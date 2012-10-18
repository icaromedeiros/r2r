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
package de.fuberlin.wiwiss.r2r;

import java.io.Serializable;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;

import de.fuberlin.wiwiss.r2r.parser.*;

public class SourcePattern implements Serializable {
	private Set<String> prefixDefinitions;
	private String queryBody;
	private Set<String> classes;
	private Set<String> properties;
	private int maxVarLength;
	private Set<String> variablesInPattern;
	
	public Set<String> getVariablesInPattern() {
		return variablesInPattern;
	}

	public Set<String> getClasses() {
		return classes;
	}

	public Set<String> getProperties() {
		return properties;
	}

	public int getMaxVarLength() {
		return maxVarLength;
	}

	private SourcePattern() {}

	public static SourcePattern parseSourcePattern(String sourcePattern, PrefixMapper prefixMapper) throws RecognitionException{
		CharStream stream =	new ANTLRStringStream(sourcePattern);
		SourcePatternLexer lexer = new SourcePatternLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SourcePatternParser parser = new SourcePatternParser(tokenStream);
		parser.setPrefixMapper(prefixMapper);
		SourcePattern sp = new SourcePattern();

		SourcePatternParser.sourcePattern_return returnValues = parser.sourcePattern();
		sp.prefixDefinitions = returnValues.usedPrefixes;
		sp.queryBody = sourcePattern;
		sp.classes = returnValues.classes;
		sp.properties = returnValues.properties;
		sp.maxVarLength = returnValues.maxVarLength;
		sp.variablesInPattern = returnValues.vars;

		return sp;
	}
	
	public static String rewriteSourcePattern(String sourcePattern, StringGenerator varGenerator) {
		CharStream stream =	new ANTLRStringStream(sourcePattern);
		SourcePatternRewriterLexer lexer = new SourcePatternRewriterLexer(stream);
		TokenStream tokenStream = new TokenRewriteStream(lexer);
		SourcePatternRewriterParser parser = new SourcePatternRewriterParser(tokenStream);
		parser.setVariableGenerator(varGenerator);
		try {
			SourcePatternRewriterParser.rewrittenSourcePattern_return result = parser.rewrittenSourcePattern();
			return result.rewrittenSourcePattern;
		} catch (RecognitionException e) {
			throw new ParseException(e.getMessage());
		}
	}

	public Set<String> getPrefixDefinitions() {
		return prefixDefinitions;
	}

	public String getQueryBody() {
		return queryBody;
	}
}
