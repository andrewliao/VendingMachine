package pack1;

public class Lol {
	private int size;
	
	public Lol() {
		size = 0;
	}
	
	public Lol(int x) {
		size = x;
	}
	
	public Lol(Lol ob) {
		size = ob.size;
	}
	
	public void setSize(int y) {
		size = y;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getOther(Lol ob) {
		return ob.size;
	}
}
