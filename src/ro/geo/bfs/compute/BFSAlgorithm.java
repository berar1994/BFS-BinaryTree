package ro.geo.bfs.compute;

import java.util.LinkedList;
import java.util.Queue;

import ro.geo.bfs.entity.Node;
import ro.geo.bfs.entity.Tree;

public class BFSAlgorithm {
	
	public static void compute(Tree binaryTree){
		Queue<Node> queue = new LinkedList<>();
		
		if(binaryTree.getRoot() == null)
			return;
		
		System.out.println("BFS");
		
		queue.add(binaryTree.getRoot());
		
		while(!queue.isEmpty()){
			Node node = (Node) queue.poll();
			System.out.print(node.getValue() + " ");
			
			if(node.getLeftChild() != null)
				queue.add(node.getLeftChild());
			
			if(node.getRightChild() != null)
				queue.add(node.getRightChild());
		}
		
	}
	
}
