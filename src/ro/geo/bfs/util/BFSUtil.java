package ro.geo.bfs.util;

import ro.geo.bfs.entity.Node;
import ro.geo.bfs.entity.Tree;

public class BFSUtil {
	
	
	public static Tree createBinaryTree(){
		Tree binaryTree = new Tree();
		
		Node root = new Node(5);
		root.setLeftChild(new Node(10));
		root.setRightChild(new Node(15));
		root.getLeftChild().setLeftChild(new Node(20));
		root.getLeftChild().setRightChild(new Node(25));
		root.getRightChild().setLeftChild(new Node(30));
		root.getRightChild().setRightChild(new Node(35));
		
		binaryTree.setRoot(root);
		return binaryTree;
	}
	
}
