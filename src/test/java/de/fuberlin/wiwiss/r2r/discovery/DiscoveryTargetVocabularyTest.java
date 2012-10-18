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

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Map;
import java.util.Iterator;

import static org.junit.Assert.*;

public class DiscoveryTargetVocabularyTest {
	private Collection<DiscoveryTargetVocabulary> defs;
	
	@Before
	public void init() {
		String vocabString = "@prefix dbpedia: <http://dbpedia.org/> ." +
								"@prefix a: <http://a.org/> ." + 
								"@prefix b: <http://b.org/> ." +
								"@prefix c: <http://c.org/> ." +
								"(a:a1, b:b1^<http://d.org/VOID>, c:c1)^dbpedia:dbpediaVOID ." +
								"(c:c2)";
		
		defs = DiscoveryTargetVocabulary.parse(vocabString);
	}
	
	@Test
	public void checkSize() {
		assertEquals(defs.size(), 2);
	}
	
	@Test
	public void checkSizes() {
		Iterator<DiscoveryTargetVocabulary> it = defs.iterator();
		assertTrue(it.hasNext());
		assertEquals(it.next().getTermDatasetPairs().size(), 3);
		assertTrue(it.hasNext());
		assertEquals(it.next().getTermDatasetPairs().size(), 1);
	}
	
	@Test
	public void checkDatasetOverwrite() {
		Iterator<DiscoveryTargetVocabulary> it = defs.iterator();
		assertTrue(it.hasNext());
		Map<String,String> pairs = it.next().getTermDatasetPairs();
		assertTrue(pairs.containsKey("http://a.org/a1"));
		assertEquals(pairs.get("http://a.org/a1"), "http://dbpedia.org/dbpediaVOID");
		assertEquals(pairs.get("http://b.org/b1"), "http://d.org/VOID");
	}
}
