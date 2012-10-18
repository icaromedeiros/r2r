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

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import de.fuberlin.wiwiss.r2r.R2R;

public class VocabularyNode {
	private String targetElement;
	private int depth;
	private boolean satisfiable = false;

	private int minDistanceToSourceDataset = Integer.MAX_VALUE;
	
	// which vocabulary nodes could use the results of this one
	private List<VocabularyNode> consuments;
	
	// meta data of mappings that map to the target element
	private Map<String, MappingMetaData> mappings;
	
	// For satisfiability checks
	private Map<String, MappingMetaData> satisfiableMappings;

	private Set<String> satisfiableDependencies;
	
	VocabularyNode(String targetElement, Map<String, MappingMetaData> mappings) {
		this.targetElement = targetElement;
		consuments = new ArrayList<VocabularyNode>();
		this.mappings = mappings;
		satisfiableMappings = new HashMap<String, MappingMetaData>();
		satisfiableDependencies = new HashSet<String>();
	}
	
	/**
	 * adds a satisfiable vocabulary dependency to this node AND then checks if this node is satisfiable
	 * @param dependency the added vocabulary dependency
	 * @return returns true if this node became satisfiable
	 */
	public boolean addSatisfiableDependency(String dependency) {
		satisfiableDependencies.add(dependency);
		if(hasSatisfiableMappings())
			satisfiable = true;
		
		return satisfiable;
	}
	
	private boolean hasSatisfiableMappings() {
		Iterator<Map.Entry<String, MappingMetaData>> iterator = mappings.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, MappingMetaData> mapping = iterator.next();
			if(checkIfDependenciesAreSatisfiable(mapping.getValue().getValuesForProperty(R2R.dependsOn)))
				return true;
		}
		return false;
	}
	
	private int filterSatisfiableMappings() {
		int count = 0;

		Iterator<Map.Entry<String, MappingMetaData>> iterator = mappings.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, MappingMetaData> mapping = iterator.next();
			if(checkIfDependenciesAreSatisfiable(mapping.getValue().getValuesForProperty(R2R.dependsOn))) {
				satisfiableMappings.put(mapping.getKey(), mapping.getValue());
				iterator.remove();
				count++;
			}
		}

		return count;
	}
	
	private boolean checkIfDependenciesAreSatisfiable(Set<String> dependencies) {
		for(String dependency: dependencies) {
			if(!satisfiableDependencies.contains(dependency))
				return false;
		}
		return true;
	}
	
	public void removeUnsatisfiableMappings() {
		// all satisfiable mappings should be in satisfiableMappings at this point
		if(mappings!=null) {
			filterSatisfiableMappings();
			mappings.clear();
		}
		mappings = satisfiableMappings;
	}
	
	/**
	 * returns a list of nodes that use the results of this node
	 * @return
	 */
	public List<VocabularyNode> getConsuments() {
		return consuments;
	}

	public Map<String, MappingMetaData> getMappings() {
		return mappings;
	}

	public boolean isSatisfiable() {
		return satisfiable;
	}

	public void setSatisfiable(boolean satisfiable) {
		this.satisfiable = satisfiable;
	}
	
	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getTargetElement() {
		return targetElement;
	}

	public void setMinDistanceToSourceDataset(int minDistanceToSourceDataset) {
		this.minDistanceToSourceDataset = minDistanceToSourceDataset;
	}

	public int getMinDistanceToSourceDataset() {
		return minDistanceToSourceDataset;
	}
	
	public void addConsument(VocabularyNode node) {
		consuments.add(node);
	}
}
