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
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import de.fuberlin.wiwiss.r2r.parser.*;

public class FunctionExecution implements Argument, Serializable {
	private List<Argument> arguments;
	private Function function;
	private String variableName = null;
	private Set<String> variableDependencies = null;
	
	public String getVariableName() {
		return variableName;
	}

	public FunctionExecution(Function function, List<Argument> arguments) {
		this.arguments = arguments;
		this.function = function;
	}

	public List<Argument> getArguments() {
		return arguments;
	}

	public Function getFunction() {
		return function;
	}
	
	public static FunctionExecution parseTransformation(String transformation, FunctionManager functionManager, FunctionMapper functionMapper) throws RecognitionException{
		CharStream stream =	new ANTLRStringStream(transformation);
		TransformationLexer lexer = new TransformationLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		TransformationParser parser = new TransformationParser(tokenStream);
		parser.setFunctionManager(functionManager);
		parser.setFunctionMapping(functionMapper);
		FunctionExecution fe = null;
	
		TransformationParser.transform_return tr = parser.transform();
		fe = tr.funcExec;
		fe.variableName = tr.variable;
		fe.variableDependencies = Collections.unmodifiableSet(tr.variableDependencies);

		return fe;
	}

	public Set<String> getVariableDependencies() {
		return variableDependencies;
	}
}
