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

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

/*
 * FunctionMapping objects handle information concerning function name to function URI mapping.
 */
public class FunctionMapper implements Serializable{
	Map<String, String> mappings = new HashMap<String, String>();
	
	public void setMapping(String functionName, String functionURI) {
		mappings.put(functionName, functionURI);
	}
	
	public String getFunctionUri(String functionName) {
		if(mappings.get(functionName)==null)
			return functionName;
		else
			return mappings.get(functionName);
	}
}
