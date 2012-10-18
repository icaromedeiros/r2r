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

import java.math.BigInteger;

public class EnumeratingURIGenerator implements StringGenerator {
	private BigInteger nr;
	private String baseuri;
	
	public BigInteger getNr() {
		return nr;
	}

	public String getBaseuri() {
		return baseuri;
	}

	/**
	 * 
	 * @param uri a String/URI which is used as the prefix
	 * @param start the integer to start with. This will be increased by one every time nextURI() is called.
	 */
	public EnumeratingURIGenerator(String uri, BigInteger start) {
		this.baseuri = uri;
		this.nr = start;
	}
	
	/**
	 * Generate URIs by using uri as prefix and appending numbers starting with 1
	 * @param uri a String/URI which is used as the prefix
	 */
	public EnumeratingURIGenerator(String uri) {
		this.baseuri = uri;
		this.nr = BigInteger.ONE;
	}
	
	/**
	 * return the next generated URI
	 */
	public String nextString() {
		BigInteger old = null;
		synchronized(this) {
			old = nr;
			nr = old.add(BigInteger.ONE);
		}
		
		return baseuri + old.toString();
	}

}
