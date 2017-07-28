package ds;

public class Queue {
	private Node start = null;
	private Node end = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue test = new Queue();
		
		test.putObject(new Integer(10));
		test.putObject(new Integer(20));
		System.out.println(test.getObject());
		test.putObject(new Integer(5));
		System.out.println(test.getObject());
		System.out.println(test.getObject());
		test.putObject(new Double(5.005));
		test.putObject(new Boolean(true));
		System.out.println(test.getObject());
	}
	
	public void putObject(Object object) {
		Node test = new Node();
		test.setStorage(object);
		if (start == null) {
			start = test;
		}
		if (end != null) {
			end.setPoint(test);
		}
		end = test;
		
	}
	
	public Object getObject() {
		Node returning = new Node();
		returning = start;
		
		if (end != null) {
			start = start.getPoint();
		} else {
			start = null;
		}
		
		return returning.getStorage();
	}

}
