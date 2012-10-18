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

public class ReplaceAllFunctionFactory implements FunctionFactory {
ReplaceAllFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new ReplaceAllFunction();
		
		return function;
	}
	
	private static class ReplaceAllFunction implements Function {
		
		public String getURI() {
			return "replaceAll";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			if(arguments.size()<3 || arguments.get(0).size()<1 || arguments.get(1).size()<1 || arguments.get(2).size()<1)
				throw new IllegalArgumentException("replaceAll: Not enough arguments supplied!");
			// Arguments
			String replaceThis = arguments.get(0).get(0);
			String byThat = arguments.get(1).get(0);
			String inThisString = arguments.get(2).get(0);

			String outputString = inThisString.replaceAll(replaceThis, byThat);

			ArrayList<String> r = new ArrayList<String>();
			r.add(outputString);
			return r;
		}	
	}
}
