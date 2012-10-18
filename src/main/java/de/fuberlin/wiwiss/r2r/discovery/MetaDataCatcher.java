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

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import de.fuberlin.wiwiss.r2r.*;

public class MetaDataCatcher {
	ConcurrentMap<String, MappingMetaData> metaData;
	MetadataRepository repository;
	
	public MetaDataCatcher(MetadataRepository repository) {
		this.repository = repository;
		metaData = new ConcurrentHashMap<String, MappingMetaData>();
	}
	
	public MappingMetaData getMetaDataForMapping(String mappingURI) {
		if(!metaData.containsKey(mappingURI))
			metaData.putIfAbsent(mappingURI, new MappingMetaData(repository.getMappingMetaData(mappingURI)));
		return metaData.get(mappingURI);
	}
}
