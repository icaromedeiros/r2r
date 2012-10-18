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

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import com.hp.hpl.jena.rdf.model.Model;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Collections;

import de.fuberlin.wiwiss.r2r.functions.HelperFunctions;
import de.fuberlin.wiwiss.r2r.parser.*;
import de.fuberlin.wiwiss.r2r.parser.TargetPatternParser.targetPattern_return;
import com.hp.hpl.jena.datatypes.TypeMapper;
import com.hp.hpl.jena.datatypes.RDFDatatype;

import de.fuberlin.wiwiss.r2r.TripleElement.Type;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.util.PrintUtil;

import java.util.Set;
import java.util.Map;

/**
 * Java representation of the Target Pattern R2R language element.
 * @author andreas
 *
 */
public class TargetPattern implements Serializable {
	private List<Triple> path;
	private Set<String> variableDependencies;
	private Set<String> classes;
	private Set<String> properties;
	private Map<String, String> hints;
	private static Log log = LogFactory.getLog(TargetPattern.class);
	private Mapping mapping = null;
	
	public Set<String> getVariableDependencies() {
		return Collections.unmodifiableSet(variableDependencies);
	}

	public TargetPattern(List<Triple> path) {
		this.path = path;
	}
	
	public void setMapping(Mapping mapping) {
		this.mapping = mapping;
	}
	
	public List<Triple> getPath() {
  	return Collections.unmodifiableList(path);
  }

	/*
	 * Generate all triples given the variable results of the query and transformations
	 * @param model		The model to add the triples to
	 * @param results	A variable binding of the source pattern and the transformation results
	 * @param group		A group identifier to use when generating blank nodes (in order to separate identifiers across result sets) 
	 */
	public void addTargetTriplesToModel(Model model, VariableResults results, int blankNodeGroup, String termURI) {
		for(Triple triple: path) {
			if(termURI==null || triple.getPropertyURI().equals(termURI) || (triple.getClassURI()!=null && triple.getClassURI().equals(termURI))) {
				List<Resource> subjectVals = getSubjectValues(triple.getSubject(), results, model, blankNodeGroup);
				List<String> verbVals = getVerbValues(triple.getVerb());
	
				for(Resource subject: subjectVals) {
					for(String verb: verbVals) {
						Property property = model.createProperty(verb);
						addObjectsToStatement(subject, property, triple.getObject(), results, model, blankNodeGroup);
					}
				}
			}
		}
	}
	
	/*
	 * TODO: could be nicer :)
	 */
	private void addObjectsToStatement(Resource subject, Property property, TripleElement object, VariableResults results, Model model, int blankNodeGroup) {
		TypeMapper typeMapper = TypeMapper.getInstance();
		//Handle IRI result types
		Type type = object.getType();
		if(type==Type.IRI || type==Type.IRIVARIABLE) {
			List<String> iris = getIriValuesOfTripleElement(object, results);
			for(String iri: iris) {
				Resource iriResource;
				if (iri.startsWith("_:")) {
					iriResource = model.createResource(new AnonId(blankNodeGroup + "_" + iri.substring(2)));
				} else {
					iriResource = model.createResource(iri);					
				}
				subject.addProperty(property, iriResource);
			}
		}
		else if(type==Type.DATATYPESTRING || type==Type.DATATYPEVARIABLE) {
			List<String> values = null;
			if(type==Type.DATATYPEVARIABLE) 
				values = getDataTypeVariableValues(object, results);
			else {
				values = new ArrayList<String>();
				values.add(object.getValue(0));
			}
			RDFDatatype datatype = typeMapper.getTypeByName(PrintUtil.expandQname(object.getValue(1)));

			for(String value: values) {
				subject.addProperty(property, value, datatype);
			}
		}
		else if(type==Type.STRING || type==Type.STRINGVARIABLE) {
			List<String> values = null;
			if(type==Type.STRINGVARIABLE)
				values = results.getResults(object.getValue(0));
			else {
				values = new ArrayList<String>();
				values.add(object.getValue(0));
			}
			for(String value: values)
				subject.addProperty(property, value);
		}
		else if(type==Type.LANGTAGSTRING || type==Type.LANGTAGVARIABLE) {
			List<String> values = null;
			if(type==Type.LANGTAGVARIABLE)
				values = results.getResults(object.getValue(0));
			else {
				values = new ArrayList<String>();
				values.add(object.getValue(0));
			}
			String langtag = object.getValue(1);
			for(String value: values) {
				subject.addProperty(property, value, langtag);
			}
		}
		else if (type==Type.VARIABLE) {
			RDFNode node = results.getRDFNode(object.getValue(0));
			if(node!=null)
				subject.addProperty(property, node);
			else {
				List<String> values = results.getResults(object.getValue(0));
				for(String value: values) {
					subject.addProperty(property, value);
				}
			}
		} else if(type==Type.BLANKNODE) {
			subject.addProperty(property, results.getBlankNodeResource(object.getValue(0), model));
		} else {
			RDFDatatype datatype = null;
			if(type==Type.BOOLEAN) {
				datatype = typeMapper.getTypeByName(PrintUtil.expandQname("xsd:boolean"));
			} else if(type==Type.DECIMAL) {
				datatype = typeMapper.getTypeByName(PrintUtil.expandQname("xsd:decimal"));
			} else if(type==Type.INTEGER) {
				datatype = typeMapper.getTypeByName(PrintUtil.expandQname("xsd:integer"));
			} else if(type==Type.DOUBLE) {
				datatype = typeMapper.getTypeByName(PrintUtil.expandQname("xsd:double"));
			}
			subject.addProperty(property, object.getValue(0), datatype);
		}
	}

