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

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;
import de.fuberlin.wiwiss.r2r.functions.HelperFunctions.DataType;

public class CompareFunctionFactory implements FunctionFactory {
	private CompareFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new CompareFunction();
		
		return function;
	}

	private static class CompareFunction implements Function {

		public String getURI() {
			return "compare";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			if(arguments.size()<3)
				throw new IllegalArgumentException("compare: Not enough arguments supplied!");
			
			String compareOp = arguments.get(0).get(0);
			List<String> leftArg = arguments.get(1);
			List<String> rightArg = arguments.get(2);
			List<String> result = new ArrayList<String>();
			
			DataType leftArgType = HelperFunctions.getDataTypeInformationOfArgument(leftArg);
			DataType rightArgType = HelperFunctions.getDataTypeInformationOfArgument(rightArg);

			DataType workingType = HelperFunctions.pickMoreGeneralDataType(leftArgType, rightArgType);
			
			int compareResult;
			
			if(workingType==DataType.String)
				compareResult = leftArg.get(0).compareTo(rightArg.get(0));
			else if(workingType==DataType.Integer) {
				Integer left = Integer.parseInt(leftArg.get(0));
				Integer right = Integer.parseInt(rightArg.get(0));
				compareResult = left.compareTo(right);
			} else {
				Double left = Double.parseDouble(leftArg.get(0));
				Double right = Double.parseDouble(rightArg.get(0));
				compareResult = left.compareTo(right);
			}

			Boolean booleanResult = false;
			
			if(compareResult < 0) {
				if(compareOp.equals("<") || compareOp.equals("<=") || compareOp.equals("!="))
					booleanResult = true;
			} else if(compareResult == 0) { 
				if(compareOp.equals("=") || compareOp.equals("<=") || compareOp.equals(">="))
					booleanResult = true;
			} else
				if(compareOp.equals(">") || compareOp.equals(">=") || compareOp.equals("!="))
					booleanResult = true;

			result.add(booleanResult.toString());
			
			return result;
		}
	}
}
