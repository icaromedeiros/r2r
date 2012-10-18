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

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileUtils;

public class BlankNodeTest {

	/** Mapping in repository, analog to LDImporter. */
	@Test
	public void testMapping1() {
		try {
			Model inModel = ModelFactory.createDefaultModel().read(
					new FileInputStream(
							"src/test/resources/ABA-to-Wiki-input.rdf"), null,
					FileUtils.langXML);
			Source in = new JenaModelSource(inModel);

			// read mapping
			Model mappingModel = ModelFactory.createDefaultModel();
			mappingModel.read(new FileInputStream(
					"src/test/resources/ABA-to-Wiki.r2r.ttl"), null,
					FileUtils.langTurtle);
			Repository mappingRepository = Repository.createJenaModelRepository(mappingModel);

			// execute mappings
			Map<String, Mapping> mappings = mappingRepository.getMappings();
			List<MappingsInfo> mappingsToExecute = new ArrayList<MappingsInfo>();
			for (Map.Entry<String, Mapping> e : mappings.entrySet()) {
				Collection<String> contextcl = new ArrayList<String>();
				contextcl.add(e.getKey());
				mappingsToExecute.add(new MappingsInfo(contextcl, contextcl));
			}
			Output out = new NTriplesOutput(
					"src/test/resources/ABA-to-Wiki-output_1.nt");
			Mapper.transform(in, out, mappingsToExecute, mappingRepository);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
	}

	/** Direct mapping in->out. */
	@Test
	public void testMapping2() {
		try {
			Source in = new FileOrURISource(
					"src/test/resources/ABA-to-Wiki-input.rdf");
			Output out = new NTriplesOutput(
					"src/test/resources/ABA-to-Wiki-output_2.nt");
			Repository mappingRepository = Repository.createFileOrUriRepository("src/test/resources/ABA-to-Wiki.r2r.ttl");
			Mapping mapping = mappingRepository.getMappingOfUri("http://www.example.org/smw-lde/smwTransformations/GeneExpression");
			mapping.executeMapping(in, out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}

	}

}
