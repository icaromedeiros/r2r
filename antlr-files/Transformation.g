grammar Transformation;

options {
  language = Java;
}

@header {
  package de.fuberlin.wiwiss.r2r.parser;
  
  import de.fuberlin.wiwiss.r2r.*;
  import  de.fuberlin.wiwiss.r2r.utils.StringUtils;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Set;
  import java.util.HashSet;
  import java.util.Collections;
}

@lexer::header {
  package de.fuberlin.wiwiss.r2r.parser;
}

@members {
  FunctionManager funcManager;
  FunctionMapper funcMapper=new FunctionMapper();
  Set<String> variables = new HashSet<String>();
  boolean targetVariableParsed = false;
  
  public void setFunctionManager(FunctionManager fm) {
    funcManager = fm;
  }
  
  public void setFunctionMapping(FunctionMapper fm) {
    funcMapper = fm;
  }
  
  public void recover(IntStream input, RecognitionException re) {
    String hdr = getErrorHeader(re);
    String msg = getErrorMessage(re, this.getTokenNames());
    
    throw new ParseException(hdr + " " + msg);
  }
  
  public void reportError(RecognitionException re) {
    String hdr = getErrorHeader(re);
    String msg = getErrorMessage(re, this.getTokenNames());
    
    throw new ParseException(hdr + " " + msg);
  }
  
  private FunctionExecution createFunctionExecution(String functionName, Argument... args) {
    List<Argument> arguments = new ArrayList<Argument>();
    for(Argument arg: args)
      arguments.add(arg);
    String uri = funcMapper.getFunctionUri(functionName);
    Function function = funcManager.getFunctionByUri(uri);
    if(function==null)
      throw new ParseException("Function Manager could not find/load Function <" + uri + ">");

    return new FunctionExecution(function, Collections.unmodifiableList(arguments));
  }
}

@lexer::members {
  public void recover(RecognitionException re) {
    String hdr = getErrorHeader(re);
    String msg = getErrorMessage(re, this.getTokenNames());
    
    throw new ParseException(hdr + " " + msg);
  }
  
  public void reportError(RecognitionException re) {
    String hdr = getErrorHeader(re);
    String msg = getErrorMessage(re, this.getTokenNames());
    
    throw new ParseException(hdr + " " + msg);
  }
}

transform returns [String variable, FunctionExecution funcExec, Set<String> variableDependencies]
  : v=variable '=' expression EOF
    {
      String var = $v.text;
      $variable = var.substring(1);
      Argument argument = $expression.value;
      if(argument instanceof FunctionExecution)
        $funcExec = (FunctionExecution) argument;
      else {
        $funcExec = createFunctionExecution("identityFunction", argument);
      }
      $variableDependencies = variables;
    }
  ;


expression returns [Argument value]
  : m=mult { $value = $m.value; String operation = null;}
   (( PLUS {operation = "add"; }
    | MINUS  {operation = "subtract"; }
   ) m=mult     { 
                  $value = createFunctionExecution(operation, $value, $m.value);
                }
   )*
  ;
  
mult returns [Argument value]
  : u=unary { $value = $u.value; String operation = null;}
   (( MULT { operation = "multiply"; }  
    | DIV { operation = "divide"; }
    ) u=unary {
                $value = createFunctionExecution(operation, $value, $u.value);
              }
   )*
  ;
  
unary returns [Argument value]
  : {boolean negative = false;} 
  ( (MINUS { negative = !negative; }
  | PLUS)
  )* term { if(negative)
              $value = createFunctionExecution("negate", $term.value);
            else
              $value = $term.value;
          }
  ;
  
term returns [Argument value]
  : function { $value = $function.funcExec; }
  | variable
    { 
      String varName = $variable.text;
      $value = new VariableArgument(varName.substring(1));
    }
  | integer { $value = new ConstantArgument(ConstantType.INTEGER, $integer.text); }
  | decimal { $value = new ConstantArgument(ConstantType.DECIMAL, $decimal.text); }
  | doubleVal { $value = new ConstantArgument(ConstantType.DOUBLE, $doubleVal.text); }
  | string
    {
      $value = new ConstantArgument(ConstantType.STRING, $string.value);
    }
  | '(' expression ')' { $value = $expression.value; }
  | conditional { $value = $conditional.value; }
  ;
  
conditional returns [Argument value]
  :  '[' leftEx=expression comp=comparisonOp rightEx=expression '?' trueEx=expression ':' falseEx=expression ']'
  {
  // Create the comparison argument
    Argument compOpArg = new ConstantArgument(ConstantType.STRING, $comp.text);
    
  // First the compare function to calculate the boolean
    FunctionExecution comparisonFunction = createFunctionExecution("compare", compOpArg, $leftEx.value, $rightEx.value);

  // Then the booleanPick function to pick either the left or right value
    $value = createFunctionExecution("booleanPick", comparisonFunction, $trueEx.value, $falseEx.value);
  } 
  ;
  
comparisonOp returns [Argument value]
  : '>' | '>=' | '=' | '<' | '<=' | '!='
  ;
  
  
variable
  : v=VAR1
    {
      if(targetVariableParsed) {
        String varName = $v.text;
        variables.add(varName.substring(1));
      }
      else
        targetVariableParsed = true; 
    }
  | v=VAR2
    {
      if(targetVariableParsed) {
        String varName = $v.text;
        variables.add(varName.substring(1));
      }
      else
        targetVariableParsed = true; 
    }
  ;
  
