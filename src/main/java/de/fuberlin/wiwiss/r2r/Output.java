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

import java.io.IOException;

import com.hp.hpl.jena.rdf.model.Model;

/**
 * The Output interface is an abstraction for the output dataset.
 * @author andreas
 *
 */
public interface Output {
	/**
	 * Write the Jena Model to the output object
	 * @param output the Jena Model object containing the mapped data. This was initially obtained by calling getOutputModel().
	 */
	public void write(Model output);
	
	/**
	 * Get a Jena Model from the output object to write to
	 * @return A Jena Model that will be used as target in the mapping process. After the mapping process this should be passed to the write method. 
	 */
	public Model getOutputModel();
	
	/**
	 * shuts down the output object and does all the work needed after all the mapped data has been added 
	 */
	public void close() throws IOException;
}
