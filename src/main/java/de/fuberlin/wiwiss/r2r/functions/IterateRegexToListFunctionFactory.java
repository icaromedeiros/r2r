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
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class IterateRegexToListFunctionFactory implements FunctionFactory {
private IterateRegexToListFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new IterateRegexToListFunction();
		
		return function;
	}

	private static class IterateRegexToListFunction implements Function {

		public String getURI() {
			return "IterateRegexToList";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			if(arguments.size()!=2)
				throw new IllegalArgumentException("itRegexToList(): Not enough arguments supplied!");
			
			String regex = arguments.get(0).get(0);
			String workString = arguments.get(1).get(0);
			List<String> result = new ArrayList<String>();
			
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(workString);
			
			int groupCount = matcher.groupCount();
			
			while(matcher.find()) {
				for(int i=1; i<=groupCount; i++) {
					result.add(matcher.group(i));
				}
			}

			return result;
		}
	}
}
