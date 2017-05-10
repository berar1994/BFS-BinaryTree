package ro.geo.bfs.main;

import ro.geo.bfs.compute.BFSAlgorithm;
import ro.geo.bfs.entity.Tree;
import ro.geo.bfs.util.BFSUtil;

public class Main {
	
	
	public static void main(String[] args){	
		Tree binaryTree = BFSUtil.createBinaryTree();
		BFSAlgorithm.compute(binaryTree);
	}
	
}