	private List<String> getDataTypeVariableValues(TripleElement object,
			VariableResults results) {
		List<String> values;
		String var = object.getValue(0);
		values = results.getResults(var);
		String hint = hints.get(var);
		// If data type hint is a known type, apply conversion
		if(HelperFunctions.getWorkingDataTypeOfDataTypeString(hint)!=null) {
			List<String> tempList = values;
			values = new ArrayList<String>();
			for(String value: tempList) {
				String convertedValue = null;
				try {
					convertedValue = HelperFunctions.convertValueToDataType(value, hint);
				} catch(NumberFormatException e) {
					if(log.isDebugEnabled())
						log.debug("NumberFormatException: In mapping <" + mapping.getUri() + "> of variable ?" + var + " for value: " +value);
					continue;
				}
				values.add(convertedValue);
			}
		}
		return values;
	}
	
	private List<String> getIriValuesOfTripleElement(TripleElement element, VariableResults results) {
		List<String> iris = null;
		if(element.getType()==Type.IRI) {
			iris = new ArrayList<String>();
			iris.add(element.getValue(0));
		}
		else 
			iris = results.getResults(element.getValue(0));

		return iris;
	}
	
	private List<Resource> getSubjectValues(TripleElement element, VariableResults results, Model model, int blankNodeGroup) {
		List<Resource> subjects = new ArrayList<Resource>();
		Type type = element.getType();
		
		if(type==Type.IRI) {
			String subjectVal = element.getValue(0);
			if(subjectVal.startsWith("_:"))
				subjects.add(model.createResource(new AnonId(blankNodeGroup + "_" + subjectVal.substring(2))));
			else
				subjects.add(model.createResource(subjectVal));
		} else if (type==Type.BLANKNODE) {
			subjects.add(results.getBlankNodeResource(element.getValue(0), model));
		} else {
			String varName = element.getValue(0);
			//only IRIVARIABLE and VARIABLE possible
			if(type==Type.VARIABLE) {
				RDFNode node = results.getRDFNode(varName);
				if(node!=null && (!node.isResource())) {
					//Node is no resource thus cannot be in the subject position => do not add => do nothing!
				}
				else
					subjects= convertIRIStringsToResources(results.getResults(varName), model);
			}
			else
				subjects = convertIRIStringsToResources(results.getResults(varName), model);
		}
		return subjects;
	}
	
	private List<Resource> convertIRIStringsToResources(List<String> iriStrings, Model model) {
		List<Resource> resources = new ArrayList<Resource>();
		for(String iri: iriStrings) {
			Resource r;
			if (iri.startsWith(Mapping.blankNodePrefix)) {
				r = model.createResource(new AnonId(iri.substring(Mapping.blankNodePrefix.length())));
			} else {
				r = model.createResource(iri);
			}
			resources.add(r);
		}
		return resources;
	}
	
	private List<String> getVerbValues(TripleElement element) {
		//Can only be IRI
		List<String> subjects = new ArrayList<String>();
		subjects.add(element.getValue(0));
		return subjects;
	}
 
	public static TargetPattern parseTargetPattern(String targetPattern, PrefixMapper prefixMapper, Set<String> generatedVars) throws RecognitionException{
		CharStream stream =	new ANTLRStringStream(targetPattern);
		TargetPatternLexer lexer = new TargetPatternLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		TargetPatternParser parser = new TargetPatternParser(tokenStream);
		parser.setPrefixMapper(prefixMapper);
		parser.setGeneratedVariables(generatedVars);
		TargetPattern tp = null;

		// Parse and set fields
		targetPattern_return retVal = parser.targetPattern();
		tp = retVal.pattern;
		tp.hints = retVal.hints;
		tp.variableDependencies = retVal.variableDependencies;
		tp.classes = retVal.classes;
		tp.properties = retVal.properties;

		return tp;
	}

	public Map<String, String> getHints() {
		return Collections.unmodifiableMap(hints);
	}

	public Set<String> getClasses() {
		return Collections.unmodifiableSet(classes);
	}

	public Set<String> getProperties() {
		return Collections.unmodifiableSet(properties);
	}
}
