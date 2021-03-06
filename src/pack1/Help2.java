package pack1;

public class Help2 {
	public static void main(String[] args) 
	throws java.io.IOException {
		
		char choice, ignore;
		
		do {
			System.out.println("Help on :");
			System.out.println("\t1. if");
			System.out.println("\t2. switch");
			System.out.println("\t3. for");
			System.out.println("\t4. while");
			System.out.println("\t5. do while\n");
			System.out.println("Choose one:");
			
			choice = (char) System.in.read();
			
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		} while (choice < '1' || choice > '5');
		
		
	
		
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
			case '3':
				System.out.println("The for:\n");
				System.out.println("for(init; condition; iteration)");
				System.out.println("\tstatement");
				break;
			case '4':
				System.out.println("The while:\n");
				System.out.println("while(condition) statement;");
				break;
			case '5':
				System.out.println("The do-while:\n");
				System.out.println("do {");
				System.out.println("\tstatement;");
				System.out.println("} while (condition);");
				break;			
		}
		
	}
}
