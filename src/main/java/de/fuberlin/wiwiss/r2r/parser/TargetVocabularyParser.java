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
  
  import java.util.Set;
  import java.util.HashSet;
  import java.util.Map;
  import java.util.HashMap;
  import com.hp.hpl.jena.util.PrintUtil;
  import java.util.Collection;
  import de.fuberlin.wiwiss.r2r.TargetVocabulary;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TargetVocabularyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PNAME_NS", "IRI_REF", "PNAME_LN", "WS", "PN_LOCAL", "PN_PREFIX", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "'+'", "','", "'('", "')'", "'.'", "'@prefix'"
    };
    public static final int IRI_REF=5;
    public static final int WS=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int PN_CHARS_BASE=10;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int PN_PREFIX=9;
    public static final int PN_CHARS=12;
    public static final int PN_LOCAL=8;
    public static final int PNAME_NS=4;
    public static final int PN_CHARS_U=11;
    public static final int PNAME_LN=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public TargetVocabularyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TargetVocabularyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TargetVocabularyParser.tokenNames; }
    public String getGrammarFileName() { return "/home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g"; }


      Map<String, String> prefixMap = new HashMap<String, String>();

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



    // $ANTLR start "targetVocabulary"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:57:1: targetVocabulary returns [Collection<TargetVocabulary> targetVocabularies] : ( prefixDefs )? v= vocabularyDefs ;
    public final Collection<TargetVocabulary> targetVocabulary() throws RecognitionException {
        Collection<TargetVocabulary> targetVocabularies = null;

        Collection<TargetVocabulary> v = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:58:3: ( ( prefixDefs )? v= vocabularyDefs )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:58:5: ( prefixDefs )? v= vocabularyDefs
            {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:58:5: ( prefixDefs )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:58:5: prefixDefs
                    {
                    pushFollow(FOLLOW_prefixDefs_in_targetVocabulary60);
                    prefixDefs();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_vocabularyDefs_in_targetVocabulary65);
            v=vocabularyDefs();

            state._fsp--;

             targetVocabularies = v; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return targetVocabularies;
    }
    // $ANTLR end "targetVocabulary"


    // $ANTLR start "vocabularyDefs"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:62:1: vocabularyDefs returns [Collection<TargetVocabulary> value] : ( vocabularyDef )* ;
    public final Collection<TargetVocabulary> vocabularyDefs() throws RecognitionException {
        Collection<TargetVocabulary> value = null;

        List<TargetVocabulary> vocabularyDef1 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:63:3: ( ( vocabularyDef )* )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:64:4: ( vocabularyDef )*
            {
             value = new ArrayList<TargetVocabulary>(); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:65:4: ( vocabularyDef )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=IRI_REF && LA2_0<=PNAME_LN)||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:65:5: vocabularyDef
            	    {
            	    pushFollow(FOLLOW_vocabularyDef_in_vocabularyDefs97);
            	    vocabularyDef1=vocabularyDef();

            	    state._fsp--;


            	           value.addAll(vocabularyDef1);
            	         

            	    }
            	    break;

            	default :
            	    break loop2;
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
        return value;
    }
    // $ANTLR end "vocabularyDefs"


    // $ANTLR start "vocabularyDef"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:72:1: vocabularyDef returns [List<TargetVocabulary> value] : (res= iriRef ( '+' )? ( ',' res= iriRef ( '+' )? )* )? '(' (entity= iriRef ( ',' entity= iriRef )* )? ')' ;
    public final List<TargetVocabulary> vocabularyDef() throws RecognitionException {
        List<TargetVocabulary> value = null;

        String res = null;

        String entity = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:73:3: ( (res= iriRef ( '+' )? ( ',' res= iriRef ( '+' )? )* )? '(' (entity= iriRef ( ',' entity= iriRef )* )? ')' )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:74:3: (res= iriRef ( '+' )? ( ',' res= iriRef ( '+' )? )* )? '(' (entity= iriRef ( ',' entity= iriRef )* )? ')'
            {
             Set<String> collectedEntities = new HashSet<String>();
                Set<String> classRestrictions = new HashSet<String>();
                Set<String> classRestrictionsToMap = new HashSet<String>();
                value = new ArrayList<TargetVocabulary>();
              
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:79:3: (res= iriRef ( '+' )? ( ',' res= iriRef ( '+' )? )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=IRI_REF && LA6_0<=PNAME_LN)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:79:4: res= iriRef ( '+' )? ( ',' res= iriRef ( '+' )? )*
                    {
                    pushFollow(FOLLOW_iriRef_in_vocabularyDef140);
                    res=iriRef();

                    state._fsp--;

                     classRestrictions.add(res); 
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:81:7: ( '+' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==13) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:81:8: '+'
                            {
                            match(input,13,FOLLOW_13_in_vocabularyDef155); 
                             classRestrictionsToMap.add(res); 

                            }
                            break;

                    }

                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:83:5: ( ',' res= iriRef ( '+' )? )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:83:7: ',' res= iriRef ( '+' )?
                    	    {
                    	    match(input,14,FOLLOW_14_in_vocabularyDef174); 
                    	    pushFollow(FOLLOW_iriRef_in_vocabularyDef178);
                    	    res=iriRef();

                    	    state._fsp--;

                    	    classRestrictions.add(res);
                    	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:84:7: ( '+' )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==13) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:84:8: '+'
                    	            {
                    	            match(input,13,FOLLOW_13_in_vocabularyDef189); 
                    	             classRestrictionsToMap.add(res); 

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_vocabularyDef215); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:88:8: (entity= iriRef ( ',' entity= iriRef )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=IRI_REF && LA8_0<=PNAME_LN)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:88:9: entity= iriRef ( ',' entity= iriRef )*
                    {
                    pushFollow(FOLLOW_iriRef_in_vocabularyDef222);
                    entity=iriRef();

                    state._fsp--;

                     collectedEntities.add(entity);
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:89:5: ( ',' entity= iriRef )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:89:6: ',' entity= iriRef
                    	    {
                    	    match(input,14,FOLLOW_14_in_vocabularyDef231); 
                    	    pushFollow(FOLLOW_iriRef_in_vocabularyDef235);
                    	    entity=iriRef();

                    	    state._fsp--;

                    	     collectedEntities.add(entity);

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_vocabularyDef246); 

                    if(classRestrictions.size()==0) {
                      value.add(new TargetVocabulary(null, collectedEntities, false));
                    } 
                    else {
                      for(String restriction: classRestrictions) {
                        boolean addMappingForCR = classRestrictionsToMap.contains(restriction);
                        value.add(new TargetVocabulary(restriction, collectedEntities, addMappingForCR));
                      }
                    }
                 

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
    // $ANTLR end "vocabularyDef"


    // $ANTLR start "prefixDefs"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:103:1: prefixDefs : prefixDef ( '.' prefixDef )* ( '.' )? ;
    public final void prefixDefs() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:103:11: ( prefixDef ( '.' prefixDef )* ( '.' )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:103:13: prefixDef ( '.' prefixDef )* ( '.' )?
            {
            pushFollow(FOLLOW_prefixDef_in_prefixDefs258);
            prefixDef();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:103:23: ( '.' prefixDef )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==18) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:103:24: '.' prefixDef
            	    {
            	    match(input,17,FOLLOW_17_in_prefixDefs261); 
            	    pushFollow(FOLLOW_prefixDef_in_prefixDefs263);
            	    prefixDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:103:40: ( '.' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:103:40: '.'
                    {
                    match(input,17,FOLLOW_17_in_prefixDefs267); 

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
    // $ANTLR end "prefixDefs"


    // $ANTLR start "prefixDef"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:105:1: prefixDef : '@prefix' prefix= PNAME_NS IRI_REF ;
    public final void prefixDef() throws RecognitionException {
        Token prefix=null;
        Token IRI_REF2=null;

        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:106:3: ( '@prefix' prefix= PNAME_NS IRI_REF )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:106:5: '@prefix' prefix= PNAME_NS IRI_REF
            {
            match(input,18,FOLLOW_18_in_prefixDef278); 
            prefix=(Token)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixDef282); 
            IRI_REF2=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefixDef284); 

                  String iri = (IRI_REF2!=null?IRI_REF2.getText():null);
                  prefixMap.put((prefix!=null?prefix.getText():null).substring(0, (prefix!=null?prefix.getText():null).length()-1), iri.substring(1, iri.length()-1));
              

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
    // $ANTLR end "prefixDef"


    // $ANTLR start "iriRef"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:112:1: iriRef returns [String value] : ( IRI_REF | prefixedName );
    public final String iriRef() throws RecognitionException {
        String value = null;

        Token IRI_REF3=null;
        TargetVocabularyParser.prefixedName_return prefixedName4 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:113:4: ( IRI_REF | prefixedName )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IRI_REF) ) {
                alt11=1;
            }
            else if ( (LA11_0==PNAME_LN) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:113:6: IRI_REF
                    {
                    IRI_REF3=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef305); 
                     
                           String iri = (IRI_REF3!=null?IRI_REF3.getText():null);
                           value = iri.substring(1, iri.length()-1);
                         

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:118:6: prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iriRef320);
                    prefixedName4=prefixedName();

                    state._fsp--;

                     
                         String qName = (prefixedName4!=null?input.toString(prefixedName4.start,prefixedName4.stop):null);
                         String iri = PrintUtil.expandQname(qName);
                         if(qName.equals(iri))
                         {
                           String[] prefixAndName = (qName.split(":"));
                           iri = prefixMap.get(prefixAndName[0]);
                           if(iri==null)
                             throw new IllegalArgumentException("Uknown namespace prefix in target vocabulary: " + prefixAndName[0]);
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
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:141:3: prefixedName : p= PNAME_LN ;
    public final TargetVocabularyParser.prefixedName_return prefixedName() throws RecognitionException {
        TargetVocabularyParser.prefixedName_return retval = new TargetVocabularyParser.prefixedName_return();
        retval.start = input.LT(1);

        Token p=null;

        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:142:4: (p= PNAME_LN )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabulary.g:142:6: p= PNAME_LN
            {
            p=(Token)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName347); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_prefixDefs_in_targetVocabulary60 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_vocabularyDefs_in_targetVocabulary65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vocabularyDef_in_vocabularyDefs97 = new BitSet(new long[]{0x0000000000008062L});
    public static final BitSet FOLLOW_iriRef_in_vocabularyDef140 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13_in_vocabularyDef155 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_vocabularyDef174 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_iriRef_in_vocabularyDef178 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13_in_vocabularyDef189 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_vocabularyDef215 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_iriRef_in_vocabularyDef222 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_vocabularyDef231 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_iriRef_in_vocabularyDef235 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_vocabularyDef246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixDef_in_prefixDefs258 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_prefixDefs261 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_prefixDef_in_prefixDefs263 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_prefixDefs267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_prefixDef278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixDef282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IRI_REF_in_prefixDef284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName347 = new BitSet(new long[]{0x0000000000000002L});

}