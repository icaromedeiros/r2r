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

/**
 * An Interface for the function manager component. A FunctionManager handles the built-in and externally loaded functions. 
 * @author andreas
 *
 */
public interface FunctionManager {
	/**
	 * This method returns a function object of a external function by URI. 
	 */
	public Function getFunctionByUri(String URI);
	
	/**
	 * Checks if a certain function identified by its URI has been registered.
	 */
	public boolean containsFunctionByUri(String URI);
	
	/**
	 * Registers a function factory
	 */
	public boolean registerFunctionFactory(String URI, FunctionFactory functionFactory);
}
