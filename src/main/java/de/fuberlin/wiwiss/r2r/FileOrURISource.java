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

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.shared.NotFoundException;
import com.hp.hpl.jena.util.FileManager;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Implementation of the Source Interface which reads a file or URI resource into memory.
 * @author andreas
 *
 */
public class FileOrURISource implements ExportableSource {

	private Model model;
	
	/**
	 * 
	 * @param fileOrURI A file name or a URI.
	 */
	public FileOrURISource(String fileOrURI) throws NotFoundException {
		FileManager fileManager = FileManager.get();
		model = fileManager.loadModel(fileOrURI);
	}

    /**
     *
     * @param file Can either be a file or a directory. In case of a directory, all files in this directory all loaded.
     * @throws NotFoundException
     */
    public FileOrURISource(File file) throws IOException {
        model = ModelFactory.createDefaultModel();
        if(file.isDirectory()) {
            for(File mappingFile: file.listFiles()) {
                FileManager fileManager = FileManager.get();
		        Model mappingFileModel = fileManager.loadModel(mappingFile.getCanonicalPath());
                model.add(mappingFileModel);
            }
        } else {
            FileManager fileManager = FileManager.get();
		    model = fileManager.loadModel(file.getCanonicalPath());
        }
    }
	
	public QueryExecution executeQuery(String query) {
		return QueryExecutionFactory.create(query, model);
	}

	public Model executeDescribeQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		Model model = qe.execDescribe();
		qe.close();
		return model;
	}

	public Model executeConstructQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		Model model = qe.execConstruct();
		qe.close();
		return model;
	}

    public void exportMappings(Writer out, String serializationFormat) {
        model.write(out, serializationFormat);
    }

    public void exportMappings(OutputStream out, String serializationFormat) {
        model.write(out, serializationFormat);
    }

    public void exportMappings(Writer out) {
        model.write(out, "N-TRIPLE");
    }

    public void exportMappings(OutputStream out) {
        model.write(out, "N-TRIPLE");
    }
}
