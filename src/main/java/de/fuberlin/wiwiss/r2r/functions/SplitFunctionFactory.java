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

public class SplitFunctionFactory implements FunctionFactory {
private SplitFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new SplitFunction();
		
		return function;
	}

	private class SplitFunction implements Function {

		public String getURI() {
			return "split";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> resultList = new ArrayList<String>();
			String splitRegEx = arguments.get(0).get(0);
			String stringToSplit = arguments.get(1).get(0);
			String[] splits = stringToSplit.split(splitRegEx);
			for(String split: splits) {
				resultList.add(split);
			}
			return resultList;
		}	
	}
}
