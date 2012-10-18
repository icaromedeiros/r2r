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

import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.shared.NotFoundException;
import com.hp.hpl.jena.vocabulary.OWL;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * Repository that offers access to R2R mappings and functions to import non-R2R mappings.
 * It implements both Mapping Repository and Metadata Repository capabilities 
 * @author andreas
 *
 */
public class Repository implements MappingRepository, MetadataRepository, Source {
	private Source source;
	private FunctionManager functionManager;
	private static Log log = LogFactory.getLog(Repository.class);
	
	// load FunctionManager as defined in r2r.properties
	private FunctionManager loadFunctionManager(Source source) {
		String fm = Config.getProperty("r2r.FunctionManager", "de.fuberlin.wiwiss.r2r.BasicFunctionManager");
		String error = null;
		Exception exception;
		try {
			Class<?> fmclass = Class.forName(fm);
			boolean constructorWithSource = false;
			Constructor<?> c = null;
			for(Constructor<?> constructor: fmclass.getConstructors()) {
				Class<?>[] pTypes = constructor.getParameterTypes();
				if(c==null && pTypes.length==0)
					c=constructor;
				if(pTypes.length==1 && pTypes[0]==Source.class) {
					c=constructor;
					constructorWithSource = true;
				}
			}
			
			if(constructorWithSource)
				return (FunctionManager)c.newInstance(source);
			else
				return (FunctionManager)c.newInstance();
		} catch (InstantiationException e) {
			exception = e;
		} catch (IllegalAccessException e) {
			exception = e;
		} catch (ClassNotFoundException e) {
			exception = e;
		} catch (IllegalArgumentException e) {
			exception = e;
		} catch (InvocationTargetException e) {
			exception = e;
		}
		error = "Could not load Function Manager: " + fm + ". Cause: " + exception;
		if(log.isDebugEnabled())
			log.debug(error);
		if(Config.rethrowActivated())
			throw new R2RException(error, exception);
		
		return null;
	}
	
	/**
	 * Create a Repository from a Source object
	 * @param source A Source object
	 */
	public Repository(Source source) {
		this.source = source;
		functionManager = loadFunctionManager(source);
	};
	
	//Factory methods:

	
	/**
	 * create a repository based on a Jena model
	 * @param model a Jena Model
	 * @return Repository
	 */
	public static Repository createJenaModelRepository(Model model) {
		return new Repository(new JenaModelSource(model));
	}
	
	/**
	 * Create a repository created from a file or URI
	 * @param fileOrUri a path to a file in the file system or a URI
	 * @return Repository
	 */
	public static Repository createFileOrUriRepository(String fileOrUri) throws NotFoundException {
		return new Repository(new FileOrURISource(fileOrUri));
	}
	
	/**
	 * Create a repository that can be queried over a SPARQL endpoint
	 * @param endpointURI The SPARQL endpoint URL String
	 * @return Repository
	 */
	public static Repository createSparqlEndpointRepository(String endpointURI) {
		return new Repository(new SparqlEndpointSource(endpointURI));
	}
	
	/**
	 * Create a repository that can be queried over a SPARQL endpoint
	 * @param endpointURI The SPARQL endpoint URL String
	 * @param defaultGraph The default graph to query
	 * @return Repository
	 */
	public static Repository createSparqlEndpointRepository(String endpointURI, String defaultGraph) {
		return new Repository(new SparqlEndpointSource(endpointURI, defaultGraph));
	}
	
	/**
	 * Create a repository that can be queried over a SPARQL endpoint
	 * @param endpointURI The SPARQL endpoint URL String
	 * @param defaultGraph The default graph to query
	 * @param namedGraphURIs A list of named graphs against the query will be executed
	 * @return Repository
	 */
	public static Repository createSparqlEndpointRepository(String endpointURI, String defaultGraph, List<String> namedGraphURIs) {
		return new Repository(new SparqlEndpointSource(endpointURI, defaultGraph, namedGraphURIs));
	}
	
