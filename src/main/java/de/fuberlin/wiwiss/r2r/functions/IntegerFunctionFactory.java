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
package de.fuberlin.wiwiss.r2r.functions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;
import de.fuberlin.wiwiss.r2r.functions.HelperFunctions.DataType;

public class IntegerFunctionFactory implements FunctionFactory {
private IntegerFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new IntegerFunction();
		
		return function;
	}

	private static class IntegerFunction implements Function {

		public String getURI() {
			return "integer";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			if(arguments.size()<1)
				throw new IllegalArgumentException("integer(): No arguments supplied!");
			
			List<String> arg = arguments.get(0);
			List<String> result = new ArrayList<String>();
			DataType type = HelperFunctions.getDataTypeInformationOfArgument(arg);
			
			if(type==DataType.String)
				throw new IllegalArgumentException("Non-numerical argument for integer-function");
			else {
				BigInteger integerResult = new BigDecimal(arg.get(0)).toBigInteger();
				result.add(integerResult.toString());
			}
			
			return result;
		}
	}
}
