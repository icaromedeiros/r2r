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

public class SourceDescription {
	private String sourceDataset;
	private String sparqlEndpoint;
	private String defaultGraph;
	
	public SourceDescription(String sourceDataset, String sparqlEndpoint,
			String defaultGraph) {
		super();
		this.sourceDataset = sourceDataset;
		this.sparqlEndpoint = sparqlEndpoint;
		this.defaultGraph = defaultGraph;
	}

	public String getSourceDataset() {
		return sourceDataset;
	}

	public String getSparqlEndpoint() {
		return sparqlEndpoint;
	}

	public String getDefaultGraph() {
		return defaultGraph;
	}
}
