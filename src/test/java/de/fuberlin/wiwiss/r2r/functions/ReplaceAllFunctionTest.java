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

import de.fuberlin.wiwiss.r2r.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ReplaceAllFunctionTest {
	private Function replaceAll;
	
	@Before
	public void init() {
		replaceAll = (new ReplaceAllFunctionFactory()).getInstance();
	}
	
	@Test
	public void replace1() {
		List<List<String>> argumentList = Helper.getArgumentLists("-", "", "43243-63634-123");
		List<String> result = replaceAll.execute(argumentList, null);
		assertEquals(result.get(0), "4324363634123");	
	}
}