	/**
	 * fetch _all_ mappings from the repository
	 * @return Java Map: mapping URI String -> Mapping object
	 */
	public Map<String, Mapping> getMappings() {
		Map<String, Mapping> mappings = new HashMap<String, Mapping>();
		List<String> resources = getMappingResources(); 

		for(String resURI: resources) {
			Mapping mapping = getMappingOfUri(resURI);
			if(mapping!=null)
				mappings.put(mapping.getUri(), mapping);
		}
		return mappings;
	}

    public Map<String, String> validateMappings() {
        Map<String, String> erroneousMappings = new HashMap<String, String>();
        List<String> resources = getMappingResources();

        for(String resURI: resources) {
            try {
                Mapping mapping = getMappingOfUri(resURI);
                if(mapping==null)
                    erroneousMappings.put(resURI, "Unknown Error");
            } catch(R2RException e) {
                erroneousMappings.put(resURI, e.getMessage());
            }
        }
        return erroneousMappings;
    }
	
	/**
	 * create a Repository object that includes the meta data of this Repository 
	 * @return Mapping meta-data Repository
	 */
	public MetadataRepository getMetaDataRepository() {
		Model resModel = ModelFactory.createDefaultModel(); 
		List<String> resources = getMappingResources(); 

		for(String resURI: resources) {
			Mapping mapping = getMappingOfUri(resURI);
			if(mapping!=null)
				resModel.add(mapping.getJenaModelWithMappingMetaData());
		}
		MetadataRepository repository = new Repository(new JenaModelSource(resModel));
		return repository;
	}

	private List<String> listMappingResourcesFromResultSet(ResultSet resultSet) {
		List<String> resources = new ArrayList<String>();
		while(resultSet.hasNext())
			resources.add(resultSet.next().get("s").toString());
		
		return resources;
	}
	
	private List<String> getMappingResources() {
		String query = "select distinct ?s where { ?s <" + R2R.targetPattern + "> ?o }";
		QueryExecution qe = source.executeQuery(query);
		try {
			return listMappingResourcesFromResultSet(qe.execSelect());
		}
		finally {
			qe.close();
		}
	}
	
	private List<String> getPropertyValues(ResultSet resultSet) {
		List<String> values = new ArrayList<String>();

		while(resultSet.hasNext()) {
			RDFNode node = resultSet.next().get("o");
			if(node instanceof Literal)
				values.add(((Literal) node).getLexicalForm());
			else
				values.add(node.toString());
		}
		return values;
	}
	
	private String getPropertyValuesQuery(String property, String resourceURI) {
		return "select distinct ?o where { <" + resourceURI + "> <" + property + "> ?o }";
	}
	
	/**
	 * fetches a Mapping out of the Repository
	 * @param mappingURI the mapping URI String
	 * @return a Mapping object corresponding to the supplied mapping URI or null 
	 */
	public Mapping getMappingOfUri(String mappingURI) {
		List<String> mappingTypes = getPropertyValuesForResource(mappingURI, RDF.type.getURI());
		if(mappingTypes.size()==0)
			throw new RuntimeException("Unknown mapping type of resource <" + mappingURI + ">");
		boolean isClassMapping = isClassMappingType(mappingTypes);
		
		List<String> sp = getPropertyValuesForResource(mappingURI, R2R.sourcePattern);
		if(sp.size()!=1) {
			if(log.isDebugEnabled())
				log.debug("Mapping <" + mappingURI + "> has no unique source pattern");
			return null;
		}
		String sourcePattern = sp.get(0);
		List<String> targetPatterns = getPropertyValuesForResource(mappingURI, R2R.targetPattern);
		List<String> transformations = getPropertyValuesForResource(mappingURI, R2R.transformation);
		List<String> prefixDefinitions = getPropertyValuesForResource(mappingURI, R2R.prefixDefinitions);
		List<String> functionImports = getPropertyValuesForResource(mappingURI, R2R.importFunction);
		
		String classRef = getReferencedClassMappingUri(mappingURI);
		
		if(classRef==null) {
			addPrefixesOfMappingCollection(mappingURI, prefixDefinitions);
			return Mapping.createMapping(mappingURI, null, prefixDefinitions, targetPatterns, transformations, sourcePattern, isClassMapping, functionImports, functionManager);
		}
		
		String parentMapping = classRef;
		List<String> sourcePatterns = new ArrayList<String>();
		sourcePatterns.add(sourcePattern);
		boolean successful = mergeWithReferencedMappings(mappingURI, prefixDefinitions, classRef, sourcePatterns);
		if(!successful)
			return null;
		
		addPrefixesOfMappingCollection(mappingURI, prefixDefinitions);
		
		return Mapping.createMapping(mappingURI, parentMapping, prefixDefinitions, targetPatterns, transformations, sourcePatterns, isClassMapping, functionImports, functionManager);
	}

