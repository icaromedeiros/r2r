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
import java.util.List;

/**
 * Interface of functions that can be used in R2R transformation expressions.
 * @author andreas
 *
 */
public interface Function extends Serializable {
	/**
	 * Executes the function on a list of arguments, each represented by a list of Strings. 
	 * @param arguments
	 * @param datatypeHint
	 * @return The result list. If the function only returns one value, this will be a one element list.
	 * @throws IllegalArgumentException
	 */
	public List<String> execute(List<List<String>> arguments, String datatypeHint) throws IllegalArgumentException;
	
	/**
	 * get the URI of the function
	 * @return The URI of the function
	 */
	public String getURI();
}
