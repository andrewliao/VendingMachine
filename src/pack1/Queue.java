package pack1;

public class Queue {
	private char q[];//this array holds the queue
	private int putloc, getloc; //the put and get indices
	
	Queue (Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		for (int i = getloc; i < putloc; i++) {
			q[i] = ob.q[i];
		}
	}
	
	Queue(char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		
		for(int i = 0; i < a.length; i++) put(a[i]);
	}
	Queue (int size) {
		q = new char[size]; //allocate memory for the queue
		putloc = getloc = 0;
	}
	
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		q[putloc++] = ch;
	}
	
	//get a character from the queue
	char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		return q[getloc++];
	}
	
	
}
