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
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g 2010-07-02 13:41:05

  package de.fuberlin.wiwiss.r2r.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TargetVocabularyLexer extends Lexer {
    public static final int IRI_REF=5;
    public static final int WS=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int PN_CHARS_BASE=10;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int PN_PREFIX=9;
    public static final int PN_LOCAL=8;
    public static final int PN_CHARS=12;
    public static final int PNAME_NS=4;
    public static final int PN_CHARS_U=11;
    public static final int PNAME_LN=6;
    public static final int EOF=-1;

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

    public TargetVocabularyLexer() {;} 
    public TargetVocabularyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TargetVocabularyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:26:7: ( '+' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:26:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:27:7: ( ',' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:27:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:28:7: ( '(' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:29:7: ( ')' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:30:7: ( '.' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:30:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:31:7: ( '@prefix' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:31:9: '@prefix'
            {
            match("@prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:147:3: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:147:5: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
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

    // $ANTLR start "IRI_REF"
    public final void mIRI_REF() throws RecognitionException {
        try {
            int _type = IRI_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:151:3: ( '<' (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:151:5: '<' (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>'
            {
            match('<'); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:151:9: (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='!'||(LA1_0>='#' && LA1_0<=';')||LA1_0=='='||(LA1_0>='?' && LA1_0<='[')||LA1_0==']'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:151:10: ~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' )
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

    // $ANTLR start "PNAME_LN"
    public final void mPNAME_LN() throws RecognitionException {
        try {
            int _type = PNAME_LN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:155:3: ( PNAME_NS PN_LOCAL )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:155:5: PNAME_NS PN_LOCAL
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

    // $ANTLR start "PNAME_NS"
    public final void mPNAME_NS() throws RecognitionException {
        try {
            int _type = PNAME_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:159:3: ( PN_PREFIX ':' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:159:5: PN_PREFIX ':'
            {
            mPN_PREFIX(); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PNAME_NS"

    // $ANTLR start "PN_CHARS_BASE"
    public final void mPN_CHARS_BASE() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:163:3: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:
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
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:179:3: ( PN_CHARS_BASE | '_' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:
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

    // $ANTLR start "PN_LOCAL"
    public final void mPN_LOCAL() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:183:3: ( ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:183:5: ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:183:29: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='-' && LA3_0<='.')||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')||LA3_0=='\u00B7'||(LA3_0>='\u00C0' && LA3_0<='\u00D6')||(LA3_0>='\u00D8' && LA3_0<='\u00F6')||(LA3_0>='\u00F8' && LA3_0<='\u037D')||(LA3_0>='\u037F' && LA3_0<='\u1FFF')||(LA3_0>='\u200C' && LA3_0<='\u200D')||(LA3_0>='\u203F' && LA3_0<='\u2040')||(LA3_0>='\u2070' && LA3_0<='\u218F')||(LA3_0>='\u2C00' && LA3_0<='\u2FEF')||(LA3_0>='\u3001' && LA3_0<='\uD7FF')||(LA3_0>='\uF900' && LA3_0<='\uFDCF')||(LA3_0>='\uFDF0' && LA3_0<='\uFFFD')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:183:30: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:183:30: ( PN_CHARS | '.' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||LA2_0=='\u00B7'||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u037D')||(LA2_0>='\u037F' && LA2_0<='\u1FFF')||(LA2_0>='\u200C' && LA2_0<='\u200D')||(LA2_0>='\u203F' && LA2_0<='\u2040')||(LA2_0>='\u2070' && LA2_0<='\u218F')||(LA2_0>='\u2C00' && LA2_0<='\u2FEF')||(LA2_0>='\u3001' && LA2_0<='\uD7FF')||(LA2_0>='\uF900' && LA2_0<='\uFDCF')||(LA2_0>='\uFDF0' && LA2_0<='\uFFFD')) ) {
                            int LA2_1 = input.LA(2);

                            if ( ((LA2_1>='-' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='9')||(LA2_1>='A' && LA2_1<='Z')||LA2_1=='_'||(LA2_1>='a' && LA2_1<='z')||LA2_1=='\u00B7'||(LA2_1>='\u00C0' && LA2_1<='\u00D6')||(LA2_1>='\u00D8' && LA2_1<='\u00F6')||(LA2_1>='\u00F8' && LA2_1<='\u037D')||(LA2_1>='\u037F' && LA2_1<='\u1FFF')||(LA2_1>='\u200C' && LA2_1<='\u200D')||(LA2_1>='\u203F' && LA2_1<='\u2040')||(LA2_1>='\u2070' && LA2_1<='\u218F')||(LA2_1>='\u2C00' && LA2_1<='\u2FEF')||(LA2_1>='\u3001' && LA2_1<='\uD7FF')||(LA2_1>='\uF900' && LA2_1<='\uFDCF')||(LA2_1>='\uFDF0' && LA2_1<='\uFFFD')) ) {
                                alt2=1;
                            }


                        }
                        else if ( (LA2_0=='.') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:
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
                    	    break loop2;
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

    // $ANTLR start "PN_PREFIX"
    public final void mPN_PREFIX() throws RecognitionException {
        try {
            int _type = PN_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:187:3: ( PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:187:5: PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:187:19: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='-' && LA5_0<='.')||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')||LA5_0=='\u00B7'||(LA5_0>='\u00C0' && LA5_0<='\u00D6')||(LA5_0>='\u00D8' && LA5_0<='\u00F6')||(LA5_0>='\u00F8' && LA5_0<='\u037D')||(LA5_0>='\u037F' && LA5_0<='\u1FFF')||(LA5_0>='\u200C' && LA5_0<='\u200D')||(LA5_0>='\u203F' && LA5_0<='\u2040')||(LA5_0>='\u2070' && LA5_0<='\u218F')||(LA5_0>='\u2C00' && LA5_0<='\u2FEF')||(LA5_0>='\u3001' && LA5_0<='\uD7FF')||(LA5_0>='\uF900' && LA5_0<='\uFDCF')||(LA5_0>='\uFDF0' && LA5_0<='\uFFFD')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:187:20: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:187:20: ( PN_CHARS | '.' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||LA4_0=='\u00B7'||(LA4_0>='\u00C0' && LA4_0<='\u00D6')||(LA4_0>='\u00D8' && LA4_0<='\u00F6')||(LA4_0>='\u00F8' && LA4_0<='\u037D')||(LA4_0>='\u037F' && LA4_0<='\u1FFF')||(LA4_0>='\u200C' && LA4_0<='\u200D')||(LA4_0>='\u203F' && LA4_0<='\u2040')||(LA4_0>='\u2070' && LA4_0<='\u218F')||(LA4_0>='\u2C00' && LA4_0<='\u2FEF')||(LA4_0>='\u3001' && LA4_0<='\uD7FF')||(LA4_0>='\uF900' && LA4_0<='\uFDCF')||(LA4_0>='\uFDF0' && LA4_0<='\uFFFD')) ) {
                            int LA4_1 = input.LA(2);

                            if ( ((LA4_1>='-' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='9')||(LA4_1>='A' && LA4_1<='Z')||LA4_1=='_'||(LA4_1>='a' && LA4_1<='z')||LA4_1=='\u00B7'||(LA4_1>='\u00C0' && LA4_1<='\u00D6')||(LA4_1>='\u00D8' && LA4_1<='\u00F6')||(LA4_1>='\u00F8' && LA4_1<='\u037D')||(LA4_1>='\u037F' && LA4_1<='\u1FFF')||(LA4_1>='\u200C' && LA4_1<='\u200D')||(LA4_1>='\u203F' && LA4_1<='\u2040')||(LA4_1>='\u2070' && LA4_1<='\u218F')||(LA4_1>='\u2C00' && LA4_1<='\u2FEF')||(LA4_1>='\u3001' && LA4_1<='\uD7FF')||(LA4_1>='\uF900' && LA4_1<='\uFDCF')||(LA4_1>='\uFDF0' && LA4_1<='\uFFFD')) ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_0=='.') ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:
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
                    	    break loop4;
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
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:191:3: ( PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:
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

    public void mTokens() throws RecognitionException {
        // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | WS | IRI_REF | PNAME_LN | PNAME_NS | PN_PREFIX )
        int alt6=11;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:46: WS
                {
                mWS(); 

                }
                break;
            case 8 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:49: IRI_REF
                {
                mIRI_REF(); 

                }
                break;
            case 9 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:57: PNAME_LN
                {
                mPNAME_LN(); 

                }
                break;
            case 10 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:66: PNAME_NS
                {
                mPNAME_NS(); 

                }
                break;
            case 11 :
                // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:1:75: PN_PREFIX
                {
                mPN_PREFIX(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\11\uffff\1\12\1\uffff\1\12\1\uffff\1\16\2\uffff";
    static final String DFA6_eofS =
        "\20\uffff";
    static final String DFA6_minS =
        "\1\11\10\uffff\1\55\1\uffff\2\55\1\60\2\uffff";
    static final String DFA6_maxS =
        "\1\ufffd\10\uffff\1\ufffd\1\uffff\3\ufffd\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\3\uffff\1"+
        "\12\1\11";
    static final String DFA6_specialS =
        "\20\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\7\2\uffff\1\7\22\uffff\1\7\7\uffff\1\3\1\4\1\uffff\1\1\1"+
            "\2\1\uffff\1\5\15\uffff\1\10\3\uffff\1\6\32\11\6\uffff\32\11"+
            "\105\uffff\27\11\1\uffff\37\11\1\uffff\u0208\11\160\uffff\16"+
            "\11\1\uffff\u1c81\11\14\uffff\2\11\142\uffff\u0120\11\u0a70"+
            "\uffff\u03f0\11\21\uffff\ua7ff\11\u2100\uffff\u04d0\11\40\uffff"+
            "\u020e\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\14\1\uffff\12\13\1\15\6\uffff\32\13\4\uffff\1\13\1"+
            "\uffff\32\13\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff"+
            "\u0286\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13\57\uffff"+
            "\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100\uffff"+
            "\u04d0\13\40\uffff\u020e\13",
            "",
            "\1\13\1\14\1\uffff\12\13\1\15\6\uffff\32\13\4\uffff\1\13\1"+
            "\uffff\32\13\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff"+
            "\u0286\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13\57\uffff"+
            "\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100\uffff"+
            "\u04d0\13\40\uffff\u020e\13",
            "\1\13\1\14\1\uffff\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff"+
            "\32\13\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff\u0286"+
            "\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13\57\uffff\u0120"+
            "\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100\uffff\u04d0"+
            "\13\40\uffff\u020e\13",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17\105\uffff\27"+
            "\17\1\uffff\37\17\1\uffff\u0208\17\160\uffff\16\17\1\uffff\u1c81"+
            "\17\14\uffff\2\17\142\uffff\u0120\17\u0a70\uffff\u03f0\17\21"+
            "\uffff\ua7ff\17\u2100\uffff\u04d0\17\40\uffff\u020e\17",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | WS | IRI_REF | PNAME_LN | PNAME_NS | PN_PREFIX );";
        }
    }
 

}