	private List<String> addPrefixesOfMappingCollection(String mappingURI,
			List<String> prefixDefinitions) {
		List<String> mC = getPropertyValuesForResource(mappingURI, R2R.partOfMappingCollection);
		List<String> prefixDefsOfCollection=null;
		if(mC.size()>0) {
			prefixDefsOfCollection = getPropertyValuesForResource(mC.get(0), R2R.prefixDefinitions);
		}
		if(prefixDefsOfCollection!=null)
			prefixDefinitions.addAll(prefixDefsOfCollection);
		return prefixDefsOfCollection;
	}

	private boolean mergeWithReferencedMappings(String mappingURI, List<String> prefixDefinitions,
			String classRef, List<String> sourcePatterns) {
		HashSet<String> mappingPath = new HashSet<String>();
		while(classRef!=null) {
			if(mappingPath.contains(classRef)) {
				if(log.isDebugEnabled()) {
					StringBuilder sb = new StringBuilder();
					sb.append("Mapping <").append(mappingURI).append("> references other mappings that lead to a cycle. ");
					sb.append("Cycle starts with mapping: <").append(classRef).append(">.");
					log.debug(sb.toString());
				}
				return false;
			}
			else
				mappingPath.add(classRef);
			
			MappingData mapData = getMappingDataOfUri(classRef);
			if(mapData==null)
				return false;
			sourcePatterns.add(mapData.sourcePattern);
			prefixDefinitions.addAll(mapData.prefixDefinitions);
			classRef = getReferencedClassMappingUri(classRef);
		}
		return true;
	}
	
	private MappingData getMappingDataOfUri(String mappingURI) {
		List<String> sp = getPropertyValuesForResource(mappingURI, R2R.sourcePattern);
		if(sp.size()!=1) {
			if(log.isDebugEnabled())
				log.debug("Mapping <" + mappingURI + "> has no unique source pattern");
			return null;
		}
		String sourcePattern = sp.get(0);

		List<String> prefixDefinitions = getPropertyValuesForResource(mappingURI, R2R.prefixDefinitions);

		return new MappingData(sourcePattern, prefixDefinitions);
	}
	
	private List<String> getPropertyValuesForResource(String resourceURI, String property) {
		QueryExecution qe = source.executeQuery(getPropertyValuesQuery(property, resourceURI));
		try {
			return getPropertyValues(qe.execSelect());
		}
		finally {
			qe.close();
		}
	}
	
	//Check if the type of the resource is a class mapping
	private boolean isClassMappingType(List<String> types) {
		for(String type: types) {
			if(type.equals(R2R.ClassMapping))
				return true;
		}
		return false;
	}
	
	private String getReferencedClassMappingUri(String mappingUri) {
		QueryExecution qe = source.executeQuery(getReferencedClassMappingUriQuery(mappingUri));
		ResultSet resultSet = qe.execSelect();
		try {
			if(resultSet.hasNext())
				return resultSet.next().get("classref").toString();
			else
				return null;
		} finally {
			qe.close();
		}
	}
	
