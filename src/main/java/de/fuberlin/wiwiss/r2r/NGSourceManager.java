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

import java.util.ArrayList;
import java.util.List;

import com.hp.hpl.jena.vocabulary.DCTerms;
import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.*;

public class NGSourceManager implements SourceManager {
	private Source sourceRepository;
	private String voidGraph = "http://www4.wiwiss.fu-berlin.de/bizer/r2r/voidGraph";
	private String sparqlEndpoint;
	
	public NGSourceManager(String sparqlEndpoint) {
		sourceRepository =  new SparqlEndpointSource(sparqlEndpoint);
		this.sparqlEndpoint = sparqlEndpoint;
	}
	
	public NGSourceManager(String sparqlEndpoint, String voidGraph) {
		this(sparqlEndpoint);
		this.voidGraph = voidGraph;
	}

	public List<SourceDescription> getSourceDescriptions() {
		String query = "SELECT distinct ?g ?voidURI where { GRAPH ?g { ?s ?p ?o } " +
						"OPTIONAL { GRAPH <" + voidGraph + ">  { ?g <" + DCTerms.isPartOf.getURI() + "> ?voidURI }}";
		QueryExecution qe = sourceRepository.executeQuery(query);
		try {
			return parseSourceDescriptions(qe.execSelect());
		}
		finally {
			qe.close();
		}
	}
	
	private List<SourceDescription> parseSourceDescriptions(ResultSet rs) {
		List<SourceDescription> sourceDescriptions = new ArrayList<SourceDescription>();
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			String graph = qs.getResource("g").getURI();
			RDFNode voidURI = qs.get("voidURI");
			SourceDescription sd = null;
			if(voidURI==null)
				sd = new SourceDescription(null, sparqlEndpoint, graph);
			else
				sd = new SourceDescription(voidURI.toString(), sparqlEndpoint, graph);
			sourceDescriptions.add(sd);
		}
		return sourceDescriptions;
	}

	public Source getSourceObjectForSourceDescription(SourceDescription sd) {
		return new SparqlEndpointSource(sd.getSparqlEndpoint(), sd.getDefaultGraph());
	}

}
