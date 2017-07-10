package pack1;

import math.Math;

public class Apreview {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Person son1 = new Person("liao", "andrew", "abcde", "111-22-3333");
		System.out.println(son1);
		
		Person son2 = new Person();
		son2.setFirstName("Brian");
		son2.setLastName("Liao");
		System.out.println(son2);
		System.out.println(son2.getId());
		
		son1 = son2;
		
		System.out.println(son1);
		
		new Person();
		new Person();
		
		int x = 2;
		double y = 0.22;
		
		System.out.println(Math.PI);
		
		System.out.println(son1.getCounter());
	}
}
