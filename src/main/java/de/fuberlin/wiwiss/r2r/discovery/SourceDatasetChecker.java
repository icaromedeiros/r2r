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

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.hp.hpl.jena.query.QueryExecution;

import de.fuberlin.wiwiss.r2r.Source;

public class SourceDatasetChecker implements DatasetChecker {
	private final Source source;
	private final ConcurrentMap<String, Boolean> cache;
	
	public SourceDatasetChecker(Source source) {
		this.source = source;
		cache = new ConcurrentHashMap<String, Boolean>();
	}
	
	public boolean containsClass(String uri) {
		Boolean existent = cache.get(uri);
		if(existent==null) {
			StringBuilder query = new StringBuilder();
			query.append("SELECT ?element WHERE { ?s a <").append(uri).append("> } LIMIT 1");
			QueryExecution qe = source.executeQuery(query.toString());
			existent = qe.execSelect().hasNext();
			qe.close();
		}
		return existent;
	}

	public boolean containsProperty(String uri) {
		Boolean existent = cache.get(uri);
		if(existent==null) {
			StringBuilder query = new StringBuilder();
			query.append("SELECT ?element WHERE { ?s <").append(uri).append("> ?o} LIMIT 1");
			QueryExecution qe = source.executeQuery(query.toString());
			existent = qe.execSelect().hasNext();
			qe.close();
		}
		return existent;
	}
	
	public boolean containsTargetElement(String uri) {
		return containsProperty(uri) || containsClass(uri);
	}
}
