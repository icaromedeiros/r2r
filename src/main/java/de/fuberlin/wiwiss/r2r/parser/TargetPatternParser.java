// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andreas/projects/r2r/antlr-files/TargetPattern.g 2012-02-23 14:53:37

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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TargetPatternParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARIABLEURI", "VAR1", "VAR2", "VARIABLETERM", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "TRUE", "FALSE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "IRI_REF", "PNAME_LN", "BLANK_NODE_LABEL", "ANON", "T", "R", "U", "E", "F", "A", "L", "S", "WS", "PN_PREFIX", "PNAME_NS", "PN_LOCAL", "VARNAME", "EXPONENT", "ECHAR", "PN_CHARS_U", "PN_CHARS_BASE", "PN_CHARS", "HEX", "COMMENT", "'.'", "'a'", "'^^'"
    };
    public static final int VARIABLEURI=4;
    public static final int IRI_REF=24;
    public static final int EXPONENT=41;
    public static final int PNAME_LN=25;
    public static final int EOF=-1;
    public static final int VARNAME=40;
    public static final int HEX=46;
    public static final int VARIABLETERM=7;
    public static final int DECIMAL_POSITIVE=13;
    public static final int DOUBLE=11;
    public static final int PN_CHARS_U=43;
    public static final int COMMENT=47;
    public static final int T__50=50;
    public static final int DOUBLE_POSITIVE=14;
    public static final int INTEGER=9;
    public static final int E=31;
    public static final int F=32;
    public static final int A=33;
    public static final int L=34;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int INTEGER_NEGATIVE=15;
    public static final int BLANK_NODE_LABEL=26;
    public static final int U=30;
    public static final int PN_LOCAL=39;
    public static final int T=28;
    public static final int PNAME_NS=38;
    public static final int S=35;
    public static final int R=29;
    public static final int TRUE=18;
    public static final int ECHAR=42;
    public static final int ANON=27;
    public static final int WS=36;
    public static final int PN_CHARS_BASE=44;
    public static final int STRING_LITERAL_LONG2=23;
    public static final int DECIMAL=10;
    public static final int VAR1=5;
    public static final int VAR2=6;
    public static final int STRING_LITERAL_LONG1=22;
    public static final int DECIMAL_NEGATIVE=16;
    public static final int INTEGER_POSITIVE=12;
    public static final int PN_PREFIX=37;
    public static final int STRING_LITERAL2=21;
    public static final int STRING_LITERAL1=20;
    public static final int PN_CHARS=45;
    public static final int DOUBLE_NEGATIVE=17;
    public static final int FALSE=19;
    public static final int LANGTAG=8;

    // delegates
    // delegators


        public TargetPatternParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TargetPatternParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TargetPatternParser.tokenNames; }
    public String getGrammarFileName() { return "/home/andreas/projects/r2r/antlr-files/TargetPattern.g"; }


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


    public static class targetPattern_return extends ParserRuleReturnScope {
        public Set<String> variableDependencies;
        public TargetPattern pattern;
        public Set<String> classes;
        public Set<String> properties;
        public Map<String, String> hints;
    };

    // $ANTLR start "targetPattern"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:74:1: targetPattern returns [Set<String> variableDependencies, TargetPattern pattern, Set<String> classes, Set<String> properties, Map<String, String> hints] : first= tripleOrPath ( '.' more= tripleOrPath )* EOF ;
    public final TargetPatternParser.targetPattern_return targetPattern() throws RecognitionException {
        TargetPatternParser.targetPattern_return retval = new TargetPatternParser.targetPattern_return();
        retval.start = input.LT(1);

        List<Triple> first = null;

        List<Triple> more = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:75:3: (first= tripleOrPath ( '.' more= tripleOrPath )* EOF )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:75:5: first= tripleOrPath ( '.' more= tripleOrPath )* EOF
            {
            pushFollow(FOLLOW_tripleOrPath_in_targetPattern64);
            first=tripleOrPath();

            state._fsp--;

             List<Triple> triples = first; 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:76:5: ( '.' more= tripleOrPath )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==48) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:77:7: '.' more= tripleOrPath
            	    {
            	    match(input,48,FOLLOW_48_in_targetPattern81); 
            	    pushFollow(FOLLOW_tripleOrPath_in_targetPattern85);
            	    more=tripleOrPath();

            	    state._fsp--;

            	     triples.addAll(more); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_targetPattern114); 
             retval.pattern = new TargetPattern(triples);
                                   retval.variableDependencies = variables;
                                   retval.classes = cls;
                                   retval.properties = props;
                                   retval.hints = datatypeHints;
                                 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "targetPattern"


    // $ANTLR start "tripleOrPath"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:89:1: tripleOrPath returns [List<Triple> value] : ( | s= subject v= verb (s= subject v= verb )* o= object );
    public final List<Triple> tripleOrPath() throws RecognitionException {
        List<Triple> value = null;

        TripleElement s = null;

        TripleElement v = null;

        TripleElement o = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:90:3: ( | s= subject v= verb (s= subject v= verb )* o= object )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==48) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=VARIABLEURI && LA3_0<=VAR2)||(LA3_0>=IRI_REF && LA3_0<=ANON)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:91:5: 
                    {
                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:91:7: s= subject v= verb (s= subject v= verb )* o= object
                    {
                     List<Triple> triples = null;
                    pushFollow(FOLLOW_subject_in_tripleOrPath153);
                    s=subject();

                    state._fsp--;

                    pushFollow(FOLLOW_verb_in_tripleOrPath157);
                    v=verb();

                    state._fsp--;

                      triples = new ArrayList<Triple>();
                                              TripleElement sElement = s;
                                              TripleElement vElement = v;
                                              props.add(vElement.getValue(0));
                                           
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:97:7: (s= subject v= verb )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:97:8: s= subject v= verb
                    	    {
                    	    pushFollow(FOLLOW_subject_in_tripleOrPath170);
                    	    s=subject();

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_verb_in_tripleOrPath174);
                    	    v=verb();

                    	    state._fsp--;


                    	                              TripleElement oElement = s;
                    	                              if(oElement.getType()==TripleElement.Type.VARIABLE && generatedVariables.contains(oElement.getValue(0)))
                    	                                oElement = new TripleElement(TripleElement.Type.IRIVARIABLE, oElement.getValue(0));
                    	                              triples.add(new Triple(sElement, vElement, oElement, vElement.getValue(0), null));
                    	                              sElement = oElement;
                    	                              vElement = v;
                    	                              props.add(vElement.getValue(0));
                    	                            

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    pushFollow(FOLLOW_object_in_tripleOrPath195);
                    o=object();

                    state._fsp--;


                                     String property = vElement.getValue(0);
                                     String classURI = null; 
                                     if(property.equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")) {
                                       cls.add(o.getValue(0));
                                       classURI = o.getValue(0);
                                     }

                                     triples.add(new Triple(sElement, vElement, o, property, classURI));
                                     value = triples;
                                   

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "tripleOrPath"


    // $ANTLR start "subject"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:132:1: subject returns [TripleElement value] : ( varOrIriRefOrBlankNode | VARIABLEURI );
    public final TripleElement subject() throws RecognitionException {
        TripleElement value = null;

        Token VARIABLEURI2=null;
        TripleElement varOrIriRefOrBlankNode1 = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:133:3: ( varOrIriRefOrBlankNode | VARIABLEURI )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=VAR1 && LA4_0<=VAR2)||(LA4_0>=IRI_REF && LA4_0<=ANON)) ) {
                alt4=1;
            }
            else if ( (LA4_0==VARIABLEURI) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:133:5: varOrIriRefOrBlankNode
                    {
                    pushFollow(FOLLOW_varOrIriRefOrBlankNode_in_subject231);
                    varOrIriRefOrBlankNode1=varOrIriRefOrBlankNode();

                    state._fsp--;

                    value = varOrIriRefOrBlankNode1;

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:134:5: VARIABLEURI
                    {
                    VARIABLEURI2=(Token)match(input,VARIABLEURI,FOLLOW_VARIABLEURI_in_subject239); 

                          String v = (VARIABLEURI2!=null?VARIABLEURI2.getText():null);
                          v = v.substring(2, v.length()-1); 
                          value = new TripleElement(TripleElement.Type.IRIVARIABLE, v); 
                          variables.add(v);
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "subject"


    // $ANTLR start "verb"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:143:1: verb returns [TripleElement value] : ( iriRef | 'a' );
    public final TripleElement verb() throws RecognitionException {
        TripleElement value = null;

        String iriRef3 = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:144:3: ( iriRef | 'a' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=IRI_REF && LA5_0<=PNAME_LN)) ) {
                alt5=1;
            }
            else if ( (LA5_0==49) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:144:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_verb264);
                    iriRef3=iriRef();

                    state._fsp--;

                     value = new TripleElement(TripleElement.Type.IRI, iriRef3); 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:145:5: 'a'
                    {
                    match(input,49,FOLLOW_49_in_verb272); 
                     value = new TripleElement(TripleElement.Type.IRI, PrintUtil.expandQname("rdf:type")); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "verb"


    // $ANTLR start "object"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:148:1: object returns [TripleElement value] : ( varOrTerm | VARIABLEURI );
    public final TripleElement object() throws RecognitionException {
        TripleElement value = null;

        Token VARIABLEURI5=null;
        TripleElement varOrTerm4 = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:149:3: ( varOrTerm | VARIABLEURI )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=VAR1 && LA6_0<=VARIABLETERM)||(LA6_0>=INTEGER && LA6_0<=ANON)) ) {
                alt6=1;
            }
            else if ( (LA6_0==VARIABLEURI) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:149:5: varOrTerm
                    {
                    pushFollow(FOLLOW_varOrTerm_in_object293);
                    varOrTerm4=varOrTerm();

                    state._fsp--;

                     value = varOrTerm4; 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:150:5: VARIABLEURI
                    {
                    VARIABLEURI5=(Token)match(input,VARIABLEURI,FOLLOW_VARIABLEURI_in_object301); 
                     String v = (VARIABLEURI5!=null?VARIABLEURI5.getText():null);
                          v = v.substring(2, v.length()-1); 
                          value = new TripleElement(TripleElement.Type.IRIVARIABLE, v);
                          variables.add(v);
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "object"


    // $ANTLR start "varOrTerm"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:158:1: varOrTerm returns [TripleElement value] : ( var | graphTerm );
    public final TripleElement varOrTerm() throws RecognitionException {
        TripleElement value = null;

        TripleElement var6 = null;

        TripleElement graphTerm7 = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:159:3: ( var | graphTerm )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=VAR1 && LA7_0<=VAR2)) ) {
                alt7=1;
            }
            else if ( (LA7_0==VARIABLETERM||(LA7_0>=INTEGER && LA7_0<=ANON)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:159:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrTerm326);
                    var6=var();

                    state._fsp--;

                     value = var6; 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:160:5: graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm334);
                    graphTerm7=graphTerm();

                    state._fsp--;

                     value = graphTerm7; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "varOrTerm"


    // $ANTLR start "varOrIriRefOrBlankNode"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:163:1: varOrIriRefOrBlankNode returns [TripleElement value] : ( var | iriRef | blankNode );
    public final TripleElement varOrIriRefOrBlankNode() throws RecognitionException {
        TripleElement value = null;

        TripleElement var8 = null;

        String iriRef9 = null;

        TripleElement blankNode10 = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:164:3: ( var | iriRef | blankNode )
            int alt8=3;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
                {
                alt8=1;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
                {
                alt8=2;
                }
                break;
            case BLANK_NODE_LABEL:
            case ANON:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:164:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrIriRefOrBlankNode355);
                    var8=var();

                    state._fsp--;

                     value = var8; 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:165:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_varOrIriRefOrBlankNode363);
                    iriRef9=iriRef();

                    state._fsp--;

                     value = new TripleElement(TripleElement.Type.IRI, iriRef9); 

                    }
                    break;
                case 3 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:166:5: blankNode
                    {
                    pushFollow(FOLLOW_blankNode_in_varOrIriRefOrBlankNode371);
                    blankNode10=blankNode();

                    state._fsp--;

                     value = blankNode10; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "varOrIriRefOrBlankNode"


    // $ANTLR start "var"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:169:1: var returns [TripleElement value] : ( VAR1 | VAR2 );
    public final TripleElement var() throws RecognitionException {
        TripleElement value = null;

        Token VAR111=null;
        Token VAR212=null;

        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:170:3: ( VAR1 | VAR2 )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==VAR1) ) {
                alt9=1;
            }
            else if ( (LA9_0==VAR2) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:170:5: VAR1
                    {
                    VAR111=(Token)match(input,VAR1,FOLLOW_VAR1_in_var392); 
                     value = new TripleElement(TripleElement.Type.VARIABLE, (VAR111!=null?VAR111.getText():null).substring(1)); variables.add((VAR111!=null?VAR111.getText():null).substring(1));

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:171:5: VAR2
                    {
                    VAR212=(Token)match(input,VAR2,FOLLOW_VAR2_in_var400); 
                     value = new TripleElement(TripleElement.Type.VARIABLE, (VAR212!=null?VAR212.getText():null).substring(1)); variables.add((VAR212!=null?VAR212.getText():null).substring(1));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "var"


    // $ANTLR start "graphTerm"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:174:1: graphTerm returns [TripleElement value] : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode );
    public final TripleElement graphTerm() throws RecognitionException {
        TripleElement value = null;

        String iriRef13 = null;

        TripleElement rdfLiteral14 = null;

        TripleElement numericLiteral15 = null;

        TripleElement booleanLiteral16 = null;

        TripleElement blankNode17 = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:175:3: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode )
            int alt10=5;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
                {
                alt10=1;
                }
                break;
            case VARIABLETERM:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt10=2;
                }
                break;
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt10=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt10=4;
                }
                break;
            case BLANK_NODE_LABEL:
            case ANON:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:175:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_graphTerm420);
                    iriRef13=iriRef();

                    state._fsp--;

                     value = new TripleElement(TripleElement.Type.IRI, iriRef13); 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:176:5: rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm428);
                    rdfLiteral14=rdfLiteral();

                    state._fsp--;

                     value = rdfLiteral14; 

                    }
                    break;
                case 3 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:177:5: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm436);
                    numericLiteral15=numericLiteral();

                    state._fsp--;

                     value = numericLiteral15; 

                    }
                    break;
                case 4 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:178:5: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm444);
                    booleanLiteral16=booleanLiteral();

                    state._fsp--;

                     value = booleanLiteral16; 

                    }
                    break;
                case 5 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:179:5: blankNode
                    {
                    pushFollow(FOLLOW_blankNode_in_graphTerm452);
                    blankNode17=blankNode();

                    state._fsp--;

                     value = blankNode17; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "graphTerm"


    // $ANTLR start "rdfLiteral"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:182:2: rdfLiteral returns [TripleElement value] : (s= string | VARIABLETERM ) (l= LANGTAG | ( '^^' i= iriRef ) )? ;
    public final TripleElement rdfLiteral() throws RecognitionException {
        TripleElement value = null;

        Token l=null;
        Token VARIABLETERM18=null;
        String s = null;

        String i = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:183:4: ( (s= string | VARIABLETERM ) (l= LANGTAG | ( '^^' i= iriRef ) )? )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:183:6: (s= string | VARIABLETERM ) (l= LANGTAG | ( '^^' i= iriRef ) )?
            {
             String v=null; TripleElement.Type vType = null; 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:184:8: (s= string | VARIABLETERM )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=STRING_LITERAL1 && LA11_0<=STRING_LITERAL_LONG2)) ) {
                alt11=1;
            }
            else if ( (LA11_0==VARIABLETERM) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:184:9: s= string
                    {
                    pushFollow(FOLLOW_string_in_rdfLiteral488);
                    s=string();

                    state._fsp--;

                     v = s; vType = TripleElement.Type.STRING; 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:186:8: VARIABLETERM
                    {
                    VARIABLETERM18=(Token)match(input,VARIABLETERM,FOLLOW_VARIABLETERM_in_rdfLiteral508); 
                     v = (VARIABLETERM18!=null?VARIABLETERM18.getText():null); v = v.substring(2, v.length()-1); variables.add(v); vType = TripleElement.Type.STRINGVARIABLE; 

                    }
                    break;

            }

            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:189:6: (l= LANGTAG | ( '^^' i= iriRef ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LANGTAG) ) {
                alt12=1;
            }
            else if ( (LA12_0==50) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:189:7: l= LANGTAG
                    {
                    l=(Token)match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral537); 
                     
                             if(vType==TripleElement.Type.STRING)
                               value = new TripleElement(TripleElement.Type.LANGTAGSTRING, v, (l!=null?l.getText():null).substring(1));
                             else
                               value = new TripleElement(TripleElement.Type.LANGTAGVARIABLE, v, (l!=null?l.getText():null).substring(1));
                           

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:197:8: ( '^^' i= iriRef )
                    {
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:197:8: ( '^^' i= iriRef )
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:197:9: '^^' i= iriRef
                    {
                    match(input,50,FOLLOW_50_in_rdfLiteral563); 
                    pushFollow(FOLLOW_iriRef_in_rdfLiteral567);
                    i=iriRef();

                    state._fsp--;

                     
                             if(vType==TripleElement.Type.STRING)
                               value = new TripleElement(TripleElement.Type.DATATYPESTRING, v, i);
                             else {
                               value = new TripleElement(TripleElement.Type.DATATYPEVARIABLE, v, i);
                               datatypeHints.put(v, i);
                             }
                           

                    }


                    }
                    break;

            }


                     if(value==null)
                         value = new TripleElement(vType, v);
                   

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "rdfLiteral"


    // $ANTLR start "numericLiteral"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:213:2: numericLiteral returns [TripleElement value] : (v= numericLiteralUnsigned | v= numericLiteralPositive | v= numericLiteralNegative );
    public final TripleElement numericLiteral() throws RecognitionException {
        TripleElement value = null;

        TripleElement v = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:214:4: (v= numericLiteralUnsigned | v= numericLiteralPositive | v= numericLiteralNegative )
            int alt13=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
                {
                alt13=1;
                }
                break;
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
                {
                alt13=2;
                }
                break;
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:214:6: v= numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral622);
                    v=numericLiteralUnsigned();

                    state._fsp--;

                    value =v;

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:215:6: v= numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral633);
                    v=numericLiteralPositive();

                    state._fsp--;

                    value =v;

                    }
                    break;
                case 3 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:216:6: v= numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral644);
                    v=numericLiteralNegative();

                    state._fsp--;

                    value =v;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericLiteral"


    // $ANTLR start "numericLiteralUnsigned"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:219:2: numericLiteralUnsigned returns [TripleElement value] : (v= INTEGER | v= DECIMAL | v= DOUBLE );
    public final TripleElement numericLiteralUnsigned() throws RecognitionException {
        TripleElement value = null;

        Token v=null;

        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:220:4: (v= INTEGER | v= DECIMAL | v= DOUBLE )
            int alt14=3;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt14=1;
                }
                break;
            case DECIMAL:
                {
                alt14=2;
                }
                break;
            case DOUBLE:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:220:6: v= INTEGER
                    {
                    v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numericLiteralUnsigned671); 
                    value = new TripleElement(TripleElement.Type.INTEGER, (v!=null?v.getText():null)); 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:221:6: v= DECIMAL
                    {
                    v=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_numericLiteralUnsigned682); 
                    value = new TripleElement(TripleElement.Type.DECIMAL, (v!=null?v.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:222:6: v= DOUBLE
                    {
                    v=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned693); 
                    value = new TripleElement(TripleElement.Type.DOUBLE, (v!=null?v.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericLiteralUnsigned"


    // $ANTLR start "numericLiteralPositive"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:225:2: numericLiteralPositive returns [TripleElement value] : (v= INTEGER_POSITIVE | v= DECIMAL_POSITIVE | v= DOUBLE_POSITIVE );
    public final TripleElement numericLiteralPositive() throws RecognitionException {
        TripleElement value = null;

        Token v=null;

        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:226:4: (v= INTEGER_POSITIVE | v= DECIMAL_POSITIVE | v= DOUBLE_POSITIVE )
            int alt15=3;
            switch ( input.LA(1) ) {
            case INTEGER_POSITIVE:
                {
                alt15=1;
                }
                break;
            case DECIMAL_POSITIVE:
                {
                alt15=2;
                }
                break;
            case DOUBLE_POSITIVE:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:226:6: v= INTEGER_POSITIVE
                    {
                    v=(Token)match(input,INTEGER_POSITIVE,FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive720); 
                    value = new TripleElement(TripleElement.Type.INTEGER, (v!=null?v.getText():null)); 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:227:6: v= DECIMAL_POSITIVE
                    {
                    v=(Token)match(input,DECIMAL_POSITIVE,FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive731); 
                    value = new TripleElement(TripleElement.Type.DECIMAL, (v!=null?v.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:228:6: v= DOUBLE_POSITIVE
                    {
                    v=(Token)match(input,DOUBLE_POSITIVE,FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive742); 
                    value = new TripleElement(TripleElement.Type.DOUBLE, (v!=null?v.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericLiteralPositive"


    // $ANTLR start "numericLiteralNegative"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:231:2: numericLiteralNegative returns [TripleElement value] : (v= INTEGER_NEGATIVE | v= DECIMAL_NEGATIVE | v= DOUBLE_NEGATIVE );
    public final TripleElement numericLiteralNegative() throws RecognitionException {
        TripleElement value = null;

        Token v=null;

        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:232:4: (v= INTEGER_NEGATIVE | v= DECIMAL_NEGATIVE | v= DOUBLE_NEGATIVE )
            int alt16=3;
            switch ( input.LA(1) ) {
            case INTEGER_NEGATIVE:
                {
                alt16=1;
                }
                break;
            case DECIMAL_NEGATIVE:
                {
                alt16=2;
                }
                break;
            case DOUBLE_NEGATIVE:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:232:6: v= INTEGER_NEGATIVE
                    {
                    v=(Token)match(input,INTEGER_NEGATIVE,FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative769); 
                    value = new TripleElement(TripleElement.Type.INTEGER, (v!=null?v.getText():null)); 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:233:6: v= DECIMAL_NEGATIVE
                    {
                    v=(Token)match(input,DECIMAL_NEGATIVE,FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative780); 
                    value = new TripleElement(TripleElement.Type.DECIMAL, (v!=null?v.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:234:6: v= DOUBLE_NEGATIVE
                    {
                    v=(Token)match(input,DOUBLE_NEGATIVE,FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative791); 
                    value = new TripleElement(TripleElement.Type.DOUBLE, (v!=null?v.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericLiteralNegative"


    // $ANTLR start "booleanLiteral"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:237:2: booleanLiteral returns [TripleElement value] : ( TRUE | FALSE );
    public final TripleElement booleanLiteral() throws RecognitionException {
        TripleElement value = null;

        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:238:4: ( TRUE | FALSE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==TRUE) ) {
                alt17=1;
            }
            else if ( (LA17_0==FALSE) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:238:6: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral816); 
                    value = new TripleElement(TripleElement.Type.BOOLEAN, "true"); 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:239:6: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral825); 
                    value = new TripleElement(TripleElement.Type.BOOLEAN, "false"); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "booleanLiteral"


    // $ANTLR start "string"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:242:2: string returns [String value] : (s= STRING_LITERAL1 | s= STRING_LITERAL2 | s= STRING_LITERAL_LONG1 | s= STRING_LITERAL_LONG2 );
    public final String string() throws RecognitionException {
        String value = null;

        Token s=null;

        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:243:4: (s= STRING_LITERAL1 | s= STRING_LITERAL2 | s= STRING_LITERAL_LONG1 | s= STRING_LITERAL_LONG2 )
            int alt18=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL1:
                {
                alt18=1;
                }
                break;
            case STRING_LITERAL2:
                {
                alt18=2;
                }
                break;
            case STRING_LITERAL_LONG1:
                {
                alt18=3;
                }
                break;
            case STRING_LITERAL_LONG2:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:243:6: s= STRING_LITERAL1
                    {
                    s=(Token)match(input,STRING_LITERAL1,FOLLOW_STRING_LITERAL1_in_string852); 
                     String temp = (s!=null?s.getText():null); value = StringUtils.unescapeString(temp.substring(1, temp.length() - 1)); 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:244:6: s= STRING_LITERAL2
                    {
                    s=(Token)match(input,STRING_LITERAL2,FOLLOW_STRING_LITERAL2_in_string863); 
                     String temp = (s!=null?s.getText():null); value = StringUtils.unescapeString(temp.substring(1, temp.length() - 1)); 

                    }
                    break;
                case 3 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:245:6: s= STRING_LITERAL_LONG1
                    {
                    s=(Token)match(input,STRING_LITERAL_LONG1,FOLLOW_STRING_LITERAL_LONG1_in_string874); 
                     String temp = (s!=null?s.getText():null); value = StringUtils.unescapeString(temp.substring(3, temp.length() - 3)); 

                    }
                    break;
                case 4 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:246:6: s= STRING_LITERAL_LONG2
                    {
                    s=(Token)match(input,STRING_LITERAL_LONG2,FOLLOW_STRING_LITERAL_LONG2_in_string885); 
                     String temp = (s!=null?s.getText():null); value = StringUtils.unescapeString(temp.substring(3, temp.length() - 3)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "string"


    // $ANTLR start "iriRef"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:249:2: iriRef returns [String value] : ( IRI_REF | prefixedName );
    public final String iriRef() throws RecognitionException {
        String value = null;

        Token IRI_REF19=null;
        TargetPatternParser.prefixedName_return prefixedName20 = null;


        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:250:4: ( IRI_REF | prefixedName )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IRI_REF) ) {
                alt19=1;
            }
            else if ( (LA19_0==PNAME_LN) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:250:6: IRI_REF
                    {
                    IRI_REF19=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef908); 
                     
                           String iri = (IRI_REF19!=null?IRI_REF19.getText():null);
                           value = iri.substring(1, iri.length()-1);
                         

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:255:6: prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iriRef923);
                    prefixedName20=prefixedName();

                    state._fsp--;

                     
                         String qName = (prefixedName20!=null?input.toString(prefixedName20.start,prefixedName20.stop):null);
                         String iri = PrintUtil.expandQname(qName);
                         if(qName.equals(iri))
                         {
                           String[] prefixAndName = (qName.split(":"));
                           iri = prefixMapper.resolvePrefix(prefixAndName[0]);
                           if(iri==null)
                            throw new IllegalArgumentException("Uknown namespace prefix: " + prefixAndName[0]);
                           else {
                             if(prefixAndName.length < 2)
                               value = iri;
                             else
                               value = iri + prefixAndName[1];
                           }  
                         }
                         else {
                           value = iri;
                         }
                       

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "iriRef"

    public static class prefixedName_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start "prefixedName"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:278:2: prefixedName returns [String value] : PNAME_LN ;
    public final TargetPatternParser.prefixedName_return prefixedName() throws RecognitionException {
        TargetPatternParser.prefixedName_return retval = new TargetPatternParser.prefixedName_return();
        retval.start = input.LT(1);

        Token PNAME_LN21=null;

        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:279:4: ( PNAME_LN )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:279:6: PNAME_LN
            {
            PNAME_LN21=(Token)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName951); 
             retval.value = (PNAME_LN21!=null?PNAME_LN21.getText():null); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefixedName"


    // $ANTLR start "blankNode"
    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:282:2: blankNode returns [TripleElement value] : ( BLANK_NODE_LABEL | ANON );
    public final TripleElement blankNode() throws RecognitionException {
        TripleElement value = null;

        Token BLANK_NODE_LABEL22=null;

        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:283:4: ( BLANK_NODE_LABEL | ANON )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==BLANK_NODE_LABEL) ) {
                alt20=1;
            }
            else if ( (LA20_0==ANON) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:283:6: BLANK_NODE_LABEL
                    {
                    BLANK_NODE_LABEL22=(Token)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode976); 
                     value = new TripleElement(TripleElement.Type.BLANKNODE, (BLANK_NODE_LABEL22!=null?BLANK_NODE_LABEL22.getText():null).substring(2)); 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:284:6: ANON
                    {
                    match(input,ANON,FOLLOW_ANON_in_blankNode985); 
                     value = new TripleElement(TripleElement.Type.BLANKNODE, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "blankNode"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\1\uffff\4\5\1\uffff\3\5\1\uffff";
    static final String DFA2_minS =
        "\1\4\4\30\1\uffff\3\30\1\uffff";
    static final String DFA2_maxS =
        "\1\33\4\61\1\uffff\3\61\1\uffff";
    static final String DFA2_acceptS =
        "\5\uffff\1\2\3\uffff\1\1";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\1\1\1\2\1\5\1\uffff\17\5\1\3\1\4\1\6\1\7",
            "\2\11\26\uffff\1\5\1\11",
            "\2\11\26\uffff\1\5\1\11",
            "\2\11\26\uffff\1\5\1\11",
            "\2\11\26\uffff\1\5\1\11",
            "",
            "\2\11\26\uffff\1\5\1\11",
            "\2\11\26\uffff\1\5\1\11",
            "\2\11\26\uffff\1\5\1\11",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 97:7: (s= subject v= verb )*";
        }
    }
 

    public static final BitSet FOLLOW_tripleOrPath_in_targetPattern64 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_targetPattern81 = new BitSet(new long[]{0x000100000F000070L});
    public static final BitSet FOLLOW_tripleOrPath_in_targetPattern85 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_EOF_in_targetPattern114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subject_in_tripleOrPath153 = new BitSet(new long[]{0x0002000003000000L});
    public static final BitSet FOLLOW_verb_in_tripleOrPath157 = new BitSet(new long[]{0x000200000FFFFEF0L});
    public static final BitSet FOLLOW_subject_in_tripleOrPath170 = new BitSet(new long[]{0x0002000003000000L});
    public static final BitSet FOLLOW_verb_in_tripleOrPath174 = new BitSet(new long[]{0x000200000FFFFEF0L});
    public static final BitSet FOLLOW_object_in_tripleOrPath195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrIriRefOrBlankNode_in_subject231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLEURI_in_subject239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_verb264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_verb272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_object293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLEURI_in_object301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIriRefOrBlankNode355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIriRefOrBlankNode363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_varOrIriRefOrBlankNode371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR1_in_var392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR2_in_var400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_rdfLiteral488 = new BitSet(new long[]{0x0004000000000102L});
    public static final BitSet FOLLOW_VARIABLETERM_in_rdfLiteral508 = new BitSet(new long[]{0x0004000000000102L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rdfLiteral563 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numericLiteralUnsigned671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_numericLiteralUnsigned682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL1_in_string852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL2_in_string863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG1_in_string874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG2_in_string885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANON_in_blankNode985 = new BitSet(new long[]{0x0000000000000002L});

}