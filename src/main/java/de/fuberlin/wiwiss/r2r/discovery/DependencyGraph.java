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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.LinkedList;

import de.fuberlin.wiwiss.r2r.R2R;

/**
 * A dependency graph of vocabulary elements that embeds a dependency graph of mappings
 * @author andreas
 *
 */
public class DependencyGraph {
	//TODO: Needs refactoring/rewrite!
	// The node with the mappings that produce the target vocabulary element
	public static MappingRanker ranker = new ExampleRanker(); 
	private VocabularyNode root;
	private String targetDataset;
	private String sourceDataset;
	private Set<VocabularyNode> sourceNodes;
	private Map<String, VocabularyNode> nodes;
	private String targetVocabularyTerm;
	Map<TargetMappingCluster, TargetMappingCluster> targetClusters;
	// The clusters a mapping is member of (generates the target element & dataset combination)
	Map<String, Set<TargetMappingCluster>> clustersOfMapping;  
	Set<String> sourceSatisfiableMappings = null;
	MetaDataCatcher mappingMetadataCatcher; //TODO: remove from this class
	
	public DependencyGraph(VocabularyNode root, String targetVocabularyTerm, String sourceDataset, String targetDataset, Map<String, VocabularyNode> allNodes, Set<VocabularyNode> sourceNodes, MetaDataCatcher mdc) {
		super();
		this.root = root;
		this.sourceNodes = sourceNodes;
		this.sourceDataset = sourceDataset;
		this.nodes = allNodes;
		this.mappingMetadataCatcher = mdc;
		this.targetDataset = targetDataset;
		this.targetVocabularyTerm = targetVocabularyTerm;
	}
	
	public String getTargetVocabularyTerm() {
		return targetVocabularyTerm;
	}

	public VocabularyNode getRoot() {
		return root;
	}

	public Set<VocabularyNode> getSourceNodes() {
		return sourceNodes;
	}
	
	public Map<String, VocabularyNode> getNodes() {
		return nodes;
	}

	/**
	 * marks nodes which are satisfiable beginning from the source nodes 
	 */
	public void assertSatisfiability() {
		LinkedList<VocabularyNode> openQueue = new LinkedList<VocabularyNode>();
		openQueue.addAll(sourceNodes);
		while(!openQueue.isEmpty()) {
			VocabularyNode node = openQueue.poll();
			for(VocabularyNode consumerNode: node.getConsuments()) {
				if(!consumerNode.isSatisfiable()) {
					boolean nowSatisfiable = consumerNode.addSatisfiableDependency(node.getTargetElement());
					if(nowSatisfiable) {
						openQueue.add(consumerNode);
						consumerNode.setMinDistanceToSourceDataset(node.getMinDistanceToSourceDataset()+1);
					}
				}
				else
					consumerNode.addSatisfiableDependency(node.getTargetElement());
			}
		}
	}
	
	// The mapping can be directly run on the Source
	private boolean mappingIsSourceSatisfiable(MappingMetaData metaData) {
		for(String dependency: metaData.getValuesForProperty(R2R.dependsOn)) {
			if(nodes.get(dependency).getMinDistanceToSourceDataset()==0)
				return true;
		}
		return false;
	}
	
