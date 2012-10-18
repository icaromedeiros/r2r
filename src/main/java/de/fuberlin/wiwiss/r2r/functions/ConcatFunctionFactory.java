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

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class ConcatFunctionFactory implements FunctionFactory {
	ConcatFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new ConcatFunction();
		
		return function;
	}
	
	private static class ConcatFunction implements Function {
		
		public String getURI() {
			return "concat";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			StringBuilder concatString = new StringBuilder();
			for(List<String> list: arguments) {
				concatString.append(list.get(0));
			}
			ArrayList<String> r = new ArrayList<String>();
			r.add(concatString.toString());
			return r;
		}	
	}
}
