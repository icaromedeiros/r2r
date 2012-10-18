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
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g 2010-07-19 12:16:41

  package de.fuberlin.wiwiss.r2r.parser;
  
  import java.util.Set;
  import java.util.HashSet;
  import java.util.Map;
  import java.util.HashMap;
  import com.hp.hpl.jena.util.PrintUtil;
  import java.util.Collection;
  import de.fuberlin.wiwiss.r2r.discovery.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TargetVocabularyDiscoveryParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PNAME_NS", "IRI_REF", "PNAME_LN", "WS", "PN_LOCAL", "PN_PREFIX", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "'('", "','", "')'", "'^'", "'.'", "'@prefix'"
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


        public TargetVocabularyDiscoveryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TargetVocabularyDiscoveryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TargetVocabularyDiscoveryParser.tokenNames; }
    public String getGrammarFileName() { return "/home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g"; }


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
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:57:1: targetVocabulary returns [Collection<DiscoveryTargetVocabulary> targetVocabularies] : ( prefixDefs )? v= vocabularyDefs ;
    public final Collection<DiscoveryTargetVocabulary> targetVocabulary() throws RecognitionException {
        Collection<DiscoveryTargetVocabulary> targetVocabularies = null;

        Collection<DiscoveryTargetVocabulary> v = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:58:3: ( ( prefixDefs )? v= vocabularyDefs )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:58:5: ( prefixDefs )? v= vocabularyDefs
            {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:58:5: ( prefixDefs )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:58:5: prefixDefs
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
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:62:1: vocabularyDefs returns [Collection<DiscoveryTargetVocabulary> value] : ( vocabularyDef )* ;
    public final Collection<DiscoveryTargetVocabulary> vocabularyDefs() throws RecognitionException {
        Collection<DiscoveryTargetVocabulary> value = null;

        DiscoveryTargetVocabulary vocabularyDef1 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:63:3: ( ( vocabularyDef )* )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:64:4: ( vocabularyDef )*
            {
             value = new ArrayList<DiscoveryTargetVocabulary>(); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:65:4: ( vocabularyDef )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:65:5: vocabularyDef
            	    {
            	    pushFollow(FOLLOW_vocabularyDef_in_vocabularyDefs97);
            	    vocabularyDef1=vocabularyDef();

            	    state._fsp--;


            	           value.add(vocabularyDef1);
            	         

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
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:72:1: vocabularyDef returns [DiscoveryTargetVocabulary value] : '(' (entity= termWithDataset ( ',' entity= termWithDataset )* )? ')' ( '^' ds= iriRef )? ( '.' )? ;
    public final DiscoveryTargetVocabulary vocabularyDef() throws RecognitionException {
        DiscoveryTargetVocabulary value = null;

        TargetVocabularyDiscoveryParser.termWithDataset_return entity = null;

        String ds = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:73:3: ( '(' (entity= termWithDataset ( ',' entity= termWithDataset )* )? ')' ( '^' ds= iriRef )? ( '.' )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:74:3: '(' (entity= termWithDataset ( ',' entity= termWithDataset )* )? ')' ( '^' ds= iriRef )? ( '.' )?
            {

                String dataset = null;
                Map<String, String> termDatasetPairs = new HashMap<String, String>();
              
            match(input,13,FOLLOW_13_in_vocabularyDef136); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:78:8: (entity= termWithDataset ( ',' entity= termWithDataset )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=IRI_REF && LA4_0<=PNAME_LN)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:78:9: entity= termWithDataset ( ',' entity= termWithDataset )*
                    {
                    pushFollow(FOLLOW_termWithDataset_in_vocabularyDef143);
                    entity=termWithDataset();

                    state._fsp--;

                     termDatasetPairs.put((entity!=null?entity.term:null), (entity!=null?entity.dataset:null));
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:79:5: ( ',' entity= termWithDataset )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:79:6: ',' entity= termWithDataset
                    	    {
                    	    match(input,14,FOLLOW_14_in_vocabularyDef152); 
                    	    pushFollow(FOLLOW_termWithDataset_in_vocabularyDef156);
                    	    entity=termWithDataset();

                    	    state._fsp--;

                    	     termDatasetPairs.put((entity!=null?entity.term:null), (entity!=null?entity.dataset:null));

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_vocabularyDef167); 
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:80:6: ( '^' ds= iriRef )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:80:7: '^' ds= iriRef
                    {
                    match(input,16,FOLLOW_16_in_vocabularyDef170); 
                    pushFollow(FOLLOW_iriRef_in_vocabularyDef174);
                    ds=iriRef();

                    state._fsp--;

                    dataset = ds;

                    }
                    break;

            }

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:80:46: ( '.' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:80:46: '.'
                    {
                    match(input,17,FOLLOW_17_in_vocabularyDef180); 

                    }
                    break;

            }


                    value = new DiscoveryTargetVocabulary(termDatasetPairs, dataset);
                  

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

    public static class termWithDataset_return extends ParserRuleReturnScope {
        public String term;
        public String dataset;
    };

    // $ANTLR start "termWithDataset"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:86:1: termWithDataset returns [String term, String dataset] : t= iriRef ( '^' ds= iriRef )? ;
    public final TargetVocabularyDiscoveryParser.termWithDataset_return termWithDataset() throws RecognitionException {
        TargetVocabularyDiscoveryParser.termWithDataset_return retval = new TargetVocabularyDiscoveryParser.termWithDataset_return();
        retval.start = input.LT(1);

        String t = null;

        String ds = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:87:3: (t= iriRef ( '^' ds= iriRef )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:87:5: t= iriRef ( '^' ds= iriRef )?
            {
            pushFollow(FOLLOW_iriRef_in_termWithDataset210);
            t=iriRef();

            state._fsp--;

             retval.term = t; retval.dataset = null;
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:88:4: ( '^' ds= iriRef )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:88:5: '^' ds= iriRef
                    {
                    match(input,16,FOLLOW_16_in_termWithDataset218); 
                    pushFollow(FOLLOW_iriRef_in_termWithDataset222);
                    ds=iriRef();

                    state._fsp--;

                    retval.dataset = ds;

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
    // $ANTLR end "termWithDataset"


    // $ANTLR start "prefixDefs"
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:91:1: prefixDefs : prefixDef ( '.' prefixDef )* ( '.' )? ;
    public final void prefixDefs() throws RecognitionException {
        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:91:11: ( prefixDef ( '.' prefixDef )* ( '.' )? )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:91:13: prefixDef ( '.' prefixDef )* ( '.' )?
            {
            pushFollow(FOLLOW_prefixDef_in_prefixDefs238);
            prefixDef();

            state._fsp--;

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:91:23: ( '.' prefixDef )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==18) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:91:24: '.' prefixDef
            	    {
            	    match(input,17,FOLLOW_17_in_prefixDefs241); 
            	    pushFollow(FOLLOW_prefixDef_in_prefixDefs243);
            	    prefixDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:91:40: ( '.' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:91:40: '.'
                    {
                    match(input,17,FOLLOW_17_in_prefixDefs247); 

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
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:93:1: prefixDef : '@prefix' prefix= PNAME_NS IRI_REF ;
    public final void prefixDef() throws RecognitionException {
        Token prefix=null;
        Token IRI_REF2=null;

        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:94:3: ( '@prefix' prefix= PNAME_NS IRI_REF )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:94:5: '@prefix' prefix= PNAME_NS IRI_REF
            {
            match(input,18,FOLLOW_18_in_prefixDef258); 
            prefix=(Token)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixDef262); 
            IRI_REF2=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefixDef264); 

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
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:100:1: iriRef returns [String value] : ( IRI_REF | prefixedName );
    public final String iriRef() throws RecognitionException {
        String value = null;

        Token IRI_REF3=null;
        TargetVocabularyDiscoveryParser.prefixedName_return prefixedName4 = null;


        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:101:4: ( IRI_REF | prefixedName )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IRI_REF) ) {
                alt10=1;
            }
            else if ( (LA10_0==PNAME_LN) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:101:6: IRI_REF
                    {
                    IRI_REF3=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef285); 
                     
                           String iri = (IRI_REF3!=null?IRI_REF3.getText():null);
                           value = iri.substring(1, iri.length()-1);
                         

                    }
                    break;
                case 2 :
                    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:106:6: prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iriRef300);
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
    // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:129:3: prefixedName : p= PNAME_LN ;
    public final TargetVocabularyDiscoveryParser.prefixedName_return prefixedName() throws RecognitionException {
        TargetVocabularyDiscoveryParser.prefixedName_return retval = new TargetVocabularyDiscoveryParser.prefixedName_return();
        retval.start = input.LT(1);

        Token p=null;

        try {
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:130:4: (p= PNAME_LN )
            // /home/andreas/code/mavenprojects/mapping/r2rApi/antlr-files/TargetVocabularyDiscovery.g:130:6: p= PNAME_LN
            {
            p=(Token)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName327); 

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


 

    public static final BitSet FOLLOW_prefixDefs_in_targetVocabulary60 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_vocabularyDefs_in_targetVocabulary65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vocabularyDef_in_vocabularyDefs97 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_vocabularyDef136 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_termWithDataset_in_vocabularyDef143 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_vocabularyDef152 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_termWithDataset_in_vocabularyDef156 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_vocabularyDef167 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_vocabularyDef170 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_iriRef_in_vocabularyDef174 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_vocabularyDef180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_termWithDataset210 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_termWithDataset218 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_iriRef_in_termWithDataset222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixDef_in_prefixDefs238 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_prefixDefs241 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_prefixDef_in_prefixDefs243 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_prefixDefs247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_prefixDef258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixDef262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IRI_REF_in_prefixDef264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName327 = new BitSet(new long[]{0x0000000000000002L});

}