	/**
	 * removes all the nodes in the tree that could not be satisfied
	 */
	public void removeUnsatisfiableNodesAndMappings() {
		Iterator<Map.Entry<String, VocabularyNode>> iterator = nodes.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, VocabularyNode> node = iterator.next();
			if(!node.getValue().isSatisfiable())
				iterator.remove();
			else {
				// node is ok, but remove unsatisfiable mappings
				node.getValue().removeUnsatisfiableMappings();	
			}					
		}
	}
	
	public void removeIrrelevantNodes() {
		LinkedList<VocabularyNode> openQueue = new LinkedList<VocabularyNode>();
		// if root is unsatisfiable do nothing
		if(root==null)
			return;
		openQueue.add(root);
		Set<VocabularyNode> relevantNodes = new HashSet<VocabularyNode>();
		relevantNodes.add(root);
		while(!openQueue.isEmpty()) {
			VocabularyNode node = openQueue.poll();
			if(node.getMappings()==null)
				continue;
			for(MappingMetaData mmd: node.getMappings().values()) {
				for(String depNodeURI: mmd.getValuesForProperty(R2R.dependsOn)) {
					VocabularyNode depNode = nodes.get(depNodeURI);
					if(depNode!=null && !relevantNodes.contains(depNode)) {
						relevantNodes.add(depNode);
						openQueue.add(depNode);
					}
				}
			}
		}
		removeAllNodesNotInSet(relevantNodes);
	}
	
	/**
	 * builds the best mapping composition(s) with a maximum depth
	 * @param depth the maximum depth of the mapping composition
	 * @param datasetChecker for checking for source vocabulary terms
	 * @return
	 */
	public MappingChain buildBestMappingComposition(int depth, DatasetChecker datasetChecker) {
		Set<TargetMappingCluster> openQueue = getSourceClusters();
		
		while(depth-- > 0) {
			Set<TargetMappingCluster> nextOpenQueue = new HashSet<TargetMappingCluster>();
			
			Set<String> mappings = getAllMappingsOfClusters(openQueue);
			for(String mapping: mappings) {
				double mappingScore = rateMapping(mapping);
	
				for(TargetMappingCluster cluster: clustersOfMapping.get(mapping)) {
					if(cluster.updateMapping(mapping, mappingScore))
						nextOpenQueue.add(cluster);
				}
			}
			
			openQueue = nextOpenQueue;
		}
		
		MappingChainNode root = getBestMappingChain(datasetChecker);
		double score = 0.0;
		if(root!=null)
			score = root.getScore();
		MappingChain mapChain = new MappingChain(root, sourceDataset, targetDataset, targetVocabularyTerm, score);
		
		return mapChain;
	}
	
	private Set<String> getAllMappingsOfClusters(Set<TargetMappingCluster> clusters) {
		Set<String> mappings = new HashSet<String>();
		
		for(TargetMappingCluster cluster: clusters) {
			mappings.addAll(cluster.getDependendMappings());
		}
		return mappings;
	}
	
	private MappingChainNode getBestMappingChain(DatasetChecker datasetChecker) {
		TargetMappingCluster rootCluster = getCluster(root.getTargetElement(), targetDataset);
		if(rootCluster==null)
			return null;
		
		String bestRootMapping = rootCluster.currentBestMapping;
		if(bestRootMapping==null)
			return null;
		else
			return buildMappingChain(rootCluster, root.getTargetElement(), datasetChecker, 0);
	}
	
	private MappingChainNode buildMappingChain(TargetMappingCluster cluster, String targetVocabularyTerm, DatasetChecker datasetChecker, int depth) {
		String mapping = cluster.currentBestMapping;
		MappingMetaData mappingMetedata = mappingMetadataCatcher.getMetaDataForMapping(mapping);
		Set<String> dependencies = mappingMetedata.getValuesForProperty(R2R.dependsOn);
		String sourceDataset = null;
		
		if(!(mappingMetedata.getValuesForProperty(R2R.sourceDataset)==null))
			sourceDataset = mappingMetedata.getValuesForProperty(R2R.sourceDataset).iterator().next();
		
		MappingChainNode mChain = new MappingChainNode(mapping, targetVocabularyTerm, depth, cluster.currentBestScore);
		
		for(String termDep: dependencies) {
			TargetMappingCluster clusterDep = getCluster(termDep, sourceDataset);
			boolean isClass = datasetChecker.containsClass(termDep);
			// If cluster has no mapping then it must be a source node
			if(isSourceCluster(clusterDep))
				mChain.setSourceDependency(termDep, isClass);
			else 
				mChain.setMappingDependency(termDep, buildMappingChain(clusterDep, termDep, datasetChecker, depth+1));
		}
		
		return mChain;
	}
	
	private boolean isSourceCluster(TargetMappingCluster cluster) {
		return (cluster.getCurrentBestMapping()==null && cluster.currentBestScore > 0.5);
	}
	
	private double rateMapping(String mapping) {
		MappingMetaData metaData = mappingMetadataCatcher.getMetaDataForMapping(mapping);
		double score = ranker.rankMapping(metaData);
		
		Set<String> dependencies = metaData.getValuesForProperty(R2R.dependsOn);
		Set<String> sDs = metaData.getValuesForProperty(R2R.sourceDataset);
		
		String sourceDataset = null;
		if(sDs!=null)
			sourceDataset = sDs.iterator().next();
		
		for(String dependency: dependencies) {
			TargetMappingCluster cluster = getCluster(dependency, sourceDataset);
			score *= cluster.getCurrentBestScore();
		}
		return score;
	}
	
	public void createMappingClustersAndDependencies() {
		Map<String, MappingMetaData> mappings = getAllMappingsFromNodes();
		targetClusters = new HashMap<TargetMappingCluster, TargetMappingCluster>();
		clustersOfMapping = new HashMap<String, Set<TargetMappingCluster>>();
		if(sourceSatisfiableMappings==null)
			setSourceSatisfiableMappings();
		
		for(Map.Entry<String, MappingMetaData> mapping: mappings.entrySet()) {
			MappingMetaData metaData = mapping.getValue();
			Set<String> sd = metaData.getValuesForProperty(R2R.sourceDataset);
			Set<String> td = metaData.getValuesForProperty(R2R.targetDataset);
			String sourceDataset = ( sd==null ? null : sd.iterator().next() );
			String targetDataset = ( td==null ? null : td.iterator().next() );

			for(String dependency: metaData.getValuesForProperty(R2R.dependsOn)) {
				TargetMappingCluster targetCluster = getCluster(dependency, sourceDataset);
				if(sourceSatisfiableMappings.contains(mapping.getKey()))
					targetCluster.updateMapping(null, 1.0);
				targetCluster.addDependendMapping(mapping.getKey());
			}
			
			for(String targetElement: metaData.getValuesForProperty(R2R.mapsTo)) {
				if(!nodes.containsKey(targetElement))
					continue;
				
				TargetMappingCluster targetCluster = getCluster(targetElement, targetDataset);
				addClusterToMapping(mapping.getKey(), targetCluster);
			}
		}
	}
	
	/**
	 * Get the mapping URIs that can be directly run on the Source
	 * @return
	 */
	public Set<String> getSourceSatisfiableMappings() {
		if(sourceSatisfiableMappings==null)
			setSourceSatisfiableMappings();
		return sourceSatisfiableMappings;
	}
	
	/**
	 * generate the Set that holds the source satisfiable mappings
	 */
	@Deprecated
	public void setSourceSatisfiableMappings() {
		sourceSatisfiableMappings = new HashSet<String>();
		for(VocabularyNode node: nodes.values()) {
			if(node.getMinDistanceToSourceDataset()==1) {
				for(Map.Entry<String, MappingMetaData> mapping: node.getMappings().entrySet()) {
					if(mappingIsSourceSatisfiable(mapping.getValue()))
						sourceSatisfiableMappings.add(mapping.getKey());
				}
			}
		}
	}
	
	private Set<TargetMappingCluster> getSourceClusters() {
		Set<TargetMappingCluster> sourceClusters = new HashSet<TargetMappingCluster>();
		Set<VocabularyNode> vNodes = getSourceNodes();
		
		for(VocabularyNode sNode: vNodes) {
			setSourceCluster(sourceClusters, sNode, sourceDataset);
			
			if(sourceDataset!=null)
				setSourceCluster(sourceClusters, sNode, null);
		}
		
		return sourceClusters;
	}

	private void setSourceCluster(Set<TargetMappingCluster> sourceClusters,
			VocabularyNode sNode, String sourceDataset) {
		TargetMappingCluster cluster = getCluster(sNode.getTargetElement(), sourceDataset);
		cluster.currentBestMapping = null;
		cluster.currentBestScore = 1.0;
		sourceClusters.add(cluster);
	}
	
	public Map<TargetMappingCluster, TargetMappingCluster> getTargetClusters() {
		return targetClusters;
	}

	public Map<String, Set<TargetMappingCluster>> getClustersOfMapping() {
		return clustersOfMapping;
	}

	private void addClusterToMapping(String mapping, TargetMappingCluster cluster) {
		Set<TargetMappingCluster> clusterSet = clustersOfMapping.get(mapping);
		if(clusterSet==null) {
			clusterSet = new HashSet<TargetMappingCluster>();
			clustersOfMapping.put(mapping, clusterSet);
		}
		clusterSet.add(cluster);
	}
	
	private TargetMappingCluster getCluster(String vocabElementURI, String datasetURI) {
		TargetMappingCluster targetCluster = new TargetMappingCluster(vocabElementURI, datasetURI);
		if(targetClusters.get(targetCluster)==null)
			targetClusters.put(targetCluster, targetCluster);
		else
			targetCluster = targetClusters.get(targetCluster);
		
		return targetCluster;
	}
	
	private void removeAllNodesNotInSet(Set<VocabularyNode> relevantNodes) {
		Iterator<Map.Entry<String, VocabularyNode>> iterator = nodes.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, VocabularyNode> node = iterator.next();
			if(!relevantNodes.contains(node.getValue()))
				iterator.remove();
		}
	}
	
	public Map<String, MappingMetaData> getAllMappingsFromNodes() {
		Map<String, MappingMetaData> mappings = new HashMap<String, MappingMetaData>();
		for(VocabularyNode node: nodes.values()) {
			if(node.getMappings()!=null)
				mappings.putAll(node.getMappings());
		}
		return mappings;
	}
}