	private String getReferencedClassMappingUriQuery(String mappingUri) {
		return "Select ?classref where { <" + mappingUri + "> <" + R2R.mappingRef + "> ?classref }"; 
	}
	
	private static class MappingData {
		String sourcePattern;
		List<String> prefixDefinitions;
		
		public MappingData(String sourcePattern, List<String> prefixDefinitions) {
			super();
			this.sourcePattern = sourcePattern;
			this.prefixDefinitions = prefixDefinitions;
		}
	}
	
	/*
	 * Get all the mapping URIs from the meta data repository that generate one or more of the given entities
	 */
	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(List<String> entityUris) {
		return getMappingURIsForVocabularyDefinition(null, entityUris, false);
	}

	//TODO: Add another function or replace this function and offer a better interface, rework semantics of the return objects
	/**
	 * Get all the mapping URIs from the meta data repository that generate one or more of the given entities.
	 * All the mappings are being put into a specific context defined by the first argument.
	 * @param classRestrictionTermUri
	 * @param propertiesUris
	 * @param addClassRestrictionMappings
	 * @return MappingsInfo objects that contain information about which and how mappings should be executed.
	 */
	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(String classRestrictionTermUri, Collection<String> propertiesUris, boolean addClassRestrictionMappings) {
		List<MappingsInfo> mappingInfos = new ArrayList<MappingsInfo>();
		
		Set<String> classRestrictions = null;
		if(classRestrictionTermUri!=null) 
			classRestrictions = getMappingsOfTargetElement(classRestrictionTermUri);
		else {
			classRestrictions = new HashSet<String>();
			classRestrictions.add("");
		}
		
		Map<String, Set<String>> mappingsPerClassMapping = new HashMap<String, Set<String>>();
		Map<String, Map<String, Collection<String>>> restrictionsPerClassMapping = new HashMap<String, Map<String, Collection<String>>>();
		
		// This will only be executed if the class restriction mappings should be added 
		if(classRestrictionTermUri!=null) {
			for(String c: classRestrictions) {
				if(addClassRestrictionMappings) {
					addMappingsToClassMappingContext(c, c, mappingsPerClassMapping);
					addRestrictionToClassMappingContext(c, classRestrictionTermUri, c, restrictionsPerClassMapping);
				}
			}
		}
		
		//Add Property/Other Mappings
		for(String propertyUri: propertiesUris) {
			Collection<String> potentialPropertyMappings = getMappingsOfTargetElement(propertyUri);
			
			for(String potMapping: potentialPropertyMappings) {
				if(classRestrictionTermUri!=null)
					for(String c: classRestrictions) {
						addRestrictionToClassMappingContext(potMapping, propertyUri, c, restrictionsPerClassMapping);
						addMappingsToClassMappingContext(potMapping, c, mappingsPerClassMapping);
					}
				else {
					addRestrictionToClassMappingContext(potMapping, propertyUri, "", restrictionsPerClassMapping);
					addMappingsToClassMappingContext(potMapping, "", mappingsPerClassMapping);
				}
			}
		}
		
		// Create Mappings Info objects
		for(String c: classRestrictions) {
			Set<String> m = mappingsPerClassMapping.get(c);
			if(m==null)
				continue;

			Map<String, Collection<String>> r = restrictionsPerClassMapping.get(c);
			
			Collection<String> context = null;
			if(classRestrictionTermUri!=null) {
				context = new ArrayList<String>();
				context.add(c);
			}
			mappingInfos.add(new MappingsInfo(context, m, r));
			
		}
		
		return mappingInfos;
	}
	
	private void addMappingsToClassMappingContext(String mapping, String classMapping, Map<String, Set<String>> mappingsPerClassMapping) {
		assert(mappingsPerClassMapping.containsKey(classMapping));
		Set<String> mappings = mappingsPerClassMapping.get(classMapping);
		if(mappings==null) {
			mappings = new HashSet<String>();
		}
		mappings.add(mapping);
		mappingsPerClassMapping.put(classMapping, mappings);
	}
	
