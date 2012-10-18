grammar SourcePatternRewriter;

options {
  language = Java;
  output=template;
  rewrite=true;
}

@header {
  package de.fuberlin.wiwiss.r2r.parser;
  
  import java.util.Set;
  import java.util.HashSet;
  import java.util.Map;
  import java.util.HashMap;
  import de.fuberlin.wiwiss.r2r.*;
  import com.hp.hpl.jena.util.PrintUtil;
  import de.fuberlin.wiwiss.r2r.parser.ParseException;
}

@lexer::header {
  package de.fuberlin.wiwiss.r2r.parser;
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

@members {
  StringGenerator variableGenerator = null;
  HashMap<String, String> variableRewriter = null;
  
  public void setVariableGenerator(StringGenerator stringGenerator) {
    this.variableGenerator = stringGenerator;
    variableRewriter = new HashMap<String, String>();
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
  
  public String rewriteVariable(String inVar) {
    if(variableRewriter==null || inVar.equals("SUBJ"))
      return inVar;

    String outVar = variableRewriter.get(inVar);
    if(outVar!=null)
      return outVar;
      
    outVar = variableGenerator.nextString();
    variableRewriter.put(inVar, outVar);
    return outVar; 
  }
}

rewrittenSourcePattern returns [String rewrittenSourcePattern]
  : sourcePattern { $rewrittenSourcePattern = $sourcePattern.text; }
  ;

sourcePattern
  : triplesBlock? ((graphPatternNotTriples | filter) '.'? triplesBlock? )* EOF
  ;

wherePattern
  : '{' triplesBlock? ((graphPatternNotTriples | filter) '.'? triplesBlock? )* '}'
  ;

groupGraphPattern
  : '{' triplesBlock? ((graphPatternNotTriples | filter) '.'? triplesBlock? )* '}'
  ;
  
triplesBlock
  : triplesSameSubject ( '.' triplesBlock?)?
  ;
  
graphPatternNotTriples
  : optionalGraphPattern | groupOrUnionGraphPattern | graphGraphPattern
  ;
  
optionalGraphPattern
  : OPTIONAL groupGraphPattern
  ;
  
graphGraphPattern
  : GRAPH varOrIriRef groupGraphPattern
  ;
  
groupOrUnionGraphPattern
  : groupGraphPattern ( UNION groupGraphPattern )*
  ;

filter
  : FILTER constraint
  ;
  
constraint
  : brackettedExpression | builtInCall | functionCall
  ;
  
functionCall
  : iriRef argList
  ;

argList
  : NIL | '(' expression ( ',' expression )* ')'
  ;
  
triplesSameSubject
  : varOrTerm propertyListNotEmpty | triplesNode propertyList
  ;
  
propertyListNotEmpty
  : v=verb oList=objectList
   ( ';' (verb objectList)?)*
  ;
  
propertyList
  : propertyListNotEmpty?
  ;
  
objectList
  : o=object
    ( ',' o=object
    )*
  ;
  
object
  : graphNode
  ;
  
verb
  : iriRef 
  | 'a'
  ;
  
triplesNode
  : collection | blankNodePropertyList
  ;

blankNodePropertyList
  : '[' propertyListNotEmpty ']'
  ;
  
collection
  : '(' graphNode+ ')'
  ;
  
graphNode
  : varOrTerm 
  | triplesNode
  ;
  
varOrTerm
  : var
  | graphTerm
  ;
  
varOrIriRef
  : var
  | iriRef
  ;
  
var
  : VAR1 -> template(revar={rewriteVariable($VAR1.text.substring(1))}) "?<revar>" 
  | VAR2 -> template(revar={rewriteVariable($VAR2.text.substring(1))}) "$<revar>" 
  ;
 
graphTerm 
  : iriRef
    | rdfLiteral | numericLiteral | booleanLiteral | blankNode | NIL
  ;
  
expression
  : conditionalOrExpression
  ;
  
conditionalOrExpression
  : conditionalAndExpression ('||' conditionalAndExpression)*
  ;
  
conditionalAndExpression
  : valueLogical ( '&&' valueLogical )*
  ;
  
valueLogical
  : relationalExpression
  ;
  
relationalExpression
  : numericExpression (
                        '=' numericExpression 
                      | '!=' numericExpression 
                      | '<' numericExpression 
                      | '>' numericExpression 
                      | '<=' numericExpression
                      | '>=' numericExpression
                      )?
  ;
  
 numericExpression
   : additiveExpression
   ;
   
 additiveExpression
   : multiplicativeExpression ( '+' multiplicativeExpression
                              | '-' multiplicativeExpression
                              | numericLiteralPositive
                              | numericLiteralNegative
                              )*
   ;
   
 multiplicativeExpression
   : unaryExpression ( '*' unaryExpression | '/'  unaryExpression)*
   ;
   
 unaryExpression
   : '!' primaryExpression
   | '+' primaryExpression
   | '-' primaryExpression
   | primaryExpression
   ;
 
 primaryExpression
   : brackettedExpression
   | builtInCall
   | iriRefOrFunction
   | rdfLiteral
   | numericLiteral
   | booleanLiteral
   | var
   ;
   
 brackettedExpression
   : '(' expression ')'
   ;
   
 builtInCall
   : STR '(' expression ')'
   | LANG '(' expression ')'
   | LANGMATCHES '(' expression ',' expression ')'
   | DATATYPE '(' expression ')'
   | BOUND '(' var ')'
   | SAMETERM '(' expression ',' expression ')'
   | ISIRI '(' expression ')'
   | ISURI '(' expression ')' 
   | ISBLANK '(' expression ')'
   | ISLITERAL '(' expression ')'
   | regexExpression
   ;   
 
 regexExpression
   : REGEX '(' expression ',' expression (',' expression)? ')'
   ;
   
 iriRefOrFunction
   : iriRef argList?
   ;
   
 rdfLiteral
   : string (LANGTAG | ('^^' iriRef) )?
   ;
   
 numericLiteral
   : numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative
   ;
   
 numericLiteralUnsigned
   : INTEGER | DECIMAL | DOUBLE
   ;
   
 numericLiteralPositive
   : INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE
   ;
   
 numericLiteralNegative
   : INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE
   ;
   
 booleanLiteral
   : TRUE | FALSE ;
   
 string
   : STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2
   ;
 
 iriRef 
   : IRI_REF
   | prefixedName
   ;
   
 prefixedName
   : p=PNAME_LN
//   | PNAME_NS
   ;
   
 blankNode
   : BLANK_NODE_LABEL | ANON
   ;

//This is for case-insensitive parsing of SPARQL-keywords
GRAPH : G R A P H ;
STR : S T R ;
ISURI : I S U R I ;
OPTIONAL : O P T I O N A L ;
LANG : L A N G ;
ISIRI : I S I R I ;
UNION : U N I O N ;
LANGMATCHES : L A N G M A T C H E S ;
ISLITERAL : I S L I T E R A L ;
ISBLANK : I S B L A N K ;
BOUND : B O U N D ;
FILTER : F I L T E R ;
DATATYPE : D A T A T Y P E ;
REGEX : R E G E X ;
TRUE : T R U E ;
SAMETERM : S A M E T E R M ;
FALSE : F A L S E ;

fragment A: ('a'|'A') ;
fragment B: ('b'|'B') ;
fragment C: ('c'|'C') ;
fragment D: ('d'|'D') ;
fragment E: ('e'|'E') ;
fragment F: ('f'|'F') ;
fragment G: ('g'|'G') ;
fragment H: ('h'|'H') ;
fragment I: ('i'|'I') ;
fragment J: ('j'|'J') ;
fragment K: ('k'|'K') ;
fragment L: ('l'|'L') ;
fragment M: ('m'|'M') ;
fragment N: ('n'|'N') ;
fragment O: ('o'|'O') ;
fragment P: ('p'|'P') ;
fragment Q: ('q'|'Q') ;
fragment R: ('r'|'R') ;
fragment S: ('s'|'S') ;
fragment T: ('t'|'T') ;
fragment U: ('u'|'U') ;
fragment V: ('v'|'V') ;
fragment W: ('w'|'W') ;
fragment X: ('x'|'X') ;
fragment Y: ('y'|'Y') ;
fragment Z: ('z'|'Z') ;


//Productions for terminals

IRI_REF
  : '<' (~('<' | '>' | '"' | '{' | '}' | '|' | '^' | '`' | '\\' | '\u0000'..'\u0020'))* '>'
  ;

PNAME_NS
  : PN_PREFIX? ':'
  ;
  
PNAME_LN
  : PNAME_NS PN_LOCAL
  ;

BLANK_NODE_LABEL
  : '_:' PN_LOCAL
  ;
  
VAR1
  : '?' VARNAME
  ;
  
VAR2
  : '$' VARNAME
  ;
  
LANGTAG
  : '@' ('a'..'z' | 'A'..'Z')+ ('-' ('a'..'z' | 'A'..'Z' | '0'..'9')+)*
  ; 

INTEGER
  : ('0'..'9')+
  ;

DECIMAL
  : ('0'..'9')+ '.' ('0'..'9')* | '.' ('0'..'9')+
  ;
  
DOUBLE
  : ('0'..'9')+ '.' ('0'..'9')* EXPONENT
  | '.' ('0'..'9')+ EXPONENT
  | ('0'..'9')+ EXPONENT
  ;
  
INTEGER_POSITIVE
  : '+' INTEGER
  ;
  
DECIMAL_POSITIVE
  : '+' DECIMAL
  ;
  
DOUBLE_POSITIVE
  : '+' DOUBLE
  ;
  
INTEGER_NEGATIVE
  : '-' INTEGER
  ;
  
DECIMAL_NEGATIVE
  : '-' DECIMAL
  ;
  
DOUBLE_NEGATIVE
  : '-' DOUBLE
  ;
  
EXPONENT
  : ('e' | 'E') ('+' | '-')? ('0'..'9')+
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
  
ECHAR
  : '\\' ('t' | 'b' | 'n' | 'r' | 'f' | '\\' | '"' | '\'')
  ;
  
NIL
  : '(' WS* ')'
  ;

WS
  : ('\u0020' | '\u0009' | '\u000D' | '\u000A') {$channel = HIDDEN;}
  ;

ANON
  : '[' WS* ']'
;

VARNAME
  : (PN_CHARS_U | '0'..'9') (PN_CHARS_U | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040')*
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
  
PN_PREFIX
  : PN_CHARS_BASE ((PN_CHARS | '.')* PN_CHARS)?
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

fragment HEX : ('0'..'9' | 'a'..'f' | 'A'..'F');
COMMENT : '#' .* ('\n'|'\r') {$channel = HIDDEN;};

