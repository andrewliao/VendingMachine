package ds;

public class Stack {
	
	private Nodes start = null;
	
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
		Nodes creation = new Nodes();
		creation.setStore(object);
		if (start != null) {
			creation.setPointing(start);
		} 
		start = creation;
		
	}
	
	public Object getObject() {
		Nodes finish = new Nodes();
		finish = start;
		if (start.getPointing() != null) {
			start = start.getPointing();
		} else {
			start = null;
		}
		return finish.getStore();
	}
}
