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
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g 2010-07-23 15:15:37

  package de.fuberlin.wiwiss.r2r.parser;
  
  import java.util.Set;
  import java.util.HashSet;
  import java.util.Map;
  import java.util.HashMap;
  import de.fuberlin.wiwiss.r2r.PrefixMapper;
  import com.hp.hpl.jena.util.PrintUtil;
  import de.fuberlin.wiwiss.r2r.parser.ParseException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SourcePatternParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OPTIONAL", "GRAPH", "UNION", "FILTER", "VAR1", "VAR2", "STR", "LANG", "LANGMATCHES", "DATATYPE", "BOUND", "SAMETERM", "ISIRI", "ISURI", "ISBLANK", "ISLITERAL", "REGEX", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "TRUE", "FALSE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "IRI_REF", "PNAME_LN", "BLANK_NODE_LABEL", "WS", "G", "R", "A", "P", "H", "S", "T", "I", "U", "O", "N", "L", "M", "C", "E", "B", "K", "D", "F", "Y", "X", "J", "Q", "V", "W", "Z", "PN_PREFIX", "PNAME_NS", "PN_LOCAL", "VARNAME", "EXPONENT", "ECHAR", "PN_CHARS_U", "PN_CHARS_BASE", "PN_CHARS", "HEX", "COMMENT", "'.'", "'{'", "'}'", "'('", "','", "')'", "';'", "'a'", "'['", "']'", "'||'", "'&&'", "'='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'^^'"
    };
    public static final int EXPONENT=71;
    public static final int GRAPH=5;
    public static final int REGEX=20;
    public static final int PNAME_LN=38;
    public static final int EOF=-1;
    public static final int VARNAME=70;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int ISLITERAL=19;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int LANGMATCHES=12;
    public static final int DOUBLE=24;
    public static final int PN_CHARS_U=73;
    public static final int COMMENT=77;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int DOUBLE_POSITIVE=27;
    public static final int BOUND=14;
    public static final int T__97=97;
    public static final int ISIRI=16;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int D=58;
    public static final int E=55;
    public static final int F=59;
    public static final int G=41;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int A=43;
    public static final int T__82=82;
    public static final int B=56;
    public static final int T__83=83;
    public static final int C=54;
    public static final int L=52;
    public static final int M=53;
    public static final int N=51;
    public static final int O=50;
    public static final int H=45;
    public static final int I=48;
    public static final int J=62;
    public static final int BLANK_NODE_LABEL=39;
    public static final int K=57;
    public static final int U=49;
    public static final int T=47;
    public static final int W=65;
    public static final int V=64;
    public static final int Q=63;
    public static final int P=44;
    public static final int S=46;
    public static final int R=42;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int Y=60;
    public static final int ISBLANK=18;
    public static final int T__88=88;
    public static final int X=61;
    public static final int Z=66;
    public static final int WS=40;
    public static final int INTEGER_POSITIVE=25;
    public static final int STRING_LITERAL2=34;
    public static final int FILTER=7;
    public static final int STRING_LITERAL1=33;
    public static final int PN_CHARS=75;
    public static final int DATATYPE=13;
    public static final int DOUBLE_NEGATIVE=30;
    public static final int FALSE=32;
    public static final int T__79=79;
    public static final int LANG=11;
    public static final int T__78=78;
    public static final int IRI_REF=37;
    public static final int ISURI=17;
    public static final int STR=10;
    public static final int SAMETERM=15;
    public static final int HEX=76;
    public static final int DECIMAL_POSITIVE=26;
    public static final int INTEGER=22;
    public static final int INTEGER_NEGATIVE=28;
    public static final int PN_LOCAL=69;
    public static final int PNAME_NS=68;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int TRUE=31;
    public static final int UNION=6;
    public static final int ECHAR=72;
    public static final int OPTIONAL=4;
    public static final int PN_CHARS_BASE=74;
    public static final int STRING_LITERAL_LONG2=36;
    public static final int DECIMAL=23;
    public static final int VAR1=8;
    public static final int VAR2=9;
    public static final int STRING_LITERAL_LONG1=35;
    public static final int DECIMAL_NEGATIVE=29;
    public static final int PN_PREFIX=67;
    public static final int LANGTAG=21;

    // delegates
    // delegators


        public SourcePatternParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SourcePatternParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SourcePatternParser.tokenNames; }
    public String getGrammarFileName() { return "/home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g"; }


      Set<String> variables = new HashSet<String>();
      int inOptional = 0;
      Set<String> prefixes = new HashSet<String>();
      Set<String> propertyDependencies = new HashSet<String>();
      Set<String> classDependencies = new HashSet<String>();
      
      PrefixMapper prefixMapper;
      
      public void setPrefixMapper(PrefixMapper pm) {
        prefixMapper = pm;
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


    public static class sourcePattern_return extends ParserRuleReturnScope {
        public Set<String> usedPrefixes;
        public Set<String> classes;
        public Set<String> properties;
        public int maxVarLength;
        public Set<String> vars;
    };

    // $ANTLR start "sourcePattern"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:67:1: sourcePattern returns [Set<String> usedPrefixes, Set<String> classes, Set<String> properties, int maxVarLength, Set<String> vars] : ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* EOF ;
    public final SourcePatternParser.sourcePattern_return sourcePattern() throws RecognitionException {
        SourcePatternParser.sourcePattern_return retval = new SourcePatternParser.sourcePattern_return();
        retval.start = input.LT(1);

        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:3: ( ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* EOF )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:5: ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* EOF
            {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:5: ( triplesBlock )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=VAR1 && LA1_0<=VAR2)||(LA1_0>=INTEGER && LA1_0<=BLANK_NODE_LABEL)||LA1_0==81||LA1_0==86) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:5: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_sourcePattern60);
                    triplesBlock();

                    state._fsp--;


                    }
                    break;

            }

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:19: ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=OPTIONAL && LA5_0<=GRAPH)||LA5_0==FILTER||LA5_0==79) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:20: ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )?
            	    {
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:20: ( graphPatternNotTriples | filter )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( ((LA2_0>=OPTIONAL && LA2_0<=GRAPH)||LA2_0==79) ) {
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
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:21: graphPatternNotTriples
            	            {
            	            pushFollow(FOLLOW_graphPatternNotTriples_in_sourcePattern65);
            	            graphPatternNotTriples();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:46: filter
            	            {
            	            pushFollow(FOLLOW_filter_in_sourcePattern69);
            	            filter();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:54: ( '.' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==78) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:54: '.'
            	            {
            	            match(input,78,FOLLOW_78_in_sourcePattern72); 

            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:59: ( triplesBlock )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( ((LA4_0>=VAR1 && LA4_0<=VAR2)||(LA4_0>=INTEGER && LA4_0<=BLANK_NODE_LABEL)||LA4_0==81||LA4_0==86) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:68:59: triplesBlock
            	            {
            	            pushFollow(FOLLOW_triplesBlock_in_sourcePattern75);
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

            match(input,EOF,FOLLOW_EOF_in_sourcePattern81); 
             
                  retval.usedPrefixes = prefixes;
                  retval.classes = classDependencies;
                  retval.properties = propertyDependencies;
                  retval.maxVarLength = 0;
                  for(String var: variables)
                    if(var.length()>retval.maxVarLength)
                      retval.maxVarLength = var.length();
                  if(!variables.contains("SUBJ"))
                    throw new ParseException("No SUBJ variable present in source pattern!");
                  retval.vars = variables;
                

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


    // $ANTLR start "wherePattern"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:83:1: wherePattern : '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' ;
    public final void wherePattern() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:3: ( '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:5: '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}'
            {
            match(input,79,FOLLOW_79_in_wherePattern100); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:9: ( triplesBlock )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=VAR1 && LA6_0<=VAR2)||(LA6_0>=INTEGER && LA6_0<=BLANK_NODE_LABEL)||LA6_0==81||LA6_0==86) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:9: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_wherePattern102);
                    triplesBlock();

                    state._fsp--;


                    }
                    break;

            }

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:23: ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=OPTIONAL && LA10_0<=GRAPH)||LA10_0==FILTER||LA10_0==79) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:24: ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )?
            	    {
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:24: ( graphPatternNotTriples | filter )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( ((LA7_0>=OPTIONAL && LA7_0<=GRAPH)||LA7_0==79) ) {
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
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:25: graphPatternNotTriples
            	            {
            	            pushFollow(FOLLOW_graphPatternNotTriples_in_wherePattern107);
            	            graphPatternNotTriples();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:50: filter
            	            {
            	            pushFollow(FOLLOW_filter_in_wherePattern111);
            	            filter();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:58: ( '.' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==78) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:58: '.'
            	            {
            	            match(input,78,FOLLOW_78_in_wherePattern114); 

            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:63: ( triplesBlock )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=VAR1 && LA9_0<=VAR2)||(LA9_0>=INTEGER && LA9_0<=BLANK_NODE_LABEL)||LA9_0==81||LA9_0==86) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:84:63: triplesBlock
            	            {
            	            pushFollow(FOLLOW_triplesBlock_in_wherePattern117);
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

            match(input,80,FOLLOW_80_in_wherePattern123); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "wherePattern"


    // $ANTLR start "groupGraphPattern"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:87:1: groupGraphPattern : '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' ;
    public final void groupGraphPattern() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:3: ( '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:5: '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}'
            {
            match(input,79,FOLLOW_79_in_groupGraphPattern136); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:9: ( triplesBlock )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=VAR1 && LA11_0<=VAR2)||(LA11_0>=INTEGER && LA11_0<=BLANK_NODE_LABEL)||LA11_0==81||LA11_0==86) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:9: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPattern138);
                    triplesBlock();

                    state._fsp--;


                    }
                    break;

            }

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:23: ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=OPTIONAL && LA15_0<=GRAPH)||LA15_0==FILTER||LA15_0==79) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:24: ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )?
            	    {
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:24: ( graphPatternNotTriples | filter )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( ((LA12_0>=OPTIONAL && LA12_0<=GRAPH)||LA12_0==79) ) {
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
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:25: graphPatternNotTriples
            	            {
            	            pushFollow(FOLLOW_graphPatternNotTriples_in_groupGraphPattern143);
            	            graphPatternNotTriples();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:50: filter
            	            {
            	            pushFollow(FOLLOW_filter_in_groupGraphPattern147);
            	            filter();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:58: ( '.' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==78) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:58: '.'
            	            {
            	            match(input,78,FOLLOW_78_in_groupGraphPattern150); 

            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:63: ( triplesBlock )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( ((LA14_0>=VAR1 && LA14_0<=VAR2)||(LA14_0>=INTEGER && LA14_0<=BLANK_NODE_LABEL)||LA14_0==81||LA14_0==86) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:88:63: triplesBlock
            	            {
            	            pushFollow(FOLLOW_triplesBlock_in_groupGraphPattern153);
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

            match(input,80,FOLLOW_80_in_groupGraphPattern159); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "groupGraphPattern"


    // $ANTLR start "triplesBlock"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:91:1: triplesBlock : triplesSameSubject ( '.' ( triplesBlock )? )? ;
    public final void triplesBlock() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:92:3: ( triplesSameSubject ( '.' ( triplesBlock )? )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:92:5: triplesSameSubject ( '.' ( triplesBlock )? )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_triplesBlock174);
            triplesSameSubject();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:92:24: ( '.' ( triplesBlock )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==78) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:92:26: '.' ( triplesBlock )?
                    {
                    match(input,78,FOLLOW_78_in_triplesBlock178); 
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:92:30: ( triplesBlock )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=VAR1 && LA16_0<=VAR2)||(LA16_0>=INTEGER && LA16_0<=BLANK_NODE_LABEL)||LA16_0==81||LA16_0==86) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:92:30: triplesBlock
                            {
                            pushFollow(FOLLOW_triplesBlock_in_triplesBlock180);
                            triplesBlock();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "triplesBlock"


    // $ANTLR start "graphPatternNotTriples"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:95:1: graphPatternNotTriples : ( optionalGraphPattern | groupOrUnionGraphPattern | graphGraphPattern );
    public final void graphPatternNotTriples() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:96:3: ( optionalGraphPattern | groupOrUnionGraphPattern | graphGraphPattern )
            int alt18=3;
            switch ( input.LA(1) ) {
            case OPTIONAL:
                {
                alt18=1;
                }
                break;
            case 79:
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:96:5: optionalGraphPattern
                    {
                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNotTriples198);
                    optionalGraphPattern();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:96:28: groupOrUnionGraphPattern
                    {
                    pushFollow(FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples202);
                    groupOrUnionGraphPattern();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:96:55: graphGraphPattern
                    {
                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNotTriples206);
                    graphGraphPattern();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "graphPatternNotTriples"


    // $ANTLR start "optionalGraphPattern"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:99:1: optionalGraphPattern : OPTIONAL groupGraphPattern ;
    public final void optionalGraphPattern() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:100:3: ( OPTIONAL groupGraphPattern )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:100:5: OPTIONAL groupGraphPattern
            {
             inOptional++; 
            match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern222); 
            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern224);
            groupGraphPattern();

            state._fsp--;

            inOptional--;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "optionalGraphPattern"


    // $ANTLR start "graphGraphPattern"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:103:1: graphGraphPattern : GRAPH varOrIriRef groupGraphPattern ;
    public final void graphGraphPattern() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:104:3: ( GRAPH varOrIriRef groupGraphPattern )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:104:5: GRAPH varOrIriRef groupGraphPattern
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern241); 
            pushFollow(FOLLOW_varOrIriRef_in_graphGraphPattern243);
            varOrIriRef();

            state._fsp--;

            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern245);
            groupGraphPattern();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "graphGraphPattern"


    // $ANTLR start "groupOrUnionGraphPattern"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:107:1: groupOrUnionGraphPattern : groupGraphPattern ( UNION groupGraphPattern )* ;
    public final void groupOrUnionGraphPattern() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:108:3: ( groupGraphPattern ( UNION groupGraphPattern )* )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:108:5: groupGraphPattern ( UNION groupGraphPattern )*
            {
            pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern260);
            groupGraphPattern();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:108:23: ( UNION groupGraphPattern )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==UNION) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:108:25: UNION groupGraphPattern
            	    {
            	    match(input,UNION,FOLLOW_UNION_in_groupOrUnionGraphPattern264); 
            	    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern266);
            	    groupGraphPattern();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "groupOrUnionGraphPattern"


    // $ANTLR start "filter"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:111:1: filter : FILTER constraint ;
    public final void filter() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:112:3: ( FILTER constraint )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:112:5: FILTER constraint
            {
            match(input,FILTER,FOLLOW_FILTER_in_filter282); 
            pushFollow(FOLLOW_constraint_in_filter284);
            constraint();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "filter"


    // $ANTLR start "constraint"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:115:1: constraint : ( brackettedExpression | builtInCall | functionCall );
    public final void constraint() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:116:3: ( brackettedExpression | builtInCall | functionCall )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 81:
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:116:5: brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_constraint299);
                    brackettedExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:116:28: builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_constraint303);
                    builtInCall();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:116:42: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_constraint307);
                    functionCall();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "constraint"


    // $ANTLR start "functionCall"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:119:1: functionCall : iriRef argList ;
    public final void functionCall() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:120:3: ( iriRef argList )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:120:5: iriRef argList
            {
            pushFollow(FOLLOW_iriRef_in_functionCall322);
            iriRef();

            state._fsp--;

            pushFollow(FOLLOW_argList_in_functionCall324);
            argList();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionCall"


    // $ANTLR start "argList"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:123:1: argList : ( nil | '(' expression ( ',' expression )* ')' );
    public final void argList() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:124:3: ( nil | '(' expression ( ',' expression )* ')' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==81) ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>=VAR1 && LA22_1<=REGEX)||(LA22_1>=INTEGER && LA22_1<=PNAME_LN)||LA22_1==81||(LA22_1>=96 && LA22_1<=97)||LA22_1==100) ) {
                    alt22=2;
                }
                else if ( (LA22_1==WS||LA22_1==83) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:124:5: nil
                    {
                    pushFollow(FOLLOW_nil_in_argList337);
                    nil();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:124:11: '(' expression ( ',' expression )* ')'
                    {
                    match(input,81,FOLLOW_81_in_argList341); 
                    pushFollow(FOLLOW_expression_in_argList343);
                    expression();

                    state._fsp--;

                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:124:26: ( ',' expression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==82) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:124:28: ',' expression
                    	    {
                    	    match(input,82,FOLLOW_82_in_argList347); 
                    	    pushFollow(FOLLOW_expression_in_argList349);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match(input,83,FOLLOW_83_in_argList354); 

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
        return ;
    }
    // $ANTLR end "argList"


    // $ANTLR start "triplesSameSubject"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:127:1: triplesSameSubject : ( varOrTerm propertyListNotEmpty | triplesNode propertyList );
    public final void triplesSameSubject() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:128:3: ( varOrTerm propertyListNotEmpty | triplesNode propertyList )
            int alt23=2;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
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
            case BLANK_NODE_LABEL:
                {
                alt23=1;
                }
                break;
            case 86:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==WS||LA23_2==87) ) {
                    alt23=1;
                }
                else if ( ((LA23_2>=IRI_REF && LA23_2<=PNAME_LN)||LA23_2==85) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case 81:
                {
                int LA23_3 = input.LA(2);

                if ( ((LA23_3>=VAR1 && LA23_3<=VAR2)||(LA23_3>=INTEGER && LA23_3<=BLANK_NODE_LABEL)||LA23_3==81||LA23_3==86) ) {
                    alt23=2;
                }
                else if ( (LA23_3==WS||LA23_3==83) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:128:5: varOrTerm propertyListNotEmpty
                    {
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubject369);
                    varOrTerm();

                    state._fsp--;

                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject371);
                    propertyListNotEmpty();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:128:38: triplesNode propertyList
                    {
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubject375);
                    triplesNode();

                    state._fsp--;

                    pushFollow(FOLLOW_propertyList_in_triplesSameSubject377);
                    propertyList();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "triplesSameSubject"


    // $ANTLR start "propertyListNotEmpty"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:131:1: propertyListNotEmpty : v= verb oList= objectList ( ';' (v= verb oList= objectList )? )* ;
    public final void propertyListNotEmpty() throws RecognitionException {
        String v = null;

        List<String> oList = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:132:3: (v= verb oList= objectList ( ';' (v= verb oList= objectList )? )* )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:132:5: v= verb oList= objectList ( ';' (v= verb oList= objectList )? )*
            {
            pushFollow(FOLLOW_verb_in_propertyListNotEmpty394);
            v=verb();

            state._fsp--;

            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty398);
            oList=objectList();

            state._fsp--;


                  if(v!=null && v.equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")) {
                    List<String> objects = oList;
                    for(String object: objects) {
                      if(object!=null)
                        classDependencies.add(object);
                    }
                  }
                
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:142:4: ( ';' (v= verb oList= objectList )? )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==84) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:142:6: ';' (v= verb oList= objectList )?
            	    {
            	    match(input,84,FOLLOW_84_in_propertyListNotEmpty411); 
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:142:10: (v= verb oList= objectList )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( ((LA24_0>=IRI_REF && LA24_0<=PNAME_LN)||LA24_0==85) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:142:11: v= verb oList= objectList
            	            {
            	            pushFollow(FOLLOW_verb_in_propertyListNotEmpty416);
            	            v=verb();

            	            state._fsp--;

            	            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty420);
            	            oList=objectList();

            	            state._fsp--;


            	            			      if(v!=null && v.equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")) {
            	            			        List<String> objects = oList;
            	            			        for(String object: objects) {
            	            			          if(object!=null)
            	            			            classDependencies.add(object);
            	            			        }
            	            			      }
            	            			   

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertyListNotEmpty"


    // $ANTLR start "propertyList"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:156:1: propertyList : ( propertyListNotEmpty )? ;
    public final void propertyList() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:157:3: ( ( propertyListNotEmpty )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:157:5: ( propertyListNotEmpty )?
            {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:157:5: ( propertyListNotEmpty )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=IRI_REF && LA26_0<=PNAME_LN)||LA26_0==85) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:157:5: propertyListNotEmpty
                    {
                    pushFollow(FOLLOW_propertyListNotEmpty_in_propertyList464);
                    propertyListNotEmpty();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertyList"


    // $ANTLR start "objectList"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:160:1: objectList returns [List<String> values] : o= object ( ',' o= object )* ;
    public final List<String> objectList() throws RecognitionException {
        List<String> values = null;

        String o = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:161:3: (o= object ( ',' o= object )* )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:161:5: o= object ( ',' o= object )*
            {
            pushFollow(FOLLOW_object_in_objectList486);
            o=object();

            state._fsp--;

             values = new ArrayList<String>(); values.add(o);
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:162:5: ( ',' o= object )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==82) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:162:7: ',' o= object
            	    {
            	    match(input,82,FOLLOW_82_in_objectList496); 
            	    pushFollow(FOLLOW_object_in_objectList500);
            	    o=object();

            	    state._fsp--;

            	     values.add(o);

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return values;
    }
    // $ANTLR end "objectList"


    // $ANTLR start "object"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:166:1: object returns [String value] : graphNode ;
    public final String object() throws RecognitionException {
        String value = null;

        String graphNode1 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:167:3: ( graphNode )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:167:5: graphNode
            {
            pushFollow(FOLLOW_graphNode_in_object528);
            graphNode1=graphNode();

            state._fsp--;

            value = graphNode1;

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


    // $ANTLR start "verb"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:170:1: verb returns [String value] : ( iriRef | 'a' );
    public final String verb() throws RecognitionException {
        String value = null;

        String iriRef2 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:171:3: ( iriRef | 'a' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=IRI_REF && LA28_0<=PNAME_LN)) ) {
                alt28=1;
            }
            else if ( (LA28_0==85) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:171:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_verb549);
                    iriRef2=iriRef();

                    state._fsp--;


                          value = null;
                          if(iriRef2!=null && inOptional==0) {
                            propertyDependencies.add(iriRef2);
                            value = iriRef2;
                          }
                        

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:179:5: 'a'
                    {
                    match(input,85,FOLLOW_85_in_verb562); 

                          if(inOptional==0)
                            propertyDependencies.add("http://www.w3.org/1999/02/22-rdf-syntax-ns#type");
                        

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


    // $ANTLR start "triplesNode"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:186:1: triplesNode : ( collection | blankNodePropertyList );
    public final void triplesNode() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:187:3: ( collection | blankNodePropertyList )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==81) ) {
                alt29=1;
            }
            else if ( (LA29_0==86) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:187:5: collection
                    {
                    pushFollow(FOLLOW_collection_in_triplesNode583);
                    collection();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:187:18: blankNodePropertyList
                    {
                    pushFollow(FOLLOW_blankNodePropertyList_in_triplesNode587);
                    blankNodePropertyList();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "triplesNode"


    // $ANTLR start "blankNodePropertyList"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:190:1: blankNodePropertyList : '[' propertyListNotEmpty ']' ;
    public final void blankNodePropertyList() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:191:3: ( '[' propertyListNotEmpty ']' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:191:5: '[' propertyListNotEmpty ']'
            {
            match(input,86,FOLLOW_86_in_blankNodePropertyList600); 
            pushFollow(FOLLOW_propertyListNotEmpty_in_blankNodePropertyList602);
            propertyListNotEmpty();

            state._fsp--;

            match(input,87,FOLLOW_87_in_blankNodePropertyList604); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "blankNodePropertyList"


    // $ANTLR start "collection"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:194:1: collection : '(' ( graphNode )+ ')' ;
    public final void collection() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:195:3: ( '(' ( graphNode )+ ')' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:195:5: '(' ( graphNode )+ ')'
            {
            match(input,81,FOLLOW_81_in_collection619); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:195:9: ( graphNode )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=VAR1 && LA30_0<=VAR2)||(LA30_0>=INTEGER && LA30_0<=BLANK_NODE_LABEL)||LA30_0==81||LA30_0==86) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:195:9: graphNode
            	    {
            	    pushFollow(FOLLOW_graphNode_in_collection621);
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

            match(input,83,FOLLOW_83_in_collection624); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "collection"


    // $ANTLR start "graphNode"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:198:1: graphNode returns [String value] : ( varOrTerm | triplesNode );
    public final String graphNode() throws RecognitionException {
        String value = null;

        String varOrTerm3 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:199:3: ( varOrTerm | triplesNode )
            int alt31=2;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
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
            case BLANK_NODE_LABEL:
                {
                alt31=1;
                }
                break;
            case 86:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==WS||LA31_2==87) ) {
                    alt31=1;
                }
                else if ( ((LA31_2>=IRI_REF && LA31_2<=PNAME_LN)||LA31_2==85) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case 81:
                {
                int LA31_3 = input.LA(2);

                if ( ((LA31_3>=VAR1 && LA31_3<=VAR2)||(LA31_3>=INTEGER && LA31_3<=BLANK_NODE_LABEL)||LA31_3==81||LA31_3==86) ) {
                    alt31=2;
                }
                else if ( (LA31_3==WS||LA31_3==83) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:199:5: varOrTerm
                    {
                    pushFollow(FOLLOW_varOrTerm_in_graphNode643);
                    varOrTerm3=varOrTerm();

                    state._fsp--;

                     value = varOrTerm3;

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:200:5: triplesNode
                    {
                    pushFollow(FOLLOW_triplesNode_in_graphNode651);
                    triplesNode();

                    state._fsp--;

                     value = null; 

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
    // $ANTLR end "graphNode"


    // $ANTLR start "varOrTerm"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:203:1: varOrTerm returns [String value] : ( var | graphTerm );
    public final String varOrTerm() throws RecognitionException {
        String value = null;

        String graphTerm4 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:204:3: ( var | graphTerm )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=VAR1 && LA32_0<=VAR2)) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=INTEGER && LA32_0<=BLANK_NODE_LABEL)||LA32_0==81||LA32_0==86) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:204:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrTerm672);
                    var();

                    state._fsp--;

                     value = null; 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:205:5: graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm680);
                    graphTerm4=graphTerm();

                    state._fsp--;

                     value = graphTerm4; 

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


    // $ANTLR start "varOrIriRef"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:208:1: varOrIriRef returns [String value] : ( var | iriRef );
    public final String varOrIriRef() throws RecognitionException {
        String value = null;

        String iriRef5 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:209:3: ( var | iriRef )
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:209:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrIriRef701);
                    var();

                    state._fsp--;

                    value = null; 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:210:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_varOrIriRef712);
                    iriRef5=iriRef();

                    state._fsp--;

                    value = iriRef5; 

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
    // $ANTLR end "varOrIriRef"


    // $ANTLR start "var"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:213:1: var : ( VAR1 | VAR2 );
    public final void var() throws RecognitionException {
        Token VAR16=null;
        Token VAR27=null;

        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:214:3: ( VAR1 | VAR2 )
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:214:5: VAR1
                    {
                    VAR16=(Token)match(input,VAR1,FOLLOW_VAR1_in_var729); 
                     variables.add((VAR16!=null?VAR16.getText():null).substring(1));

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:214:55: VAR2
                    {
                    VAR27=(Token)match(input,VAR2,FOLLOW_VAR2_in_var735); 
                     variables.add((VAR27!=null?VAR27.getText():null).substring(1));

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
        return ;
    }
    // $ANTLR end "var"


    // $ANTLR start "graphTerm"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:217:1: graphTerm returns [String value] : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil );
    public final String graphTerm() throws RecognitionException {
        String value = null;

        String iriRef8 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:218:3: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil )
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
            case 86:
                {
                alt35=5;
                }
                break;
            case 81:
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:218:5: iriRef
                    {
                     value = null; 
                    pushFollow(FOLLOW_iriRef_in_graphTerm761);
                    iriRef8=iriRef();

                    state._fsp--;

                     value = iriRef8; 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:220:7: rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm771);
                    rdfLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:220:20: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm775);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:220:37: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm779);
                    booleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:220:54: blankNode
                    {
                    pushFollow(FOLLOW_blankNode_in_graphTerm783);
                    blankNode();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:220:66: nil
                    {
                    pushFollow(FOLLOW_nil_in_graphTerm787);
                    nil();

                    state._fsp--;


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


    // $ANTLR start "expression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:223:1: expression : conditionalOrExpression ;
    public final void expression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:224:3: ( conditionalOrExpression )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:224:5: conditionalOrExpression
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_expression802);
            conditionalOrExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "conditionalOrExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:227:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final void conditionalOrExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:228:3: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:228:5: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression817);
            conditionalAndExpression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:228:30: ( '||' conditionalAndExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==88) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:228:31: '||' conditionalAndExpression
            	    {
            	    match(input,88,FOLLOW_88_in_conditionalOrExpression820); 
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression822);
            	    conditionalAndExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "conditionalOrExpression"


    // $ANTLR start "conditionalAndExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:231:1: conditionalAndExpression : valueLogical ( '&&' valueLogical )* ;
    public final void conditionalAndExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:232:3: ( valueLogical ( '&&' valueLogical )* )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:232:5: valueLogical ( '&&' valueLogical )*
            {
            pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression839);
            valueLogical();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:232:18: ( '&&' valueLogical )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==89) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:232:20: '&&' valueLogical
            	    {
            	    match(input,89,FOLLOW_89_in_conditionalAndExpression843); 
            	    pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression845);
            	    valueLogical();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "conditionalAndExpression"


    // $ANTLR start "valueLogical"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:235:1: valueLogical : relationalExpression ;
    public final void valueLogical() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:236:3: ( relationalExpression )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:236:5: relationalExpression
            {
            pushFollow(FOLLOW_relationalExpression_in_valueLogical863);
            relationalExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "valueLogical"


    // $ANTLR start "relationalExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:239:1: relationalExpression : numericExpression ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )? ;
    public final void relationalExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:240:3: ( numericExpression ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:240:5: numericExpression ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )?
            {
            pushFollow(FOLLOW_numericExpression_in_relationalExpression878);
            numericExpression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:240:23: ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )?
            int alt38=7;
            switch ( input.LA(1) ) {
                case 90:
                    {
                    alt38=1;
                    }
                    break;
                case 91:
                    {
                    alt38=2;
                    }
                    break;
                case 92:
                    {
                    alt38=3;
                    }
                    break;
                case 93:
                    {
                    alt38=4;
                    }
                    break;
                case 94:
                    {
                    alt38=5;
                    }
                    break;
                case 95:
                    {
                    alt38=6;
                    }
                    break;
            }

            switch (alt38) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:241:25: '=' numericExpression
                    {
                    match(input,90,FOLLOW_90_in_relationalExpression906); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression908);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:242:25: '!=' numericExpression
                    {
                    match(input,91,FOLLOW_91_in_relationalExpression935); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression937);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:243:25: '<' numericExpression
                    {
                    match(input,92,FOLLOW_92_in_relationalExpression964); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression966);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:244:25: '>' numericExpression
                    {
                    match(input,93,FOLLOW_93_in_relationalExpression993); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression995);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:245:25: '<=' numericExpression
                    {
                    match(input,94,FOLLOW_94_in_relationalExpression1022); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression1024);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:246:25: '>=' numericExpression
                    {
                    match(input,95,FOLLOW_95_in_relationalExpression1050); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression1052);
                    numericExpression();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relationalExpression"


    // $ANTLR start "numericExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:250:2: numericExpression : additiveExpression ;
    public final void numericExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:251:4: ( additiveExpression )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:251:6: additiveExpression
            {
            pushFollow(FOLLOW_additiveExpression_in_numericExpression1094);
            additiveExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericExpression"


    // $ANTLR start "additiveExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:254:2: additiveExpression : multiplicativeExpression ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )* ;
    public final void additiveExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:255:4: ( multiplicativeExpression ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )* )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:255:6: multiplicativeExpression ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1113);
            multiplicativeExpression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:255:31: ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )*
            loop39:
            do {
                int alt39=5;
                switch ( input.LA(1) ) {
                case 96:
                    {
                    alt39=1;
                    }
                    break;
                case 97:
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
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:255:33: '+' multiplicativeExpression
            	    {
            	    match(input,96,FOLLOW_96_in_additiveExpression1117); 
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1119);
            	    multiplicativeExpression();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:256:33: '-' multiplicativeExpression
            	    {
            	    match(input,97,FOLLOW_97_in_additiveExpression1153); 
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1155);
            	    multiplicativeExpression();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:257:33: numericLiteralPositive
            	    {
            	    pushFollow(FOLLOW_numericLiteralPositive_in_additiveExpression1189);
            	    numericLiteralPositive();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:258:33: numericLiteralNegative
            	    {
            	    pushFollow(FOLLOW_numericLiteralNegative_in_additiveExpression1223);
            	    numericLiteralNegative();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "additiveExpression"


    // $ANTLR start "multiplicativeExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:262:2: multiplicativeExpression : unaryExpression ( '*' unaryExpression | '/' unaryExpression )* ;
    public final void multiplicativeExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:263:4: ( unaryExpression ( '*' unaryExpression | '/' unaryExpression )* )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:263:6: unaryExpression ( '*' unaryExpression | '/' unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1275);
            unaryExpression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:263:22: ( '*' unaryExpression | '/' unaryExpression )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==98) ) {
                    alt40=1;
                }
                else if ( (LA40_0==99) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:263:24: '*' unaryExpression
            	    {
            	    match(input,98,FOLLOW_98_in_multiplicativeExpression1279); 
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1281);
            	    unaryExpression();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:263:46: '/' unaryExpression
            	    {
            	    match(input,99,FOLLOW_99_in_multiplicativeExpression1285); 
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1288);
            	    unaryExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "unaryExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:266:2: unaryExpression : ( '!' primaryExpression | '+' primaryExpression | '-' primaryExpression | primaryExpression );
    public final void unaryExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:267:4: ( '!' primaryExpression | '+' primaryExpression | '-' primaryExpression | primaryExpression )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt41=1;
                }
                break;
            case 96:
                {
                alt41=2;
                }
                break;
            case 97:
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
            case 81:
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:267:6: '!' primaryExpression
                    {
                    match(input,100,FOLLOW_100_in_unaryExpression1309); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1311);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:268:6: '+' primaryExpression
                    {
                    match(input,96,FOLLOW_96_in_unaryExpression1318); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1320);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:269:6: '-' primaryExpression
                    {
                    match(input,97,FOLLOW_97_in_unaryExpression1327); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1329);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:270:6: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1336);
                    primaryExpression();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "unaryExpression"


    // $ANTLR start "primaryExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:273:2: primaryExpression : ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var );
    public final void primaryExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:274:4: ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var )
            int alt42=7;
            switch ( input.LA(1) ) {
            case 81:
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:274:6: brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_primaryExpression1353);
                    brackettedExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:275:6: builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_primaryExpression1360);
                    builtInCall();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:276:6: iriRefOrFunction
                    {
                    pushFollow(FOLLOW_iriRefOrFunction_in_primaryExpression1367);
                    iriRefOrFunction();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:277:6: rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_primaryExpression1374);
                    rdfLiteral();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:278:6: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression1381);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:279:6: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression1388);
                    booleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:280:6: var
                    {
                    pushFollow(FOLLOW_var_in_primaryExpression1395);
                    var();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "primaryExpression"


    // $ANTLR start "brackettedExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:283:2: brackettedExpression : '(' expression ')' ;
    public final void brackettedExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:284:4: ( '(' expression ')' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:284:6: '(' expression ')'
            {
            match(input,81,FOLLOW_81_in_brackettedExpression1414); 
            pushFollow(FOLLOW_expression_in_brackettedExpression1416);
            expression();

            state._fsp--;

            match(input,83,FOLLOW_83_in_brackettedExpression1418); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "brackettedExpression"


    // $ANTLR start "builtInCall"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:287:2: builtInCall : ( STR '(' expression ')' | LANG '(' expression ')' | LANGMATCHES '(' expression ',' expression ')' | DATATYPE '(' expression ')' | BOUND '(' var ')' | SAMETERM '(' expression ',' expression ')' | ISIRI '(' expression ')' | ISURI '(' expression ')' | ISBLANK '(' expression ')' | ISLITERAL '(' expression ')' | regexExpression );
    public final void builtInCall() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:288:4: ( STR '(' expression ')' | LANG '(' expression ')' | LANGMATCHES '(' expression ',' expression ')' | DATATYPE '(' expression ')' | BOUND '(' var ')' | SAMETERM '(' expression ',' expression ')' | ISIRI '(' expression ')' | ISURI '(' expression ')' | ISBLANK '(' expression ')' | ISLITERAL '(' expression ')' | regexExpression )
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:288:6: STR '(' expression ')'
                    {
                    match(input,STR,FOLLOW_STR_in_builtInCall1437); 
                    match(input,81,FOLLOW_81_in_builtInCall1439); 
                    pushFollow(FOLLOW_expression_in_builtInCall1441);
                    expression();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1443); 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:289:6: LANG '(' expression ')'
                    {
                    match(input,LANG,FOLLOW_LANG_in_builtInCall1450); 
                    match(input,81,FOLLOW_81_in_builtInCall1452); 
                    pushFollow(FOLLOW_expression_in_builtInCall1454);
                    expression();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1456); 

                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:290:6: LANGMATCHES '(' expression ',' expression ')'
                    {
                    match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall1463); 
                    match(input,81,FOLLOW_81_in_builtInCall1465); 
                    pushFollow(FOLLOW_expression_in_builtInCall1467);
                    expression();

                    state._fsp--;

                    match(input,82,FOLLOW_82_in_builtInCall1469); 
                    pushFollow(FOLLOW_expression_in_builtInCall1471);
                    expression();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1473); 

                    }
                    break;
                case 4 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:291:6: DATATYPE '(' expression ')'
                    {
                    match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall1480); 
                    match(input,81,FOLLOW_81_in_builtInCall1482); 
                    pushFollow(FOLLOW_expression_in_builtInCall1484);
                    expression();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1486); 

                    }
                    break;
                case 5 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:292:6: BOUND '(' var ')'
                    {
                    match(input,BOUND,FOLLOW_BOUND_in_builtInCall1493); 
                    match(input,81,FOLLOW_81_in_builtInCall1495); 
                    pushFollow(FOLLOW_var_in_builtInCall1497);
                    var();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1499); 

                    }
                    break;
                case 6 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:293:6: SAMETERM '(' expression ',' expression ')'
                    {
                    match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall1506); 
                    match(input,81,FOLLOW_81_in_builtInCall1508); 
                    pushFollow(FOLLOW_expression_in_builtInCall1510);
                    expression();

                    state._fsp--;

                    match(input,82,FOLLOW_82_in_builtInCall1512); 
                    pushFollow(FOLLOW_expression_in_builtInCall1514);
                    expression();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1516); 

                    }
                    break;
                case 7 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:294:6: ISIRI '(' expression ')'
                    {
                    match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall1523); 
                    match(input,81,FOLLOW_81_in_builtInCall1525); 
                    pushFollow(FOLLOW_expression_in_builtInCall1527);
                    expression();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1529); 

                    }
                    break;
                case 8 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:295:6: ISURI '(' expression ')'
                    {
                    match(input,ISURI,FOLLOW_ISURI_in_builtInCall1536); 
                    match(input,81,FOLLOW_81_in_builtInCall1538); 
                    pushFollow(FOLLOW_expression_in_builtInCall1540);
                    expression();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1542); 

                    }
                    break;
                case 9 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:296:6: ISBLANK '(' expression ')'
                    {
                    match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall1550); 
                    match(input,81,FOLLOW_81_in_builtInCall1552); 
                    pushFollow(FOLLOW_expression_in_builtInCall1554);
                    expression();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1556); 

                    }
                    break;
                case 10 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:297:6: ISLITERAL '(' expression ')'
                    {
                    match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall1563); 
                    match(input,81,FOLLOW_81_in_builtInCall1565); 
                    pushFollow(FOLLOW_expression_in_builtInCall1567);
                    expression();

                    state._fsp--;

                    match(input,83,FOLLOW_83_in_builtInCall1569); 

                    }
                    break;
                case 11 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:298:6: regexExpression
                    {
                    pushFollow(FOLLOW_regexExpression_in_builtInCall1576);
                    regexExpression();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "builtInCall"


    // $ANTLR start "regexExpression"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:301:2: regexExpression : REGEX '(' expression ',' expression ( ',' expression )? ')' ;
    public final void regexExpression() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:302:4: ( REGEX '(' expression ',' expression ( ',' expression )? ')' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:302:6: REGEX '(' expression ',' expression ( ',' expression )? ')'
            {
            match(input,REGEX,FOLLOW_REGEX_in_regexExpression1596); 
            match(input,81,FOLLOW_81_in_regexExpression1598); 
            pushFollow(FOLLOW_expression_in_regexExpression1600);
            expression();

            state._fsp--;

            match(input,82,FOLLOW_82_in_regexExpression1602); 
            pushFollow(FOLLOW_expression_in_regexExpression1604);
            expression();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:302:42: ( ',' expression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==82) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:302:43: ',' expression
                    {
                    match(input,82,FOLLOW_82_in_regexExpression1607); 
                    pushFollow(FOLLOW_expression_in_regexExpression1609);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,83,FOLLOW_83_in_regexExpression1613); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "regexExpression"


    // $ANTLR start "iriRefOrFunction"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:305:2: iriRefOrFunction : iriRef ( argList )? ;
    public final void iriRefOrFunction() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:306:4: ( iriRef ( argList )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:306:6: iriRef ( argList )?
            {
            pushFollow(FOLLOW_iriRef_in_iriRefOrFunction1632);
            iriRef();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:306:13: ( argList )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==81) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:306:13: argList
                    {
                    pushFollow(FOLLOW_argList_in_iriRefOrFunction1634);
                    argList();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "iriRefOrFunction"


    // $ANTLR start "rdfLiteral"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:309:2: rdfLiteral : string ( LANGTAG | ( '^^' iriRef ) )? ;
    public final void rdfLiteral() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:310:4: ( string ( LANGTAG | ( '^^' iriRef ) )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:310:6: string ( LANGTAG | ( '^^' iriRef ) )?
            {
            pushFollow(FOLLOW_string_in_rdfLiteral1654);
            string();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:310:13: ( LANGTAG | ( '^^' iriRef ) )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LANGTAG) ) {
                alt46=1;
            }
            else if ( (LA46_0==101) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:310:14: LANGTAG
                    {
                    match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral1657); 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:310:24: ( '^^' iriRef )
                    {
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:310:24: ( '^^' iriRef )
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:310:25: '^^' iriRef
                    {
                    match(input,101,FOLLOW_101_in_rdfLiteral1662); 
                    pushFollow(FOLLOW_iriRef_in_rdfLiteral1664);
                    iriRef();

                    state._fsp--;


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rdfLiteral"


    // $ANTLR start "numericLiteral"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:313:2: numericLiteral : ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative );
    public final void numericLiteral() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:314:4: ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative )
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:314:6: numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral1687);
                    numericLiteralUnsigned();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:314:31: numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral1691);
                    numericLiteralPositive();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:314:56: numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral1695);
                    numericLiteralNegative();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "numericLiteral"


    // $ANTLR start "numericLiteralUnsigned"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:317:2: numericLiteralUnsigned : ( INTEGER | DECIMAL | DOUBLE );
    public final void numericLiteralUnsigned() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:318:4: ( INTEGER | DECIMAL | DOUBLE )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericLiteralUnsigned"


    // $ANTLR start "numericLiteralPositive"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:321:2: numericLiteralPositive : ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE );
    public final void numericLiteralPositive() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:322:4: ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericLiteralPositive"


    // $ANTLR start "numericLiteralNegative"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:325:2: numericLiteralNegative : ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE );
    public final void numericLiteralNegative() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:326:4: ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericLiteralNegative"


    // $ANTLR start "booleanLiteral"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:329:2: booleanLiteral : ( TRUE | FALSE );
    public final void booleanLiteral() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:330:4: ( TRUE | FALSE )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "booleanLiteral"


    // $ANTLR start "string"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:332:2: string : ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 );
    public final void string() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:333:4: ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "string"


    // $ANTLR start "iriRef"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:336:2: iriRef returns [String value] : ( IRI_REF | prefixedName );
    public final String iriRef() throws RecognitionException {
        String value = null;

        Token IRI_REF9=null;
        SourcePatternParser.prefixedName_return prefixedName10 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:337:4: ( IRI_REF | prefixedName )
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
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:337:6: IRI_REF
                    {
                    IRI_REF9=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef1848); 
                     
                           String iri = (IRI_REF9!=null?IRI_REF9.getText():null);
                           value = iri.substring(1, iri.length()-1);
                         

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:342:6: prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iriRef1863);
                    prefixedName10=prefixedName();

                    state._fsp--;

                     
                         String qName = (prefixedName10!=null?input.toString(prefixedName10.start,prefixedName10.stop):null);
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
    };

    // $ANTLR start "prefixedName"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:365:2: prefixedName : p= PNAME_LN ;
    public final SourcePatternParser.prefixedName_return prefixedName() throws RecognitionException {
        SourcePatternParser.prefixedName_return retval = new SourcePatternParser.prefixedName_return();
        retval.start = input.LT(1);

        Token p=null;

        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:366:4: (p= PNAME_LN )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:366:6: p= PNAME_LN
            {
            p=(Token)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName1889); 

                   String qName = (p!=null?p.getText():null);
                   String[] split = qName.split(":");
                   prefixes.add(split[0]);
                 

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
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:375:2: blankNode : ( BLANK_NODE_LABEL | anon );
    public final void blankNode() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:376:3: ( BLANK_NODE_LABEL | anon )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==BLANK_NODE_LABEL) ) {
                alt49=1;
            }
            else if ( (LA49_0==86) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:376:5: BLANK_NODE_LABEL
                    {
                    match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode1915); 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:376:24: anon
                    {
                    pushFollow(FOLLOW_anon_in_blankNode1919);
                    anon();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "blankNode"


    // $ANTLR start "anon"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:379:2: anon : '[' ( WS )* ']' ;
    public final void anon() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:380:3: ( '[' ( WS )* ']' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:380:5: '[' ( WS )* ']'
            {
            match(input,86,FOLLOW_86_in_anon1936); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:380:9: ( WS )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==WS) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:380:9: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_anon1938); 

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            match(input,87,FOLLOW_87_in_anon1941); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "anon"


    // $ANTLR start "nil"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:383:2: nil : '(' ( WS )* ')' ;
    public final void nil() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:384:3: ( '(' ( WS )* ')' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:384:5: '(' ( WS )* ')'
            {
            match(input,81,FOLLOW_81_in_nil1957); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:384:9: ( WS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==WS) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/SourcePattern.g:384:9: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_nil1959); 

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            match(input,83,FOLLOW_83_in_nil1962); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nil"

    // Delegated rules


 

    public static final BitSet FOLLOW_triplesBlock_in_sourcePattern60 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000008000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_sourcePattern65 = new BitSet(new long[]{0x000000FFFFC003B0L,0x000000000042C000L});
    public static final BitSet FOLLOW_filter_in_sourcePattern69 = new BitSet(new long[]{0x000000FFFFC003B0L,0x000000000042C000L});
    public static final BitSet FOLLOW_78_in_sourcePattern72 = new BitSet(new long[]{0x000000FFFFC003B0L,0x0000000000428000L});
    public static final BitSet FOLLOW_triplesBlock_in_sourcePattern75 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000008000L});
    public static final BitSet FOLLOW_EOF_in_sourcePattern81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_wherePattern100 = new BitSet(new long[]{0x000000FFFFC003B0L,0x0000000000438000L});
    public static final BitSet FOLLOW_triplesBlock_in_wherePattern102 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000018000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_wherePattern107 = new BitSet(new long[]{0x000000FFFFC003B0L,0x000000000043C000L});
    public static final BitSet FOLLOW_filter_in_wherePattern111 = new BitSet(new long[]{0x000000FFFFC003B0L,0x000000000043C000L});
    public static final BitSet FOLLOW_78_in_wherePattern114 = new BitSet(new long[]{0x000000FFFFC003B0L,0x0000000000438000L});
    public static final BitSet FOLLOW_triplesBlock_in_wherePattern117 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000018000L});
    public static final BitSet FOLLOW_80_in_wherePattern123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_groupGraphPattern136 = new BitSet(new long[]{0x000000FFFFC003B0L,0x0000000000438000L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPattern138 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000018000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_groupGraphPattern143 = new BitSet(new long[]{0x000000FFFFC003B0L,0x000000000043C000L});
    public static final BitSet FOLLOW_filter_in_groupGraphPattern147 = new BitSet(new long[]{0x000000FFFFC003B0L,0x000000000043C000L});
    public static final BitSet FOLLOW_78_in_groupGraphPattern150 = new BitSet(new long[]{0x000000FFFFC003B0L,0x0000000000438000L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPattern153 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000018000L});
    public static final BitSet FOLLOW_80_in_groupGraphPattern159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesBlock174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_triplesBlock178 = new BitSet(new long[]{0x000000FFFFC00302L,0x0000000000420000L});
    public static final BitSet FOLLOW_triplesBlock_in_triplesBlock180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNotTriples198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNotTriples206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern241 = new BitSet(new long[]{0x0000006000000300L});
    public static final BitSet FOLLOW_varOrIriRef_in_graphGraphPattern243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern260 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_UNION_in_groupOrUnionGraphPattern264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern266 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_FILTER_in_filter282 = new BitSet(new long[]{0x00000060001FFC00L,0x0000000000020000L});
    public static final BitSet FOLLOW_constraint_in_filter284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_constraint299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_functionCall322 = new BitSet(new long[]{0x000000FFFFC00300L,0x0000000000420000L});
    public static final BitSet FOLLOW_argList_in_functionCall324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_argList337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_argList341 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_argList343 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_argList347 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_argList349 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_83_in_argList354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubject369 = new BitSet(new long[]{0x0000006000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubject375 = new BitSet(new long[]{0x0000006000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_propertyList_in_triplesSameSubject377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty394 = new BitSet(new long[]{0x000000FFFFC00300L,0x0000000000420000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty398 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_propertyListNotEmpty411 = new BitSet(new long[]{0x0000006000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty416 = new BitSet(new long[]{0x000000FFFFC00300L,0x0000000000420000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_propertyList464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_objectList486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_objectList496 = new BitSet(new long[]{0x000000FFFFC00300L,0x0000000000420000L});
    public static final BitSet FOLLOW_object_in_objectList500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_graphNode_in_object528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_verb549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_verb562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_in_triplesNode583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNodePropertyList_in_triplesNode587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_blankNodePropertyList600 = new BitSet(new long[]{0x0000006000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_blankNodePropertyList602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_blankNodePropertyList604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_collection619 = new BitSet(new long[]{0x000000FFFFC00300L,0x0000000000420000L});
    public static final BitSet FOLLOW_graphNode_in_collection621 = new BitSet(new long[]{0x000000FFFFC00300L,0x00000000004A0000L});
    public static final BitSet FOLLOW_83_in_collection624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_graphNode643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIriRef701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIriRef712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR1_in_var729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR2_in_var735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_graphTerm787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_expression802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression817 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_conditionalOrExpression820 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression822 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression839 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_conditionalAndExpression843 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression845 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_relationalExpression_in_valueLogical863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression878 = new BitSet(new long[]{0x0000000000000002L,0x00000000FC000000L});
    public static final BitSet FOLLOW_90_in_relationalExpression906 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_relationalExpression935 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_relationalExpression964 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_relationalExpression993 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_relationalExpression1022 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_relationalExpression1050 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_numericExpression1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1113 = new BitSet(new long[]{0x000000007FC00002L,0x0000000300000000L});
    public static final BitSet FOLLOW_96_in_additiveExpression1117 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1119 = new BitSet(new long[]{0x000000007FC00002L,0x0000000300000000L});
    public static final BitSet FOLLOW_97_in_additiveExpression1153 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1155 = new BitSet(new long[]{0x000000007FC00002L,0x0000000300000000L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_additiveExpression1189 = new BitSet(new long[]{0x000000007FC00002L,0x0000000300000000L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_additiveExpression1223 = new BitSet(new long[]{0x000000007FC00002L,0x0000000300000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1275 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_98_in_multiplicativeExpression1279 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1281 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_99_in_multiplicativeExpression1285 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1288 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_100_in_unaryExpression1309 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_unaryExpression1318 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_unaryExpression1327 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_primaryExpression1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRefOrFunction_in_primaryExpression1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_primaryExpression1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_brackettedExpression1414 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_brackettedExpression1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_brackettedExpression1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_builtInCall1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1439 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANG_in_builtInCall1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1452 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1465 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_builtInCall1469 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1482 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall1493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1495 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_var_in_builtInCall1497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall1506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1508 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_builtInCall1512 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1525 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1538 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall1550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1552 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall1563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_builtInCall1565 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexExpression1598 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_regexExpression1600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexExpression1602 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_regexExpression1604 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_regexExpression1607 = new BitSet(new long[]{0x0000007FFFDFFF00L,0x0000001300020000L});
    public static final BitSet FOLLOW_expression_in_regexExpression1609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexExpression1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction1632 = new BitSet(new long[]{0x000000FFFFC00302L,0x0000000000420000L});
    public static final BitSet FOLLOW_argList_in_iriRefOrFunction1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_rdfLiteral1654 = new BitSet(new long[]{0x0000000000200002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rdfLiteral1662 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralUnsigned0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralPositive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralNegative0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anon_in_blankNode1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_anon1936 = new BitSet(new long[]{0x0000010000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_anon1938 = new BitSet(new long[]{0x0000010000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_anon1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_nil1957 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_WS_in_nil1959 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_nil1962 = new BitSet(new long[]{0x0000000000000002L});

}