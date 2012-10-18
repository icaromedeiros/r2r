grammar TargetPattern;

options {
  language = Java;
//  backtrack=true;
}

@header {
  package de.fuberlin.wiwiss.r2r.parser;
  
  import de.fuberlin.wiwiss.r2r.*;
  import  de.fuberlin.wiwiss.r2r.utils.StringUtils;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
  import java.util.Set;
  import java.util.HashSet;
  import com.hp.hpl.jena.util.PrintUtil;
}

@lexer::header {
  package de.fuberlin.wiwiss.r2r.parser;
}

@members {
  PrefixMapper prefixMapper;
  Set<String> generatedVariables;
  Set<String> variables = new HashSet<String>();
  Set<String> props = new HashSet<String>();
  Set<String> cls = new HashSet<String>();
  Map<String, String> datatypeHints = new HashMap<String, String>();
  
  public void setPrefixMapper(PrefixMapper pm) {
    prefixMapper = pm;
  }
  
  public void setGeneratedVariables(Set<String> variableNames) {
    generatedVariables = variableNames;
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


targetPattern returns [Set<String> variableDependencies, TargetPattern pattern, Set<String> classes, Set<String> properties, Map<String, String> hints]
  : first=tripleOrPath { List<Triple> triples = $first.value; } 
    (
      '.' more=tripleOrPath  { triples.addAll($more.value); }
    )*
                 EOF { $pattern = new TargetPattern(triples);
                       $variableDependencies = variables;
                       $classes = cls;
                       $properties = props;
                       $hints = datatypeHints;
                     }
  ;


  
tripleOrPath returns [List<Triple> value]
  :
    | { List<Triple> triples = null;}
      s=subject v=verb {  triples = new ArrayList<Triple>();
                          TripleElement sElement = $s.value;
                          TripleElement vElement = $v.value;
                          props.add(vElement.getValue(0));
                       }
      (s=subject v=verb {
                          TripleElement oElement = $s.value;
                          if(oElement.getType()==TripleElement.Type.VARIABLE && generatedVariables.contains(oElement.getValue(0)))
                            oElement = new TripleElement(TripleElement.Type.IRIVARIABLE, oElement.getValue(0));
                          triples.add(new Triple(sElement, vElement, oElement, vElement.getValue(0), null));
                          sElement = oElement;
                          vElement = $v.value;
                          props.add(vElement.getValue(0));
                        }
      )*
      o=object {
                 String property = vElement.getValue(0);
                 String classURI = null; 
                 if(property.equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")) {
                   cls.add($o.value.getValue(0));
                   classURI = $o.value.getValue(0);
                 }

                 triples.add(new Triple(sElement, vElement, $o.value, property, classURI));
                 $value = triples;
               }
  ; 
  
  

//triple returns [Triple value]
//  : s=subject v=verb o=object
//    { 
//      $value = new Triple($s.value, $v.value, $o.value);
//      if($v.value.getValue(0).equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))
//        cls.add($o.value.getValue(0));
//      props.add($v.value.getValue(0));
//    }
//  ;

subject returns [TripleElement value]
  : varOrIriRefOrBlankNode {$value = $varOrIriRefOrBlankNode.value;}
  | VARIABLEURI
    {
      String v = $VARIABLEURI.text;
      v = v.substring(2, v.length()-1); 
      $value = new TripleElement(TripleElement.Type.IRIVARIABLE, v); 
      variables.add(v);
    }
  ;
  
verb returns [TripleElement value]
  : iriRef { $value = new TripleElement(TripleElement.Type.IRI, $iriRef.value); }
  | 'a' { $value = new TripleElement(TripleElement.Type.IRI, PrintUtil.expandQname("rdf:type")); }
  ;
  
object returns [TripleElement value]
  : varOrTerm { $value = $varOrTerm.value; }
  | VARIABLEURI
    { String v = $VARIABLEURI.text;
      v = v.substring(2, v.length()-1); 
      $value = new TripleElement(TripleElement.Type.IRIVARIABLE, v);
      variables.add(v);
    }
  ;
  
varOrTerm returns [TripleElement value]
  : var { $value = $var.value; }
  | graphTerm { $value = $graphTerm.value; }
  ;
  
varOrIriRefOrBlankNode returns [TripleElement value]
  : var { $value = $var.value; }
  | iriRef { $value = new TripleElement(TripleElement.Type.IRI, $iriRef.value); }
  | blankNode { $value = $blankNode.value; }
  ;
  
var returns [TripleElement value]
  : VAR1 { $value = new TripleElement(TripleElement.Type.VARIABLE, $VAR1.text.substring(1)); variables.add($VAR1.text.substring(1));}
  | VAR2 { $value = new TripleElement(TripleElement.Type.VARIABLE, $VAR2.text.substring(1)); variables.add($VAR2.text.substring(1));}
  ;
 
graphTerm returns [TripleElement value]
  : iriRef { $value = new TripleElement(TripleElement.Type.IRI, $iriRef.value); }
  | rdfLiteral { $value = $rdfLiteral.value; }
  | numericLiteral { $value = $numericLiteral.value; }
  | booleanLiteral { $value = $booleanLiteral.value; }
  | blankNode { $value = $blankNode.value; }
  ;
   
 rdfLiteral returns [TripleElement value]
   : { String v=null; TripleElement.Type vType = null; }
       (s=string
        { v = $s.value; vType = TripleElement.Type.STRING; } 
     | VARIABLETERM
        { v = $VARIABLETERM.text; v = v.substring(2, v.length()-1); variables.add(v); vType = TripleElement.Type.STRINGVARIABLE; }
       )
     (l=LANGTAG
       { 
         if(vType==TripleElement.Type.STRING)
           $value = new TripleElement(TripleElement.Type.LANGTAGSTRING, v, $l.text.substring(1));
         else
           $value = new TripleElement(TripleElement.Type.LANGTAGVARIABLE, v, $l.text.substring(1));
       }
      
     | ('^^' i=iriRef
       { 
         if(vType==TripleElement.Type.STRING)
           $value = new TripleElement(TripleElement.Type.DATATYPESTRING, v, $i.value);
         else {
           $value = new TripleElement(TripleElement.Type.DATATYPEVARIABLE, v, $i.value);
           datatypeHints.put(v, $i.value);
         }
       }
       ) )?
       {
         if($value==null)
             $value = new TripleElement(vType, v);
       }
   ;
   
 numericLiteral returns [TripleElement value]
   : v=numericLiteralUnsigned {$value=$v.value;}
   | v=numericLiteralPositive {$value=$v.value;}
   | v=numericLiteralNegative {$value=$v.value;}
   ;
   
 numericLiteralUnsigned returns [TripleElement value]
   : v=INTEGER {$value = new TripleElement(TripleElement.Type.INTEGER, $v.text); }
   | v=DECIMAL {$value = new TripleElement(TripleElement.Type.DECIMAL, $v.text); }
   | v=DOUBLE {$value = new TripleElement(TripleElement.Type.DOUBLE, $v.text); }
   ;
   
 numericLiteralPositive returns [TripleElement value]
   : v=INTEGER_POSITIVE {$value = new TripleElement(TripleElement.Type.INTEGER, $v.text); }
   | v=DECIMAL_POSITIVE {$value = new TripleElement(TripleElement.Type.DECIMAL, $v.text); }
   | v=DOUBLE_POSITIVE {$value = new TripleElement(TripleElement.Type.DOUBLE, $v.text); }
   ;
   
 numericLiteralNegative returns [TripleElement value]
   : v=INTEGER_NEGATIVE {$value = new TripleElement(TripleElement.Type.INTEGER, $v.text); }
   | v=DECIMAL_NEGATIVE {$value = new TripleElement(TripleElement.Type.DECIMAL, $v.text); }
   | v=DOUBLE_NEGATIVE {$value = new TripleElement(TripleElement.Type.DOUBLE, $v.text); }
   ;
   
 booleanLiteral returns [TripleElement value]
   : TRUE {$value = new TripleElement(TripleElement.Type.BOOLEAN, "true"); }
   | FALSE {$value = new TripleElement(TripleElement.Type.BOOLEAN, "false"); }
   ;
   
 string returns [String value]
   : s=STRING_LITERAL1 { String temp = $s.text; $value = StringUtils.unescapeString(temp.substring(1, temp.length() - 1)); }
   | s=STRING_LITERAL2 { String temp = $s.text; $value = StringUtils.unescapeString(temp.substring(1, temp.length() - 1)); }
   | s=STRING_LITERAL_LONG1 { String temp = $s.text; $value = StringUtils.unescapeString(temp.substring(3, temp.length() - 3)); }
   | s=STRING_LITERAL_LONG2 { String temp = $s.text; $value = StringUtils.unescapeString(temp.substring(3, temp.length() - 3)); }
   ;
 
 iriRef returns [String value]
   : IRI_REF
     { 
       String iri = $IRI_REF.text;
       $value = iri.substring(1, iri.length()-1);
     } 
   | prefixedName
   { 
     String qName = $prefixedName.text;
     String iri = PrintUtil.expandQname(qName);
     if(qName.equals(iri))
     {
       String[] prefixAndName = (qName.split(":"));
       iri = prefixMapper.resolvePrefix(prefixAndName[0]);
       if(iri==null)
        throw new IllegalArgumentException("Uknown namespace prefix: " + prefixAndName[0]);
       else {
         if(prefixAndName.length < 2)
           $value = iri;
         else
           $value = iri + prefixAndName[1];
       }  
     }
     else {
       $value = iri;
     }
   }
   ;
   
 prefixedName returns [String value]
   : PNAME_LN { $value = $PNAME_LN.text; }
   ;
   
 blankNode returns [TripleElement value]
   : BLANK_NODE_LABEL { $value = new TripleElement(TripleElement.Type.BLANKNODE, $BLANK_NODE_LABEL.text.substring(2)); }
   | ANON { $value = new TripleElement(TripleElement.Type.BLANKNODE, null); }
   ;
   


//This is for case-insensitive parsing of SPARQL-keywords

TRUE : T R U E ;
FALSE : F A L S E ;

fragment A: ('a'|'A') ;
fragment E: ('e'|'E') ;
fragment F: ('f'|'F') ;
fragment L: ('l'|'L') ;
fragment R: ('r'|'R') ;
fragment S: ('s'|'S') ;
fragment T: ('t'|'T') ;
fragment U: ('u'|'U') ;

//Productions for terminals

WS
  : ('\u0020' | '\u0009' | '\u000D' | '\u000A') {$channel = HIDDEN;}
  ;
  
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
  
VARIABLETERM
   : '?\'' VARNAME '\''
   ;
   
VARIABLEURI
   : '?<' VARNAME '>'
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
  : E ('+' | '-')? ('0'..'9')+
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

