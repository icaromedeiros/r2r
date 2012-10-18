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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SourcePatternRewriterLexer extends Lexer {
    public static final int EXPONENT=72;
    public static final int GRAPH=5;
    public static final int PNAME_LN=39;
    public static final int REGEX=21;
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
    public static final int DOUBLE_POSITIVE=28;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int BOUND=15;
    public static final int T__96=96;
    public static final int ISIRI=17;
    public static final int T__95=95;
    public static final int D=59;
    public static final int E=56;
    public static final int F=60;
    public static final int G=42;
    public static final int T__80=80;
    public static final int A=44;
    public static final int T__81=81;
    public static final int B=57;
    public static final int T__82=82;
    public static final int C=55;
    public static final int T__83=83;
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
    public static final int STRING_LITERAL_LONG2=37;
    public static final int PN_CHARS_BASE=76;
    public static final int DECIMAL=24;
    public static final int VAR1=9;
    public static final int STRING_LITERAL_LONG1=36;
    public static final int VAR2=10;
    public static final int DECIMAL_NEGATIVE=30;
    public static final int PN_PREFIX=68;
    public static final int LANGTAG=22;

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


    // delegates
    // delegators

    public SourcePatternRewriterLexer() {;} 
    public SourcePatternRewriterLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SourcePatternRewriterLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g"; }

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:26:7: ( '.' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:27:7: ( '{' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:28:7: ( '}' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:29:7: ( '(' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:30:7: ( ',' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:31:7: ( ')' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:32:7: ( ';' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:32:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:33:7: ( 'a' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:33:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:34:7: ( '[' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:34:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:35:7: ( ']' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:35:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:36:7: ( '||' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:36:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:37:7: ( '&&' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:37:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:38:7: ( '=' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:38:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:39:7: ( '!=' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:39:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:40:7: ( '<' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:40:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:41:7: ( '>' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:41:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:42:7: ( '<=' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:42:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:43:7: ( '>=' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:43:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:44:7: ( '+' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:44:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:45:7: ( '-' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:45:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:46:8: ( '*' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:46:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:47:8: ( '/' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:47:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:48:8: ( '!' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:48:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:49:8: ( '^^' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:49:10: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "GRAPH"
    public final void mGRAPH() throws RecognitionException {
        try {
            int _type = GRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:323:7: ( G R A P H )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:323:9: G R A P H
            {
            mG(); 
            mR(); 
            mA(); 
            mP(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRAPH"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:324:5: ( S T R )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:324:7: S T R
            {
            mS(); 
            mT(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "ISURI"
    public final void mISURI() throws RecognitionException {
        try {
            int _type = ISURI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:325:7: ( I S U R I )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:325:9: I S U R I
            {
            mI(); 
            mS(); 
            mU(); 
            mR(); 
            mI(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISURI"

    // $ANTLR start "OPTIONAL"
    public final void mOPTIONAL() throws RecognitionException {
        try {
            int _type = OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:326:10: ( O P T I O N A L )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:326:12: O P T I O N A L
            {
            mO(); 
            mP(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTIONAL"

    // $ANTLR start "LANG"
    public final void mLANG() throws RecognitionException {
        try {
            int _type = LANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:327:6: ( L A N G )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:327:8: L A N G
            {
            mL(); 
            mA(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANG"

    // $ANTLR start "ISIRI"
    public final void mISIRI() throws RecognitionException {
        try {
            int _type = ISIRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:328:7: ( I S I R I )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:328:9: I S I R I
            {
            mI(); 
            mS(); 
            mI(); 
            mR(); 
            mI(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISIRI"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:329:7: ( U N I O N )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:329:9: U N I O N
            {
            mU(); 
            mN(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "LANGMATCHES"
    public final void mLANGMATCHES() throws RecognitionException {
        try {
            int _type = LANGMATCHES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:330:13: ( L A N G M A T C H E S )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:330:15: L A N G M A T C H E S
            {
            mL(); 
            mA(); 
            mN(); 
            mG(); 
            mM(); 
            mA(); 
            mT(); 
            mC(); 
            mH(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGMATCHES"

    // $ANTLR start "ISLITERAL"
    public final void mISLITERAL() throws RecognitionException {
        try {
            int _type = ISLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:331:11: ( I S L I T E R A L )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:331:13: I S L I T E R A L
            {
            mI(); 
            mS(); 
            mL(); 
            mI(); 
            mT(); 
            mE(); 
            mR(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISLITERAL"

    // $ANTLR start "ISBLANK"
    public final void mISBLANK() throws RecognitionException {
        try {
            int _type = ISBLANK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:332:9: ( I S B L A N K )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:332:11: I S B L A N K
            {
            mI(); 
            mS(); 
            mB(); 
            mL(); 
            mA(); 
            mN(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISBLANK"

    // $ANTLR start "BOUND"
    public final void mBOUND() throws RecognitionException {
        try {
            int _type = BOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:333:7: ( B O U N D )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:333:9: B O U N D
            {
            mB(); 
            mO(); 
            mU(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOUND"

    // $ANTLR start "FILTER"
    public final void mFILTER() throws RecognitionException {
        try {
            int _type = FILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:334:8: ( F I L T E R )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:334:10: F I L T E R
            {
            mF(); 
            mI(); 
            mL(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILTER"

    // $ANTLR start "DATATYPE"
    public final void mDATATYPE() throws RecognitionException {
        try {
            int _type = DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:335:10: ( D A T A T Y P E )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:335:12: D A T A T Y P E
            {
            mD(); 
            mA(); 
            mT(); 
            mA(); 
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATATYPE"

    // $ANTLR start "REGEX"
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:336:7: ( R E G E X )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:336:9: R E G E X
            {
            mR(); 
            mE(); 
            mG(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEX"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:337:6: ( T R U E )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:337:8: T R U E
            {
            mT(); 
            mR(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "SAMETERM"
    public final void mSAMETERM() throws RecognitionException {
        try {
            int _type = SAMETERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:338:10: ( S A M E T E R M )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:338:12: S A M E T E R M
            {
            mS(); 
            mA(); 
            mM(); 
            mE(); 
            mT(); 
            mE(); 
            mR(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAMETERM"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:339:7: ( F A L S E )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:339:9: F A L S E
            {
            mF(); 
            mA(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:341:11: ( ( 'a' | 'A' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:341:13: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:342:11: ( ( 'b' | 'B' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:342:13: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:343:11: ( ( 'c' | 'C' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:343:13: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:344:11: ( ( 'd' | 'D' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:344:13: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:345:11: ( ( 'e' | 'E' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:345:13: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:346:11: ( ( 'f' | 'F' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:346:13: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:347:11: ( ( 'g' | 'G' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:347:13: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:348:11: ( ( 'h' | 'H' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:348:13: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:349:11: ( ( 'i' | 'I' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:349:13: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:350:11: ( ( 'j' | 'J' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:350:13: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:351:11: ( ( 'k' | 'K' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:351:13: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:352:11: ( ( 'l' | 'L' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:352:13: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:353:11: ( ( 'm' | 'M' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:353:13: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:354:11: ( ( 'n' | 'N' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:354:13: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:355:11: ( ( 'o' | 'O' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:355:13: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:356:11: ( ( 'p' | 'P' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:356:13: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:357:11: ( ( 'q' | 'Q' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:357:13: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:358:11: ( ( 'r' | 'R' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:358:13: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:359:11: ( ( 's' | 'S' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:359:13: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:360:11: ( ( 't' | 'T' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:360:13: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:361:11: ( ( 'u' | 'U' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:361:13: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:362:11: ( ( 'v' | 'V' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:362:13: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:363:11: ( ( 'w' | 'W' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:363:13: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:364:11: ( ( 'x' | 'X' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:364:13: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:365:11: ( ( 'y' | 'Y' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:365:13: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:366:11: ( ( 'z' | 'Z' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:366:13: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "IRI_REF"
    public final void mIRI_REF() throws RecognitionException {
        try {
            int _type = IRI_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:372:3: ( '<' (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:372:5: '<' (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>'
            {
            match('<'); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:372:9: (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='!'||(LA1_0>='#' && LA1_0<=';')||LA1_0=='='||(LA1_0>='?' && LA1_0<='[')||LA1_0==']'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:372:10: ~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' )
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IRI_REF"

    // $ANTLR start "PNAME_NS"
    public final void mPNAME_NS() throws RecognitionException {
        try {
            int _type = PNAME_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:376:3: ( ( PN_PREFIX )? ':' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:376:5: ( PN_PREFIX )? ':'
            {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:376:5: ( PN_PREFIX )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u02FF')||(LA2_0>='\u0370' && LA2_0<='\u037D')||(LA2_0>='\u037F' && LA2_0<='\u1FFF')||(LA2_0>='\u200C' && LA2_0<='\u200D')||(LA2_0>='\u2070' && LA2_0<='\u218F')||(LA2_0>='\u2C00' && LA2_0<='\u2FEF')||(LA2_0>='\u3001' && LA2_0<='\uD7FF')||(LA2_0>='\uF900' && LA2_0<='\uFDCF')||(LA2_0>='\uFDF0' && LA2_0<='\uFFFD')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:376:5: PN_PREFIX
                    {
                    mPN_PREFIX(); 

                    }
                    break;

            }

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PNAME_NS"

    // $ANTLR start "PNAME_LN"
    public final void mPNAME_LN() throws RecognitionException {
        try {
            int _type = PNAME_LN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:380:3: ( PNAME_NS PN_LOCAL )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:380:5: PNAME_NS PN_LOCAL
            {
            mPNAME_NS(); 
            mPN_LOCAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PNAME_LN"

    // $ANTLR start "BLANK_NODE_LABEL"
    public final void mBLANK_NODE_LABEL() throws RecognitionException {
        try {
            int _type = BLANK_NODE_LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:384:3: ( '_:' PN_LOCAL )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:384:5: '_:' PN_LOCAL
            {
            match("_:"); 

            mPN_LOCAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANK_NODE_LABEL"

    // $ANTLR start "VAR1"
    public final void mVAR1() throws RecognitionException {
        try {
            int _type = VAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:388:3: ( '?' VARNAME )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:388:5: '?' VARNAME
            {
            match('?'); 
            mVARNAME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR1"

    // $ANTLR start "VAR2"
    public final void mVAR2() throws RecognitionException {
        try {
            int _type = VAR2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:392:3: ( '$' VARNAME )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:392:5: '$' VARNAME
            {
            match('$'); 
            mVARNAME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR2"

    // $ANTLR start "LANGTAG"
    public final void mLANGTAG() throws RecognitionException {
        try {
            int _type = LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:396:3: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:396:5: '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            {
            match('@'); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:396:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:396:32: ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:396:33: '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    {
            	    match('-'); 
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:396:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGTAG"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:400:3: ( ( '0' .. '9' )+ )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:400:5: ( '0' .. '9' )+
            {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:400:5: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:400:6: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:404:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='.') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:404:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:404:5: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:404:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('.'); 
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:404:21: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:404:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:404:35: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:404:39: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:404:40: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:408:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:408:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT
                    {
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:408:5: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:408:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    match('.'); 
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:408:21: ( '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:408:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:409:5: '.' ( '0' .. '9' )+ EXPONENT
                    {
                    match('.'); 
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:409:9: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:409:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;
                case 3 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:410:5: ( '0' .. '9' )+ EXPONENT
                    {
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:410:5: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:410:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "INTEGER_POSITIVE"
    public final void mINTEGER_POSITIVE() throws RecognitionException {
        try {
            int _type = INTEGER_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:414:3: ( '+' INTEGER )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:414:5: '+' INTEGER
            {
            match('+'); 
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_POSITIVE"

    // $ANTLR start "DECIMAL_POSITIVE"
    public final void mDECIMAL_POSITIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:418:3: ( '+' DECIMAL )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:418:5: '+' DECIMAL
            {
            match('+'); 
            mDECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_POSITIVE"

    // $ANTLR start "DOUBLE_POSITIVE"
    public final void mDOUBLE_POSITIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:422:3: ( '+' DOUBLE )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:422:5: '+' DOUBLE
            {
            match('+'); 
            mDOUBLE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_POSITIVE"

    // $ANTLR start "INTEGER_NEGATIVE"
    public final void mINTEGER_NEGATIVE() throws RecognitionException {
        try {
            int _type = INTEGER_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:426:3: ( '-' INTEGER )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:426:5: '-' INTEGER
            {
            match('-'); 
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_NEGATIVE"

    // $ANTLR start "DECIMAL_NEGATIVE"
    public final void mDECIMAL_NEGATIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:430:3: ( '-' DECIMAL )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:430:5: '-' DECIMAL
            {
            match('-'); 
            mDECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_NEGATIVE"

    // $ANTLR start "DOUBLE_NEGATIVE"
    public final void mDOUBLE_NEGATIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:434:3: ( '-' DOUBLE )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:434:5: '-' DOUBLE
            {
            match('-'); 
            mDOUBLE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_NEGATIVE"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:438:3: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:438:5: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:438:17: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:438:30: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:438:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "STRING_LITERAL1"
    public final void mSTRING_LITERAL1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:442:3: ( '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:442:5: '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:442:10: (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }
                else if ( (LA18_0=='\\') ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:442:11: ~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:442:58: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL1"

    // $ANTLR start "STRING_LITERAL2"
    public final void mSTRING_LITERAL2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:446:3: ( '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:446:5: '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"'
            {
            match('\"'); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:446:9: (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }
                else if ( (LA19_0=='\\') ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:446:10: ~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:446:57: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL2"

    // $ANTLR start "STRING_LITERAL_LONG1"
    public final void mSTRING_LITERAL_LONG1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:3: ( '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:5: '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); 

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:14: ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\'') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='\'') ) {
                        int LA22_3 = input.LA(3);

                        if ( ((LA22_3>='\u0000' && LA22_3<='&')||(LA22_3>='(' && LA22_3<='\uFFFF')) ) {
                            alt22=1;
                        }


                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='&')||(LA22_1>='(' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:15: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:15: ( '\\'' | '\\'\\'' )?
            	    int alt20=3;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0=='\'') ) {
            	        int LA20_1 = input.LA(2);

            	        if ( (LA20_1=='\'') ) {
            	            alt20=2;
            	        }
            	        else if ( ((LA20_1>='\u0000' && LA20_1<='&')||(LA20_1>='(' && LA20_1<='\uFFFF')) ) {
            	            alt20=1;
            	        }
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:17: '\\''
            	            {
            	            match('\''); 

            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:24: '\\'\\''
            	            {
            	            match("''"); 


            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:33: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0=='\\') ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:34: ~ ( '\\'' | '\\\\' )
            	            {
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:450:51: ECHAR
            	            {
            	            mECHAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match("'''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG1"

    // $ANTLR start "STRING_LITERAL_LONG2"
    public final void mSTRING_LITERAL_LONG2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:3: ( '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:5: '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); 

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:11: ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\"') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='\"') ) {
                        int LA25_3 = input.LA(3);

                        if ( ((LA25_3>='\u0000' && LA25_3<='!')||(LA25_3>='#' && LA25_3<='\uFFFF')) ) {
                            alt25=1;
                        }


                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<='!')||(LA25_1>='#' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<='!')||(LA25_0>='#' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:12: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:12: ( '\"' | '\"\"' )?
            	    int alt23=3;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0=='\"') ) {
            	        int LA23_1 = input.LA(2);

            	        if ( (LA23_1=='\"') ) {
            	            alt23=2;
            	        }
            	        else if ( ((LA23_1>='\u0000' && LA23_1<='!')||(LA23_1>='#' && LA23_1<='\uFFFF')) ) {
            	            alt23=1;
            	        }
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:14: '\"'
            	            {
            	            match('\"'); 

            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:20: '\"\"'
            	            {
            	            match("\"\""); 


            	            }
            	            break;

            	    }

            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:27: (~ ( '\"' | '\\\\' ) | ECHAR )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0=='\\') ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:28: ~ ( '\"' | '\\\\' )
            	            {
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:454:44: ECHAR
            	            {
            	            mECHAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match("\"\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG2"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            int _type = ECHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:458:3: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:458:5: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ECHAR"

    // $ANTLR start "NIL"
    public final void mNIL() throws RecognitionException {
        try {
            int _type = NIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:462:3: ( '(' ( WS )* ')' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:462:5: '(' ( WS )* ')'
            {
            match('('); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:462:9: ( WS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:462:9: WS
            	    {
            	    mWS(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NIL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:466:3: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:466:5: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ANON"
    public final void mANON() throws RecognitionException {
        try {
            int _type = ANON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:470:3: ( '[' ( WS )* ']' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:470:5: '[' ( WS )* ']'
            {
            match('['); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:470:9: ( WS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:470:9: WS
            	    {
            	    mWS(); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANON"

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            int _type = VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:474:3: ( ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:474:5: ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:474:29: ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')||LA28_0=='\u00B7'||(LA28_0>='\u00C0' && LA28_0<='\u00D6')||(LA28_0>='\u00D8' && LA28_0<='\u00F6')||(LA28_0>='\u00F8' && LA28_0<='\u037D')||(LA28_0>='\u037F' && LA28_0<='\u1FFF')||(LA28_0>='\u200C' && LA28_0<='\u200D')||(LA28_0>='\u203F' && LA28_0<='\u2040')||(LA28_0>='\u2070' && LA28_0<='\u218F')||(LA28_0>='\u2C00' && LA28_0<='\u2FEF')||(LA28_0>='\u3001' && LA28_0<='\uD7FF')||(LA28_0>='\uF900' && LA28_0<='\uFDCF')||(LA28_0>='\uFDF0' && LA28_0<='\uFFFD')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "PN_CHARS_BASE"
    public final void mPN_CHARS_BASE() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:478:3: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS_BASE"

    // $ANTLR start "PN_CHARS_U"
    public final void mPN_CHARS_U() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:494:3: ( PN_CHARS_BASE | '_' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS_U"

    // $ANTLR start "PN_PREFIX"
    public final void mPN_PREFIX() throws RecognitionException {
        try {
            int _type = PN_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:498:3: ( PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:498:5: PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:498:19: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>='-' && LA30_0<='.')||(LA30_0>='0' && LA30_0<='9')||(LA30_0>='A' && LA30_0<='Z')||LA30_0=='_'||(LA30_0>='a' && LA30_0<='z')||LA30_0=='\u00B7'||(LA30_0>='\u00C0' && LA30_0<='\u00D6')||(LA30_0>='\u00D8' && LA30_0<='\u00F6')||(LA30_0>='\u00F8' && LA30_0<='\u037D')||(LA30_0>='\u037F' && LA30_0<='\u1FFF')||(LA30_0>='\u200C' && LA30_0<='\u200D')||(LA30_0>='\u203F' && LA30_0<='\u2040')||(LA30_0>='\u2070' && LA30_0<='\u218F')||(LA30_0>='\u2C00' && LA30_0<='\u2FEF')||(LA30_0>='\u3001' && LA30_0<='\uD7FF')||(LA30_0>='\uF900' && LA30_0<='\uFDCF')||(LA30_0>='\uFDF0' && LA30_0<='\uFFFD')) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:498:20: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:498:20: ( PN_CHARS | '.' )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='-'||(LA29_0>='0' && LA29_0<='9')||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')||LA29_0=='\u00B7'||(LA29_0>='\u00C0' && LA29_0<='\u00D6')||(LA29_0>='\u00D8' && LA29_0<='\u00F6')||(LA29_0>='\u00F8' && LA29_0<='\u037D')||(LA29_0>='\u037F' && LA29_0<='\u1FFF')||(LA29_0>='\u200C' && LA29_0<='\u200D')||(LA29_0>='\u203F' && LA29_0<='\u2040')||(LA29_0>='\u2070' && LA29_0<='\u218F')||(LA29_0>='\u2C00' && LA29_0<='\u2FEF')||(LA29_0>='\u3001' && LA29_0<='\uD7FF')||(LA29_0>='\uF900' && LA29_0<='\uFDCF')||(LA29_0>='\uFDF0' && LA29_0<='\uFFFD')) ) {
                            int LA29_1 = input.LA(2);

                            if ( ((LA29_1>='-' && LA29_1<='.')||(LA29_1>='0' && LA29_1<='9')||(LA29_1>='A' && LA29_1<='Z')||LA29_1=='_'||(LA29_1>='a' && LA29_1<='z')||LA29_1=='\u00B7'||(LA29_1>='\u00C0' && LA29_1<='\u00D6')||(LA29_1>='\u00D8' && LA29_1<='\u00F6')||(LA29_1>='\u00F8' && LA29_1<='\u037D')||(LA29_1>='\u037F' && LA29_1<='\u1FFF')||(LA29_1>='\u200C' && LA29_1<='\u200D')||(LA29_1>='\u203F' && LA29_1<='\u2040')||(LA29_1>='\u2070' && LA29_1<='\u218F')||(LA29_1>='\u2C00' && LA29_1<='\u2FEF')||(LA29_1>='\u3001' && LA29_1<='\uD7FF')||(LA29_1>='\uF900' && LA29_1<='\uFDCF')||(LA29_1>='\uFDF0' && LA29_1<='\uFFFD')) ) {
                                alt29=1;
                            }


                        }
                        else if ( (LA29_0=='.') ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    mPN_CHARS(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PN_PREFIX"

    // $ANTLR start "PN_CHARS"
    public final void mPN_CHARS() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:502:3: ( PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS"

    // $ANTLR start "PN_LOCAL"
    public final void mPN_LOCAL() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:511:3: ( ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:511:5: ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:511:29: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>='-' && LA32_0<='.')||(LA32_0>='0' && LA32_0<='9')||(LA32_0>='A' && LA32_0<='Z')||LA32_0=='_'||(LA32_0>='a' && LA32_0<='z')||LA32_0=='\u00B7'||(LA32_0>='\u00C0' && LA32_0<='\u00D6')||(LA32_0>='\u00D8' && LA32_0<='\u00F6')||(LA32_0>='\u00F8' && LA32_0<='\u037D')||(LA32_0>='\u037F' && LA32_0<='\u1FFF')||(LA32_0>='\u200C' && LA32_0<='\u200D')||(LA32_0>='\u203F' && LA32_0<='\u2040')||(LA32_0>='\u2070' && LA32_0<='\u218F')||(LA32_0>='\u2C00' && LA32_0<='\u2FEF')||(LA32_0>='\u3001' && LA32_0<='\uD7FF')||(LA32_0>='\uF900' && LA32_0<='\uFDCF')||(LA32_0>='\uFDF0' && LA32_0<='\uFFFD')) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:511:30: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:511:30: ( PN_CHARS | '.' )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='-'||(LA31_0>='0' && LA31_0<='9')||(LA31_0>='A' && LA31_0<='Z')||LA31_0=='_'||(LA31_0>='a' && LA31_0<='z')||LA31_0=='\u00B7'||(LA31_0>='\u00C0' && LA31_0<='\u00D6')||(LA31_0>='\u00D8' && LA31_0<='\u00F6')||(LA31_0>='\u00F8' && LA31_0<='\u037D')||(LA31_0>='\u037F' && LA31_0<='\u1FFF')||(LA31_0>='\u200C' && LA31_0<='\u200D')||(LA31_0>='\u203F' && LA31_0<='\u2040')||(LA31_0>='\u2070' && LA31_0<='\u218F')||(LA31_0>='\u2C00' && LA31_0<='\u2FEF')||(LA31_0>='\u3001' && LA31_0<='\uD7FF')||(LA31_0>='\uF900' && LA31_0<='\uFDCF')||(LA31_0>='\uFDF0' && LA31_0<='\uFFFD')) ) {
                            int LA31_1 = input.LA(2);

                            if ( ((LA31_1>='-' && LA31_1<='.')||(LA31_1>='0' && LA31_1<='9')||(LA31_1>='A' && LA31_1<='Z')||LA31_1=='_'||(LA31_1>='a' && LA31_1<='z')||LA31_1=='\u00B7'||(LA31_1>='\u00C0' && LA31_1<='\u00D6')||(LA31_1>='\u00D8' && LA31_1<='\u00F6')||(LA31_1>='\u00F8' && LA31_1<='\u037D')||(LA31_1>='\u037F' && LA31_1<='\u1FFF')||(LA31_1>='\u200C' && LA31_1<='\u200D')||(LA31_1>='\u203F' && LA31_1<='\u2040')||(LA31_1>='\u2070' && LA31_1<='\u218F')||(LA31_1>='\u2C00' && LA31_1<='\u2FEF')||(LA31_1>='\u3001' && LA31_1<='\uD7FF')||(LA31_1>='\uF900' && LA31_1<='\uFDCF')||(LA31_1>='\uFDF0' && LA31_1<='\uFFFD')) ) {
                                alt31=1;
                            }


                        }
                        else if ( (LA31_0=='.') ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    mPN_CHARS(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_LOCAL"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:514:14: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:514:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:515:9: ( '#' ( . )* ( '\\n' | '\\r' ) )
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:515:11: '#' ( . )* ( '\\n' | '\\r' )
            {
            match('#'); 
            // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:515:15: ( . )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='\n'||LA33_0=='\r') ) {
                    alt33=2;
                }
                else if ( ((LA33_0>='\u0000' && LA33_0<='\t')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:515:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:8: ( T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | GRAPH | STR | ISURI | OPTIONAL | LANG | ISIRI | UNION | LANGMATCHES | ISLITERAL | ISBLANK | BOUND | FILTER | DATATYPE | REGEX | TRUE | SAMETERM | FALSE | IRI_REF | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | ECHAR | NIL | WS | ANON | VARNAME | PN_PREFIX | COMMENT )
        int alt34=69;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:10: T__80
                {
                mT__80(); 

                }
                break;
            case 2 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:16: T__81
                {
                mT__81(); 

                }
                break;
            case 3 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:22: T__82
                {
                mT__82(); 

                }
                break;
            case 4 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:28: T__83
                {
                mT__83(); 

                }
                break;
            case 5 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:34: T__84
                {
                mT__84(); 

                }
                break;
            case 6 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:40: T__85
                {
                mT__85(); 

                }
                break;
            case 7 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:46: T__86
                {
                mT__86(); 

                }
                break;
            case 8 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:52: T__87
                {
                mT__87(); 

                }
                break;
            case 9 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:58: T__88
                {
                mT__88(); 

                }
                break;
            case 10 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:64: T__89
                {
                mT__89(); 

                }
                break;
            case 11 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:70: T__90
                {
                mT__90(); 

                }
                break;
            case 12 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:76: T__91
                {
                mT__91(); 

                }
                break;
            case 13 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:82: T__92
                {
                mT__92(); 

                }
                break;
            case 14 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:88: T__93
                {
                mT__93(); 

                }
                break;
            case 15 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:94: T__94
                {
                mT__94(); 

                }
                break;
            case 16 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:100: T__95
                {
                mT__95(); 

                }
                break;
            case 17 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:106: T__96
                {
                mT__96(); 

                }
                break;
            case 18 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:112: T__97
                {
                mT__97(); 

                }
                break;
            case 19 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:118: T__98
                {
                mT__98(); 

                }
                break;
            case 20 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:124: T__99
                {
                mT__99(); 

                }
                break;
            case 21 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:130: T__100
                {
                mT__100(); 

                }
                break;
            case 22 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:137: T__101
                {
                mT__101(); 

                }
                break;
            case 23 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:144: T__102
                {
                mT__102(); 

                }
                break;
            case 24 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:151: T__103
                {
                mT__103(); 

                }
                break;
            case 25 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:158: GRAPH
                {
                mGRAPH(); 

                }
                break;
            case 26 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:164: STR
                {
                mSTR(); 

                }
                break;
            case 27 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:168: ISURI
                {
                mISURI(); 

                }
                break;
            case 28 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:174: OPTIONAL
                {
                mOPTIONAL(); 

                }
                break;
            case 29 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:183: LANG
                {
                mLANG(); 

                }
                break;
            case 30 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:188: ISIRI
                {
                mISIRI(); 

                }
                break;
            case 31 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:194: UNION
                {
                mUNION(); 

                }
                break;
            case 32 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:200: LANGMATCHES
                {
                mLANGMATCHES(); 

                }
                break;
            case 33 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:212: ISLITERAL
                {
                mISLITERAL(); 

                }
                break;
            case 34 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:222: ISBLANK
                {
                mISBLANK(); 

                }
                break;
            case 35 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:230: BOUND
                {
                mBOUND(); 

                }
                break;
            case 36 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:236: FILTER
                {
                mFILTER(); 

                }
                break;
            case 37 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:243: DATATYPE
                {
                mDATATYPE(); 

                }
                break;
            case 38 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:252: REGEX
                {
                mREGEX(); 

                }
                break;
            case 39 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:258: TRUE
                {
                mTRUE(); 

                }
                break;
            case 40 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:263: SAMETERM
                {
                mSAMETERM(); 

                }
                break;
            case 41 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:272: FALSE
                {
                mFALSE(); 

                }
                break;
            case 42 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:278: IRI_REF
                {
                mIRI_REF(); 

                }
                break;
            case 43 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:286: PNAME_NS
                {
                mPNAME_NS(); 

                }
                break;
            case 44 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:295: PNAME_LN
                {
                mPNAME_LN(); 

                }
                break;
            case 45 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:304: BLANK_NODE_LABEL
                {
                mBLANK_NODE_LABEL(); 

                }
                break;
            case 46 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:321: VAR1
                {
                mVAR1(); 

                }
                break;
            case 47 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:326: VAR2
                {
                mVAR2(); 

                }
                break;
            case 48 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:331: LANGTAG
                {
                mLANGTAG(); 

                }
                break;
            case 49 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:339: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 50 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:347: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 51 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:355: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 52 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:362: INTEGER_POSITIVE
                {
                mINTEGER_POSITIVE(); 

                }
                break;
            case 53 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:379: DECIMAL_POSITIVE
                {
                mDECIMAL_POSITIVE(); 

                }
                break;
            case 54 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:396: DOUBLE_POSITIVE
                {
                mDOUBLE_POSITIVE(); 

                }
                break;
            case 55 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:412: INTEGER_NEGATIVE
                {
                mINTEGER_NEGATIVE(); 

                }
                break;
            case 56 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:429: DECIMAL_NEGATIVE
                {
                mDECIMAL_NEGATIVE(); 

                }
                break;
            case 57 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:446: DOUBLE_NEGATIVE
                {
                mDOUBLE_NEGATIVE(); 

                }
                break;
            case 58 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:462: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 59 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:471: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); 

                }
                break;
            case 60 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:487: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 

                }
                break;
            case 61 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:503: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); 

                }
                break;
            case 62 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:524: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); 

                }
                break;
            case 63 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:545: ECHAR
                {
                mECHAR(); 

                }
                break;
            case 64 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:551: NIL
                {
                mNIL(); 

                }
                break;
            case 65 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:555: WS
                {
                mWS(); 

                }
                break;
            case 66 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:558: ANON
                {
                mANON(); 

                }
                break;
            case 67 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:563: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 68 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:571: PN_PREFIX
                {
                mPN_PREFIX(); 

                }
                break;
            case 69 :
                // /home/andreas/code/mavenprojects/mapping/SourceForger2rApi/r2r/antlr-files/SourcePatternRewriter.g:1:581: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA15_eotS =
        "\5\uffff";
    static final String DFA15_eofS =
        "\5\uffff";
    static final String DFA15_minS =
        "\2\56\3\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA15_specialS =
        "\5\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "407:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA34_eotS =
        "\1\uffff\1\57\2\uffff\1\61\3\uffff\1\62\1\67\4\uffff\1\71\1\74\1"+
        "\76\1\101\1\104\3\uffff\14\106\1\126\1\106\3\uffff\1\131\1\106\5"+
        "\uffff\1\142\4\uffff\1\106\1\143\5\uffff\1\144\4\uffff\1\146\2\uffff"+
        "\1\153\2\uffff\1\106\1\uffff\14\106\1\125\1\143\5\uffff\1\131\1"+
        "\106\1\142\1\136\1\uffff\1\140\5\uffff\1\u0083\2\uffff\1\u0083\1"+
        "\uffff\1\u0085\1\uffff\1\u0085\1\106\1\u0087\16\106\1\125\1\141"+
        "\1\142\2\uffff\1\u0083\1\uffff\1\u0085\1\uffff\1\106\1\uffff\6\106"+
        "\1\u009e\6\106\1\u00a5\1\u00a6\1\106\1\u00a8\2\106\1\u00ab\2\106"+
        "\1\uffff\1\u00ae\1\u00af\1\106\1\u00b1\1\106\1\u00b3\2\uffff\1\106"+
        "\1\uffff\2\106\1\uffff\2\106\2\uffff\1\u00b9\1\uffff\1\106\1\uffff"+
        "\2\106\1\u00bd\2\106\1\uffff\1\106\1\u00c1\1\106\1\uffff\1\u00c3"+
        "\1\106\1\u00c5\1\uffff\1\u00c6\1\uffff\1\106\2\uffff\1\106\1\u00c9"+
        "\1\uffff";
    static final String DFA34_eofS =
        "\u00ca\uffff";
    static final String DFA34_minS =
        "\1\11\1\60\2\uffff\1\11\3\uffff\1\55\1\11\4\uffff\1\75\1\41\1\75"+
        "\2\56\3\uffff\13\55\1\53\1\60\1\72\3\uffff\1\56\1\55\2\0\3\uffff"+
        "\1\60\4\uffff\3\55\4\uffff\1\41\4\uffff\1\56\1\60\1\uffff\1\56\1"+
        "\60\1\uffff\1\55\1\uffff\16\55\5\uffff\1\56\1\53\1\60\1\47\1\uffff"+
        "\1\42\5\uffff\1\60\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\21\55"+
        "\2\60\2\uffff\1\60\1\uffff\1\60\1\uffff\1\55\1\uffff\26\55\1\uffff"+
        "\6\55\2\uffff\1\55\1\uffff\2\55\1\uffff\2\55\2\uffff\1\55\1\uffff"+
        "\1\55\1\uffff\5\55\1\uffff\3\55\1\uffff\3\55\1\uffff\1\55\1\uffff"+
        "\1\55\2\uffff\2\55\1\uffff";
    static final String DFA34_maxS =
        "\1\ufffd\1\71\2\uffff\1\51\3\uffff\1\ufffd\1\135\4\uffff\1\75\1"+
        "\uffff\1\75\2\71\3\uffff\15\ufffd\1\72\3\uffff\2\ufffd\2\uffff\3"+
        "\uffff\1\145\4\uffff\3\ufffd\4\uffff\1\uffff\4\uffff\1\145\1\71"+
        "\1\uffff\1\145\1\71\1\uffff\1\ufffd\1\uffff\16\ufffd\5\uffff\1\ufffd"+
        "\1\71\1\145\1\47\1\uffff\1\42\5\uffff\1\145\2\uffff\1\145\1\uffff"+
        "\1\145\1\uffff\1\145\22\ufffd\1\145\2\uffff\1\145\1\uffff\1\145"+
        "\1\uffff\1\ufffd\1\uffff\26\ufffd\1\uffff\6\ufffd\2\uffff\1\ufffd"+
        "\1\uffff\2\ufffd\1\uffff\2\ufffd\2\uffff\1\ufffd\1\uffff\1\ufffd"+
        "\1\uffff\5\ufffd\1\uffff\3\ufffd\1\uffff\3\ufffd\1\uffff\1\ufffd"+
        "\1\uffff\1\ufffd\2\uffff\2\ufffd\1\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\2\uffff\1\12\1\13\1\14\1\15"+
        "\5\uffff\1\25\1\26\1\30\16\uffff\1\56\1\57\1\60\4\uffff\1\77\1\101"+
        "\1\105\1\uffff\1\1\1\100\1\4\1\10\3\uffff\1\102\1\11\1\16\1\27\1"+
        "\uffff\1\52\1\17\1\22\1\20\2\uffff\1\23\2\uffff\1\24\1\uffff\1\103"+
        "\16\uffff\1\72\1\53\1\54\1\55\1\61\4\uffff\1\73\1\uffff\1\74\1\63"+
        "\1\62\1\104\1\21\1\uffff\1\64\1\66\1\uffff\1\71\1\uffff\1\67\24"+
        "\uffff\1\75\1\76\1\uffff\1\65\1\uffff\1\70\1\uffff\1\32\26\uffff"+
        "\1\35\6\uffff\1\47\1\31\1\uffff\1\36\2\uffff\1\33\2\uffff\1\37\1"+
        "\43\1\uffff\1\51\1\uffff\1\46\5\uffff\1\44\3\uffff\1\42\3\uffff"+
        "\1\50\1\uffff\1\34\1\uffff\1\45\1\41\2\uffff\1\40";
    static final String DFA34_specialS =
        "\51\uffff\1\0\1\1\u009f\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\16\1\52\1\55\1\45\1\uffff"+
            "\1\14\1\51\1\4\1\6\1\23\1\21\1\5\1\22\1\1\1\24\12\47\1\42\1"+
            "\7\1\17\1\15\1\20\1\44\1\46\1\50\1\34\1\50\1\36\1\41\1\35\1"+
            "\26\1\50\1\30\2\50\1\32\2\50\1\31\2\50\1\37\1\27\1\40\1\33\5"+
            "\50\1\11\1\53\1\12\1\25\1\43\1\uffff\1\10\1\34\1\50\1\36\1\41"+
            "\1\35\1\26\1\50\1\30\2\50\1\32\2\50\1\31\2\50\1\37\1\27\1\40"+
            "\1\33\5\50\1\2\1\13\1\3\102\uffff\27\50\1\uffff\37\50\1\uffff"+
            "\u0208\50\160\uffff\16\50\1\uffff\u1c81\50\14\uffff\2\50\142"+
            "\uffff\u0120\50\u0a70\uffff\u03f0\50\21\uffff\ua7ff\50\u2100"+
            "\uffff\u04d0\50\40\uffff\u020e\50",
            "\12\56",
            "",
            "",
            "\2\60\2\uffff\1\60\22\uffff\1\60\10\uffff\1\60",
            "",
            "",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\2\66\2\uffff\1\66\22\uffff\1\66\74\uffff\1\66",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\73\1\uffff\31\73\1\uffff\1\72\36\73\1\uffff\1\73\1\uffff"+
            "\1\73\1\uffff\32\73\3\uffff\uff82\73",
            "\1\75",
            "\1\100\1\uffff\12\77",
            "\1\103\1\uffff\12\102",
            "",
            "",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\21\63\1\105\10\63\4\uffff"+
            "\1\63\1\uffff\21\63\1\105\10\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\110\22\63\1\107\6\63"+
            "\4\uffff\1\63\1\uffff\1\110\22\63\1\107\6\63\74\uffff\1\63\10"+
            "\uffff\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63"+
            "\14\uffff\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0"+
            "\63\21\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\22\63\1\111\7\63\4\uffff"+
            "\1\63\1\uffff\22\63\1\111\7\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\17\63\1\112\12\63\4\uffff"+
            "\1\63\1\uffff\17\63\1\112\12\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\113\31\63\4\uffff\1"+
            "\63\1\uffff\1\113\31\63\74\uffff\1\63\10\uffff\27\63\1\uffff"+
            "\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff"+
            "\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff"+
            "\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\15\63\1\114\14\63\4\uffff"+
            "\1\63\1\uffff\15\63\1\114\14\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\16\63\1\115\13\63\4\uffff"+
            "\1\63\1\uffff\16\63\1\115\13\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\117\7\63\1\116\21\63"+
            "\4\uffff\1\63\1\uffff\1\117\7\63\1\116\21\63\74\uffff\1\63\10"+
            "\uffff\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63"+
            "\14\uffff\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0"+
            "\63\21\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\120\31\63\4\uffff\1"+
            "\63\1\uffff\1\120\31\63\74\uffff\1\63\10\uffff\27\63\1\uffff"+
            "\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff"+
            "\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff"+
            "\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\121\25\63\4\uffff"+
            "\1\63\1\uffff\4\63\1\121\25\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\21\63\1\122\10\63\4\uffff"+
            "\1\63\1\uffff\21\63\1\122\10\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\125\1\uffff\1\124\1\65\1\uffff\12\123\1\42\6\uffff\32\63"+
            "\4\uffff\1\63\1\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff"+
            "\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff"+
            "\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff"+
            "\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\12\127\7\uffff\32\127\4\uffff\1\127\1\uffff\32\127\105\uffff"+
            "\27\127\1\uffff\37\127\1\uffff\u0208\127\160\uffff\16\127\1"+
            "\uffff\u1c81\127\14\uffff\2\127\142\uffff\u0120\127\u0a70\uffff"+
            "\u03f0\127\21\uffff\ua7ff\127\u2100\uffff\u04d0\127\40\uffff"+
            "\u020e\127",
            "\1\130",
            "",
            "",
            "",
            "\1\134\1\uffff\12\132\7\uffff\4\106\1\133\25\106\4\uffff\1"+
            "\106\1\uffff\4\106\1\133\25\106\74\uffff\1\106\10\uffff\27\106"+
            "\1\uffff\37\106\1\uffff\u0286\106\1\uffff\u1c81\106\14\uffff"+
            "\2\106\61\uffff\2\106\57\uffff\u0120\106\u0a70\uffff\u03f0\106"+
            "\21\uffff\ua7ff\106\u2100\uffff\u04d0\106\40\uffff\u020e\106",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\12\136\1\uffff\2\136\1\uffff\31\136\1\135\uffd8\136",
            "\12\140\1\uffff\2\140\1\uffff\24\140\1\137\uffdd\140",
            "",
            "",
            "",
            "\12\56\13\uffff\1\141\37\uffff\1\141",
            "",
            "",
            "",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\64\1\42\6\uffff\32\64\4\uffff\1\64\1"+
            "\uffff\32\64\74\uffff\1\64\10\uffff\27\64\1\uffff\37\64\1\uffff"+
            "\u0286\64\1\uffff\u1c81\64\14\uffff\2\64\61\uffff\2\64\57\uffff"+
            "\u0120\64\u0a70\uffff\u03f0\64\21\uffff\ua7ff\64\u2100\uffff"+
            "\u04d0\64\40\uffff\u020e\64",
            "\1\64\1\65\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff"+
            "\32\64\74\uffff\1\64\10\uffff\27\64\1\uffff\37\64\1\uffff\u0286"+
            "\64\1\uffff\u1c81\64\14\uffff\2\64\61\uffff\2\64\57\uffff\u0120"+
            "\64\u0a70\uffff\u03f0\64\21\uffff\ua7ff\64\u2100\uffff\u04d0"+
            "\64\40\uffff\u020e\64",
            "",
            "",
            "",
            "",
            "\1\73\1\uffff\31\73\1\uffff\37\73\1\uffff\1\73\1\uffff\1\73"+
            "\1\uffff\32\73\3\uffff\uff82\73",
            "",
            "",
            "",
            "",
            "\1\145\1\uffff\12\77\13\uffff\1\147\37\uffff\1\147",
            "\12\150",
            "",
            "\1\152\1\uffff\12\102\13\uffff\1\151\37\uffff\1\151",
            "\12\154",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\155\31\63\4\uffff\1"+
            "\63\1\uffff\1\155\31\63\74\uffff\1\63\10\uffff\27\63\1\uffff"+
            "\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff"+
            "\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff"+
            "\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\21\63\1\156\10\63\4\uffff"+
            "\1\63\1\uffff\21\63\1\156\10\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\14\63\1\157\15\63\4\uffff"+
            "\1\63\1\uffff\14\63\1\157\15\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\63\1\162\6\63\1\160"+
            "\2\63\1\161\10\63\1\163\5\63\4\uffff\1\63\1\uffff\1\63\1\162"+
            "\6\63\1\160\2\63\1\161\10\63\1\163\5\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\23\63\1\164\6\63\4\uffff"+
            "\1\63\1\uffff\23\63\1\164\6\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\15\63\1\165\14\63\4\uffff"+
            "\1\63\1\uffff\15\63\1\165\14\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\10\63\1\166\21\63\4\uffff"+
            "\1\63\1\uffff\10\63\1\166\21\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\24\63\1\167\5\63\4\uffff"+
            "\1\63\1\uffff\24\63\1\167\5\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\13\63\1\170\16\63\4\uffff"+
            "\1\63\1\uffff\13\63\1\170\16\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\13\63\1\171\16\63\4\uffff"+
            "\1\63\1\uffff\13\63\1\171\16\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\23\63\1\172\6\63\4\uffff"+
            "\1\63\1\uffff\23\63\1\172\6\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\6\63\1\173\23\63\4\uffff"+
            "\1\63\1\uffff\6\63\1\173\23\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\24\63\1\174\5\63\4\uffff"+
            "\1\63\1\uffff\24\63\1\174\5\63\74\uffff\1\63\10\uffff\27\63"+
            "\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2"+
            "\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\123\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\175\1\42\6\uffff\32\64\4\uffff\1\64\1"+
            "\uffff\32\64\74\uffff\1\64\10\uffff\27\64\1\uffff\37\64\1\uffff"+
            "\u0286\64\1\uffff\u1c81\64\14\uffff\2\64\61\uffff\2\64\57\uffff"+
            "\u0120\64\u0a70\uffff\u03f0\64\21\uffff\ua7ff\64\u2100\uffff"+
            "\u04d0\64\40\uffff\u020e\64",
            "",
            "",
            "",
            "",
            "",
            "\1\134\1\uffff\12\132\7\uffff\4\106\1\133\25\106\4\uffff\1"+
            "\106\1\uffff\4\106\1\133\25\106\74\uffff\1\106\10\uffff\27\106"+
            "\1\uffff\37\106\1\uffff\u0286\106\1\uffff\u1c81\106\14\uffff"+
            "\2\106\61\uffff\2\106\57\uffff\u0120\106\u0a70\uffff\u03f0\106"+
            "\21\uffff\ua7ff\106\u2100\uffff\u04d0\106\40\uffff\u020e\106",
            "\1\141\1\uffff\1\141\2\uffff\12\176",
            "\12\177\13\uffff\1\141\37\uffff\1\141",
            "\1\u0080",
            "",
            "\1\u0081",
            "",
            "",
            "",
            "",
            "",
            "\12\u0082\13\uffff\1\147\37\uffff\1\147",
            "",
            "",
            "\12\150\13\uffff\1\147\37\uffff\1\147",
            "",
            "\12\u0084\13\uffff\1\151\37\uffff\1\151",
            "",
            "\12\154\13\uffff\1\151\37\uffff\1\151",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\17\63\1\u0086\12\63\4"+
            "\uffff\1\63\1\uffff\17\63\1\u0086\12\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\u0088\25\63\4"+
            "\uffff\1\63\1\uffff\4\63\1\u0088\25\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\21\63\1\u0089\10\63\4"+
            "\uffff\1\63\1\uffff\21\63\1\u0089\10\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\10\63\1\u008a\21\63\4"+
            "\uffff\1\63\1\uffff\10\63\1\u008a\21\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\13\63\1\u008b\16\63\4"+
            "\uffff\1\63\1\uffff\13\63\1\u008b\16\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\21\63\1\u008c\10\63\4"+
            "\uffff\1\63\1\uffff\21\63\1\u008c\10\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\10\63\1\u008d\21\63\4"+
            "\uffff\1\63\1\uffff\10\63\1\u008d\21\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\6\63\1\u008e\23\63\4"+
            "\uffff\1\63\1\uffff\6\63\1\u008e\23\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\16\63\1\u008f\13\63\4"+
            "\uffff\1\63\1\uffff\16\63\1\u008f\13\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\15\63\1\u0090\14\63\4"+
            "\uffff\1\63\1\uffff\15\63\1\u0090\14\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\23\63\1\u0091\6\63\4"+
            "\uffff\1\63\1\uffff\23\63\1\u0091\6\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\22\63\1\u0092\7\63\4"+
            "\uffff\1\63\1\uffff\22\63\1\u0092\7\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\u0093\31\63\4\uffff"+
            "\1\63\1\uffff\1\u0093\31\63\74\uffff\1\63\10\uffff\27\63\1\uffff"+
            "\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff"+
            "\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff"+
            "\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\u0094\25\63\4"+
            "\uffff\1\63\1\uffff\4\63\1\u0094\25\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\u0095\25\63\4"+
            "\uffff\1\63\1\uffff\4\63\1\u0095\25\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\175\1\42\6\uffff\32\64\4\uffff\1\64\1"+
            "\uffff\32\64\74\uffff\1\64\10\uffff\27\64\1\uffff\37\64\1\uffff"+
            "\u0286\64\1\uffff\u1c81\64\14\uffff\2\64\61\uffff\2\64\57\uffff"+
            "\u0120\64\u0a70\uffff\u03f0\64\21\uffff\ua7ff\64\u2100\uffff"+
            "\u04d0\64\40\uffff\u020e\64",
            "\12\176\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106\74\uffff"+
            "\1\106\10\uffff\27\106\1\uffff\37\106\1\uffff\u0286\106\1\uffff"+
            "\u1c81\106\14\uffff\2\106\61\uffff\2\106\57\uffff\u0120\106"+
            "\u0a70\uffff\u03f0\106\21\uffff\ua7ff\106\u2100\uffff\u04d0"+
            "\106\40\uffff\u020e\106",
            "\12\177\13\uffff\1\141\37\uffff\1\141",
            "",
            "",
            "\12\u0082\13\uffff\1\147\37\uffff\1\147",
            "",
            "\12\u0084\13\uffff\1\151\37\uffff\1\151",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\7\63\1\u0096\22\63\4"+
            "\uffff\1\63\1\uffff\7\63\1\u0096\22\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\23\63\1\u0097\6\63\4"+
            "\uffff\1\63\1\uffff\23\63\1\u0097\6\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\10\63\1\u0098\21\63\4"+
            "\uffff\1\63\1\uffff\10\63\1\u0098\21\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\23\63\1\u0099\6\63\4"+
            "\uffff\1\63\1\uffff\23\63\1\u0099\6\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\u009a\31\63\4\uffff"+
            "\1\63\1\uffff\1\u009a\31\63\74\uffff\1\63\10\uffff\27\63\1\uffff"+
            "\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff"+
            "\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff"+
            "\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\10\63\1\u009b\21\63\4"+
            "\uffff\1\63\1\uffff\10\63\1\u009b\21\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\16\63\1\u009c\13\63\4"+
            "\uffff\1\63\1\uffff\16\63\1\u009c\13\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\14\63\1\u009d\15\63\4"+
            "\uffff\1\63\1\uffff\14\63\1\u009d\15\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\15\63\1\u009f\14\63\4"+
            "\uffff\1\63\1\uffff\15\63\1\u009f\14\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\3\63\1\u00a0\26\63\4"+
            "\uffff\1\63\1\uffff\3\63\1\u00a0\26\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\u00a1\25\63\4"+
            "\uffff\1\63\1\uffff\4\63\1\u00a1\25\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\u00a2\25\63\4"+
            "\uffff\1\63\1\uffff\4\63\1\u00a2\25\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\23\63\1\u00a3\6\63\4"+
            "\uffff\1\63\1\uffff\23\63\1\u00a3\6\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\27\63\1\u00a4\2\63\4"+
            "\uffff\1\63\1\uffff\27\63\1\u00a4\2\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\u00a7\25\63\4"+
            "\uffff\1\63\1\uffff\4\63\1\u00a7\25\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\u00a9\25\63\4"+
            "\uffff\1\63\1\uffff\4\63\1\u00a9\25\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\15\63\1\u00aa\14\63\4"+
            "\uffff\1\63\1\uffff\15\63\1\u00aa\14\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\15\63\1\u00ac\14\63\4"+
            "\uffff\1\63\1\uffff\15\63\1\u00ac\14\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\u00ad\31\63\4\uffff"+
            "\1\63\1\uffff\1\u00ad\31\63\74\uffff\1\63\10\uffff\27\63\1\uffff"+
            "\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff"+
            "\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff"+
            "\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\21\63\1\u00b0\10\63\4"+
            "\uffff\1\63\1\uffff\21\63\1\u00b0\10\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\30\63\1\u00b2\1\63\4"+
            "\uffff\1\63\1\uffff\30\63\1\u00b2\1\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\21\63\1\u00b4\10\63\4"+
            "\uffff\1\63\1\uffff\21\63\1\u00b4\10\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\21\63\1\u00b5\10\63\4"+
            "\uffff\1\63\1\uffff\21\63\1\u00b5\10\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\12\63\1\u00b6\17\63\4"+
            "\uffff\1\63\1\uffff\12\63\1\u00b6\17\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\u00b7\31\63\4\uffff"+
            "\1\63\1\uffff\1\u00b7\31\63\74\uffff\1\63\10\uffff\27\63\1\uffff"+
            "\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff"+
            "\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff"+
            "\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\23\63\1\u00b8\6\63\4"+
            "\uffff\1\63\1\uffff\23\63\1\u00b8\6\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\17\63\1\u00ba\12\63\4"+
            "\uffff\1\63\1\uffff\17\63\1\u00ba\12\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\14\63\1\u00bb\15\63\4"+
            "\uffff\1\63\1\uffff\14\63\1\u00bb\15\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\1\u00bc\31\63\4\uffff"+
            "\1\63\1\uffff\1\u00bc\31\63\74\uffff\1\63\10\uffff\27\63\1\uffff"+
            "\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff"+
            "\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff"+
            "\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\13\63\1\u00be\16\63\4"+
            "\uffff\1\63\1\uffff\13\63\1\u00be\16\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\2\63\1\u00bf\27\63\4"+
            "\uffff\1\63\1\uffff\2\63\1\u00bf\27\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\u00c0\25\63\4"+
            "\uffff\1\63\1\uffff\4\63\1\u00c0\25\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\13\63\1\u00c2\16\63\4"+
            "\uffff\1\63\1\uffff\13\63\1\u00c2\16\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\7\63\1\u00c4\22\63\4"+
            "\uffff\1\63\1\uffff\7\63\1\u00c4\22\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\4\63\1\u00c7\25\63\4"+
            "\uffff\1\63\1\uffff\4\63\1\u00c7\25\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "",
            "",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\22\63\1\u00c8\7\63\4"+
            "\uffff\1\63\1\uffff\22\63\1\u00c8\7\63\74\uffff\1\63\10\uffff"+
            "\27\63\1\uffff\37\63\1\uffff\u0286\63\1\uffff\u1c81\63\14\uffff"+
            "\2\63\61\uffff\2\63\57\uffff\u0120\63\u0a70\uffff\u03f0\63\21"+
            "\uffff\ua7ff\63\u2100\uffff\u04d0\63\40\uffff\u020e\63",
            "\1\64\1\65\1\uffff\12\63\1\42\6\uffff\32\63\4\uffff\1\63\1"+
            "\uffff\32\63\74\uffff\1\63\10\uffff\27\63\1\uffff\37\63\1\uffff"+
            "\u0286\63\1\uffff\u1c81\63\14\uffff\2\63\61\uffff\2\63\57\uffff"+
            "\u0120\63\u0a70\uffff\u03f0\63\21\uffff\ua7ff\63\u2100\uffff"+
            "\u04d0\63\40\uffff\u020e\63",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | GRAPH | STR | ISURI | OPTIONAL | LANG | ISIRI | UNION | LANGMATCHES | ISLITERAL | ISBLANK | BOUND | FILTER | DATATYPE | REGEX | TRUE | SAMETERM | FALSE | IRI_REF | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | ECHAR | NIL | WS | ANON | VARNAME | PN_PREFIX | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_41 = input.LA(1);

                        s = -1;
                        if ( (LA34_41=='\'') ) {s = 93;}

                        else if ( ((LA34_41>='\u0000' && LA34_41<='\t')||(LA34_41>='\u000B' && LA34_41<='\f')||(LA34_41>='\u000E' && LA34_41<='&')||(LA34_41>='(' && LA34_41<='\uFFFF')) ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_42 = input.LA(1);

                        s = -1;
                        if ( (LA34_42=='\"') ) {s = 95;}

                        else if ( ((LA34_42>='\u0000' && LA34_42<='\t')||(LA34_42>='\u000B' && LA34_42<='\f')||(LA34_42>='\u000E' && LA34_42<='!')||(LA34_42>='#' && LA34_42<='\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}