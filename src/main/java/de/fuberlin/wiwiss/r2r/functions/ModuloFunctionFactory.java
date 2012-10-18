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

public class ModuloFunctionFactory implements FunctionFactory {
private ModuloFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new ModuloFunction();
		
		return function;
	}

	private class ModuloFunction implements Function {

		public String getURI() {
			return "mod";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			if(arguments.size()!=2)
				throw new IllegalArgumentException("Modulo: Illegal number of arguments supplied!");
			
			String arg1 = arguments.get(0).get(0);
			String arg2 = arguments.get(1).get(0);
			List<String> result = new ArrayList<String>();
			DataType type = HelperFunctions.getDataTypeInformationOfAllArguments(arguments);
			type = HelperFunctions.takeMostAppropriateDataTypeForAddLikeCalculations(type, hint);
			
			if(type==DataType.String)
				throw new IllegalArgumentException("Non-numerical argument for modulo-function");
			if(type==DataType.Int) {
				Integer intResult = Integer.parseInt(arg1) % Integer.parseInt(arg2);
				result.add(intResult.toString());
			} else if(type==DataType.Long) {
				Long longResult = Long.parseLong(arg1) % Long.parseLong(arg2);
				result.add(longResult.toString());
			} else if(type==DataType.Integer) {
				BigInteger bigIntResult = (new BigInteger(arg1)).mod(new BigInteger(arg2));
				result.add(bigIntResult.toString());
			} else if(type==DataType.Decimal) {
				BigDecimal decimalResult = (new BigDecimal(arg1)).remainder(new BigDecimal(arg2));
				result.add(decimalResult.toString());
			} else if(type==DataType.Double) {
				Double doubleResult = Double.parseDouble(arg1) % Double.parseDouble(arg2);
				result.add(doubleResult.toString());
			}

			return result;
		}
	}
}
