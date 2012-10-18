// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andreas/projects/r2r/antlr-files/Transformation.g 2012-02-23 14:41:37

package de.fuberlin.wiwiss.r2r.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TransformationLexer extends Lexer {
    public static final int INTEGER=11;
    public static final int T__40=40;
    public static final int EXPONENT=20;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int PN_LOCAL=27;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int EOF=-1;
    public static final int ECHAR=21;
    public static final int ALPHA=19;
    public static final int FUNCTIONNAME=10;
    public static final int VARNAME=18;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=23;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int STRING_LITERAL_LONG2=17;
    public static final int PN_CHARS_BASE=24;
    public static final int T__36=36;
    public static final int DECIMAL=12;
    public static final int T__37=37;
    public static final int VAR1=8;
    public static final int T__38=38;
    public static final int VAR2=9;
    public static final int STRING_LITERAL_LONG1=16;
    public static final int T__39=39;
    public static final int PN_PREFIX=26;
    public static final int STRING_LITERAL2=15;
    public static final int STRING_LITERAL1=14;
    public static final int PN_CHARS=25;
    public static final int DOUBLE=13;
    public static final int PN_CHARS_U=22;
    public static final int PLUS=4;
    public static final int DIV=7;

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

    public TransformationLexer() {;} 
    public TransformationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TransformationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/andreas/projects/r2r/antlr-files/Transformation.g"; }

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:26:7: ( '=' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:27:7: ( '(' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:28:7: ( ')' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:29:7: ( '[' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:29:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:30:7: ( '?' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:30:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:31:7: ( ':' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:32:7: ( ']' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:33:7: ( '>' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:34:7: ( '>=' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:34:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:35:7: ( '<' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:35:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:36:7: ( '<=' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:36:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:37:7: ( '!=' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:37:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:38:7: ( ',' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "VAR1"
    public final void mVAR1() throws RecognitionException {
        try {
            int _type = VAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:238:3: ( '?' VARNAME )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:238:5: '?' VARNAME
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
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:242:3: ( '$' VARNAME )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:242:5: '$' VARNAME
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:246:3: ( ( '0' .. '9' )+ )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:246:5: ( '0' .. '9' )+
            {
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:246:5: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:246:6: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FUNCTIONNAME"
    public final void mFUNCTIONNAME() throws RecognitionException {
        try {
            int _type = FUNCTIONNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:250:3: ( ( ( ALPHA )+ ':' )? ALPHA ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:250:5: ( ( ALPHA )+ ':' )? ALPHA ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:250:5: ( ( ALPHA )+ ':' )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:250:6: ( ALPHA )+ ':'
                    {
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:250:6: ( ALPHA )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:250:7: ALPHA
                    	    {
                    	    mALPHA(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    match(':'); 

                    }
                    break;

            }

            mALPHA(); 
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:250:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTIONNAME"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:254:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='.') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:254:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:254:5: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:254:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:254:21: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:254:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:254:35: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:254:39: ( '0' .. '9' )+
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
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:254:40: '0' .. '9'
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
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:258:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:258:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT
                    {
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:258:5: ( '0' .. '9' )+
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
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:258:6: '0' .. '9'
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

                    match('.'); 
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:258:21: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:258:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;
                case 2 :
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:259:5: '.' ( '0' .. '9' )+ EXPONENT
                    {
                    match('.'); 
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:259:9: ( '0' .. '9' )+
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
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:259:10: '0' .. '9'
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

                    mEXPONENT(); 

                    }
                    break;
                case 3 :
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:260:5: ( '0' .. '9' )+ EXPONENT
                    {
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:260:5: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:260:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
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

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:264:3: ( '*' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:264:5: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:268:3: ( '/' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:268:5: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:296:3: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+ )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:296:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/andreas/projects/r2r/antlr-files/Transformation.g:296:17: ( PLUS | MINUS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='+'||LA14_0=='-') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:
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

            // /home/andreas/projects/r2r/antlr-files/Transformation.g:296:33: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:296:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:300:3: ( '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:300:5: '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); 
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:300:10: (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }
                else if ( (LA16_0=='\\') ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:300:11: ~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' )
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
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:300:58: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:304:3: ( '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:304:5: '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"'
            {
            match('\"'); 
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:304:9: (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }
                else if ( (LA17_0=='\\') ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:304:10: ~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' )
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
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:304:57: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:3: ( '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:5: '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); 

            // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:14: ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\'') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='\'') ) {
                        int LA20_3 = input.LA(3);

                        if ( ((LA20_3>='\u0000' && LA20_3<='&')||(LA20_3>='(' && LA20_3<='\uFFFF')) ) {
                            alt20=1;
                        }


                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='&')||(LA20_1>='(' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:15: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:15: ( '\\'' | '\\'\\'' )?
            	    int alt18=3;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0=='\'') ) {
            	        int LA18_1 = input.LA(2);

            	        if ( (LA18_1=='\'') ) {
            	            alt18=2;
            	        }
            	        else if ( ((LA18_1>='\u0000' && LA18_1<='&')||(LA18_1>='(' && LA18_1<='\uFFFF')) ) {
            	            alt18=1;
            	        }
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:17: '\\''
            	            {
            	            match('\''); 

            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:24: '\\'\\''
            	            {
            	            match("''"); 


            	            }
            	            break;

            	    }

            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:33: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0=='\\') ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:34: ~ ( '\\'' | '\\\\' )
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
            	            // /home/andreas/projects/r2r/antlr-files/Transformation.g:308:51: ECHAR
            	            {
            	            mECHAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:3: ( '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:5: '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); 

            // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:11: ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\"') ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1=='\"') ) {
                        int LA23_3 = input.LA(3);

                        if ( ((LA23_3>='\u0000' && LA23_3<='!')||(LA23_3>='#' && LA23_3<='\uFFFF')) ) {
                            alt23=1;
                        }


                    }
                    else if ( ((LA23_1>='\u0000' && LA23_1<='!')||(LA23_1>='#' && LA23_1<='\uFFFF')) ) {
                        alt23=1;
                    }


                }
                else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:12: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:12: ( '\"' | '\"\"' )?
            	    int alt21=3;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0=='\"') ) {
            	        int LA21_1 = input.LA(2);

            	        if ( (LA21_1=='\"') ) {
            	            alt21=2;
            	        }
            	        else if ( ((LA21_1>='\u0000' && LA21_1<='!')||(LA21_1>='#' && LA21_1<='\uFFFF')) ) {
            	            alt21=1;
            	        }
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:14: '\"'
            	            {
            	            match('\"'); 

            	            }
            	            break;
            	        case 2 :
            	            // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:20: '\"\"'
            	            {
            	            match("\"\""); 


            	            }
            	            break;

            	    }

            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:27: (~ ( '\"' | '\\\\' ) | ECHAR )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0=='\\') ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:28: ~ ( '\"' | '\\\\' )
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
            	            // /home/andreas/projects/r2r/antlr-files/Transformation.g:312:44: ECHAR
            	            {
            	            mECHAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:316:3: ( '-' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:316:5: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:320:3: ( '+' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:320:5: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            int _type = ECHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:324:3: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:324:5: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
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

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            int _type = VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:328:3: ( ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:328:5: ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/andreas/projects/r2r/antlr-files/Transformation.g:328:29: ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')||LA24_0=='\u00B7'||(LA24_0>='\u00C0' && LA24_0<='\u00D6')||(LA24_0>='\u00D8' && LA24_0<='\u00F6')||(LA24_0>='\u00F8' && LA24_0<='\u037D')||(LA24_0>='\u037F' && LA24_0<='\u1FFF')||(LA24_0>='\u200C' && LA24_0<='\u200D')||(LA24_0>='\u203F' && LA24_0<='\u2040')||(LA24_0>='\u2070' && LA24_0<='\u218F')||(LA24_0>='\u2C00' && LA24_0<='\u2FEF')||(LA24_0>='\u3001' && LA24_0<='\uD7FF')||(LA24_0>='\uF900' && LA24_0<='\uFDCF')||(LA24_0>='\uFDF0' && LA24_0<='\uFFFD')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:
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
            	    break loop24;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:332:3: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:332:5: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
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

    // $ANTLR start "PN_PREFIX"
    public final void mPN_PREFIX() throws RecognitionException {
        try {
            int _type = PN_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:336:3: ( PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:336:5: PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); 
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:336:19: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>='-' && LA26_0<='.')||(LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')||LA26_0=='\u00B7'||(LA26_0>='\u00C0' && LA26_0<='\u00D6')||(LA26_0>='\u00D8' && LA26_0<='\u00F6')||(LA26_0>='\u00F8' && LA26_0<='\u037D')||(LA26_0>='\u037F' && LA26_0<='\u1FFF')||(LA26_0>='\u200C' && LA26_0<='\u200D')||(LA26_0>='\u203F' && LA26_0<='\u2040')||(LA26_0>='\u2070' && LA26_0<='\u218F')||(LA26_0>='\u2C00' && LA26_0<='\u2FEF')||(LA26_0>='\u3001' && LA26_0<='\uD7FF')||(LA26_0>='\uF900' && LA26_0<='\uFDCF')||(LA26_0>='\uFDF0' && LA26_0<='\uFFFD')) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:336:20: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:336:20: ( PN_CHARS | '.' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='-'||(LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')||LA25_0=='\u00B7'||(LA25_0>='\u00C0' && LA25_0<='\u00D6')||(LA25_0>='\u00D8' && LA25_0<='\u00F6')||(LA25_0>='\u00F8' && LA25_0<='\u037D')||(LA25_0>='\u037F' && LA25_0<='\u1FFF')||(LA25_0>='\u200C' && LA25_0<='\u200D')||(LA25_0>='\u203F' && LA25_0<='\u2040')||(LA25_0>='\u2070' && LA25_0<='\u218F')||(LA25_0>='\u2C00' && LA25_0<='\u2FEF')||(LA25_0>='\u3001' && LA25_0<='\uD7FF')||(LA25_0>='\uF900' && LA25_0<='\uFDCF')||(LA25_0>='\uFDF0' && LA25_0<='\uFFFD')) ) {
                            int LA25_1 = input.LA(2);

                            if ( ((LA25_1>='-' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='9')||(LA25_1>='A' && LA25_1<='Z')||LA25_1=='_'||(LA25_1>='a' && LA25_1<='z')||LA25_1=='\u00B7'||(LA25_1>='\u00C0' && LA25_1<='\u00D6')||(LA25_1>='\u00D8' && LA25_1<='\u00F6')||(LA25_1>='\u00F8' && LA25_1<='\u037D')||(LA25_1>='\u037F' && LA25_1<='\u1FFF')||(LA25_1>='\u200C' && LA25_1<='\u200D')||(LA25_1>='\u203F' && LA25_1<='\u2040')||(LA25_1>='\u2070' && LA25_1<='\u218F')||(LA25_1>='\u2C00' && LA25_1<='\u2FEF')||(LA25_1>='\u3001' && LA25_1<='\uD7FF')||(LA25_1>='\uF900' && LA25_1<='\uFDCF')||(LA25_1>='\uFDF0' && LA25_1<='\uFFFD')) ) {
                                alt25=1;
                            }


                        }
                        else if ( (LA25_0=='.') ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:
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
                    	    break loop25;
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

    // $ANTLR start "PN_CHARS_BASE"
    public final void mPN_CHARS_BASE() throws RecognitionException {
        try {
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:340:3: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:
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
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:356:3: ( PN_CHARS_BASE | '_' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:
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

    // $ANTLR start "PN_CHARS"
    public final void mPN_CHARS() throws RecognitionException {
        try {
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:360:3: ( PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:
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
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:369:3: ( ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:369:5: ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/andreas/projects/r2r/antlr-files/Transformation.g:369:29: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>='-' && LA28_0<='.')||(LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')||LA28_0=='\u00B7'||(LA28_0>='\u00C0' && LA28_0<='\u00D6')||(LA28_0>='\u00D8' && LA28_0<='\u00F6')||(LA28_0>='\u00F8' && LA28_0<='\u037D')||(LA28_0>='\u037F' && LA28_0<='\u1FFF')||(LA28_0>='\u200C' && LA28_0<='\u200D')||(LA28_0>='\u203F' && LA28_0<='\u2040')||(LA28_0>='\u2070' && LA28_0<='\u218F')||(LA28_0>='\u2C00' && LA28_0<='\u2FEF')||(LA28_0>='\u3001' && LA28_0<='\uD7FF')||(LA28_0>='\uF900' && LA28_0<='\uFDCF')||(LA28_0>='\uFDF0' && LA28_0<='\uFFFD')) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:369:30: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // /home/andreas/projects/r2r/antlr-files/Transformation.g:369:30: ( PN_CHARS | '.' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='-'||(LA27_0>='0' && LA27_0<='9')||(LA27_0>='A' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='z')||LA27_0=='\u00B7'||(LA27_0>='\u00C0' && LA27_0<='\u00D6')||(LA27_0>='\u00D8' && LA27_0<='\u00F6')||(LA27_0>='\u00F8' && LA27_0<='\u037D')||(LA27_0>='\u037F' && LA27_0<='\u1FFF')||(LA27_0>='\u200C' && LA27_0<='\u200D')||(LA27_0>='\u203F' && LA27_0<='\u2040')||(LA27_0>='\u2070' && LA27_0<='\u218F')||(LA27_0>='\u2C00' && LA27_0<='\u2FEF')||(LA27_0>='\u3001' && LA27_0<='\uD7FF')||(LA27_0>='\uF900' && LA27_0<='\uFDCF')||(LA27_0>='\uFDF0' && LA27_0<='\uFFFD')) ) {
                            int LA27_1 = input.LA(2);

                            if ( ((LA27_1>='-' && LA27_1<='.')||(LA27_1>='0' && LA27_1<='9')||(LA27_1>='A' && LA27_1<='Z')||LA27_1=='_'||(LA27_1>='a' && LA27_1<='z')||LA27_1=='\u00B7'||(LA27_1>='\u00C0' && LA27_1<='\u00D6')||(LA27_1>='\u00D8' && LA27_1<='\u00F6')||(LA27_1>='\u00F8' && LA27_1<='\u037D')||(LA27_1>='\u037F' && LA27_1<='\u1FFF')||(LA27_1>='\u200C' && LA27_1<='\u200D')||(LA27_1>='\u203F' && LA27_1<='\u2040')||(LA27_1>='\u2070' && LA27_1<='\u218F')||(LA27_1>='\u2C00' && LA27_1<='\u2FEF')||(LA27_1>='\u3001' && LA27_1<='\uD7FF')||(LA27_1>='\uF900' && LA27_1<='\uFDCF')||(LA27_1>='\uFDF0' && LA27_1<='\uFFFD')) ) {
                                alt27=1;
                            }


                        }
                        else if ( (LA27_0=='.') ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /home/andreas/projects/r2r/antlr-files/Transformation.g:
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
                    	    break loop27;
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

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:373:3: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/andreas/projects/r2r/antlr-files/Transformation.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "ALPHA"

    public void mTokens() throws RecognitionException {
        // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | VAR1 | VAR2 | INTEGER | FUNCTIONNAME | DECIMAL | DOUBLE | MULT | DIV | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | MINUS | PLUS | ECHAR | VARNAME | WS | PN_PREFIX )
        int alt29=32;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:10: T__28
                {
                mT__28(); 

                }
                break;
            case 2 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:16: T__29
                {
                mT__29(); 

                }
                break;
            case 3 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:22: T__30
                {
                mT__30(); 

                }
                break;
            case 4 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:28: T__31
                {
                mT__31(); 

                }
                break;
            case 5 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:34: T__32
                {
                mT__32(); 

                }
                break;
            case 6 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:40: T__33
                {
                mT__33(); 

                }
                break;
            case 7 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:46: T__34
                {
                mT__34(); 

                }
                break;
            case 8 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:52: T__35
                {
                mT__35(); 

                }
                break;
            case 9 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:58: T__36
                {
                mT__36(); 

                }
                break;
            case 10 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:64: T__37
                {
                mT__37(); 

                }
                break;
            case 11 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:70: T__38
                {
                mT__38(); 

                }
                break;
            case 12 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:76: T__39
                {
                mT__39(); 

                }
                break;
            case 13 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:82: T__40
                {
                mT__40(); 

                }
                break;
            case 14 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:88: VAR1
                {
                mVAR1(); 

                }
                break;
            case 15 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:93: VAR2
                {
                mVAR2(); 

                }
                break;
            case 16 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:98: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 17 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:106: FUNCTIONNAME
                {
                mFUNCTIONNAME(); 

                }
                break;
            case 18 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:119: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 19 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:127: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 20 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:134: MULT
                {
                mMULT(); 

                }
                break;
            case 21 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:139: DIV
                {
                mDIV(); 

                }
                break;
            case 22 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:143: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 23 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:152: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); 

                }
                break;
            case 24 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:168: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 

                }
                break;
            case 25 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:184: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); 

                }
                break;
            case 26 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:205: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); 

                }
                break;
            case 27 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:226: MINUS
                {
                mMINUS(); 

                }
                break;
            case 28 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:232: PLUS
                {
                mPLUS(); 

                }
                break;
            case 29 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:237: ECHAR
                {
                mECHAR(); 

                }
                break;
            case 30 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:243: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 31 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:251: WS
                {
                mWS(); 

                }
                break;
            case 32 :
                // /home/andreas/projects/r2r/antlr-files/Transformation.g:1:254: PN_PREFIX
                {
                mPN_PREFIX(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA3_eotS =
        "\1\uffff\1\2\1\uffff\1\2\1\uffff";
    static final String DFA3_eofS =
        "\5\uffff";
    static final String DFA3_minS =
        "\1\101\1\72\1\uffff\1\72\1\uffff";
    static final String DFA3_maxS =
        "\2\172\1\uffff\1\172\1\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA3_specialS =
        "\5\uffff}>";
    static final String[] DFA3_transitionS = {
            "\32\1\6\uffff\32\1",
            "\1\4\6\uffff\32\3\6\uffff\32\3",
            "",
            "\1\4\6\uffff\32\3\6\uffff\32\3",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "250:5: ( ( ALPHA )+ ':' )?";
        }
    }
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\2\56\3\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "257:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA29_eotS =
        "\5\uffff\1\34\2\uffff\1\36\1\40\3\uffff\1\41\1\45\3\uffff\1\45\5"+
        "\uffff\1\32\11\uffff\1\41\1\32\1\66\1\uffff\1\45\1\uffff\1\45\1"+
        "\32\1\45\1\uffff\1\45\1\66\1\45\1\60\1\uffff\1\62\2\uffff\1\63\1"+
        "\66\1\uffff\1\45\2\uffff";
    static final String DFA29_eofS =
        "\72\uffff";
    static final String DFA29_minS =
        "\1\11\4\uffff\1\60\2\uffff\2\75\3\uffff\1\56\1\53\1\60\2\uffff\1"+
        "\55\2\0\3\uffff\1\55\11\uffff\1\56\1\53\1\60\1\uffff\1\55\1\uffff"+
        "\3\55\1\uffff\1\55\1\60\1\55\1\47\1\uffff\1\42\2\uffff\2\60\1\uffff"+
        "\1\55\2\uffff";
    static final String DFA29_maxS =
        "\1\ufffd\4\uffff\1\ufffd\2\uffff\2\75\3\uffff\2\ufffd\1\71\2\uffff"+
        "\1\ufffd\2\uffff\3\uffff\1\ufffd\11\uffff\1\ufffd\1\71\1\145\1\uffff"+
        "\1\ufffd\1\uffff\3\ufffd\1\uffff\1\ufffd\1\145\1\ufffd\1\47\1\uffff"+
        "\1\42\2\uffff\1\ufffd\1\145\1\uffff\1\ufffd\2\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\2\uffff\1\14\1\15\1\17"+
        "\3\uffff\1\24\1\25\3\uffff\1\33\1\34\1\35\1\uffff\1\37\1\36\1\16"+
        "\1\5\1\11\1\10\1\13\1\12\1\20\3\uffff\1\21\1\uffff\1\40\3\uffff"+
        "\1\26\4\uffff\1\27\1\uffff\1\30\1\23\2\uffff\1\22\1\uffff\1\31\1"+
        "\32";
    static final String DFA29_specialS =
        "\23\uffff\1\0\1\1\45\uffff}>";
    static final String[] DFA29_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\12\1\24\1\uffff\1\14\2\uffff"+
            "\1\23\1\2\1\3\1\20\1\26\1\13\1\25\1\17\1\21\12\15\1\6\1\uffff"+
            "\1\11\1\1\1\10\1\5\1\uffff\4\22\1\16\25\22\1\4\1\27\1\7\1\uffff"+
            "\1\32\1\uffff\4\22\1\16\25\22\105\uffff\27\30\1\uffff\37\30"+
            "\1\uffff\u0208\30\160\uffff\16\30\1\uffff\u1c81\30\14\uffff"+
            "\2\30\142\uffff\u0120\30\u0a70\uffff\u03f0\30\21\uffff\ua7ff"+
            "\30\u2100\uffff\u04d0\30\40\uffff\u020e\30",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33\105\uffff\27"+
            "\33\1\uffff\37\33\1\uffff\u0208\33\160\uffff\16\33\1\uffff\u1c81"+
            "\33\14\uffff\2\33\142\uffff\u0120\33\u0a70\uffff\u03f0\33\21"+
            "\uffff\ua7ff\33\u2100\uffff\u04d0\33\40\uffff\u020e\33",
            "",
            "",
            "\1\35",
            "\1\37",
            "",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\4\32\1\43\25\32\4\uffff\1\32\1"+
            "\uffff\4\32\1\43\25\32\74\uffff\1\32\10\uffff\27\32\1\uffff"+
            "\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff"+
            "\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff"+
            "\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\1\53\1\uffff\1\50\1\47\1\uffff\12\52\7\uffff\32\46\4\uffff"+
            "\1\54\1\uffff\32\46\74\uffff\1\51\10\uffff\27\51\1\uffff\37"+
            "\51\1\uffff\u0286\51\1\uffff\u1c81\51\14\uffff\2\51\61\uffff"+
            "\2\51\57\uffff\u0120\51\u0a70\uffff\u03f0\51\21\uffff\ua7ff"+
            "\51\u2100\uffff\u04d0\51\40\uffff\u020e\51",
            "\12\55",
            "",
            "",
            "\1\56\1\47\1\uffff\12\54\7\uffff\32\46\4\uffff\1\54\1\uffff"+
            "\32\46\74\uffff\1\51\10\uffff\27\51\1\uffff\37\51\1\uffff\u0286"+
            "\51\1\uffff\u1c81\51\14\uffff\2\51\61\uffff\2\51\57\uffff\u0120"+
            "\51\u0a70\uffff\u03f0\51\21\uffff\ua7ff\51\u2100\uffff\u04d0"+
            "\51\40\uffff\u020e\51",
            "\12\60\1\uffff\2\60\1\uffff\31\60\1\57\uffd8\60",
            "\12\62\1\uffff\2\62\1\uffff\24\62\1\61\uffdd\62",
            "",
            "",
            "",
            "\2\47\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51"+
            "\74\uffff\1\51\10\uffff\27\51\1\uffff\37\51\1\uffff\u0286\51"+
            "\1\uffff\u1c81\51\14\uffff\2\51\61\uffff\2\51\57\uffff\u0120"+
            "\51\u0a70\uffff\u03f0\51\21\uffff\ua7ff\51\u2100\uffff\u04d0"+
            "\51\40\uffff\u020e\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\4\32\1\43\25\32\4\uffff\1\32\1"+
            "\uffff\4\32\1\43\25\32\74\uffff\1\32\10\uffff\27\32\1\uffff"+
            "\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff"+
            "\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff"+
            "\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\1\63\1\uffff\1\63\2\uffff\12\64",
            "\12\65\13\uffff\1\63\37\uffff\1\63",
            "",
            "\1\56\1\47\1\uffff\12\54\7\uffff\32\46\4\uffff\1\54\1\uffff"+
            "\32\46\74\uffff\1\51\10\uffff\27\51\1\uffff\37\51\1\uffff\u0286"+
            "\51\1\uffff\u1c81\51\14\uffff\2\51\61\uffff\2\51\57\uffff\u0120"+
            "\51\u0a70\uffff\u03f0\51\21\uffff\ua7ff\51\u2100\uffff\u04d0"+
            "\51\40\uffff\u020e\51",
            "",
            "\1\56\1\47\1\uffff\12\67\7\uffff\32\56\4\uffff\1\56\1\uffff"+
            "\32\56\74\uffff\1\47\10\uffff\27\47\1\uffff\37\47\1\uffff\u0286"+
            "\47\1\uffff\u1c81\47\14\uffff\2\47\61\uffff\2\47\57\uffff\u0120"+
            "\47\u0a70\uffff\u03f0\47\21\uffff\ua7ff\47\u2100\uffff\u04d0"+
            "\47\40\uffff\u020e\47",
            "\2\47\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51"+
            "\74\uffff\1\51\10\uffff\27\51\1\uffff\37\51\1\uffff\u0286\51"+
            "\1\uffff\u1c81\51\14\uffff\2\51\61\uffff\2\51\57\uffff\u0120"+
            "\51\u0a70\uffff\u03f0\51\21\uffff\ua7ff\51\u2100\uffff\u04d0"+
            "\51\40\uffff\u020e\51",
            "\1\56\1\47\1\uffff\12\52\7\uffff\32\54\4\uffff\1\54\1\uffff"+
            "\32\54\74\uffff\1\51\10\uffff\27\51\1\uffff\37\51\1\uffff\u0286"+
            "\51\1\uffff\u1c81\51\14\uffff\2\51\61\uffff\2\51\57\uffff\u0120"+
            "\51\u0a70\uffff\u03f0\51\21\uffff\ua7ff\51\u2100\uffff\u04d0"+
            "\51\40\uffff\u020e\51",
            "",
            "\1\56\1\47\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff"+
            "\32\54\74\uffff\1\51\10\uffff\27\51\1\uffff\37\51\1\uffff\u0286"+
            "\51\1\uffff\u1c81\51\14\uffff\2\51\61\uffff\2\51\57\uffff\u0120"+
            "\51\u0a70\uffff\u03f0\51\21\uffff\ua7ff\51\u2100\uffff\u04d0"+
            "\51\40\uffff\u020e\51",
            "\12\55\13\uffff\1\63\37\uffff\1\63",
            "\1\56\1\47\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff"+
            "\32\56\74\uffff\1\47\10\uffff\27\47\1\uffff\37\47\1\uffff\u0286"+
            "\47\1\uffff\u1c81\47\14\uffff\2\47\61\uffff\2\47\57\uffff\u0120"+
            "\47\u0a70\uffff\u03f0\47\21\uffff\ua7ff\47\u2100\uffff\u04d0"+
            "\47\40\uffff\u020e\47",
            "\1\70",
            "",
            "\1\71",
            "",
            "",
            "\12\64\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32\74\uffff\1"+
            "\32\10\uffff\27\32\1\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81"+
            "\32\14\uffff\2\32\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff"+
            "\u03f0\32\21\uffff\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e"+
            "\32",
            "\12\65\13\uffff\1\63\37\uffff\1\63",
            "",
            "\1\56\1\47\1\uffff\12\67\7\uffff\32\56\4\uffff\1\56\1\uffff"+
            "\32\56\74\uffff\1\47\10\uffff\27\47\1\uffff\37\47\1\uffff\u0286"+
            "\47\1\uffff\u1c81\47\14\uffff\2\47\61\uffff\2\47\57\uffff\u0120"+
            "\47\u0a70\uffff\u03f0\47\21\uffff\ua7ff\47\u2100\uffff\u04d0"+
            "\47\40\uffff\u020e\47",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | VAR1 | VAR2 | INTEGER | FUNCTIONNAME | DECIMAL | DOUBLE | MULT | DIV | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | MINUS | PLUS | ECHAR | VARNAME | WS | PN_PREFIX );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_19 = input.LA(1);

                        s = -1;
                        if ( (LA29_19=='\'') ) {s = 47;}

                        else if ( ((LA29_19>='\u0000' && LA29_19<='\t')||(LA29_19>='\u000B' && LA29_19<='\f')||(LA29_19>='\u000E' && LA29_19<='&')||(LA29_19>='(' && LA29_19<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_20 = input.LA(1);

                        s = -1;
                        if ( (LA29_20=='\"') ) {s = 49;}

                        else if ( ((LA29_20>='\u0000' && LA29_20<='\t')||(LA29_20>='\u000B' && LA29_20<='\f')||(LA29_20>='\u000E' && LA29_20<='!')||(LA29_20>='#' && LA29_20<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}