package pack1;

public class LogicalOpTable {
	public static void main(String[] args) {
		
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q)+ "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = true; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q)+ "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q)+ "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q)+ "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		int x = 3;
		int y = 4;
		Person a = new Person();
		a.setLastName("Ma");
		int z = test1(x, y, a);
		System.out.println(x);
		System.out.println(y);
		System.out.println(a.getLastName());
	}
	
	private static int test1(int x, int y, Person p) {
		x = x*x;
		y = y*y;
		p.setLastName("Liao");
		p = new Person();
		p.setLastName("Winters");
		return x+y;
	}
}
