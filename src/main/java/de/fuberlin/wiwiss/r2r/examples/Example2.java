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

import de.fuberlin.wiwiss.r2r.FileOrURISource;
import de.fuberlin.wiwiss.r2r.Mapper;
import de.fuberlin.wiwiss.r2r.NTriplesOutput;
import de.fuberlin.wiwiss.r2r.Output;
import de.fuberlin.wiwiss.r2r.Repository;
import de.fuberlin.wiwiss.r2r.Source;

public class Example2 {
	public static void main(String[] args) throws Exception {
		// Configure the source, use local file
		Source in = new FileOrURISource("example_data/example2_data.ttl");
		
		// Output to local file in RDF/XML format
//		Output out = new RDFXMLOutput("example2_output.xml");
		Output out = new NTriplesOutput("example2_output.nt");

		// Create an in-memory repository from a local file
		Repository mappingRepository = Repository.createFileOrUriRepository("example_data/mappings.ttl");
		
		// Specify target dataset. Just generate any statement containing on of the properties
		String vocabulary = "@prefix dbpedia: <http://dbpedia.org/ontology/> ." +
		"(" +
			"dbpedia:meltingPoint" +
		")";
		
		// Transform: The output data is written to LabelToName_Output.nt
		Mapper.transform(in, out, mappingRepository, vocabulary);
		
		// Close the Output object to write the data to file
		out.close();
		System.out.println("Finished.");
	}
}