	private void addRestrictionToClassMappingContext(String propMapping, String property, String classMapping, Map<String, Map<String, Collection<String>>> restrictionsOfClassContexts) {
		assert(restrictionsOfClassContexts.containsKey(classMapping));
		Map<String, Collection<String>> restrictions = restrictionsOfClassContexts.get(classMapping);
		if(restrictions==null) {
			restrictions = new HashMap<String, Collection<String>>();
			restrictionsOfClassContexts.put(classMapping, restrictions);
		}
		Collection<String> properties = restrictions.get(propMapping);
		if(properties==null) {
			properties = new HashSet<String>();
			restrictions.put(propMapping, properties);
		}
		properties.add(property);
	}

	
	private void addRestrictionToMap(String mappingUri, String propertyUri, Map<String, Collection<String>> resMap) {
		Collection<String> restrictions = resMap.get(mappingUri);
		if(restrictions==null) {
			restrictions = new HashSet<String>();
			resMap.put(mappingUri, restrictions);
		}
		restrictions.add(propertyUri);
	}
	
	/*
	 * Fetches all class mappings from the repository where classUri is the target class
	 */
	public Set<String> getMappingsOfTargetElement(String uri) {
		String query = "Select ?mapping where { ?mapping <" + R2R.mapsTo + "> <" + uri + "> }";
		QueryExecution qe = source.executeQuery(query);
		ResultSet resultset = qe.execSelect();
		Set<String> mappings = new HashSet<String>();
		while(resultset.hasNext()) {
			mappings.add(resultset.next().get("mapping").toString());
		}
		qe.close();
		return mappings;
	}

	


	/*
	 * Checks if the property mapping is associated with one of the class mappings or a subclass of one of them.
	 */
//	private boolean checkForMappingContainment(String propertyMapping, Set<String> classMappings) {
//		String currentMapping = propertyMapping;
//		
//		while(currentMapping!=null) {
//			String query = "Select ?mapping where { <" + currentMapping + "> <" + R2R.classMappingRef + "> ?mapping }";
//			QueryExecution qe = source.executeQuery(query);
//			ResultSet rs = qe.execSelect();
//			try {
//				if(!rs.hasNext())
//					return false;
//				else {
//					currentMapping = rs.next().get("mapping").toString();
//					if(classMappings.contains(currentMapping))
//						return true;
//				}
//			}
//			finally {
//				qe.close();
//			}
//		}
//		return false;
//	}
	

	

	public QueryExecution executeQuery(String query) {
		return source.executeQuery(query);
	}

	public Model executeDescribeQuery(String query) {
		return source.executeDescribeQuery(query);
	}
	
	/**
	 * reads in all mapping data found in a Source object. Also converts simple OWL and RDFS mappings into R2R format
	 * @param source Source object containing mapping information
	 * @return Jena Model with the imported, possibly converted mappings
	 */
	public static Model importMappingDataFromSource(Source source, StringGenerator uriGenerator) {
		Model outputModel = ModelFactory.createDefaultModel();
		importMappingDataFromSourceIntoModel(source, outputModel, uriGenerator);
		return outputModel;
	}
	
	public static Model importMappingDataFromFile(String filename, StringGenerator uriGenerator) {
		Source source = new FileOrURISource(filename);
		return importMappingDataFromSource(source, uriGenerator);
	}
	
	/**
	 * write mapping data from Source object into the given Jena Model
	 * @param source Source object
	 * @param outputModel Jena model to output the imported (and possibly converted) mapping data
	 */
	public static void importMappingDataFromSourceIntoModel(Source source, Model outputModel, StringGenerator uriGenerator) {
		copyR2RmappingData(source, outputModel);
		importRDFSMappingData(source, outputModel, uriGenerator);
		importOWLMappingData(source, outputModel, uriGenerator);
	}
	
