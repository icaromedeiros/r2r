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

/**
 * R2R vocabulary
 * @author andreas
 *
 */
public class R2R {
	//r2r namespace
	public final static String R2R = "http://www4.wiwiss.fu-berlin.de/bizer/r2r/";
	
	//r2r class URIs
	public final static String ClassMapping = R2R + "ClassMapping";
	public final static String PropertyMapping = R2R + "PropertyMapping";
	public final static String Mapping = R2R + "Mapping";
	public final static String ExternalFunction = R2R + "ExternalFunction";
	public final static String MappingCollection = R2R + "MappingCollection";
	
	public final static String partOfMappingCollection = R2R + "partOfMappingCollection";
	public final static String sourcePattern = R2R + "sourcePattern";
	public final static String targetPattern = R2R + "targetPattern";
	public final static String mappingRef = R2R + "mappingRef";
	public final static String transformation = R2R + "transformation";
	public final static String targetProperty = R2R + "targetEntity";
	public final static String prefixDefinitions = R2R + "prefixDefinitions";
	public final static String mapsTo = R2R + "mapsTo";
	public final static String dependsOn = R2R + "dependsOn";
	public final static String classRestriction = R2R + "classRestriction";
	public final static String classRestrictionAndTarget = R2R + "classRestrictionAndTargetEntity";
	
	// Other Meta Data
	public final static String equivalenceMapping = R2R + "equivalenceMapping";
	public final static String byVocabularyPublisher = R2R + "byVocabularyPublisher";
	public final static String publishedWithDataset = R2R + "publishedWithDataset";
	public final static String sourceDataset = R2R + "sourceDataset";
	public final static String targetDataset = R2R + "targetDataset";

	//Function Properties:
	public final static String TransformationFunction = R2R + "TransformationFunction";
	public final static String codeLocation = R2R + "codeLocation";
	public final static String qualifiedClassName = R2R + "qualifiedClassName";
	public final static String importFunction = R2R + "importFunction";
	
	
	
}
