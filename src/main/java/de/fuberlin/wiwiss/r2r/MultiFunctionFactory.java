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

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * A factory which is able to create multiple functions.
 * 
 * @author maggi
 * 
 */
public abstract class MultiFunctionFactory implements FunctionFactory {

	protected Map<String, Function> functions;

	public Function getInstance() {
		return null;
	}

	public MultiFunctionFactory() {
		this.functions = new HashMap<String, Function>();
	}

	/**
	 * Returns a function instance by name.
	 * 
	 * @param name
	 * @return the function of <code>null</code> if there is no function for
	 *         this name.
	 */
	public Function getInstance(String name) {
		return functions.get(name);
	}

	/**
	 * Lists all functions this factory provides.
	 */
	public Collection<Function> listFunctions() {
		return Collections.unmodifiableCollection(functions.values());
	}
}
