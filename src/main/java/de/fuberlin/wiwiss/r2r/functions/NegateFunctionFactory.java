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

import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;
import java.math.BigDecimal;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;
import de.fuberlin.wiwiss.r2r.functions.HelperFunctions.DataType;

public class NegateFunctionFactory implements FunctionFactory {
private NegateFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new NegateFunction();
		
		return function;
	}

	private class NegateFunction implements Function {

		public String getURI() {
			return "negate";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			if(arguments.size()<1)
				throw new IllegalArgumentException("Not enough arguments!");
			
			List<String> argument = arguments.get(0);
			
			if(argument.size()<1)
				throw new IllegalArgumentException("Not enough arguments!");
			
			DataType type = HelperFunctions.getDataTypeInformationOfArgument(argument);
			
			if(type==DataType.String)
				throw new IllegalArgumentException("Non-numerical argument for negate-function!");
			if(type==DataType.Integer) {
				BigInteger intResult = new BigInteger(argument.get(0)).negate();
				result.add(intResult.toString());
			} else if(type==DataType.Int) {
				Integer intResult = -Integer.parseInt(argument.get(0));
				result.add(intResult.toString());
			} else if(type==DataType.Long) {
				Long longResult = -Long.parseLong(argument.get(0));
				result.add(longResult.toString());
			} else if(type==DataType.Decimal) {
				BigDecimal decimalResult = new BigDecimal(argument.get(0)).negate();
				result.add(decimalResult.toString());
			} else if(type==DataType.Double) {
				Double doubleResult = -Double.parseDouble(argument.get(0));
				result.add(doubleResult.toString());
			}

			return result;
		}
	}
}
