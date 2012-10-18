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

/*
* A Triple of a TargetPattern
*/
public class Triple implements Serializable {
	private TripleElement subject;
	private TripleElement verb;
	private TripleElement object;
	private String propertyURI;
	private String classURI;
	
	public Triple(TripleElement subject, TripleElement verb,
			TripleElement object, String propertyURI, String classURI) {
		super();
		this.subject = subject;
		this.verb = verb;
		this.object = object;
		this.propertyURI = propertyURI;
		this.classURI = classURI;
	}

	public String getPropertyURI() {
		return propertyURI;
	}

	public String getClassURI() {
		return this.classURI;
	}

	public TripleElement getSubject() {
		return subject;
	}

	public TripleElement getVerb() {
		return verb;
	}

	public TripleElement getObject() {
		return object;
	}
	
	
}
