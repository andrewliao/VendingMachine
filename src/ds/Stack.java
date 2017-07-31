package ds;

public class Stack {
	
	private Node tail = null;
	
	public static void main(String[] args) {
		Stack test = new Stack();
		
		test.putObject(new Integer(10));
		test.putObject(new Integer(20));
		System.out.println(test.getObject());
		test.putObject(new Integer(5));
		System.out.println(test.getObject());
		System.out.println(test.getObject());
		test.putObject(new Double(5.005));
		test.putObject(new Boolean(true));
	}
	
	public void putObject(Object object) {
		Node creation = new Node();
		creation.setStorage(object);
		if (tail != null) {
			creation.setPrev(tail);
		} 
		tail = creation;
		
	}
	
	public Object getObject() {
		Node finish = new Node();
		finish = tail;
		if (tail.getPrev() != null) {
			tail = tail.getPrev();
		} else {
			tail = null;
		}
		return finish.getStorage();
	}
}
