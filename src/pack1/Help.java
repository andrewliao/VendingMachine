package pack1;

public class Help {
	public static void main(String[] args) 
	throws java.io.IOException {
		
		System.out.println("Help on :");
		System.out.println("\t1. if");
		System.out.println("\t2. switch");
		System.out.println("Choose one:");
		
		char choice = (char) System.in.read();
		char x = (char) System.in.read();
		
		switch(choice) {
			case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println("\tcase constant:");
				System.out.println("\tstatement sequence");
				System.out.println("\tbreak");
				System.out.println("   // ...");
				System.out.println("}");
				break;
			default: 
				System.out.println("Selection not found.");
		}
		if (x == '\n') {
			System.out.println("I stored return!");
		}
	}
}
