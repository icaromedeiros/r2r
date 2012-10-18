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

import de.fuberlin.wiwiss.r2r.functions.*;
import de.fuberlin.wiwiss.r2r.functions.xpath.XPathFunctionFactory;

import java.net.MalformedURLException;
import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * An implementation of FunctionManager that has all built-in functions
 * registered.
 * 
 * @author andreas
 * 
 */
public class BasicFunctionManager implements FunctionManager {
	private static Log log = LogFactory.getLog(BasicFunctionManager.class);
	private Map<String, FunctionFactory> functions = new HashMap<String, FunctionFactory>();
	private FunctionFactoryLoader ffLoader = null;

	/**
	 * Only register built-in functions, not able to load external functions
	 */
	public BasicFunctionManager() {
		functions.put("join", new JoinFunctionFactory());
		functions.put("concat", new ConcatFunctionFactory());
		functions.put("split", new SplitFunctionFactory());
		functions.put("listJoin", new ListJoinFunctionFactory());
		functions.put("list", new ListFunctionFactory());
		functions.put("subListByIndex", new SubListByIndexFunctionFactory());
		functions.put("regexToList", new RegExToListFunctionFactory());
		functions.put("identityFunction", new IdentityFunctionFactory());
		functions.put("add", new AddFunctionFactory());
		functions.put("subtract", new SubtractFunctionFactory());
		functions.put("divide", new DivideFunctionFactory());
		functions.put("multiply", new MultiplyFunctionFactory());
		functions.put("negate", new NegateFunctionFactory());
		functions.put("listConcat", new ListConcatFunctionFactory());
		functions.put("subList", new SubListFunctionFactory());
		functions.put("getByIndex", new GetByIndexFunctionFactory());
		functions.put("mod", new ModuloFunctionFactory());
		functions.put("integer", new IntegerFunctionFactory());
		functions.put("length", new LengthFunctionFactory());
		functions.put("replaceAll", new ReplaceAllFunctionFactory());
		functions.put("booleanPick", new BooleanPickFunctionFactory());
		functions.put("compare", new CompareFunctionFactory());
		functions.put("itRegexToList", new IterateRegexToListFunctionFactory());
        functions.put("strlen", new StringLengthFunctionFactory());
        functions.put("md5sum", new Md5sumFunctionFactory());
        functions.put("sha1sum", new Sha1sumFunctionFactory());
		
		// Xpath functions
		XPathFunctionFactory xpFunctionFactory = new XPathFunctionFactory();
		for(Function function : xpFunctionFactory.listFunctions()) {
			functions.put(function.getURI(), xpFunctionFactory);
		}

		// deprecated
		functions.put("infixConcat", new JoinFunctionFactory());
		functions.put("infixListConcat", new ListJoinFunctionFactory());
	}

	public synchronized boolean containsFunctionByUri(String URI) {
		return functions.containsKey(URI);
	}

	public synchronized Function getFunctionByName(String name) {
		// not used
		return null;
	}

	public synchronized Function getFunctionByUri(String URI) {
		if (!functions.containsKey(URI))
			return null;
		FunctionFactory factory = functions.get(URI);
		if (factory instanceof MultiFunctionFactory) {
			return ((MultiFunctionFactory) factory).getInstance(URI);
		}
		return functions.get(URI).getInstance();
	}

	public boolean registerFunctionFactory(String uri,
			FunctionFactory functionFactory) {
		// Cannot register new functions in this FunctionManager
		return false;
	}

}
