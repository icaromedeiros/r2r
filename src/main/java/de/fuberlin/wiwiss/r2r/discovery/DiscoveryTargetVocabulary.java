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
package de.fuberlin.wiwiss.r2r.discovery;

import java.util.Map;
import java.util.Collection;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;



import de.fuberlin.wiwiss.r2r.parser.*;

public class DiscoveryTargetVocabulary {
	// "Map<term, dataset>"
	private final Map<String, String> terms;
	
	public DiscoveryTargetVocabulary(Map<String, String> vocabularyTerms, String dataset) {
		this.terms = vocabularyTerms;
		if(dataset!=null)
			setDataset(dataset);
	}
	
	private void setDataset(String dataset) {
		for(Map.Entry<String, String> termDataset: terms.entrySet()) {
			if(termDataset.getValue()==null)
				termDataset.setValue(dataset);
		}
	}

	public Map<String, String> getTermDatasetPairs() {
		return terms;
	}
	
	public static Collection<DiscoveryTargetVocabulary> parse(String vocabDefinition) {
		CharStream stream =	new ANTLRStringStream(vocabDefinition);
		TargetVocabularyDiscoveryLexer lexer = new TargetVocabularyDiscoveryLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		TargetVocabularyDiscoveryParser parser = new TargetVocabularyDiscoveryParser(tokenStream);
		Collection<DiscoveryTargetVocabulary> tvs = null;
		try {
			tvs = parser.targetVocabulary();
		} catch (RecognitionException e) {
			System.err.println(e.getMessage());
			return null;
		}
		return tvs;
	}
	
}
