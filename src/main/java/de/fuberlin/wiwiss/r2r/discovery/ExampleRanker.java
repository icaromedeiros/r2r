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

import java.util.Set;

import de.fuberlin.wiwiss.r2r.R2R;

public class ExampleRanker implements MappingRanker {
	public static final double mappingChainLengthWeight = 1.0;
	public static final double byPublisherWeight = 1.0;
	public static final double byDatasetMaintainerWeight = 1.0;
	public static final double weightSum = mappingChainLengthWeight + byDatasetMaintainerWeight + byPublisherWeight; 
	
	public double rankMapping(MappingMetaData metaData) {
		String sourceDataset = getSingleValue(metaData, R2R.sourceDataset);
		String targetDataset = getSingleValue(metaData, R2R.targetDataset);
		String datasetP = getSingleValue(metaData, R2R.publishedWithDataset);
		String vocabularyP = getSingleValue(metaData, R2R.byVocabularyPublisher);
		
		double score = mappingChainLengthWeight*0.95;
		
		if(sourceDataset==null && targetDataset==null) {
			score+=byDatasetMaintainerWeight;
			if(vocabularyP!=null && vocabularyP.equalsIgnoreCase("true"))
				score += byPublisherWeight;
			else
				score += byPublisherWeight*0.90;
		}else {
			score += byPublisherWeight;
			if(targetDataset!=null && targetDataset.equals(datasetP))
				score += byDatasetMaintainerWeight;
			else if(sourceDataset!=null && targetDataset.equals(datasetP))
				score += byDatasetMaintainerWeight*0.95;
			else
				score += byDatasetMaintainerWeight*0.90;
		}

		return score / weightSum;
	}

	private String getSingleValue(MappingMetaData metaData, String property) {
		Set<String> values = metaData.getValuesForProperty(property);

		if(values!=null && !values.isEmpty())
			return values.iterator().next();
		else
			return null;
	}
}
