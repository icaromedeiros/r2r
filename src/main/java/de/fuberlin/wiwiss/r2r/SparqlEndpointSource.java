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

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.rdf.model.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the Source interface, wrapping a SPARQL endpoint.
 * @author andreas
 *
 */
public class SparqlEndpointSource implements Source {

	private String sparqlEndpointURI;
	private List<String> defaultGraphs = null;
	private List<String> namedGraphs = null;
	
	/**
	 * 
	 * @param endpointURI The URL of the SPARQL endpoint
	 * @param defaultGraph default graph
	 * @param namedGraphURIs a list of named graphs
	 */
	public SparqlEndpointSource(String endpointURI, String defaultGraph, List<String> namedGraphURIs) {
		this.sparqlEndpointURI = endpointURI;
		defaultGraphs = new ArrayList<String>();
		defaultGraphs.add(defaultGraph);
		namedGraphs = namedGraphURIs;
	}
	
	/**
	 * 
	 * @param endpointURI URL of the SPARQL endpoint
	 */
	public SparqlEndpointSource(String endpointURI) {
		this.sparqlEndpointURI = endpointURI;
	}
	
	/**
	 * 
	 * @param endpointURI URL of the SPARQL endpoint
	 * @param defaultGraph the default graph
	 */
	public SparqlEndpointSource(String endpointURI, String defaultGraph) {
		this.sparqlEndpointURI = endpointURI;
		defaultGraphs = new ArrayList<String>();
		defaultGraphs.add(defaultGraph);
	}
	
	public QueryExecution executeQuery(String query) {
		return QueryExecutionFactory.sparqlService(sparqlEndpointURI, query, defaultGraphs, namedGraphs);
	}

	public Model executeDescribeQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.sparqlService(sparqlEndpointURI, query, defaultGraphs, namedGraphs);
		Model model = qe.execDescribe();
		qe.close();
		return model;
	}

	public Model executeConstructQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.sparqlService(sparqlEndpointURI, query, defaultGraphs, namedGraphs);
		Model model = qe.execConstruct();
		qe.close();
		return model;
	}
}
