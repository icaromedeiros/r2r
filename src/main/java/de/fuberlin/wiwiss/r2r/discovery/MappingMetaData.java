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
package de.fuberlin.wiwiss.r2r.discovery;

import java.util.Set;
import java.util.Map;

/**
 * A class holding mapping meta data
 * @author andreas
 *
 */
public class MappingMetaData {
	Map<String, Set<String>> metaData;
	
	public MappingMetaData(Map<String, Set<String>> data) {
		this.metaData = data;
	}
	
	/**
	 * get the lexical values of the specified property
	 * @param property the property URI
	 * @return lexical property values
	 */
	public Set<String> getValuesForProperty(String property) {
		return metaData.get(property);
	}
}
