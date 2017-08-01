package oclass;

public class Node {
	int data;
	Node left;
	Node right;
	
	public Node() {
		data = 0;
		left = null;
		right = null;
	}
	
	public Node(int n) {
		this.data = n;
		left = null;
		right = null;
	}

	public void setLeft(Node child) {
		this.left = child;
	}
	
	public void setRight(Node child) {
		this.right = child;
	}
	
	

}
