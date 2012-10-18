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
import java.util.ArrayList;
import java.util.Collections;

/*
 * This class stores the type and value of an element (subject, predicate or object) of a triple.
 */
public class TripleElement implements Serializable {
	private Type type;
	private List<String> values;
	
	public enum Type {
		IRI, VARIABLE, IRIVARIABLE, BOOLEAN, STRING, STRINGVARIABLE, LANGTAGSTRING, LANGTAGVARIABLE, DATATYPESTRING, DATATYPEVARIABLE, INTEGER, DOUBLE, DECIMAL, BLANKNODE
	}
	
	public TripleElement(Type type, String... values) {
		this.type = type;
		this.values = new ArrayList<String>();
		if(values!=null) {
			for(String value: values)
				this.values.add(value);
		}
		else
			this.values.add(null);
	}
	
	public Type getType() {
		return type;
	}

	public String getValue(int index) {
		return values.get(index);
	}
	
	public List<String> getValues() {
		return Collections.unmodifiableList(values);
	}
}
