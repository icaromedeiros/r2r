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

import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public interface MetadataRepository {
	/**
	 * Get all the mapping URIs (packaged in MappingsInfo objects) from the meta data repository that generate one or more of the given entities
	 * @param entityUris
	 * @return
	 */
	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(List<String> entityUris);
	
	/**
	 * Get all the mapping URIs from the meta data repository that generate one or more of the given entities.
	 * All the mappings are being restricted by the first argument.
	 * @param contextEntityUri the class restriction. Only instances that qualify are mapped.
	 * @param propertyUris the target properties of the mapped instances.
	 * @param addClassRestrictionMappings is true if mappings of the class restriction should be added. Else these mappings only act as restrictions not as triple generating mappings.
	 * @return MappingsInfo objects that contain information about which mappings and how they should be executed.
	 */
	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(String contextEntityUri, Collection<String> propertyUris, boolean addClassRestrictionMappings);
	
	/**
	 * Gets the mapping URIs for all mappings that map to the specified target element (mapping r2r:mapsTo targetElement)
	 * @param elementURI 
	 * @return
	 */
	public Set<String> getMappingsOfTargetElement(String elementURI);
	
	public Map<String, Set<String>> getMappingMetaData(String mappingURI) ;
}
