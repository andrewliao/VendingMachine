import java.io.IOException;
import java.util.*;

public class Vending {

	public static void main(String[] args) 
		throws java.io.IOException {
		Scanner console = new Scanner(System.in);

			intro();

			//entering a correct input, trying to input the first choice
			char choice = 'a', deleting = 'b';
			choice = input(console, choice, deleting);
			money(choice);
	}
	
	public static void intro() {
		//what the vending machine will say
		System.out.println("What would you like to purchase?");
		System.out.println("We have Soda(1), Chips(2), and Candy(3).");
		System.out.println("Please input the number of your choice.");
	}
	
	
	public static char input(Scanner console, char choice, char deleting) 
	throws java.io.IOException {
		//entering a correct input
				do {
					choice = (char) System.in.read();
					do {
						deleting = (char) System.in.read();
					} while(deleting != '\n');
					
					if (!(choice == '1' || choice == '2' || choice == '3')) {
						System.out.println("You have inputed the wrong thing! Try Again.");
						
					}
				} while  (!(choice == '1' || choice == '2' || choice == '3'));
		
				return choice;		
	}
	
	public static void money(char choice) throws IOException {
		if (choice == '1') {
			if (Soda.getStock() == 0) {
				System.out.println("Sorry, we are out of stock.");
				
			}
			if (Soda.getStock() != 0) {
				System.out.println("The soda cost $" + Soda.getCost() + ". Please pay into the slot below.(Currently you can see " + Soda.getStock() + " cans of soda in the rack)");
				System.out.println("Your return amount is $"+ change(choice) +". (Now you can see " + Soda.getStock() + " cans of soda in the rack)");
			}
		}
		
		if (choice == '2') {
			if (Chips.getStock() == 0) {
				System.out.println("Sorry, we are out of stock.");
			}
			if (Chips.getStock() != 0) {
				System.out.println("The chips cost $" + Chips.getCost() + ". Please pay into the slot below. (Currently you can see " + Chips.getStock() + " bags of chips in the rack)");
				System.out.println("Your return amount is $"+ change(choice) +". (Now you can see " + Chips.getStock() + " bags of chips in the rack)");
			}
		}
		
		if (choice == '3') {
			if (Candy.getStock() == 0) {
				System.out.println("Sorry, we are out of stock.");
			}
			if (Candy.getStock() != 0) {
				System.out.println("The candy cost $" + Candy.getCost() + ". Please pay into the slot below. (Currently you can see " + Candy.getStock() + " bars of candy in the rack)");
				System.out.println("Your return amount is $"+ change(choice) +". (Now you can see " + Candy.getStock() + " bars of candy in the rack)");
			}
		}
	}
	
	
	public static double change(char choice) 
	throws java.io.IOException {
		double foodCost;
		if (choice == '1') {
			foodCost = Soda.getCost();
		} else if (choice == '2') {
			foodCost = Chips.getCost();
		} else {
			foodCost = Candy.getCost();
		}
		double amount = 0;
		char value;
		System.out.println("We only accept dollar bills!");
		do {
			value = (char) System.in.read();
			
			if (value >= 49 && value <= 57) {
				amount += (value - 48);
			}
		
		} while(value != '\n');
		
		System.out.println("You have $" + amount + " in credit.");
		
		if (foodCost > amount) {
			System.out.println("Sorry that is not the correct amount.");
			return amount;
		}
		
		
		amount = amount - foodCost;
		
		if (choice == '1') {
			Soda.setStock(Soda.getStock() - 1);
		} else if (choice == '2') {
			Chips.setStock(Chips.getStock() - 1);
		} else {
			Candy.setStock(Candy.getStock() - 1);
		}
		
		return amount;	
		
	}
	

}
