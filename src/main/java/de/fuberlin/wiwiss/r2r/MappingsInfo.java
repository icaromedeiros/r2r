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
import java.util.Map;

/*
 * This Class contains information about how mappings should be executed
 */
public class MappingsInfo {
	public final Collection<String> classRestrictionMappings;
	public final Collection<String> allMappings;
	public final Map<String, Collection<String>> restrictions;  
	
	public MappingsInfo(Collection<String> contextMappings, Collection<String> allMappings) {
		super();
		this.classRestrictionMappings = contextMappings;
		this.allMappings = allMappings;
		restrictions = null; 
	}
	
	public MappingsInfo(Collection<String> contextMappings, Collection<String> allMappings, Map<String, Collection<String>> restrictions) {
		super();
		this.classRestrictionMappings = contextMappings;
		this.allMappings = allMappings;
		this.restrictions = restrictions;
	}
	
	/*
	 * checks if a mapping is restricted to execute target patterns with a certain property
	 */
	public boolean isRestricted(String mappingUri) {
		if(restrictions==null)
			return false;
		return restrictions.get(mappingUri)!=null;
	}
	
	/*
	 * returns the restriction (URI String) of the specified mapping or null if not restricted
	 */
	public Collection<String> getRestrictions(String mappingUri) {
		if(restrictions==null)
			return null;
		return restrictions.get(mappingUri);
	}
}
