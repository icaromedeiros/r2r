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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Helper {
	public static List<List<String>> getArgumentLists(String... args) {
		List<List<String>> argumentLists = new ArrayList<List<String>>();
		for (String arg : args) {
			if (arg != null) {
				List<String> a1 = new ArrayList<String>();
				a1.add(arg);
				argumentLists.add(a1);
			} else {
				argumentLists.add(Collections.EMPTY_LIST);
			}
		}

		return argumentLists;
	}
}
