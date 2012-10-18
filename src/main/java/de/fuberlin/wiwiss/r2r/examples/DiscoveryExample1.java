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
import de.fuberlin.wiwiss.r2r.discovery.*;
import java.util.*;

public class DiscoveryExample1 {
	public static void main(String[] args) throws Exception {
		// Setting up input, output and mapping repository
		Source in = new FileOrURISource("example_data/discoveryExample1_input.n3");
		Output out = new NTriplesOutput("discoveryExample1_output.nt");
		Repository repository = new Repository(new FileOrURISource("example_data/DBpediaToX.ttl"));
		
		/* Generate mapping meta data repository, because no meta data is included in the repository
		 * This will generate r2r:dependsOn and r2r:mapsTo properties
		 */
		MetadataRepository metaRepository = repository.getMetaDataRepository();

		// The DatasetChecker provides vocabulary term information for the source dataset
		DatasetChecker datasetCheck = new SourceDatasetChecker(in);
		MappingDiscovery discovery = new MappingDiscovery(datasetCheck, metaRepository);
		
		// The target vocabulary definition
		String vocabDef = "@prefix dbpedia: <http://dbpedia.org/ontology/> .\n" +
                          "@prefix linkedmdb: <http://data.linkedmdb.org/resource/movie/> .\n" +
                          "(dbpedia:runtime, dbpedia:Film, dbpedia:director)"; 
			
		/* Start the discovery process for the given vocabulary definition
		 * The arguments are:
		 * 1. The vocabulary definition
		 * 2. The URI of the voiD description of the source dataset, in this case of LinkedMDB.
		 * 3. The search depth in the search graph. In our example 2 would actually be enough.
		 */
		Collection<MappingChain> chains = discovery.getMappingChains(vocabDef, "http://mappings.dbpedia.org/r2r/linkedmdbVOID", 3);
		
		// Execute Mapping Chains and print out information
		for(MappingChain mc: chains) {
			System.out.println("\nExecuting: " + mc + "\n_________________________\n");
			mc.execute(in, out, repository);
		}

		// Close the Output object (so everything is written to file)
		out.close();
	}
}
