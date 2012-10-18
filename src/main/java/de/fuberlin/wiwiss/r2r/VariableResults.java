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

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Model;

/*
 * Stores variable results taken from the query and also the ones calculated by the transformations.
 */
public class VariableResults {
	private Map<String, List<String>> variableValues;
	private QuerySolution querySolution;
	private Map<String, Resource> blankNodes = null;
	
	VariableResults(QuerySolution qs) {
		variableValues = new HashMap<String, List<String>>();
		this.querySolution = qs;
	}
	
	public boolean addVariableResult(String varName, List<String> results) {
		if(variableValues.get(varName)==null) {
			variableValues.put(varName, results);
			return true;
		}
		return false;
	}
	
	public RDFNode getRDFNode(String variable) {
		return querySolution.get(variable);
	}
	
	public List<String> getResults(String varName) {
		return variableValues.get(varName);
	}
	
	public Resource getBlankNodeResource(String identifier, Model model) {
		if(blankNodes==null)
			blankNodes = new HashMap<String, Resource>();
		
		// If no identifier is given, always create a new blank node
		if(identifier==null)
			return model.createResource();
		
		// For equivalent identifiers return equivalent blank nodes
		if(blankNodes.containsKey(identifier))
			return blankNodes.get(identifier);
		else {
			Resource blankNode = model.createResource();
			blankNodes.put(identifier, blankNode);
			return blankNode;
		}
	}
}
