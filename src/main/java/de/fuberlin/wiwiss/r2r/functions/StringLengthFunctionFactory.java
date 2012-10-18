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

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: andreas
 * Date: 07.06.11
 * Time: 18:11
 * To change this template use File | Settings | File Templates.
 */
public class StringLengthFunctionFactory implements FunctionFactory {
    private Function function = null;

		public Function getInstance() {
			if(function==null)
				function = new LengthFunction();

			return function;
		}

		private static class LengthFunction implements Function {

			public String getURI() {
				return "strlen";
			}

			public List<String> execute(List<List<String>> arguments, String hint) {
				if(arguments.size()<1 || arguments.get(0).size()<1)
					throw new IllegalArgumentException("strlen(): No argument supplied!");

				String arg = arguments.get(0).get(0);
				List<String> result = new ArrayList<String>();
				result.add("" + arg.length());

				return result;
			}
		}

}