function returns [FunctionExecution funcExec]
  : FUNCTIONNAME
    { 
      List<Argument> arguments = new ArrayList<Argument>();
      String fname = $FUNCTIONNAME.text;
      String uri = funcMapper.getFunctionUri(fname);
      Function function = funcManager.getFunctionByUri(uri);
      if(function==null)
        throw new ParseException("Function Manager could not find/load Function <" + uri + ">");
    }
    '(' 
       (a=expression { arguments.add($a.value); }
          (',' a=expression { arguments.add($a.value);})*
       )?
    ')' { $funcExec = new FunctionExecution(function, Collections.unmodifiableList(arguments));}
  ;
  
//integer
//  : INTEGER | INTEGER_NEGATIVE | INTEGER_POSITIVE
//  ;
//
//decimal
//  : DECIMAL | DECIMAL_NEGATIVE | DECIMAL_POSITIVE
//  ;
//  
//doubleVal
//  : DOUBLE | DOUBLE_POSITIVE | DOUBLE_NEGATIVE
//  ;

integer
  : INTEGER 
  ;

decimal
  : DECIMAL
  ;
  
doubleVal
  : DOUBLE
  ;

 string returns [String value]
   : s=STRING_LITERAL1 { String temp = $s.text; $value = StringUtils.unescapeString(temp.substring(1, temp.length() - 1)); }
   | s=STRING_LITERAL2 { String temp = $s.text; $value = StringUtils.unescapeString(temp.substring(1, temp.length() - 1)); }
   | s=STRING_LITERAL_LONG1 { String temp = $s.text; $value = StringUtils.unescapeString(temp.substring(3, temp.length() - 3)); }
   | s=STRING_LITERAL_LONG2 { String temp = $s.text; $value = StringUtils.unescapeString(temp.substring(3, temp.length() - 3)); }
   ;
    
//TOKENS


  
VAR1
  : '?' VARNAME
  ;
  
VAR2
  : '$' VARNAME
  ;
  
INTEGER
  : ('0'..'9')+
  ;
  
FUNCTIONNAME
  : ((ALPHA)+ ':')? ALPHA ('a'..'z' | 'A'..'Z' | '_' | '-' | '0'..'9')*
  ;
  
DECIMAL
  : ('0'..'9')+ '.' ('0'..'9')* | '.' ('0'..'9')+
  ;
  
DOUBLE
  : ('0'..'9')+ '.' ('0'..'9')* EXPONENT
  | '.' ('0'..'9')+ EXPONENT
  | ('0'..'9')+ EXPONENT
  ;
  
MULT
  : '*'
  ;

DIV
  : '/'
  ;
  
//INTEGER_POSITIVE
//  : PLUS INTEGER
//  ;
//  
//DECIMAL_POSITIVE
//  : PLUS DECIMAL
//  ;
//  
//DOUBLE_POSITIVE
//  : PLUS DOUBLE
//  ;
//  
//INTEGER_NEGATIVE
//  : MINUS INTEGER
//  ;
//  
//DECIMAL_NEGATIVE
//  : MINUS DECIMAL
//  ;
//  
//DOUBLE_NEGATIVE
//  : MINUS DOUBLE
//  ;
  
EXPONENT
  : ('e' | 'E') (PLUS | MINUS)? ('0'..'9')+
  ;

STRING_LITERAL1
  : '\'' (~('\u0027' | '\u005c' | '\u000A' | '\u000D') | ECHAR)* '\''
  ;
  
STRING_LITERAL2
  : '"' (~('\u0022' | '\u005c' | '\u000A' | '\u000D') | ECHAR)* '"'
  ;

STRING_LITERAL_LONG1
  : '\'\'\'' (( '\'' | '\'\'')? (~('\'' | '\\') | ECHAR))*   '\'\'\''
  ;
  
STRING_LITERAL_LONG2
  : '"""' (( '"' | '""')? (~('"' | '\\') | ECHAR))*   '"""'
  ;
  
MINUS
  : '-'
  ;
  
PLUS
  : '+'
  ;
  
ECHAR
  : '\\' ('t' | 'b' | 'n' | 'r' | 'f' | '\\' | '"' | '\'')
  ;

VARNAME
  : (PN_CHARS_U | '0'..'9') (PN_CHARS_U | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040')*
  ;
  
WS
  : ('\u0020' | '\u0009' | '\u000D' | '\u000A') {$channel = HIDDEN;}
  ;

PN_PREFIX
  : PN_CHARS_BASE ((PN_CHARS | '.')* PN_CHARS)?
  ;
  
fragment PN_CHARS_BASE
  : 'a'..'z'
  | 'A'..'Z'
  | '\u00C0'..'\u00D6'
  | '\u00D8'..'\u00F6'
  | '\u00F8'..'\u02FF'
  | '\u0370'..'\u037D'
  | '\u037F'..'\u1FFF'
  | '\u200C'..'\u200D'
  | '\u2070'..'\u218F'
  | '\u2C00'..'\u2FEF'
  | '\u3001'..'\uD7FF'
  | '\uF900'..'\uFDCF'
  | '\uFDF0'..'\uFFFD'
  ;
    
fragment PN_CHARS_U
  : PN_CHARS_BASE | '_'
  ;
  
fragment PN_CHARS
  : PN_CHARS_U 
  | '-' 
  | '0'..'9'
  | '\u00B7'
  | '\u0300'..'\u036F'
  | '\u203F'..'\u2040'
  ;
  
fragment PN_LOCAL
  : (PN_CHARS_U | '0'..'9') ((PN_CHARS | '.')* PN_CHARS)?
  ;
  
fragment ALPHA
  : 'a'..'z' | 'A'..'Z'
  ;