	private static void copyR2RmappingData(Source source, Model outputModel) {
		String query = "CONSTRUCT { ?s ?p ?o }" + 
				"WHERE {" +
				"?s <" + R2R.sourcePattern + "> ?st ." +
				"?s ?p ?o ." +
				"}";
		outputModel.add(source.executeConstructQuery(query));
	}
	
	/**
	 * imports rdfs:subClassOf and rdfs:subPropertyOf mappings from the Source
	 * @param source the Source of the RDFS mappings
	 * @param outputModel where the converted mappings are written to
	 * @param uriGenerator URIs for the converted mappings are taken from the URIGenerator
	 */
	public static void importRDFSMappingData(Source source, Model outputModel, StringGenerator uriGenerator) {
		importAndConvertSubClassOfMappings(source, outputModel, uriGenerator);
		importAndConvertSubPropertyOfMappings(source, outputModel, uriGenerator);
	}
	
	/**
	 * imports owl:equivalentClass and owl:equivalentProperty mappings from the Source
	 * @param source the Source of the OWL mappings
	 * @param outputModel where the converted mappings are written to
	 * @param uriGenerator URIs for the converted mappings are taken from the URIGenerator
	 */
	public static void importOWLMappingData(Source source, Model outputModel, StringGenerator uriGenerator) {
		importAndConvertEquivalentClassMappings(source, outputModel, uriGenerator);
		importAndConvertEquivalentPropertyMappings(source, outputModel, uriGenerator);
	}
	
