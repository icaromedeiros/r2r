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
package de.fuberlin.wiwiss.r2r.functions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.fuberlin.wiwiss.r2r.Function;

public class IterativeRegexToListFunctionTest {
	private Function itRegexToList;
	
	@Before
	public void init() {
		itRegexToList = (new IterateRegexToListFunctionFactory()).getInstance();
	}
	
	@Test
	public void regex1() {
		List<List<String>> argumentList = Helper.getArgumentLists("(\\d+)", "1, 2, 3, 4, 5");
		List<String> result = itRegexToList.execute(argumentList, null);
		assertEquals(5, result.size());
		assertEquals("1", result.get(0));
	}

	@Test
	public void regex2() {
		List<List<String>> argumentList = Helper.getArgumentLists("\"(.+?)\"", "\"1\", \"2\", \"3\", \"4\", \"5\"");
		List<String> result = itRegexToList.execute(argumentList, null);
		assertEquals(5, result.size());
		assertEquals("1", result.get(0));
	}
}
