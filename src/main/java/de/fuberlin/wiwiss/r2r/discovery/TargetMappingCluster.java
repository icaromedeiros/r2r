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

import java.util.HashSet;
import java.util.Set;

public class TargetMappingCluster {
	protected double currentBestScore = 0.0;
	protected String currentBestMapping = null;
	protected Set<String> dependendMappings;
	public Set<String> getDependendMappings() {
		return dependendMappings;
	}

	protected String datasetURI;
	protected String vocabElementURI;
	
	public TargetMappingCluster(String vocabElementURI, String datasetURI) {
		this.datasetURI = datasetURI;
		this.vocabElementURI = vocabElementURI;
		dependendMappings = new HashSet<String>();
	}
	
	@Override
	public int hashCode() {
		return vocabElementURI.hashCode() + (datasetURI==null ? 0 : datasetURI.hashCode());
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof TargetMappingCluster) {
			TargetMappingCluster mc = (TargetMappingCluster) object;
			if(!vocabElementURI.equals(mc.vocabElementURI))
				return false;
			else {
				if(datasetURI!=null && mc.datasetURI!=null)
					return datasetURI.equals(mc.datasetURI);
				else if(datasetURI==mc.datasetURI) // both null
					return true;
				else
					return false; // one null, one objects
			}
		}
		else
			return false;
	}
	
	public void addDependendMapping(String mapping) {
		dependendMappings.add(mapping);
	}
	
	@Override
	public String toString() {
		return vocabElementURI + datasetURI;
	}
	
	/**
	 * 
	 * @param mapping mapping URI
	 * @param mappingScore score between 0 and 1
	 * @return true if the mapping is the new best mapping for this cluster
	 */
	public boolean updateMapping(String mapping, double mappingScore) {
		if(mappingScore > currentBestScore) {
			currentBestScore = mappingScore;
			currentBestMapping = mapping;
			return true;
		}
		return false;
	}

	public double getCurrentBestScore() {
		return currentBestScore;
	}

	public String getCurrentBestMapping() {
		return currentBestMapping;
	}
}
