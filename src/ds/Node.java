package ds;

public class Node {
	private Object storage;
	private Node next, prev;
	
	public Object getStorage() {
		return storage;
	}
	public void setStorage(Object storage) {
		this.storage = storage;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
