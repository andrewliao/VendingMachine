package oclass;

import java.util.LinkedList;

public class FDemo {
	private LinkedList list = new LinkedList(); 
	int x;
	
	FDemo(int i) {
		x = i;
	}
	
	//called when when object is recycled
	protected void finalize() {
		System.out.println("Finalizing " + x);
	}
	
	//generates an object that is immediately destroyed
	void generator(int i) {
		FDemo o = new FDemo(i);
		list.add(o);
	}
}
