/*
 *  R2R
 *
 *  Copyright 2010-2011 Freie Universität Berlin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g 2011-04-28 13:03:26

  package de.fuberlin.wiwiss.r2r.parser;
  
  import java.util.Set;
  import java.util.HashSet;
  import java.util.Map;
  import java.util.HashMap;
  import de.fuberlin.wiwiss.r2r.*;
  import com.hp.hpl.jena.util.PrintUtil;
  import de.fuberlin.wiwiss.r2r.parser.ParseException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class SourcePatternRewriterParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OPTIONAL", "GRAPH", "UNION", "FILTER", "NIL", "VAR1", "VAR2", "STR", "LANG", "LANGMATCHES", "DATATYPE", "BOUND", "SAMETERM", "ISIRI", "ISURI", "ISBLANK", "ISLITERAL", "REGEX", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "TRUE", "FALSE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "IRI_REF", "PNAME_LN", "BLANK_NODE_LABEL", "ANON", "G", "R", "A", "P", "H", "S", "T", "I", "U", "O", "N", "L", "M", "C", "E", "B", "K", "D", "F", "Y", "X", "J", "Q", "V", "W", "Z", "PN_PREFIX", "PNAME_NS", "PN_LOCAL", "VARNAME", "EXPONENT", "ECHAR", "WS", "PN_CHARS_U", "PN_CHARS_BASE", "PN_CHARS", "HEX", "COMMENT", "'.'", "'{'", "'}'", "'('", "','", "')'", "';'", "'a'", "'['", "']'", "'||'", "'&&'", "'='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'^^'"
    };
    public static final int EXPONENT=72;
    public static final int GRAPH=5;
    public static final int REGEX=21;
    public static final int PNAME_LN=39;
    public static final int EOF=-1;
    public static final int VARNAME=71;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int ISLITERAL=20;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int LANGMATCHES=13;
    public static final int DOUBLE=25;
    public static final int PN_CHARS_U=75;
    public static final int COMMENT=79;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int DOUBLE_POSITIVE=28;
    public static final int BOUND=15;
    public static final int T__97=97;
    public static final int ISIRI=17;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int D=59;
    public static final int E=56;
    public static final int F=60;
    public static final int G=42;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int A=44;
    public static final int T__82=82;
    public static final int B=57;
    public static final int T__83=83;
    public static final int C=55;
    public static final int L=53;
    public static final int M=54;
    public static final int N=52;
    public static final int O=51;
    public static final int H=46;
    public static final int I=49;
    public static final int J=63;
    public static final int BLANK_NODE_LABEL=40;
    public static final int K=58;
    public static final int U=50;
    public static final int T=48;
    public static final int W=66;
    public static final int V=65;
    public static final int Q=64;
    public static final int P=45;
    public static final int S=47;
    public static final int R=43;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int Y=61;
    public static final int ISBLANK=19;
    public static final int T__88=88;
    public static final int X=62;
    public static final int Z=67;
    public static final int WS=74;
    public static final int NIL=8;
    public static final int INTEGER_POSITIVE=26;
    public static final int STRING_LITERAL2=35;
    public static final int FILTER=7;
    public static final int STRING_LITERAL1=34;
    public static final int PN_CHARS=77;
    public static final int DATATYPE=14;
    public static final int DOUBLE_NEGATIVE=31;
    public static final int FALSE=33;
    public static final int LANG=12;
    public static final int IRI_REF=38;
    public static final int ISURI=18;
    public static final int STR=11;
    public static final int SAMETERM=16;
    public static final int HEX=78;
    public static final int T__103=103;
    public static final int DECIMAL_POSITIVE=27;
    public static final int INTEGER=23;
    public static final int INTEGER_NEGATIVE=29;
    public static final int PN_LOCAL=70;
    public static final int PNAME_NS=69;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int TRUE=32;
    public static final int UNION=6;
    public static final int ECHAR=73;
    public static final int OPTIONAL=4;
    public static final int ANON=41;
    public static final int PN_CHARS_BASE=76;
    public static final int STRING_LITERAL_LONG2=37;
    public static final int DECIMAL=24;
    public static final int VAR1=9;
    public static final int VAR2=10;
    public static final int STRING_LITERAL_LONG1=36;
    public static final int DECIMAL_NEGATIVE=30;
    public static final int PN_PREFIX=68;
    public static final int LANGTAG=22;

    // delegates
    // delegators


        public SourcePatternRewriterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SourcePatternRewriterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("SourcePatternRewriterParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return SourcePatternRewriterParser.tokenNames; }
    public String getGrammarFileName() { return "/home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g"; }


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


    public static class rewrittenSourcePattern_return extends ParserRuleReturnScope {
        public String rewrittenSourcePattern;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrittenSourcePattern"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:78:1: rewrittenSourcePattern returns [String rewrittenSourcePattern] : sourcePattern ;
    public final SourcePatternRewriterParser.rewrittenSourcePattern_return rewrittenSourcePattern() throws RecognitionException {
        SourcePatternRewriterParser.rewrittenSourcePattern_return retval = new SourcePatternRewriterParser.rewrittenSourcePattern_return();
        retval.start = input.LT(1);

        SourcePatternRewriterParser.sourcePattern_return sourcePattern1 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:79:3: ( sourcePattern )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:79:5: sourcePattern
            {
            pushFollow(FOLLOW_sourcePattern_in_rewrittenSourcePattern74);
            sourcePattern1=sourcePattern();

            state._fsp--;

             retval.rewrittenSourcePattern = (sourcePattern1!=null?input.toString(sourcePattern1.start,sourcePattern1.stop):null); 

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
    // $ANTLR end "rewrittenSourcePattern"

    public static class sourcePattern_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sourcePattern"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:82:1: sourcePattern : ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* EOF ;
    public final SourcePatternRewriterParser.sourcePattern_return sourcePattern() throws RecognitionException {
        SourcePatternRewriterParser.sourcePattern_return retval = new SourcePatternRewriterParser.sourcePattern_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:3: ( ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* EOF )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:5: ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* EOF
            {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:5: ( triplesBlock )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=NIL && LA1_0<=VAR2)||(LA1_0>=INTEGER && LA1_0<=ANON)||LA1_0==83||LA1_0==88) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:5: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_sourcePattern89);
                    triplesBlock();

                    state._fsp--;


                    }
                    break;

            }

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:19: ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=OPTIONAL && LA5_0<=GRAPH)||LA5_0==FILTER||LA5_0==81) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:20: ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )?
            	    {
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:20: ( graphPatternNotTriples | filter )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( ((LA2_0>=OPTIONAL && LA2_0<=GRAPH)||LA2_0==81) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==FILTER) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:21: graphPatternNotTriples
            	            {
            	            pushFollow(FOLLOW_graphPatternNotTriples_in_sourcePattern94);
            	            graphPatternNotTriples();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:46: filter
            	            {
            	            pushFollow(FOLLOW_filter_in_sourcePattern98);
            	            filter();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:54: ( '.' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==80) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:54: '.'
            	            {
            	            match(input,80,FOLLOW_80_in_sourcePattern101); 

            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:59: ( triplesBlock )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( ((LA4_0>=NIL && LA4_0<=VAR2)||(LA4_0>=INTEGER && LA4_0<=ANON)||LA4_0==83||LA4_0==88) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:83:59: triplesBlock
            	            {
            	            pushFollow(FOLLOW_triplesBlock_in_sourcePattern104);
            	            triplesBlock();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_sourcePattern110); 

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
    // $ANTLR end "sourcePattern"

    public static class wherePattern_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "wherePattern"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:86:1: wherePattern : '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' ;
    public final SourcePatternRewriterParser.wherePattern_return wherePattern() throws RecognitionException {
        SourcePatternRewriterParser.wherePattern_return retval = new SourcePatternRewriterParser.wherePattern_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:3: ( '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:5: '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}'
            {
            match(input,81,FOLLOW_81_in_wherePattern123); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:9: ( triplesBlock )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=NIL && LA6_0<=VAR2)||(LA6_0>=INTEGER && LA6_0<=ANON)||LA6_0==83||LA6_0==88) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:9: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_wherePattern125);
                    triplesBlock();

                    state._fsp--;


                    }
                    break;

            }

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:23: ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=OPTIONAL && LA10_0<=GRAPH)||LA10_0==FILTER||LA10_0==81) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:24: ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )?
            	    {
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:24: ( graphPatternNotTriples | filter )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( ((LA7_0>=OPTIONAL && LA7_0<=GRAPH)||LA7_0==81) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==FILTER) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:25: graphPatternNotTriples
            	            {
            	            pushFollow(FOLLOW_graphPatternNotTriples_in_wherePattern130);
            	            graphPatternNotTriples();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:50: filter
            	            {
            	            pushFollow(FOLLOW_filter_in_wherePattern134);
            	            filter();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:58: ( '.' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==80) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:58: '.'
            	            {
            	            match(input,80,FOLLOW_80_in_wherePattern137); 

            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:63: ( triplesBlock )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=NIL && LA9_0<=VAR2)||(LA9_0>=INTEGER && LA9_0<=ANON)||LA9_0==83||LA9_0==88) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:87:63: triplesBlock
            	            {
            	            pushFollow(FOLLOW_triplesBlock_in_wherePattern140);
            	            triplesBlock();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,82,FOLLOW_82_in_wherePattern146); 

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
    // $ANTLR end "wherePattern"

    public static class groupGraphPattern_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "groupGraphPattern"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:90:1: groupGraphPattern : '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' ;
    public final SourcePatternRewriterParser.groupGraphPattern_return groupGraphPattern() throws RecognitionException {
        SourcePatternRewriterParser.groupGraphPattern_return retval = new SourcePatternRewriterParser.groupGraphPattern_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:3: ( '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:5: '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}'
            {
            match(input,81,FOLLOW_81_in_groupGraphPattern159); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:9: ( triplesBlock )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=NIL && LA11_0<=VAR2)||(LA11_0>=INTEGER && LA11_0<=ANON)||LA11_0==83||LA11_0==88) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:9: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPattern161);
                    triplesBlock();

                    state._fsp--;


                    }
                    break;

            }

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:23: ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=OPTIONAL && LA15_0<=GRAPH)||LA15_0==FILTER||LA15_0==81) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:24: ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )?
            	    {
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:24: ( graphPatternNotTriples | filter )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( ((LA12_0>=OPTIONAL && LA12_0<=GRAPH)||LA12_0==81) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==FILTER) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:25: graphPatternNotTriples
            	            {
            	            pushFollow(FOLLOW_graphPatternNotTriples_in_groupGraphPattern166);
            	            graphPatternNotTriples();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:50: filter
            	            {
            	            pushFollow(FOLLOW_filter_in_groupGraphPattern170);
            	            filter();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:58: ( '.' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==80) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:58: '.'
            	            {
            	            match(input,80,FOLLOW_80_in_groupGraphPattern173); 

            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:63: ( triplesBlock )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( ((LA14_0>=NIL && LA14_0<=VAR2)||(LA14_0>=INTEGER && LA14_0<=ANON)||LA14_0==83||LA14_0==88) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:91:63: triplesBlock
            	            {
            	            pushFollow(FOLLOW_triplesBlock_in_groupGraphPattern176);
            	            triplesBlock();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,82,FOLLOW_82_in_groupGraphPattern182); 

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
    // $ANTLR end "groupGraphPattern"

    public static class triplesBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "triplesBlock"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:94:1: triplesBlock : triplesSameSubject ( '.' ( triplesBlock )? )? ;
    public final SourcePatternRewriterParser.triplesBlock_return triplesBlock() throws RecognitionException {
        SourcePatternRewriterParser.triplesBlock_return retval = new SourcePatternRewriterParser.triplesBlock_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:95:3: ( triplesSameSubject ( '.' ( triplesBlock )? )? )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:95:5: triplesSameSubject ( '.' ( triplesBlock )? )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_triplesBlock197);
            triplesSameSubject();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:95:24: ( '.' ( triplesBlock )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==80) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:95:26: '.' ( triplesBlock )?
                    {
                    match(input,80,FOLLOW_80_in_triplesBlock201); 
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:95:30: ( triplesBlock )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=NIL && LA16_0<=VAR2)||(LA16_0>=INTEGER && LA16_0<=ANON)||LA16_0==83||LA16_0==88) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:95:30: triplesBlock
                            {
                            pushFollow(FOLLOW_triplesBlock_in_triplesBlock203);
                            triplesBlock();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


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
    // $ANTLR end "triplesBlock"

    public static class graphPatternNotTriples_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "graphPatternNotTriples"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:98:1: graphPatternNotTriples : ( optionalGraphPattern | groupOrUnionGraphPattern | graphGraphPattern );
    public final SourcePatternRewriterParser.graphPatternNotTriples_return graphPatternNotTriples() throws RecognitionException {
        SourcePatternRewriterParser.graphPatternNotTriples_return retval = new SourcePatternRewriterParser.graphPatternNotTriples_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:99:3: ( optionalGraphPattern | groupOrUnionGraphPattern | graphGraphPattern )
            int alt18=3;
            switch ( input.LA(1) ) {
            case OPTIONAL:
                {
                alt18=1;
                }
                break;
            case 81:
                {
                alt18=2;
                }
                break;
            case GRAPH:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:99:5: optionalGraphPattern
                    {
                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNotTriples221);
                    optionalGraphPattern();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:99:28: groupOrUnionGraphPattern
                    {
                    pushFollow(FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples225);
                    groupOrUnionGraphPattern();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:99:55: graphGraphPattern
                    {
                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNotTriples229);
                    graphGraphPattern();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "graphPatternNotTriples"

    public static class optionalGraphPattern_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "optionalGraphPattern"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:102:1: optionalGraphPattern : OPTIONAL groupGraphPattern ;
    public final SourcePatternRewriterParser.optionalGraphPattern_return optionalGraphPattern() throws RecognitionException {
        SourcePatternRewriterParser.optionalGraphPattern_return retval = new SourcePatternRewriterParser.optionalGraphPattern_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:103:3: ( OPTIONAL groupGraphPattern )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:103:5: OPTIONAL groupGraphPattern
            {
            match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern244); 
            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern246);
            groupGraphPattern();

            state._fsp--;


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
    // $ANTLR end "optionalGraphPattern"

    public static class graphGraphPattern_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "graphGraphPattern"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:106:1: graphGraphPattern : GRAPH varOrIriRef groupGraphPattern ;
    public final SourcePatternRewriterParser.graphGraphPattern_return graphGraphPattern() throws RecognitionException {
        SourcePatternRewriterParser.graphGraphPattern_return retval = new SourcePatternRewriterParser.graphGraphPattern_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:107:3: ( GRAPH varOrIriRef groupGraphPattern )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:107:5: GRAPH varOrIriRef groupGraphPattern
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern261); 
            pushFollow(FOLLOW_varOrIriRef_in_graphGraphPattern263);
            varOrIriRef();

            state._fsp--;

            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern265);
            groupGraphPattern();

            state._fsp--;


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
    // $ANTLR end "graphGraphPattern"

    public static class groupOrUnionGraphPattern_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "groupOrUnionGraphPattern"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:110:1: groupOrUnionGraphPattern : groupGraphPattern ( UNION groupGraphPattern )* ;
    public final SourcePatternRewriterParser.groupOrUnionGraphPattern_return groupOrUnionGraphPattern() throws RecognitionException {
        SourcePatternRewriterParser.groupOrUnionGraphPattern_return retval = new SourcePatternRewriterParser.groupOrUnionGraphPattern_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:111:3: ( groupGraphPattern ( UNION groupGraphPattern )* )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:111:5: groupGraphPattern ( UNION groupGraphPattern )*
            {
            pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern280);
            groupGraphPattern();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:111:23: ( UNION groupGraphPattern )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==UNION) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:111:25: UNION groupGraphPattern
            	    {
            	    match(input,UNION,FOLLOW_UNION_in_groupOrUnionGraphPattern284); 
            	    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern286);
            	    groupGraphPattern();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "groupOrUnionGraphPattern"

    public static class filter_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filter"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:114:1: filter : FILTER constraint ;
    public final SourcePatternRewriterParser.filter_return filter() throws RecognitionException {
        SourcePatternRewriterParser.filter_return retval = new SourcePatternRewriterParser.filter_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:115:3: ( FILTER constraint )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:115:5: FILTER constraint
            {
            match(input,FILTER,FOLLOW_FILTER_in_filter302); 
            pushFollow(FOLLOW_constraint_in_filter304);
            constraint();

            state._fsp--;


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
    // $ANTLR end "filter"

    public static class constraint_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraint"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:118:1: constraint : ( brackettedExpression | builtInCall | functionCall );
    public final SourcePatternRewriterParser.constraint_return constraint() throws RecognitionException {
        SourcePatternRewriterParser.constraint_return retval = new SourcePatternRewriterParser.constraint_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:119:3: ( brackettedExpression | builtInCall | functionCall )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt20=1;
                }
                break;
            case STR:
            case LANG:
            case LANGMATCHES:
            case DATATYPE:
            case BOUND:
            case SAMETERM:
            case ISIRI:
            case ISURI:
            case ISBLANK:
            case ISLITERAL:
            case REGEX:
                {
                alt20=2;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:119:5: brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_constraint319);
                    brackettedExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:119:28: builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_constraint323);
                    builtInCall();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:119:42: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_constraint327);
                    functionCall();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "constraint"

    public static class functionCall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionCall"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:122:1: functionCall : iriRef argList ;
    public final SourcePatternRewriterParser.functionCall_return functionCall() throws RecognitionException {
        SourcePatternRewriterParser.functionCall_return retval = new SourcePatternRewriterParser.functionCall_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:123:3: ( iriRef argList )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:123:5: iriRef argList
            {
            pushFollow(FOLLOW_iriRef_in_functionCall342);
            iriRef();

            state._fsp--;

            pushFollow(FOLLOW_argList_in_functionCall344);
            argList();

            state._fsp--;


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
    // $ANTLR end "functionCall"

    public static class argList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "argList"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:126:1: argList : ( NIL | '(' expression ( ',' expression )* ')' );
    public final SourcePatternRewriterParser.argList_return argList() throws RecognitionException {
        SourcePatternRewriterParser.argList_return retval = new SourcePatternRewriterParser.argList_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:127:3: ( NIL | '(' expression ( ',' expression )* ')' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NIL) ) {
                alt22=1;
            }
            else if ( (LA22_0==83) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:127:5: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_argList357); 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:127:11: '(' expression ( ',' expression )* ')'
                    {
                    match(input,83,FOLLOW_83_in_argList361); 
                    pushFollow(FOLLOW_expression_in_argList363);
                    expression();

                    state._fsp--;

                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:127:26: ( ',' expression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==84) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:127:28: ',' expression
                    	    {
                    	    match(input,84,FOLLOW_84_in_argList367); 
                    	    pushFollow(FOLLOW_expression_in_argList369);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match(input,85,FOLLOW_85_in_argList374); 

                    }
                    break;

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
    // $ANTLR end "argList"

    public static class triplesSameSubject_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "triplesSameSubject"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:130:1: triplesSameSubject : ( varOrTerm propertyListNotEmpty | triplesNode propertyList );
    public final SourcePatternRewriterParser.triplesSameSubject_return triplesSameSubject() throws RecognitionException {
        SourcePatternRewriterParser.triplesSameSubject_return retval = new SourcePatternRewriterParser.triplesSameSubject_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:131:3: ( varOrTerm propertyListNotEmpty | triplesNode propertyList )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=NIL && LA23_0<=VAR2)||(LA23_0>=INTEGER && LA23_0<=ANON)) ) {
                alt23=1;
            }
            else if ( (LA23_0==83||LA23_0==88) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:131:5: varOrTerm propertyListNotEmpty
                    {
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubject389);
                    varOrTerm();

                    state._fsp--;

                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject391);
                    propertyListNotEmpty();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:131:38: triplesNode propertyList
                    {
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubject395);
                    triplesNode();

                    state._fsp--;

                    pushFollow(FOLLOW_propertyList_in_triplesSameSubject397);
                    propertyList();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "triplesSameSubject"

    public static class propertyListNotEmpty_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "propertyListNotEmpty"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:134:1: propertyListNotEmpty : v= verb oList= objectList ( ';' ( verb objectList )? )* ;
    public final SourcePatternRewriterParser.propertyListNotEmpty_return propertyListNotEmpty() throws RecognitionException {
        SourcePatternRewriterParser.propertyListNotEmpty_return retval = new SourcePatternRewriterParser.propertyListNotEmpty_return();
        retval.start = input.LT(1);

        SourcePatternRewriterParser.verb_return v = null;

        SourcePatternRewriterParser.objectList_return oList = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:135:3: (v= verb oList= objectList ( ';' ( verb objectList )? )* )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:135:5: v= verb oList= objectList ( ';' ( verb objectList )? )*
            {
            pushFollow(FOLLOW_verb_in_propertyListNotEmpty414);
            v=verb();

            state._fsp--;

            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty418);
            oList=objectList();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:136:4: ( ';' ( verb objectList )? )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==86) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:136:6: ';' ( verb objectList )?
            	    {
            	    match(input,86,FOLLOW_86_in_propertyListNotEmpty425); 
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:136:10: ( verb objectList )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( ((LA24_0>=IRI_REF && LA24_0<=PNAME_LN)||LA24_0==87) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:136:11: verb objectList
            	            {
            	            pushFollow(FOLLOW_verb_in_propertyListNotEmpty428);
            	            verb();

            	            state._fsp--;

            	            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty430);
            	            objectList();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "propertyListNotEmpty"

    public static class propertyList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "propertyList"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:139:1: propertyList : ( propertyListNotEmpty )? ;
    public final SourcePatternRewriterParser.propertyList_return propertyList() throws RecognitionException {
        SourcePatternRewriterParser.propertyList_return retval = new SourcePatternRewriterParser.propertyList_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:140:3: ( ( propertyListNotEmpty )? )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:140:5: ( propertyListNotEmpty )?
            {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:140:5: ( propertyListNotEmpty )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=IRI_REF && LA26_0<=PNAME_LN)||LA26_0==87) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:140:5: propertyListNotEmpty
                    {
                    pushFollow(FOLLOW_propertyListNotEmpty_in_propertyList449);
                    propertyListNotEmpty();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "propertyList"

    public static class objectList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "objectList"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:143:1: objectList : o= object ( ',' o= object )* ;
    public final SourcePatternRewriterParser.objectList_return objectList() throws RecognitionException {
        SourcePatternRewriterParser.objectList_return retval = new SourcePatternRewriterParser.objectList_return();
        retval.start = input.LT(1);

        SourcePatternRewriterParser.object_return o = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:144:3: (o= object ( ',' o= object )* )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:144:5: o= object ( ',' o= object )*
            {
            pushFollow(FOLLOW_object_in_objectList467);
            o=object();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:145:5: ( ',' o= object )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==84) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:145:7: ',' o= object
            	    {
            	    match(input,84,FOLLOW_84_in_objectList475); 
            	    pushFollow(FOLLOW_object_in_objectList479);
            	    o=object();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
    // $ANTLR end "objectList"

    public static class object_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "object"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:149:1: object : graphNode ;
    public final SourcePatternRewriterParser.object_return object() throws RecognitionException {
        SourcePatternRewriterParser.object_return retval = new SourcePatternRewriterParser.object_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:150:3: ( graphNode )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:150:5: graphNode
            {
            pushFollow(FOLLOW_graphNode_in_object501);
            graphNode();

            state._fsp--;


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
    // $ANTLR end "object"

    public static class verb_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "verb"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:153:1: verb : ( iriRef | 'a' );
    public final SourcePatternRewriterParser.verb_return verb() throws RecognitionException {
        SourcePatternRewriterParser.verb_return retval = new SourcePatternRewriterParser.verb_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:154:3: ( iriRef | 'a' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=IRI_REF && LA28_0<=PNAME_LN)) ) {
                alt28=1;
            }
            else if ( (LA28_0==87) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:154:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_verb516);
                    iriRef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:155:5: 'a'
                    {
                    match(input,87,FOLLOW_87_in_verb523); 

                    }
                    break;

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
    // $ANTLR end "verb"

    public static class triplesNode_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "triplesNode"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:158:1: triplesNode : ( collection | blankNodePropertyList );
    public final SourcePatternRewriterParser.triplesNode_return triplesNode() throws RecognitionException {
        SourcePatternRewriterParser.triplesNode_return retval = new SourcePatternRewriterParser.triplesNode_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:159:3: ( collection | blankNodePropertyList )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==83) ) {
                alt29=1;
            }
            else if ( (LA29_0==88) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:159:5: collection
                    {
                    pushFollow(FOLLOW_collection_in_triplesNode538);
                    collection();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:159:18: blankNodePropertyList
                    {
                    pushFollow(FOLLOW_blankNodePropertyList_in_triplesNode542);
                    blankNodePropertyList();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "triplesNode"

    public static class blankNodePropertyList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blankNodePropertyList"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:162:1: blankNodePropertyList : '[' propertyListNotEmpty ']' ;
    public final SourcePatternRewriterParser.blankNodePropertyList_return blankNodePropertyList() throws RecognitionException {
        SourcePatternRewriterParser.blankNodePropertyList_return retval = new SourcePatternRewriterParser.blankNodePropertyList_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:163:3: ( '[' propertyListNotEmpty ']' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:163:5: '[' propertyListNotEmpty ']'
            {
            match(input,88,FOLLOW_88_in_blankNodePropertyList555); 
            pushFollow(FOLLOW_propertyListNotEmpty_in_blankNodePropertyList557);
            propertyListNotEmpty();

            state._fsp--;

            match(input,89,FOLLOW_89_in_blankNodePropertyList559); 

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
    // $ANTLR end "blankNodePropertyList"

    public static class collection_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "collection"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:166:1: collection : '(' ( graphNode )+ ')' ;
    public final SourcePatternRewriterParser.collection_return collection() throws RecognitionException {
        SourcePatternRewriterParser.collection_return retval = new SourcePatternRewriterParser.collection_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:167:3: ( '(' ( graphNode )+ ')' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:167:5: '(' ( graphNode )+ ')'
            {
            match(input,83,FOLLOW_83_in_collection574); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:167:9: ( graphNode )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=NIL && LA30_0<=VAR2)||(LA30_0>=INTEGER && LA30_0<=ANON)||LA30_0==83||LA30_0==88) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:167:9: graphNode
            	    {
            	    pushFollow(FOLLOW_graphNode_in_collection576);
            	    graphNode();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            match(input,85,FOLLOW_85_in_collection579); 

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
    // $ANTLR end "collection"

    public static class graphNode_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "graphNode"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:170:1: graphNode : ( varOrTerm | triplesNode );
    public final SourcePatternRewriterParser.graphNode_return graphNode() throws RecognitionException {
        SourcePatternRewriterParser.graphNode_return retval = new SourcePatternRewriterParser.graphNode_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:171:3: ( varOrTerm | triplesNode )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=NIL && LA31_0<=VAR2)||(LA31_0>=INTEGER && LA31_0<=ANON)) ) {
                alt31=1;
            }
            else if ( (LA31_0==83||LA31_0==88) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:171:5: varOrTerm
                    {
                    pushFollow(FOLLOW_varOrTerm_in_graphNode594);
                    varOrTerm();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:172:5: triplesNode
                    {
                    pushFollow(FOLLOW_triplesNode_in_graphNode601);
                    triplesNode();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "graphNode"

    public static class varOrTerm_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "varOrTerm"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:175:1: varOrTerm : ( var | graphTerm );
    public final SourcePatternRewriterParser.varOrTerm_return varOrTerm() throws RecognitionException {
        SourcePatternRewriterParser.varOrTerm_return retval = new SourcePatternRewriterParser.varOrTerm_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:176:3: ( var | graphTerm )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=VAR1 && LA32_0<=VAR2)) ) {
                alt32=1;
            }
            else if ( (LA32_0==NIL||(LA32_0>=INTEGER && LA32_0<=ANON)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:176:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrTerm616);
                    var();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:177:5: graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm622);
                    graphTerm();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "varOrTerm"

    public static class varOrIriRef_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "varOrIriRef"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:180:1: varOrIriRef : ( var | iriRef );
    public final SourcePatternRewriterParser.varOrIriRef_return varOrIriRef() throws RecognitionException {
        SourcePatternRewriterParser.varOrIriRef_return retval = new SourcePatternRewriterParser.varOrIriRef_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:181:3: ( var | iriRef )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=VAR1 && LA33_0<=VAR2)) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=IRI_REF && LA33_0<=PNAME_LN)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:181:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrIriRef637);
                    var();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:182:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_varOrIriRef643);
                    iriRef();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "varOrIriRef"

    public static class var_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:185:1: var : ( VAR1 -> template(revar=rewriteVariable($VAR1.text.substring(1))) \"?<revar>\" | VAR2 -> template(revar=rewriteVariable($VAR2.text.substring(1))) \"$<revar>\");
    public final SourcePatternRewriterParser.var_return var() throws RecognitionException {
        SourcePatternRewriterParser.var_return retval = new SourcePatternRewriterParser.var_return();
        retval.start = input.LT(1);

        Token VAR12=null;
        Token VAR23=null;

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:186:3: ( VAR1 -> template(revar=rewriteVariable($VAR1.text.substring(1))) \"?<revar>\" | VAR2 -> template(revar=rewriteVariable($VAR2.text.substring(1))) \"$<revar>\")
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==VAR1) ) {
                alt34=1;
            }
            else if ( (LA34_0==VAR2) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:186:5: VAR1
                    {
                    VAR12=(Token)match(input,VAR1,FOLLOW_VAR1_in_var658); 


                    // TEMPLATE REWRITE
                    // 186:10: -> template(revar=rewriteVariable($VAR1.text.substring(1))) \"?<revar>\"
                    {
                        retval.st = new StringTemplate(templateLib, "?<revar>",
                      new STAttrMap().put("revar", rewriteVariable((VAR12!=null?VAR12.getText():null).substring(1))));
                    }

                    ((TokenRewriteStream)input).replace(
                      ((Token)retval.start).getTokenIndex(),
                      input.LT(-1).getTokenIndex(),
                      retval.st);
                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:187:5: VAR2
                    {
                    VAR23=(Token)match(input,VAR2,FOLLOW_VAR2_in_var676); 


                    // TEMPLATE REWRITE
                    // 187:10: -> template(revar=rewriteVariable($VAR2.text.substring(1))) \"$<revar>\"
                    {
                        retval.st = new StringTemplate(templateLib, "$<revar>",
                      new STAttrMap().put("revar", rewriteVariable((VAR23!=null?VAR23.getText():null).substring(1))));
                    }

                    ((TokenRewriteStream)input).replace(
                      ((Token)retval.start).getTokenIndex(),
                      input.LT(-1).getTokenIndex(),
                      retval.st);
                    }
                    break;

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
    // $ANTLR end "var"

    public static class graphTerm_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "graphTerm"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:190:1: graphTerm : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | NIL );
    public final SourcePatternRewriterParser.graphTerm_return graphTerm() throws RecognitionException {
        SourcePatternRewriterParser.graphTerm_return retval = new SourcePatternRewriterParser.graphTerm_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:191:3: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | NIL )
            int alt35=6;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
                {
                alt35=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt35=2;
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
                alt35=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt35=4;
                }
                break;
            case BLANK_NODE_LABEL:
            case ANON:
                {
                alt35=5;
                }
                break;
            case NIL:
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:191:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_graphTerm703);
                    iriRef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:192:7: rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm711);
                    rdfLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:192:20: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm715);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:192:37: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm719);
                    booleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:192:54: blankNode
                    {
                    pushFollow(FOLLOW_blankNode_in_graphTerm723);
                    blankNode();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:192:66: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_graphTerm727); 

                    }
                    break;

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
    // $ANTLR end "graphTerm"

    public static class expression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:195:1: expression : conditionalOrExpression ;
    public final SourcePatternRewriterParser.expression_return expression() throws RecognitionException {
        SourcePatternRewriterParser.expression_return retval = new SourcePatternRewriterParser.expression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:196:3: ( conditionalOrExpression )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:196:5: conditionalOrExpression
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_expression742);
            conditionalOrExpression();

            state._fsp--;


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
    // $ANTLR end "expression"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionalOrExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:199:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final SourcePatternRewriterParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        SourcePatternRewriterParser.conditionalOrExpression_return retval = new SourcePatternRewriterParser.conditionalOrExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:200:3: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:200:5: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression757);
            conditionalAndExpression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:200:30: ( '||' conditionalAndExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==90) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:200:31: '||' conditionalAndExpression
            	    {
            	    match(input,90,FOLLOW_90_in_conditionalOrExpression760); 
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression762);
            	    conditionalAndExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


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
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionalAndExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:203:1: conditionalAndExpression : valueLogical ( '&&' valueLogical )* ;
    public final SourcePatternRewriterParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        SourcePatternRewriterParser.conditionalAndExpression_return retval = new SourcePatternRewriterParser.conditionalAndExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:204:3: ( valueLogical ( '&&' valueLogical )* )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:204:5: valueLogical ( '&&' valueLogical )*
            {
            pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression779);
            valueLogical();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:204:18: ( '&&' valueLogical )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==91) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:204:20: '&&' valueLogical
            	    {
            	    match(input,91,FOLLOW_91_in_conditionalAndExpression783); 
            	    pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression785);
            	    valueLogical();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


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
    // $ANTLR end "conditionalAndExpression"

    public static class valueLogical_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "valueLogical"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:207:1: valueLogical : relationalExpression ;
    public final SourcePatternRewriterParser.valueLogical_return valueLogical() throws RecognitionException {
        SourcePatternRewriterParser.valueLogical_return retval = new SourcePatternRewriterParser.valueLogical_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:208:3: ( relationalExpression )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:208:5: relationalExpression
            {
            pushFollow(FOLLOW_relationalExpression_in_valueLogical803);
            relationalExpression();

            state._fsp--;


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
    // $ANTLR end "valueLogical"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:211:1: relationalExpression : numericExpression ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )? ;
    public final SourcePatternRewriterParser.relationalExpression_return relationalExpression() throws RecognitionException {
        SourcePatternRewriterParser.relationalExpression_return retval = new SourcePatternRewriterParser.relationalExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:212:3: ( numericExpression ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )? )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:212:5: numericExpression ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )?
            {
            pushFollow(FOLLOW_numericExpression_in_relationalExpression818);
            numericExpression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:212:23: ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )?
            int alt38=7;
            switch ( input.LA(1) ) {
                case 92:
                    {
                    alt38=1;
                    }
                    break;
                case 93:
                    {
                    alt38=2;
                    }
                    break;
                case 94:
                    {
                    alt38=3;
                    }
                    break;
                case 95:
                    {
                    alt38=4;
                    }
                    break;
                case 96:
                    {
                    alt38=5;
                    }
                    break;
                case 97:
                    {
                    alt38=6;
                    }
                    break;
            }

            switch (alt38) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:213:25: '=' numericExpression
                    {
                    match(input,92,FOLLOW_92_in_relationalExpression846); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression848);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:214:25: '!=' numericExpression
                    {
                    match(input,93,FOLLOW_93_in_relationalExpression875); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression877);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:215:25: '<' numericExpression
                    {
                    match(input,94,FOLLOW_94_in_relationalExpression904); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression906);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:216:25: '>' numericExpression
                    {
                    match(input,95,FOLLOW_95_in_relationalExpression933); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression935);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:217:25: '<=' numericExpression
                    {
                    match(input,96,FOLLOW_96_in_relationalExpression962); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression964);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:218:25: '>=' numericExpression
                    {
                    match(input,97,FOLLOW_97_in_relationalExpression990); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression992);
                    numericExpression();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "relationalExpression"

    public static class numericExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "numericExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:222:2: numericExpression : additiveExpression ;
    public final SourcePatternRewriterParser.numericExpression_return numericExpression() throws RecognitionException {
        SourcePatternRewriterParser.numericExpression_return retval = new SourcePatternRewriterParser.numericExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:223:4: ( additiveExpression )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:223:6: additiveExpression
            {
            pushFollow(FOLLOW_additiveExpression_in_numericExpression1034);
            additiveExpression();

            state._fsp--;


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
    // $ANTLR end "numericExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additiveExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:226:2: additiveExpression : multiplicativeExpression ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )* ;
    public final SourcePatternRewriterParser.additiveExpression_return additiveExpression() throws RecognitionException {
        SourcePatternRewriterParser.additiveExpression_return retval = new SourcePatternRewriterParser.additiveExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:227:4: ( multiplicativeExpression ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )* )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:227:6: multiplicativeExpression ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1053);
            multiplicativeExpression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:227:31: ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )*
            loop39:
            do {
                int alt39=5;
                switch ( input.LA(1) ) {
                case 98:
                    {
                    alt39=1;
                    }
                    break;
                case 99:
                    {
                    alt39=2;
                    }
                    break;
                case INTEGER_POSITIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE_POSITIVE:
                    {
                    alt39=3;
                    }
                    break;
                case INTEGER_NEGATIVE:
                case DECIMAL_NEGATIVE:
                case DOUBLE_NEGATIVE:
                    {
                    alt39=4;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:227:33: '+' multiplicativeExpression
            	    {
            	    match(input,98,FOLLOW_98_in_additiveExpression1057); 
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1059);
            	    multiplicativeExpression();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:228:33: '-' multiplicativeExpression
            	    {
            	    match(input,99,FOLLOW_99_in_additiveExpression1093); 
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1095);
            	    multiplicativeExpression();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:229:33: numericLiteralPositive
            	    {
            	    pushFollow(FOLLOW_numericLiteralPositive_in_additiveExpression1129);
            	    numericLiteralPositive();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:230:33: numericLiteralNegative
            	    {
            	    pushFollow(FOLLOW_numericLiteralNegative_in_additiveExpression1163);
            	    numericLiteralNegative();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


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
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "multiplicativeExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:234:2: multiplicativeExpression : unaryExpression ( '*' unaryExpression | '/' unaryExpression )* ;
    public final SourcePatternRewriterParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        SourcePatternRewriterParser.multiplicativeExpression_return retval = new SourcePatternRewriterParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:235:4: ( unaryExpression ( '*' unaryExpression | '/' unaryExpression )* )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:235:6: unaryExpression ( '*' unaryExpression | '/' unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1215);
            unaryExpression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:235:22: ( '*' unaryExpression | '/' unaryExpression )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==100) ) {
                    alt40=1;
                }
                else if ( (LA40_0==101) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:235:24: '*' unaryExpression
            	    {
            	    match(input,100,FOLLOW_100_in_multiplicativeExpression1219); 
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1221);
            	    unaryExpression();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:235:46: '/' unaryExpression
            	    {
            	    match(input,101,FOLLOW_101_in_multiplicativeExpression1225); 
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1228);
            	    unaryExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


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
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "unaryExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:238:2: unaryExpression : ( '!' primaryExpression | '+' primaryExpression | '-' primaryExpression | primaryExpression );
    public final SourcePatternRewriterParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SourcePatternRewriterParser.unaryExpression_return retval = new SourcePatternRewriterParser.unaryExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:239:4: ( '!' primaryExpression | '+' primaryExpression | '-' primaryExpression | primaryExpression )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt41=1;
                }
                break;
            case 98:
                {
                alt41=2;
                }
                break;
            case 99:
                {
                alt41=3;
                }
                break;
            case VAR1:
            case VAR2:
            case STR:
            case LANG:
            case LANGMATCHES:
            case DATATYPE:
            case BOUND:
            case SAMETERM:
            case ISIRI:
            case ISURI:
            case ISBLANK:
            case ISLITERAL:
            case REGEX:
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case TRUE:
            case FALSE:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case IRI_REF:
            case PNAME_LN:
            case 83:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:239:6: '!' primaryExpression
                    {
                    match(input,102,FOLLOW_102_in_unaryExpression1249); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1251);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:240:6: '+' primaryExpression
                    {
                    match(input,98,FOLLOW_98_in_unaryExpression1258); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1260);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:241:6: '-' primaryExpression
                    {
                    match(input,99,FOLLOW_99_in_unaryExpression1267); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1269);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:242:6: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1276);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "unaryExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primaryExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:245:2: primaryExpression : ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var );
    public final SourcePatternRewriterParser.primaryExpression_return primaryExpression() throws RecognitionException {
        SourcePatternRewriterParser.primaryExpression_return retval = new SourcePatternRewriterParser.primaryExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:246:4: ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var )
            int alt42=7;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt42=1;
                }
                break;
            case STR:
            case LANG:
            case LANGMATCHES:
            case DATATYPE:
            case BOUND:
            case SAMETERM:
            case ISIRI:
            case ISURI:
            case ISBLANK:
            case ISLITERAL:
            case REGEX:
                {
                alt42=2;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
                {
                alt42=3;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt42=4;
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
                alt42=5;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt42=6;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt42=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:246:6: brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_primaryExpression1293);
                    brackettedExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:247:6: builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_primaryExpression1300);
                    builtInCall();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:248:6: iriRefOrFunction
                    {
                    pushFollow(FOLLOW_iriRefOrFunction_in_primaryExpression1307);
                    iriRefOrFunction();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:249:6: rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_primaryExpression1314);
                    rdfLiteral();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:250:6: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression1321);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:251:6: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression1328);
                    booleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:252:6: var
                    {
                    pushFollow(FOLLOW_var_in_primaryExpression1335);
                    var();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "primaryExpression"

    public static class brackettedExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "brackettedExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:255:2: brackettedExpression : '(' expression ')' ;
    public final SourcePatternRewriterParser.brackettedExpression_return brackettedExpression() throws RecognitionException {
        SourcePatternRewriterParser.brackettedExpression_return retval = new SourcePatternRewriterParser.brackettedExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:256:4: ( '(' expression ')' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:256:6: '(' expression ')'
            {
            match(input,83,FOLLOW_83_in_brackettedExpression1354); 
            pushFollow(FOLLOW_expression_in_brackettedExpression1356);
            expression();

            state._fsp--;

            match(input,85,FOLLOW_85_in_brackettedExpression1358); 

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
    // $ANTLR end "brackettedExpression"

    public static class builtInCall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "builtInCall"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:259:2: builtInCall : ( STR '(' expression ')' | LANG '(' expression ')' | LANGMATCHES '(' expression ',' expression ')' | DATATYPE '(' expression ')' | BOUND '(' var ')' | SAMETERM '(' expression ',' expression ')' | ISIRI '(' expression ')' | ISURI '(' expression ')' | ISBLANK '(' expression ')' | ISLITERAL '(' expression ')' | regexExpression );
    public final SourcePatternRewriterParser.builtInCall_return builtInCall() throws RecognitionException {
        SourcePatternRewriterParser.builtInCall_return retval = new SourcePatternRewriterParser.builtInCall_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:260:4: ( STR '(' expression ')' | LANG '(' expression ')' | LANGMATCHES '(' expression ',' expression ')' | DATATYPE '(' expression ')' | BOUND '(' var ')' | SAMETERM '(' expression ',' expression ')' | ISIRI '(' expression ')' | ISURI '(' expression ')' | ISBLANK '(' expression ')' | ISLITERAL '(' expression ')' | regexExpression )
            int alt43=11;
            switch ( input.LA(1) ) {
            case STR:
                {
                alt43=1;
                }
                break;
            case LANG:
                {
                alt43=2;
                }
                break;
            case LANGMATCHES:
                {
                alt43=3;
                }
                break;
            case DATATYPE:
                {
                alt43=4;
                }
                break;
            case BOUND:
                {
                alt43=5;
                }
                break;
            case SAMETERM:
                {
                alt43=6;
                }
                break;
            case ISIRI:
                {
                alt43=7;
                }
                break;
            case ISURI:
                {
                alt43=8;
                }
                break;
            case ISBLANK:
                {
                alt43=9;
                }
                break;
            case ISLITERAL:
                {
                alt43=10;
                }
                break;
            case REGEX:
                {
                alt43=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:260:6: STR '(' expression ')'
                    {
                    match(input,STR,FOLLOW_STR_in_builtInCall1377); 
                    match(input,83,FOLLOW_83_in_builtInCall1379); 
                    pushFollow(FOLLOW_expression_in_builtInCall1381);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1383); 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:261:6: LANG '(' expression ')'
                    {
                    match(input,LANG,FOLLOW_LANG_in_builtInCall1390); 
                    match(input,83,FOLLOW_83_in_builtInCall1392); 
                    pushFollow(FOLLOW_expression_in_builtInCall1394);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1396); 

                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:262:6: LANGMATCHES '(' expression ',' expression ')'
                    {
                    match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall1403); 
                    match(input,83,FOLLOW_83_in_builtInCall1405); 
                    pushFollow(FOLLOW_expression_in_builtInCall1407);
                    expression();

                    state._fsp--;

                    match(input,84,FOLLOW_84_in_builtInCall1409); 
                    pushFollow(FOLLOW_expression_in_builtInCall1411);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1413); 

                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:263:6: DATATYPE '(' expression ')'
                    {
                    match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall1420); 
                    match(input,83,FOLLOW_83_in_builtInCall1422); 
                    pushFollow(FOLLOW_expression_in_builtInCall1424);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1426); 

                    }
                    break;
                case 5 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:264:6: BOUND '(' var ')'
                    {
                    match(input,BOUND,FOLLOW_BOUND_in_builtInCall1433); 
                    match(input,83,FOLLOW_83_in_builtInCall1435); 
                    pushFollow(FOLLOW_var_in_builtInCall1437);
                    var();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1439); 

                    }
                    break;
                case 6 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:265:6: SAMETERM '(' expression ',' expression ')'
                    {
                    match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall1446); 
                    match(input,83,FOLLOW_83_in_builtInCall1448); 
                    pushFollow(FOLLOW_expression_in_builtInCall1450);
                    expression();

                    state._fsp--;

                    match(input,84,FOLLOW_84_in_builtInCall1452); 
                    pushFollow(FOLLOW_expression_in_builtInCall1454);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1456); 

                    }
                    break;
                case 7 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:266:6: ISIRI '(' expression ')'
                    {
                    match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall1463); 
                    match(input,83,FOLLOW_83_in_builtInCall1465); 
                    pushFollow(FOLLOW_expression_in_builtInCall1467);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1469); 

                    }
                    break;
                case 8 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:267:6: ISURI '(' expression ')'
                    {
                    match(input,ISURI,FOLLOW_ISURI_in_builtInCall1476); 
                    match(input,83,FOLLOW_83_in_builtInCall1478); 
                    pushFollow(FOLLOW_expression_in_builtInCall1480);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1482); 

                    }
                    break;
                case 9 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:268:6: ISBLANK '(' expression ')'
                    {
                    match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall1490); 
                    match(input,83,FOLLOW_83_in_builtInCall1492); 
                    pushFollow(FOLLOW_expression_in_builtInCall1494);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1496); 

                    }
                    break;
                case 10 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:269:6: ISLITERAL '(' expression ')'
                    {
                    match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall1503); 
                    match(input,83,FOLLOW_83_in_builtInCall1505); 
                    pushFollow(FOLLOW_expression_in_builtInCall1507);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1509); 

                    }
                    break;
                case 11 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:270:6: regexExpression
                    {
                    pushFollow(FOLLOW_regexExpression_in_builtInCall1516);
                    regexExpression();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "builtInCall"

    public static class regexExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "regexExpression"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:273:2: regexExpression : REGEX '(' expression ',' expression ( ',' expression )? ')' ;
    public final SourcePatternRewriterParser.regexExpression_return regexExpression() throws RecognitionException {
        SourcePatternRewriterParser.regexExpression_return retval = new SourcePatternRewriterParser.regexExpression_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:274:4: ( REGEX '(' expression ',' expression ( ',' expression )? ')' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:274:6: REGEX '(' expression ',' expression ( ',' expression )? ')'
            {
            match(input,REGEX,FOLLOW_REGEX_in_regexExpression1536); 
            match(input,83,FOLLOW_83_in_regexExpression1538); 
            pushFollow(FOLLOW_expression_in_regexExpression1540);
            expression();

            state._fsp--;

            match(input,84,FOLLOW_84_in_regexExpression1542); 
            pushFollow(FOLLOW_expression_in_regexExpression1544);
            expression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:274:42: ( ',' expression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==84) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:274:43: ',' expression
                    {
                    match(input,84,FOLLOW_84_in_regexExpression1547); 
                    pushFollow(FOLLOW_expression_in_regexExpression1549);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,85,FOLLOW_85_in_regexExpression1553); 

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
    // $ANTLR end "regexExpression"

    public static class iriRefOrFunction_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "iriRefOrFunction"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:277:2: iriRefOrFunction : iriRef ( argList )? ;
    public final SourcePatternRewriterParser.iriRefOrFunction_return iriRefOrFunction() throws RecognitionException {
        SourcePatternRewriterParser.iriRefOrFunction_return retval = new SourcePatternRewriterParser.iriRefOrFunction_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:278:4: ( iriRef ( argList )? )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:278:6: iriRef ( argList )?
            {
            pushFollow(FOLLOW_iriRef_in_iriRefOrFunction1572);
            iriRef();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:278:13: ( argList )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==NIL||LA45_0==83) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:278:13: argList
                    {
                    pushFollow(FOLLOW_argList_in_iriRefOrFunction1574);
                    argList();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "iriRefOrFunction"

    public static class rdfLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rdfLiteral"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:281:2: rdfLiteral : string ( LANGTAG | ( '^^' iriRef ) )? ;
    public final SourcePatternRewriterParser.rdfLiteral_return rdfLiteral() throws RecognitionException {
        SourcePatternRewriterParser.rdfLiteral_return retval = new SourcePatternRewriterParser.rdfLiteral_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:282:4: ( string ( LANGTAG | ( '^^' iriRef ) )? )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:282:6: string ( LANGTAG | ( '^^' iriRef ) )?
            {
            pushFollow(FOLLOW_string_in_rdfLiteral1594);
            string();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:282:13: ( LANGTAG | ( '^^' iriRef ) )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LANGTAG) ) {
                alt46=1;
            }
            else if ( (LA46_0==103) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:282:14: LANGTAG
                    {
                    match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral1597); 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:282:24: ( '^^' iriRef )
                    {
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:282:24: ( '^^' iriRef )
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:282:25: '^^' iriRef
                    {
                    match(input,103,FOLLOW_103_in_rdfLiteral1602); 
                    pushFollow(FOLLOW_iriRef_in_rdfLiteral1604);
                    iriRef();

                    state._fsp--;


                    }


                    }
                    break;

            }


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
    // $ANTLR end "rdfLiteral"

    public static class numericLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "numericLiteral"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:285:2: numericLiteral : ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative );
    public final SourcePatternRewriterParser.numericLiteral_return numericLiteral() throws RecognitionException {
        SourcePatternRewriterParser.numericLiteral_return retval = new SourcePatternRewriterParser.numericLiteral_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:286:4: ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative )
            int alt47=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
                {
                alt47=1;
                }
                break;
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
                {
                alt47=2;
                }
                break;
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:286:6: numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral1627);
                    numericLiteralUnsigned();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:286:31: numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral1631);
                    numericLiteralPositive();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:286:56: numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral1635);
                    numericLiteralNegative();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "numericLiteral"

    public static class numericLiteralUnsigned_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "numericLiteralUnsigned"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:289:2: numericLiteralUnsigned : ( INTEGER | DECIMAL | DOUBLE );
    public final SourcePatternRewriterParser.numericLiteralUnsigned_return numericLiteralUnsigned() throws RecognitionException {
        SourcePatternRewriterParser.numericLiteralUnsigned_return retval = new SourcePatternRewriterParser.numericLiteralUnsigned_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:290:4: ( INTEGER | DECIMAL | DOUBLE )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            {
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=DOUBLE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "numericLiteralUnsigned"

    public static class numericLiteralPositive_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "numericLiteralPositive"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:293:2: numericLiteralPositive : ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE );
    public final SourcePatternRewriterParser.numericLiteralPositive_return numericLiteralPositive() throws RecognitionException {
        SourcePatternRewriterParser.numericLiteralPositive_return retval = new SourcePatternRewriterParser.numericLiteralPositive_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:294:4: ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            {
            if ( (input.LA(1)>=INTEGER_POSITIVE && input.LA(1)<=DOUBLE_POSITIVE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "numericLiteralPositive"

    public static class numericLiteralNegative_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "numericLiteralNegative"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:297:2: numericLiteralNegative : ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE );
    public final SourcePatternRewriterParser.numericLiteralNegative_return numericLiteralNegative() throws RecognitionException {
        SourcePatternRewriterParser.numericLiteralNegative_return retval = new SourcePatternRewriterParser.numericLiteralNegative_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:298:4: ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            {
            if ( (input.LA(1)>=INTEGER_NEGATIVE && input.LA(1)<=DOUBLE_NEGATIVE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "numericLiteralNegative"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "booleanLiteral"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:301:2: booleanLiteral : ( TRUE | FALSE );
    public final SourcePatternRewriterParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SourcePatternRewriterParser.booleanLiteral_return retval = new SourcePatternRewriterParser.booleanLiteral_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:302:4: ( TRUE | FALSE )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            {
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "booleanLiteral"

    public static class string_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "string"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:304:2: string : ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 );
    public final SourcePatternRewriterParser.string_return string() throws RecognitionException {
        SourcePatternRewriterParser.string_return retval = new SourcePatternRewriterParser.string_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:305:4: ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            {
            if ( (input.LA(1)>=STRING_LITERAL1 && input.LA(1)<=STRING_LITERAL_LONG2) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "string"

    public static class iriRef_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "iriRef"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:308:2: iriRef : ( IRI_REF | prefixedName );
    public final SourcePatternRewriterParser.iriRef_return iriRef() throws RecognitionException {
        SourcePatternRewriterParser.iriRef_return retval = new SourcePatternRewriterParser.iriRef_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:309:4: ( IRI_REF | prefixedName )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IRI_REF) ) {
                alt48=1;
            }
            else if ( (LA48_0==PNAME_LN) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:309:6: IRI_REF
                    {
                    match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef1785); 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:310:6: prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iriRef1792);
                    prefixedName();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "iriRef"

    public static class prefixedName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "prefixedName"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:313:2: prefixedName : p= PNAME_LN ;
    public final SourcePatternRewriterParser.prefixedName_return prefixedName() throws RecognitionException {
        SourcePatternRewriterParser.prefixedName_return retval = new SourcePatternRewriterParser.prefixedName_return();
        retval.start = input.LT(1);

        Token p=null;

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:314:4: (p= PNAME_LN )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:314:6: p= PNAME_LN
            {
            p=(Token)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName1813); 

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

    public static class blankNode_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blankNode"
    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:318:2: blankNode : ( BLANK_NODE_LABEL | ANON );
    public final SourcePatternRewriterParser.blankNode_return blankNode() throws RecognitionException {
        SourcePatternRewriterParser.blankNode_return retval = new SourcePatternRewriterParser.blankNode_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:319:4: ( BLANK_NODE_LABEL | ANON )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            {
            if ( (input.LA(1)>=BLANK_NODE_LABEL && input.LA(1)<=ANON) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "blankNode"

    // Delegated rules


 

    public static final BitSet FOLLOW_sourcePattern_in_rewrittenSourcePattern74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesBlock_in_sourcePattern89 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000020000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_sourcePattern94 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010B0000L});
    public static final BitSet FOLLOW_filter_in_sourcePattern98 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010B0000L});
    public static final BitSet FOLLOW_80_in_sourcePattern101 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010A0000L});
    public static final BitSet FOLLOW_triplesBlock_in_sourcePattern104 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000020000L});
    public static final BitSet FOLLOW_EOF_in_sourcePattern110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_wherePattern123 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010E0000L});
    public static final BitSet FOLLOW_triplesBlock_in_wherePattern125 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000060000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_wherePattern130 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010F0000L});
    public static final BitSet FOLLOW_filter_in_wherePattern134 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010F0000L});
    public static final BitSet FOLLOW_80_in_wherePattern137 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010E0000L});
    public static final BitSet FOLLOW_triplesBlock_in_wherePattern140 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000060000L});
    public static final BitSet FOLLOW_82_in_wherePattern146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_groupGraphPattern159 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010E0000L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPattern161 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000060000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_groupGraphPattern166 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010F0000L});
    public static final BitSet FOLLOW_filter_in_groupGraphPattern170 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010F0000L});
    public static final BitSet FOLLOW_80_in_groupGraphPattern173 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010E0000L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPattern176 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000060000L});
    public static final BitSet FOLLOW_82_in_groupGraphPattern182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesBlock197 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_triplesBlock201 = new BitSet(new long[]{0x000003FFFF800702L,0x0000000001080000L});
    public static final BitSet FOLLOW_triplesBlock_in_triplesBlock203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNotTriples221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNotTriples229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern261 = new BitSet(new long[]{0x000000C000000600L});
    public static final BitSet FOLLOW_varOrIriRef_in_graphGraphPattern263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern280 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_UNION_in_groupOrUnionGraphPattern284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern286 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_FILTER_in_filter302 = new BitSet(new long[]{0x000000C0003FF800L,0x0000000000080000L});
    public static final BitSet FOLLOW_constraint_in_filter304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_constraint319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_functionCall342 = new BitSet(new long[]{0x0000000000000100L,0x0000000000080000L});
    public static final BitSet FOLLOW_argList_in_functionCall344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_argList357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_argList361 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_argList363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_84_in_argList367 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_argList369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_85_in_argList374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubject389 = new BitSet(new long[]{0x000000C000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubject395 = new BitSet(new long[]{0x000000C000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propertyList_in_triplesSameSubject397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty414 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001080000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_propertyListNotEmpty425 = new BitSet(new long[]{0x000000C000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty428 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001080000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_propertyList449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_objectList467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_objectList475 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001080000L});
    public static final BitSet FOLLOW_object_in_objectList479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_graphNode_in_object501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_verb516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_verb523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_in_triplesNode538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNodePropertyList_in_triplesNode542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_blankNodePropertyList555 = new BitSet(new long[]{0x000000C000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_blankNodePropertyList557 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_blankNodePropertyList559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_collection574 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001080000L});
    public static final BitSet FOLLOW_graphNode_in_collection576 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001280000L});
    public static final BitSet FOLLOW_85_in_collection579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_graphNode594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIriRef637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIriRef643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR1_in_var658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR2_in_var676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_graphTerm727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_expression742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression757 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_conditionalOrExpression760 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression762 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression779 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_conditionalAndExpression783 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression785 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_relationalExpression_in_valueLogical803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression818 = new BitSet(new long[]{0x0000000000000002L,0x00000003F0000000L});
    public static final BitSet FOLLOW_92_in_relationalExpression846 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_relationalExpression875 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_relationalExpression904 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_relationalExpression933 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_relationalExpression962 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_relationalExpression990 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_numericExpression1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1053 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_98_in_additiveExpression1057 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1059 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_99_in_additiveExpression1093 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1095 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_additiveExpression1129 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_additiveExpression1163 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1215 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_100_in_multiplicativeExpression1219 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1221 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_101_in_multiplicativeExpression1225 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1228 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_102_in_unaryExpression1249 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_unaryExpression1258 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_unaryExpression1267 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_primaryExpression1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRefOrFunction_in_primaryExpression1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_primaryExpression1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_brackettedExpression1354 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_brackettedExpression1356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_brackettedExpression1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_builtInCall1377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1379 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANG_in_builtInCall1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1392 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall1403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1405 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_builtInCall1409 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall1420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1422 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1435 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_var_in_builtInCall1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall1446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1448 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_builtInCall1452 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1465 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall1476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1478 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1492 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall1503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1505 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexExpression1538 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_regexExpression1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexExpression1542 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_regexExpression1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_84_in_regexExpression1547 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_regexExpression1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_regexExpression1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction1572 = new BitSet(new long[]{0x0000000000000102L,0x0000000000080000L});
    public static final BitSet FOLLOW_argList_in_iriRefOrFunction1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_rdfLiteral1594 = new BitSet(new long[]{0x0000000000400002L,0x0000008000000000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rdfLiteral1602 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralUnsigned0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralPositive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralNegative0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_blankNode0 = new BitSet(new long[]{0x0000000000000002L});

}