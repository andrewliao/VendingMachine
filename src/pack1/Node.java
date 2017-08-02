package pack1;

public class Node {
	private int data;
	private Node left;
	private Node right;
	
	public Node(int n) {
		data = n;
		left = null;
		right = null;
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
