package oclass;

public class Node {
	private int data;
	private Node left;
	private Node right;
	
	public Node() {
		data = 0;
	}
	
	public Node(int n) {
		data = n;
		left = null;
		right = null;
	}
	
	public void setData(int n) {
		this.data = n;
	}
	public int getData() {
		return this.data;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
	
	public Node getRight() {
		return right;
	}
	
	
}
