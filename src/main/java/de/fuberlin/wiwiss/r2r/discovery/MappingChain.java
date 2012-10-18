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

import de.fuberlin.wiwiss.r2r.*;

public class MappingChain {
	private MappingChainNode root;
	private String sourceDataset;
	private String targetDataset;
	private String targetVocabularyTerm;
	private double score;

	public MappingChain(MappingChainNode root, String sourceDataset,
			String targetDataset, String targetVocabularyTerm, 
			double score) {
		super();
		this.root = root;
		this.sourceDataset = sourceDataset;
		this.targetDataset = targetDataset;
		this.targetVocabularyTerm = targetVocabularyTerm;
		this.score = score;
	}

	public MappingChainNode getRoot() {
		return root;
	}

	public String getSourceDataset() {
		return sourceDataset;
	}

	public String getTargetDataset() {
		return targetDataset;
	}

	public String getTargetVocabularyTerm() {
		return targetVocabularyTerm;
	}

	public double getScore() {
		return score;
	}

	/**
	 * executes the mapping chain against a dataset, however, if the discovery couldn't find an appropriate mapping chain
	 * then nothing will happen.
	 * @param in Source object representing the source dataset
	 * @param out Output object where the triples are written to
	 * @param repository the mapping repository
	 * @return Numbers of triples generated in the whole process
	 */
	public long execute(Source in, Output out, MappingRepository repository) {
		if(root!=null)
			return root.execute(in, out, repository);
		else
			return 0;
	}
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append("  MappingChain\n");
		output.append("target vocabulary term:\t ").append(targetVocabularyTerm).append("\n");
		if(targetDataset!=null)
			output.append("target dataset:\t\t").append(targetDataset).append("\n");
		else
			output.append("target dataset:\t\tnone \n");
		if(sourceDataset!=null)
			output.append("source dataset:\t\t").append(sourceDataset).append("\n");
		else
			output.append("source dataset:\t\tnone \n");
		output.append("score:\t\t\t").append(score).append("\n");
		output.append("  Nodes:\n");
		if(root!=null)
			output.append(root.toString());
		else
			output.append("This mapping chain is empty and not executable!");
		
		return output.toString();
	}
	
	/**
	 * checks if an executable mapping chain was found 
	 * @return 
	 */
	public boolean isExecutable() {
		return root!=null;
	}
}
