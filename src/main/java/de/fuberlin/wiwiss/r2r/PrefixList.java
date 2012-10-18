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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;

/**
 * Stores (namespace) prefixes in a way that prefixes that are prefixed by other prefixes in the List are removed. 
 * @author ced
 *
 */
public class PrefixList {
	private List<String> prefixes;
	
	private PrefixList() {}
	
	public static PrefixList createPrefixList(Collection<String> inputPrefixes) {
		List<String> p = new ArrayList<String>();
		if(inputPrefixes instanceof ArrayList<?>)
			p = (ArrayList<String>) inputPrefixes;
		else
			p.addAll(inputPrefixes);

		Collections.sort(p);
		Iterator<String> sortedIterator = p.listIterator();
		String previousPrefix = null;
		while(sortedIterator.hasNext()) {
			if(previousPrefix==null) {
				previousPrefix = sortedIterator.next();
				continue;
			}
			String currentPrefix = sortedIterator.next();
			if(currentPrefix.length() < previousPrefix.length()) {
				previousPrefix = currentPrefix;
			} else {
				int cLen = currentPrefix.length();
				// Remove current prefix if previous prefix subsumes this one
				if(previousPrefix.equals(currentPrefix.substring(0, previousPrefix.length())))
					sortedIterator.remove();
				else // no prefix will follow that the previous one subsumes
					previousPrefix = currentPrefix;
			}
		}
		PrefixList pl = new PrefixList();
		pl.prefixes = p;
		return pl;
	}
	
	public String prefixedBy(String uri) {
		int index = Collections.binarySearch(prefixes, uri);
		if(index < 0) {
			index = -index-2;
			if(index==-1)
				return null;
			String prefix = prefixes.get(index);
			if(uri.substring(0, prefix.length()).equals(prefix))
				return prefixes.get(index);
			else
				return null;
		}
		else
			return prefixes.get(index);
	}
	
	public int size() {
		return prefixes.size();
	}
	
	public static void main(String args[]) {
		ArrayList<String> blah = new ArrayList<String>();
		blah.add("http://dbpedia.org/ontology/");
		blah.add("http://nodomain.com/");
		blah.add("http://lala.com/");
		blah.add("http://dbpedia.org/qerre/");
		blah.add("http://dbpedia.org/resource/");
		PrefixList pl = PrefixList.createPrefixList(blah);
		System.out.println("http://dbpedia.org/resource/lala prefixed by " + pl.prefixedBy("http://dbpedia.org/resource/lala"));
		System.out.println("http://dbpedia.org/resorce/lala prefixed by " + pl.prefixedBy("http://dbpedia.org/resorce/lala"));
		System.out.println("http://dbpedia.org/pesorce/lala prefixed by " + pl.prefixedBy("http://dbpedia.org/resorce/lala"));
		System.out.println("http://dbpedia.org/resource/ prefixed by " + pl.prefixedBy("http://dbpedia.org/resource/"));
		System.out.println("http://dbpedia.org/ontology/fasgsd prefixed by " + pl.prefixedBy("http://dbpedia.org/ontology/fasgsd"));
		System.out.println("Size: " + pl.size());
	}
}