	private static void importAndConvertEquivalentPropertyMappings(Source source, Model outputModel, StringGenerator uriGenerator) {
		String query = "Select ?e1 ?e2 WHERE {" +
			"?e1 <" + OWL.equivalentProperty.getURI() + "> ?e2" +
			"}";
		QueryExecution qe = source.executeQuery(query);
		ResultSet rs = qe.execSelect();
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			RDFNode e1 = qs.get("e1");
			RDFNode e2 = qs.get("e2");
			if(e1.isURIResource() && e2.isURIResource()) {
				String uri = uriGenerator.nextString();
				String e1Pattern = "?SUBJ <" + e1.toString() + "> ?o";
				String e2Pattern = "?SUBJ <" + e2.toString() + "> ?o";
				addR2RMapping(uri, e1Pattern, e2Pattern, R2R.PropertyMapping, outputModel, true);
				uri = uriGenerator.nextString();
				addR2RMapping(uri, e2Pattern, e1Pattern, R2R.PropertyMapping, outputModel, true);
			}
		}
		qe.close();
	}
	
	private static void importAndConvertEquivalentClassMappings(Source source, Model outputModel, StringGenerator uriGenerator) {
		String query = "Select ?e1 ?e2 WHERE {" +
		"?e1 <" + OWL.equivalentClass.getURI() + "> ?e2" +
		"}";
		QueryExecution qe = source.executeQuery(query);
		ResultSet rs = qe.execSelect();
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			RDFNode e1 = qs.get("e1");
			RDFNode e2 = qs.get("e2");
			if(e1.isURIResource() && e2.isURIResource()) {
				String uri = uriGenerator.nextString();
				String e1Pattern = "?SUBJ a <" + e1.toString() + ">";
				String e2Pattern = "?SUBJ a <" + e2.toString() + ">";
				addR2RMapping(uri, e1Pattern, e2Pattern, R2R.ClassMapping, outputModel, true);
				uri = uriGenerator.nextString();
				addR2RMapping(uri, e2Pattern, e1Pattern, R2R.ClassMapping, outputModel, true);
			}
		}
		qe.close();
	}
	
	private static void importAndConvertSubClassOfMappings(Source source, Model outputModel, StringGenerator uriGenerator) {
		String query = "Select ?from ?to WHERE {" +
			"?from <" + RDFS.subClassOf.getURI() + "> ?to" +
			"}";
		QueryExecution qe = source.executeQuery(query);
		ResultSet rs = qe.execSelect();
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			RDFNode from = qs.get("from");
			RDFNode to = qs.get("to");
			if(from.isURIResource() && to.isURIResource()) {
				String uri = uriGenerator.nextString();
				String sourcePattern = "?SUBJ a <" + from.toString() + ">";
				String targetPattern = "?SUBJ a <" + to.toString() + ">";
				addR2RMapping(uri, sourcePattern, targetPattern, R2R.ClassMapping, outputModel, false);
			}
		}
		qe.close();
	}
	
	private static void importAndConvertSubPropertyOfMappings(Source source, Model outputModel, StringGenerator uriGenerator) {
		String query = "Select ?from ?to WHERE {" +
			"?from <" + RDFS.subPropertyOf.getURI() + "> ?to" +
			"}";
		QueryExecution qe = source.executeQuery(query);
		ResultSet rs = qe.execSelect();
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			RDFNode from = qs.get("from");
			RDFNode to = qs.get("to");
			if(from.isURIResource() && to.isURIResource()) {
				String uri = uriGenerator.nextString();
				String sourcePattern = "?SUBJ <" + from.toString() + "> ?o";
				String targetPattern = "?SUBJ <" + to.toString() + "> ?o";
				addR2RMapping(uri, sourcePattern, targetPattern, R2R.PropertyMapping, outputModel, false);
			}
		}
		qe.close();
	}
	
	private static void addR2RMapping(String uri, String sourcePattern, String targetPattern, String mappingClass, Model outputModel, boolean equivalenceMapping) {
		Resource res = outputModel.getResource(uri);
		res.addProperty(RDF.type, outputModel.createResource(mappingClass));
		res.addProperty(outputModel.createProperty(R2R.sourcePattern), sourcePattern);
		res.addProperty(outputModel.createProperty(R2R.targetPattern), targetPattern);
		res.addLiteral(outputModel.createProperty(R2R.equivalenceMapping), equivalenceMapping);
	}

	public Model executeConstructQuery(String query) {
		return source.executeConstructQuery(query);
	}

	public Map<String, Set<String>> getMappingMetaData(String mappingURI) {
		Map<String, Set<String>> metadata = new HashMap<String, Set<String>>();
		StringBuilder query = new StringBuilder();
		query.append("SELECT ?property ?value WHERE { <").append(mappingURI).append("> ?property ?value }");
		QueryExecution qe = source.executeQuery(query.toString());
		ResultSet rs = qe.execSelect();
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			RDFNode valueNode = qs.get("value");
			String value = null;
			if(valueNode.isURIResource())
				value = valueNode.toString();
			else if(valueNode.isLiteral())
				value = ((Literal)valueNode).getLexicalForm();
			if(value!=null)
				insertMetaData(metadata, qs.getResource("property").getURI(), value);
		}
		qe.close();
		return metadata;
	}

	private void insertMetaData(Map<String, Set<String>> metaData, String property, String value) {
		Set<String> values = metaData.get(property);
		if(values==null)
			values = new HashSet<String>();
		values.add(value);
		metaData.put(property, values);
	}

    public boolean exportRepositoryData(Writer out, String serializationFormat) {
        if(isExportableRepository()) {
            ((ExportableSource) source).exportMappings(out, serializationFormat);
            return true; }
        else
            return false;
    }

    public boolean exportRepositoryData(OutputStream out, String serializationFormat) {
        if(isExportableRepository()) {
            ((ExportableSource) source).exportMappings(out, serializationFormat);
            return true; }
        else
            return false;
    }

    public boolean exportRepositoryData(Writer out) {
        return exportRepositoryData(out, "N-TRIPLE");
    }

    public boolean exportRepositoryData(OutputStream out) {
        return exportRepositoryData(out, "N-TRIPLE");
    }

    public boolean isExportableRepository() {
        return source instanceof ExportableSource;
    }
}
