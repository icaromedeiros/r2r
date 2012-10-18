// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andreas/projects/r2r/antlr-files/TargetPattern.g 2012-02-23 14:53:38

  package de.fuberlin.wiwiss.r2r.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TargetPatternLexer extends Lexer {
    public static final int VARIABLEURI=4;
    public static final int IRI_REF=24;
    public static final int EXPONENT=41;
    public static final int PNAME_LN=25;
    public static final int EOF=-1;
    public static final int VARNAME=40;
    public static final int VARIABLETERM=7;
    public static final int HEX=46;
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
    public static final int PN_PREFIX=37;
    public static final int INTEGER_POSITIVE=12;
    public static final int STRING_LITERAL2=21;
    public static final int STRING_LITERAL1=20;
    public static final int PN_CHARS=45;
    public static final int DOUBLE_NEGATIVE=17;
    public static final int FALSE=19;
    public static final int LANGTAG=8;

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

    public TargetPatternLexer() {;} 
    public TargetPatternLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TargetPatternLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/andreas/projects/r2r/antlr-files/TargetPattern.g"; }

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:26:7: ( '.' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:27:7: ( 'a' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:27:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:28:7: ( '^^' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:28:9: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:291:6: ( T R U E )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:291:8: T R U E
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

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:292:7: ( F A L S E )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:292:9: F A L S E
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:294:11: ( ( 'a' | 'A' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:294:13: ( 'a' | 'A' )
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

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:295:11: ( ( 'e' | 'E' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:295:13: ( 'e' | 'E' )
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:296:11: ( ( 'f' | 'F' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:296:13: ( 'f' | 'F' )
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

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:297:11: ( ( 'l' | 'L' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:297:13: ( 'l' | 'L' )
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

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:298:11: ( ( 'r' | 'R' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:298:13: ( 'r' | 'R' )
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:299:11: ( ( 's' | 'S' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:299:13: ( 's' | 'S' )
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:300:11: ( ( 't' | 'T' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:300:13: ( 't' | 'T' )
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:301:11: ( ( 'u' | 'U' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:301:13: ( 'u' | 'U' )
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:306:3: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:306:5: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:310:3: ( '<' (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:310:5: '<' (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>'
            {
            match('<'); 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:310:9: (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='!'||(LA1_0>='#' && LA1_0<=';')||LA1_0=='='||(LA1_0>='?' && LA1_0<='[')||LA1_0==']'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:310:10: ~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' )
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:314:3: ( ( PN_PREFIX )? ':' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:314:5: ( PN_PREFIX )? ':'
            {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:314:5: ( PN_PREFIX )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u02FF')||(LA2_0>='\u0370' && LA2_0<='\u037D')||(LA2_0>='\u037F' && LA2_0<='\u1FFF')||(LA2_0>='\u200C' && LA2_0<='\u200D')||(LA2_0>='\u2070' && LA2_0<='\u218F')||(LA2_0>='\u2C00' && LA2_0<='\u2FEF')||(LA2_0>='\u3001' && LA2_0<='\uD7FF')||(LA2_0>='\uF900' && LA2_0<='\uFDCF')||(LA2_0>='\uFDF0' && LA2_0<='\uFFFD')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:314:5: PN_PREFIX
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:318:3: ( PNAME_NS PN_LOCAL )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:318:5: PNAME_NS PN_LOCAL
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:322:3: ( '_:' PN_LOCAL )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:322:5: '_:' PN_LOCAL
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:326:3: ( '?' VARNAME )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:326:5: '?' VARNAME
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:330:3: ( '$' VARNAME )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:330:5: '$' VARNAME
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

    // $ANTLR start "VARIABLETERM"
    public final void mVARIABLETERM() throws RecognitionException {
        try {
            int _type = VARIABLETERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:334:4: ( '?\\'' VARNAME '\\'' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:334:6: '?\\'' VARNAME '\\''
            {
            match("?'"); 

            mVARNAME(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLETERM"

    // $ANTLR start "VARIABLEURI"
    public final void mVARIABLEURI() throws RecognitionException {
        try {
            int _type = VARIABLEURI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:338:4: ( '?<' VARNAME '>' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:338:6: '?<' VARNAME '>'
            {
            match("?<"); 

            mVARNAME(); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLEURI"

    // $ANTLR start "LANGTAG"
    public final void mLANGTAG() throws RecognitionException {
        try {
            int _type = LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:342:3: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:342:5: '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            {
            match('@'); 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:342:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:
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

            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:342:32: ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:342:33: '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    {
            	    match('-'); 
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:342:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
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
            	    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:346:3: ( ( '0' .. '9' )+ )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:346:5: ( '0' .. '9' )+
            {
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:346:5: ( '0' .. '9' )+
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
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:346:6: '0' .. '9'
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:350:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
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
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:350:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:350:5: ( '0' .. '9' )+
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
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:350:6: '0' .. '9'
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
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:350:21: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:350:22: '0' .. '9'
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
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:350:35: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:350:39: ( '0' .. '9' )+
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
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:350:40: '0' .. '9'
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:354:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:354:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT
                    {
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:354:5: ( '0' .. '9' )+
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
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:354:6: '0' .. '9'
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
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:354:21: ( '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:354:22: '0' .. '9'
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
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:355:5: '.' ( '0' .. '9' )+ EXPONENT
                    {
                    match('.'); 
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:355:9: ( '0' .. '9' )+
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
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:355:10: '0' .. '9'
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
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:356:5: ( '0' .. '9' )+ EXPONENT
                    {
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:356:5: ( '0' .. '9' )+
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
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:356:6: '0' .. '9'
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:360:3: ( '+' INTEGER )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:360:5: '+' INTEGER
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:364:3: ( '+' DECIMAL )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:364:5: '+' DECIMAL
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:368:3: ( '+' DOUBLE )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:368:5: '+' DOUBLE
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:372:3: ( '-' INTEGER )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:372:5: '-' INTEGER
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:376:3: ( '-' DECIMAL )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:376:5: '-' DECIMAL
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:380:3: ( '-' DOUBLE )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:380:5: '-' DOUBLE
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:384:3: ( E ( '+' | '-' )? ( '0' .. '9' )+ )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:384:5: E ( '+' | '-' )? ( '0' .. '9' )+
            {
            mE(); 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:384:7: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:
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

            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:384:20: ( '0' .. '9' )+
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
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:384:21: '0' .. '9'
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:388:3: ( '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:388:5: '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:388:10: (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
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
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:388:11: ~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' )
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
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:388:58: ECHAR
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:392:3: ( '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:392:5: '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"'
            {
            match('\"'); 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:392:9: (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
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
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:392:10: ~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' )
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
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:392:57: ECHAR
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:3: ( '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:5: '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); 

            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:14: ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
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
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:15: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:15: ( '\\'' | '\\'\\'' )?
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
            	            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:17: '\\''
            	            {
            	            match('\''); 

            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:24: '\\'\\''
            	            {
            	            match("''"); 


            	            }
            	            break;

            	    }

            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:33: (~ ( '\\'' | '\\\\' ) | ECHAR )
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
            	            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:34: ~ ( '\\'' | '\\\\' )
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
            	            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:396:51: ECHAR
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:3: ( '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:5: '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); 

            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:11: ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
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
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:12: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:12: ( '\"' | '\"\"' )?
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
            	            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:14: '\"'
            	            {
            	            match('\"'); 

            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:20: '\"\"'
            	            {
            	            match("\"\""); 


            	            }
            	            break;

            	    }

            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:27: (~ ( '\"' | '\\\\' ) | ECHAR )
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
            	            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:28: ~ ( '\"' | '\\\\' )
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
            	            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:400:44: ECHAR
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:404:3: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:404:5: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
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

    // $ANTLR start "ANON"
    public final void mANON() throws RecognitionException {
        try {
            int _type = ANON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:410:3: ( '[' ( WS )* ']' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:410:5: '[' ( WS )* ']'
            {
            match('['); 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:410:9: ( WS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:410:9: WS
            	    {
            	    mWS(); 

            	    }
            	    break;

            	default :
            	    break loop26;
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:414:3: ( ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:414:5: ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:414:29: ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')||(LA27_0>='A' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='z')||LA27_0=='\u00B7'||(LA27_0>='\u00C0' && LA27_0<='\u00D6')||(LA27_0>='\u00D8' && LA27_0<='\u00F6')||(LA27_0>='\u00F8' && LA27_0<='\u037D')||(LA27_0>='\u037F' && LA27_0<='\u1FFF')||(LA27_0>='\u200C' && LA27_0<='\u200D')||(LA27_0>='\u203F' && LA27_0<='\u2040')||(LA27_0>='\u2070' && LA27_0<='\u218F')||(LA27_0>='\u2C00' && LA27_0<='\u2FEF')||(LA27_0>='\u3001' && LA27_0<='\uD7FF')||(LA27_0>='\uF900' && LA27_0<='\uFDCF')||(LA27_0>='\uFDF0' && LA27_0<='\uFFFD')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:
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
            	    break loop27;
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:418:3: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:434:3: ( PN_CHARS_BASE | '_' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:438:3: ( PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:438:5: PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:438:19: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>='-' && LA29_0<='.')||(LA29_0>='0' && LA29_0<='9')||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')||LA29_0=='\u00B7'||(LA29_0>='\u00C0' && LA29_0<='\u00D6')||(LA29_0>='\u00D8' && LA29_0<='\u00F6')||(LA29_0>='\u00F8' && LA29_0<='\u037D')||(LA29_0>='\u037F' && LA29_0<='\u1FFF')||(LA29_0>='\u200C' && LA29_0<='\u200D')||(LA29_0>='\u203F' && LA29_0<='\u2040')||(LA29_0>='\u2070' && LA29_0<='\u218F')||(LA29_0>='\u2C00' && LA29_0<='\u2FEF')||(LA29_0>='\u3001' && LA29_0<='\uD7FF')||(LA29_0>='\uF900' && LA29_0<='\uFDCF')||(LA29_0>='\uFDF0' && LA29_0<='\uFFFD')) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:438:20: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:438:20: ( PN_CHARS | '.' )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='-'||(LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')||LA28_0=='\u00B7'||(LA28_0>='\u00C0' && LA28_0<='\u00D6')||(LA28_0>='\u00D8' && LA28_0<='\u00F6')||(LA28_0>='\u00F8' && LA28_0<='\u037D')||(LA28_0>='\u037F' && LA28_0<='\u1FFF')||(LA28_0>='\u200C' && LA28_0<='\u200D')||(LA28_0>='\u203F' && LA28_0<='\u2040')||(LA28_0>='\u2070' && LA28_0<='\u218F')||(LA28_0>='\u2C00' && LA28_0<='\u2FEF')||(LA28_0>='\u3001' && LA28_0<='\uD7FF')||(LA28_0>='\uF900' && LA28_0<='\uFDCF')||(LA28_0>='\uFDF0' && LA28_0<='\uFFFD')) ) {
                            int LA28_1 = input.LA(2);

                            if ( ((LA28_1>='-' && LA28_1<='.')||(LA28_1>='0' && LA28_1<='9')||(LA28_1>='A' && LA28_1<='Z')||LA28_1=='_'||(LA28_1>='a' && LA28_1<='z')||LA28_1=='\u00B7'||(LA28_1>='\u00C0' && LA28_1<='\u00D6')||(LA28_1>='\u00D8' && LA28_1<='\u00F6')||(LA28_1>='\u00F8' && LA28_1<='\u037D')||(LA28_1>='\u037F' && LA28_1<='\u1FFF')||(LA28_1>='\u200C' && LA28_1<='\u200D')||(LA28_1>='\u203F' && LA28_1<='\u2040')||(LA28_1>='\u2070' && LA28_1<='\u218F')||(LA28_1>='\u2C00' && LA28_1<='\u2FEF')||(LA28_1>='\u3001' && LA28_1<='\uD7FF')||(LA28_1>='\uF900' && LA28_1<='\uFDCF')||(LA28_1>='\uFDF0' && LA28_1<='\uFFFD')) ) {
                                alt28=1;
                            }


                        }
                        else if ( (LA28_0=='.') ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:
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
                    	    break loop28;
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:442:3: ( PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:451:3: ( ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:451:5: ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:451:29: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>='-' && LA31_0<='.')||(LA31_0>='0' && LA31_0<='9')||(LA31_0>='A' && LA31_0<='Z')||LA31_0=='_'||(LA31_0>='a' && LA31_0<='z')||LA31_0=='\u00B7'||(LA31_0>='\u00C0' && LA31_0<='\u00D6')||(LA31_0>='\u00D8' && LA31_0<='\u00F6')||(LA31_0>='\u00F8' && LA31_0<='\u037D')||(LA31_0>='\u037F' && LA31_0<='\u1FFF')||(LA31_0>='\u200C' && LA31_0<='\u200D')||(LA31_0>='\u203F' && LA31_0<='\u2040')||(LA31_0>='\u2070' && LA31_0<='\u218F')||(LA31_0>='\u2C00' && LA31_0<='\u2FEF')||(LA31_0>='\u3001' && LA31_0<='\uD7FF')||(LA31_0>='\uF900' && LA31_0<='\uFDCF')||(LA31_0>='\uFDF0' && LA31_0<='\uFFFD')) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:451:30: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:451:30: ( PN_CHARS | '.' )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='-'||(LA30_0>='0' && LA30_0<='9')||(LA30_0>='A' && LA30_0<='Z')||LA30_0=='_'||(LA30_0>='a' && LA30_0<='z')||LA30_0=='\u00B7'||(LA30_0>='\u00C0' && LA30_0<='\u00D6')||(LA30_0>='\u00D8' && LA30_0<='\u00F6')||(LA30_0>='\u00F8' && LA30_0<='\u037D')||(LA30_0>='\u037F' && LA30_0<='\u1FFF')||(LA30_0>='\u200C' && LA30_0<='\u200D')||(LA30_0>='\u203F' && LA30_0<='\u2040')||(LA30_0>='\u2070' && LA30_0<='\u218F')||(LA30_0>='\u2C00' && LA30_0<='\u2FEF')||(LA30_0>='\u3001' && LA30_0<='\uD7FF')||(LA30_0>='\uF900' && LA30_0<='\uFDCF')||(LA30_0>='\uFDF0' && LA30_0<='\uFFFD')) ) {
                            int LA30_1 = input.LA(2);

                            if ( ((LA30_1>='-' && LA30_1<='.')||(LA30_1>='0' && LA30_1<='9')||(LA30_1>='A' && LA30_1<='Z')||LA30_1=='_'||(LA30_1>='a' && LA30_1<='z')||LA30_1=='\u00B7'||(LA30_1>='\u00C0' && LA30_1<='\u00D6')||(LA30_1>='\u00D8' && LA30_1<='\u00F6')||(LA30_1>='\u00F8' && LA30_1<='\u037D')||(LA30_1>='\u037F' && LA30_1<='\u1FFF')||(LA30_1>='\u200C' && LA30_1<='\u200D')||(LA30_1>='\u203F' && LA30_1<='\u2040')||(LA30_1>='\u2070' && LA30_1<='\u218F')||(LA30_1>='\u2C00' && LA30_1<='\u2FEF')||(LA30_1>='\u3001' && LA30_1<='\uD7FF')||(LA30_1>='\uF900' && LA30_1<='\uFDCF')||(LA30_1>='\uFDF0' && LA30_1<='\uFFFD')) ) {
                                alt30=1;
                            }


                        }
                        else if ( (LA30_0=='.') ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:
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
                    	    break loop30;
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:454:14: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:454:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:455:9: ( '#' ( . )* ( '\\n' | '\\r' ) )
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:455:11: '#' ( . )* ( '\\n' | '\\r' )
            {
            match('#'); 
            // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:455:15: ( . )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='\n'||LA32_0=='\r') ) {
                    alt32=2;
                }
                else if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:455:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop32;
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
        // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:8: ( T__48 | T__49 | T__50 | TRUE | FALSE | WS | IRI_REF | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | VARIABLETERM | VARIABLEURI | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | ECHAR | ANON | VARNAME | PN_PREFIX | COMMENT )
        int alt33=34;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:10: T__48
                {
                mT__48(); 

                }
                break;
            case 2 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:16: T__49
                {
                mT__49(); 

                }
                break;
            case 3 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:22: T__50
                {
                mT__50(); 

                }
                break;
            case 4 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:28: TRUE
                {
                mTRUE(); 

                }
                break;
            case 5 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:33: FALSE
                {
                mFALSE(); 

                }
                break;
            case 6 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:39: WS
                {
                mWS(); 

                }
                break;
            case 7 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:42: IRI_REF
                {
                mIRI_REF(); 

                }
                break;
            case 8 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:50: PNAME_NS
                {
                mPNAME_NS(); 

                }
                break;
            case 9 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:59: PNAME_LN
                {
                mPNAME_LN(); 

                }
                break;
            case 10 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:68: BLANK_NODE_LABEL
                {
                mBLANK_NODE_LABEL(); 

                }
                break;
            case 11 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:85: VAR1
                {
                mVAR1(); 

                }
                break;
            case 12 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:90: VAR2
                {
                mVAR2(); 

                }
                break;
            case 13 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:95: VARIABLETERM
                {
                mVARIABLETERM(); 

                }
                break;
            case 14 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:108: VARIABLEURI
                {
                mVARIABLEURI(); 

                }
                break;
            case 15 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:120: LANGTAG
                {
                mLANGTAG(); 

                }
                break;
            case 16 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:128: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 17 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:136: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 18 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:144: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 19 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:151: INTEGER_POSITIVE
                {
                mINTEGER_POSITIVE(); 

                }
                break;
            case 20 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:168: DECIMAL_POSITIVE
                {
                mDECIMAL_POSITIVE(); 

                }
                break;
            case 21 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:185: DOUBLE_POSITIVE
                {
                mDOUBLE_POSITIVE(); 

                }
                break;
            case 22 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:201: INTEGER_NEGATIVE
                {
                mINTEGER_NEGATIVE(); 

                }
                break;
            case 23 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:218: DECIMAL_NEGATIVE
                {
                mDECIMAL_NEGATIVE(); 

                }
                break;
            case 24 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:235: DOUBLE_NEGATIVE
                {
                mDOUBLE_NEGATIVE(); 

                }
                break;
            case 25 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:251: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 26 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:260: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); 

                }
                break;
            case 27 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:276: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 

                }
                break;
            case 28 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:292: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); 

                }
                break;
            case 29 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:313: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); 

                }
                break;
            case 30 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:334: ECHAR
                {
                mECHAR(); 

                }
                break;
            case 31 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:340: ANON
                {
                mANON(); 

                }
                break;
            case 32 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:345: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 33 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:353: PN_PREFIX
                {
                mPN_PREFIX(); 

                }
                break;
            case 34 :
                // /home/andreas/projects/r2r/antlr-files/TargetPattern.g:1:363: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA33 dfa33 = new DFA33(this);
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
            return "353:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA33_eotS =
        "\1\uffff\1\30\1\31\1\uffff\2\35\2\uffff\1\35\1\43\1\35\3\uffff\1"+
        "\54\2\uffff\1\35\5\uffff\1\65\2\uffff\1\35\1\uffff\1\67\1\uffff"+
        "\2\35\1\67\1\42\7\uffff\1\35\1\54\1\65\1\uffff\1\75\1\uffff\1\103"+
        "\1\uffff\1\62\1\uffff\1\64\4\uffff\2\35\1\42\1\66\1\65\2\uffff\2"+
        "\112\1\114\2\uffff\1\114\2\uffff\1\115\1\35\1\112\1\uffff\1\114"+
        "\2\uffff\1\117\1\uffff";
    static final String DFA33_eofS =
        "\120\uffff";
    static final String DFA33_minS =
        "\1\11\1\60\1\55\1\uffff\2\55\2\uffff\1\53\1\60\1\72\1\47\2\uffff"+
        "\3\56\1\55\2\0\3\uffff\1\60\2\uffff\3\55\1\uffff\4\55\7\uffff\1"+
        "\53\1\56\1\60\1\uffff\1\56\1\60\1\56\1\60\1\47\1\uffff\1\42\4\uffff"+
        "\3\55\2\60\2\uffff\3\60\2\uffff\1\60\2\uffff\2\55\1\60\1\uffff\1"+
        "\60\2\uffff\1\55\1\uffff";
    static final String DFA33_maxS =
        "\1\ufffd\1\71\1\ufffd\1\uffff\2\ufffd\2\uffff\2\ufffd\1\72\1\ufffd"+
        "\2\uffff\1\ufffd\2\71\1\ufffd\2\uffff\3\uffff\1\145\2\uffff\3\ufffd"+
        "\1\uffff\4\ufffd\7\uffff\1\71\1\ufffd\1\145\1\uffff\1\145\1\71\1"+
        "\145\1\71\1\47\1\uffff\1\42\4\uffff\4\ufffd\1\145\2\uffff\3\145"+
        "\2\uffff\1\145\2\uffff\2\ufffd\1\145\1\uffff\1\145\2\uffff\1\ufffd"+
        "\1\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\1\3\2\uffff\1\6\1\7\4\uffff\1\14\1\17\6\uffff\1\36\1\37"+
        "\1\42\1\uffff\1\1\1\2\3\uffff\1\40\4\uffff\1\31\1\10\1\11\1\12\1"+
        "\15\1\16\1\13\3\uffff\1\20\5\uffff\1\32\1\uffff\1\33\1\21\1\22\1"+
        "\41\5\uffff\1\23\1\25\3\uffff\1\30\1\26\1\uffff\1\34\1\35\3\uffff"+
        "\1\24\1\uffff\1\27\1\4\1\uffff\1\5";
    static final String DFA33_specialS =
        "\22\uffff\1\1\1\0\74\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\1\uffff\1\23\1\26\1\14\2\uffff"+
            "\1\22\3\uffff\1\17\1\uffff\1\20\1\1\1\uffff\12\16\1\11\1\uffff"+
            "\1\7\2\uffff\1\13\1\15\4\21\1\10\1\5\15\21\1\4\6\21\1\25\1\24"+
            "\1\uffff\1\3\1\12\1\uffff\1\2\3\21\1\10\1\5\15\21\1\4\6\21\105"+
            "\uffff\27\21\1\uffff\37\21\1\uffff\u0208\21\160\uffff\16\21"+
            "\1\uffff\u1c81\21\14\uffff\2\21\142\uffff\u0120\21\u0a70\uffff"+
            "\u03f0\21\21\uffff\ua7ff\21\u2100\uffff\u04d0\21\40\uffff\u020e"+
            "\21",
            "\12\27",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32\74\uffff\1\32\10\uffff\27\32\1\uffff\37\32\1\uffff"+
            "\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff\2\32\57\uffff"+
            "\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff\32\u2100\uffff"+
            "\u04d0\32\40\uffff\u020e\32",
            "",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\21\32\1\36\10\32\4\uffff"+
            "\1\32\1\uffff\21\32\1\36\10\32\74\uffff\1\32\10\uffff\27\32"+
            "\1\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2"+
            "\32\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21"+
            "\uffff\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\1\37\31\32\4\uffff\1"+
            "\32\1\uffff\1\37\31\32\74\uffff\1\32\10\uffff\27\32\1\uffff"+
            "\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff"+
            "\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff"+
            "\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "",
            "",
            "\1\42\1\uffff\1\40\1\33\1\uffff\12\41\1\11\6\uffff\32\32\4"+
            "\uffff\1\32\1\uffff\32\32\74\uffff\1\32\10\uffff\27\32\1\uffff"+
            "\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff"+
            "\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff"+
            "\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44\105\uffff\27"+
            "\44\1\uffff\37\44\1\uffff\u0208\44\160\uffff\16\44\1\uffff\u1c81"+
            "\44\14\uffff\2\44\142\uffff\u0120\44\u0a70\uffff\u03f0\44\21"+
            "\uffff\ua7ff\44\u2100\uffff\u04d0\44\40\uffff\u020e\44",
            "\1\45",
            "\1\46\10\uffff\12\50\2\uffff\1\47\4\uffff\32\50\4\uffff\1\50"+
            "\1\uffff\32\50\105\uffff\27\50\1\uffff\37\50\1\uffff\u0208\50"+
            "\160\uffff\16\50\1\uffff\u1c81\50\14\uffff\2\50\142\uffff\u0120"+
            "\50\u0a70\uffff\u03f0\50\21\uffff\ua7ff\50\u2100\uffff\u04d0"+
            "\50\40\uffff\u020e\50",
            "",
            "",
            "\1\53\1\uffff\12\52\7\uffff\4\35\1\51\25\35\4\uffff\1\35\1"+
            "\uffff\4\35\1\51\25\35\74\uffff\1\35\10\uffff\27\35\1\uffff"+
            "\37\35\1\uffff\u0286\35\1\uffff\u1c81\35\14\uffff\2\35\61\uffff"+
            "\2\35\57\uffff\u0120\35\u0a70\uffff\u03f0\35\21\uffff\ua7ff"+
            "\35\u2100\uffff\u04d0\35\40\uffff\u020e\35",
            "\1\56\1\uffff\12\55",
            "\1\60\1\uffff\12\57",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32\74\uffff\1\32\10\uffff\27\32\1\uffff\37\32\1\uffff"+
            "\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff\2\32\57\uffff"+
            "\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff\32\u2100\uffff"+
            "\u04d0\32\40\uffff\u020e\32",
            "\12\62\1\uffff\2\62\1\uffff\31\62\1\61\uffd8\62",
            "\12\64\1\uffff\2\64\1\uffff\24\64\1\63\uffdd\64",
            "",
            "",
            "",
            "\12\27\13\uffff\1\66\37\uffff\1\66",
            "",
            "",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32\74\uffff\1\32\10\uffff\27\32\1\uffff\37\32\1\uffff"+
            "\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff\2\32\57\uffff"+
            "\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff\32\u2100\uffff"+
            "\u04d0\32\40\uffff\u020e\32",
            "\1\34\1\33\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff"+
            "\32\34\74\uffff\1\34\10\uffff\27\34\1\uffff\37\34\1\uffff\u0286"+
            "\34\1\uffff\u1c81\34\14\uffff\2\34\61\uffff\2\34\57\uffff\u0120"+
            "\34\u0a70\uffff\u03f0\34\21\uffff\ua7ff\34\u2100\uffff\u04d0"+
            "\34\40\uffff\u020e\34",
            "\1\34\1\33\1\uffff\12\34\1\11\6\uffff\32\34\4\uffff\1\34\1"+
            "\uffff\32\34\74\uffff\1\34\10\uffff\27\34\1\uffff\37\34\1\uffff"+
            "\u0286\34\1\uffff\u1c81\34\14\uffff\2\34\61\uffff\2\34\57\uffff"+
            "\u0120\34\u0a70\uffff\u03f0\34\21\uffff\ua7ff\34\u2100\uffff"+
            "\u04d0\34\40\uffff\u020e\34",
            "",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\24\32\1\70\5\32\4\uffff"+
            "\1\32\1\uffff\24\32\1\70\5\32\74\uffff\1\32\10\uffff\27\32\1"+
            "\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2\32"+
            "\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21\uffff"+
            "\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\13\32\1\71\16\32\4\uffff"+
            "\1\32\1\uffff\13\32\1\71\16\32\74\uffff\1\32\10\uffff\27\32"+
            "\1\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2"+
            "\32\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21"+
            "\uffff\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\1\34\1\33\1\uffff\12\72\1\11\6\uffff\32\34\4\uffff\1\34\1"+
            "\uffff\32\34\74\uffff\1\34\10\uffff\27\34\1\uffff\37\34\1\uffff"+
            "\u0286\34\1\uffff\u1c81\34\14\uffff\2\34\61\uffff\2\34\57\uffff"+
            "\u0120\34\u0a70\uffff\u03f0\34\21\uffff\ua7ff\34\u2100\uffff"+
            "\u04d0\34\40\uffff\u020e\34",
            "\1\34\1\33\1\uffff\12\41\1\11\6\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32\74\uffff\1\32\10\uffff\27\32\1\uffff\37\32\1\uffff"+
            "\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff\2\32\57\uffff"+
            "\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff\32\u2100\uffff"+
            "\u04d0\32\40\uffff\u020e\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\1\uffff\1\66\2\uffff\12\73",
            "\1\53\1\uffff\12\52\7\uffff\4\35\1\51\25\35\4\uffff\1\35\1"+
            "\uffff\4\35\1\51\25\35\74\uffff\1\35\10\uffff\27\35\1\uffff"+
            "\37\35\1\uffff\u0286\35\1\uffff\u1c81\35\14\uffff\2\35\61\uffff"+
            "\2\35\57\uffff\u0120\35\u0a70\uffff\u03f0\35\21\uffff\ua7ff"+
            "\35\u2100\uffff\u04d0\35\40\uffff\u020e\35",
            "\12\74\13\uffff\1\66\37\uffff\1\66",
            "",
            "\1\77\1\uffff\12\55\13\uffff\1\76\37\uffff\1\76",
            "\12\100",
            "\1\101\1\uffff\12\57\13\uffff\1\102\37\uffff\1\102",
            "\12\104",
            "\1\105",
            "",
            "\1\106",
            "",
            "",
            "",
            "",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\4\32\1\107\25\32\4\uffff"+
            "\1\32\1\uffff\4\32\1\107\25\32\74\uffff\1\32\10\uffff\27\32"+
            "\1\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2"+
            "\32\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21"+
            "\uffff\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\22\32\1\110\7\32\4\uffff"+
            "\1\32\1\uffff\22\32\1\110\7\32\74\uffff\1\32\10\uffff\27\32"+
            "\1\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2"+
            "\32\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21"+
            "\uffff\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\1\34\1\33\1\uffff\12\72\1\11\6\uffff\32\34\4\uffff\1\34\1"+
            "\uffff\32\34\74\uffff\1\34\10\uffff\27\34\1\uffff\37\34\1\uffff"+
            "\u0286\34\1\uffff\u1c81\34\14\uffff\2\34\61\uffff\2\34\57\uffff"+
            "\u0120\34\u0a70\uffff\u03f0\34\21\uffff\ua7ff\34\u2100\uffff"+
            "\u04d0\34\40\uffff\u020e\34",
            "\12\73\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\74\uffff\1"+
            "\35\10\uffff\27\35\1\uffff\37\35\1\uffff\u0286\35\1\uffff\u1c81"+
            "\35\14\uffff\2\35\61\uffff\2\35\57\uffff\u0120\35\u0a70\uffff"+
            "\u03f0\35\21\uffff\ua7ff\35\u2100\uffff\u04d0\35\40\uffff\u020e"+
            "\35",
            "\12\74\13\uffff\1\66\37\uffff\1\66",
            "",
            "",
            "\12\111\13\uffff\1\76\37\uffff\1\76",
            "\12\100\13\uffff\1\76\37\uffff\1\76",
            "\12\113\13\uffff\1\102\37\uffff\1\102",
            "",
            "",
            "\12\104\13\uffff\1\102\37\uffff\1\102",
            "",
            "",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32\74\uffff\1\32\10\uffff\27\32\1\uffff\37\32\1\uffff"+
            "\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff\2\32\57\uffff"+
            "\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff\32\u2100\uffff"+
            "\u04d0\32\40\uffff\u020e\32",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\4\32\1\116\25\32\4\uffff"+
            "\1\32\1\uffff\4\32\1\116\25\32\74\uffff\1\32\10\uffff\27\32"+
            "\1\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2"+
            "\32\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21"+
            "\uffff\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\12\111\13\uffff\1\76\37\uffff\1\76",
            "",
            "\12\113\13\uffff\1\102\37\uffff\1\102",
            "",
            "",
            "\1\34\1\33\1\uffff\12\32\1\11\6\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32\74\uffff\1\32\10\uffff\27\32\1\uffff\37\32\1\uffff"+
            "\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff\2\32\57\uffff"+
            "\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff\32\u2100\uffff"+
            "\u04d0\32\40\uffff\u020e\32",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__48 | T__49 | T__50 | TRUE | FALSE | WS | IRI_REF | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | VARIABLETERM | VARIABLEURI | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | ECHAR | ANON | VARNAME | PN_PREFIX | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_19 = input.LA(1);

                        s = -1;
                        if ( (LA33_19=='\"') ) {s = 51;}

                        else if ( ((LA33_19>='\u0000' && LA33_19<='\t')||(LA33_19>='\u000B' && LA33_19<='\f')||(LA33_19>='\u000E' && LA33_19<='!')||(LA33_19>='#' && LA33_19<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_18 = input.LA(1);

                        s = -1;
                        if ( (LA33_18=='\'') ) {s = 49;}

                        else if ( ((LA33_18>='\u0000' && LA33_18<='\t')||(LA33_18>='\u000B' && LA33_18<='\f')||(LA33_18>='\u000E' && LA33_18<='&')||(LA33_18>='(' && LA33_18<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}