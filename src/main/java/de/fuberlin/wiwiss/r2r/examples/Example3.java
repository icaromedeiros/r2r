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
package de.fuberlin.wiwiss.r2r.examples;

import de.fuberlin.wiwiss.r2r.*;
import java.io.IOException;

public class Example3 {
	public static void main(String[] argv) throws IOException {
		// Configure the source, use DBpedia's SPARQL endpoint
		Source in = new SparqlEndpointSource("http://dbpedia.org/sparql");
		
		// Output to local file
		Output out = new NTriplesOutput("example3_output.nt");
		
		// Create an in-memory repository from a local file
		Repository mappingRepository = Repository.createFileOrUriRepository("example_data/mappings.ttl");
		
		// Specify target dataset. The '+' behind foaf:Person means to generate rdf:type statements
		String vocabulary = "@prefix foaf: <http://xmlns.com/foaf/0.1/>" +
		"foaf:Person+(" +
			"foaf:name," +
			"<http://nodomain/ontology/weight>" +
		")";
		
		// Transform: The output data is written to LabelToName_Output.nt
		Mapper.transform(in, out, mappingRepository, vocabulary);
		
		// Close the Output object to flush and close stream/printer
		out.close();
		System.out.println("Finished.");
	}
}
