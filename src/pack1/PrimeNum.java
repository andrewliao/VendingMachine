package pack1;

public class PrimeNum {
	public static void main(String[] args) {
		for (int i = 3; i < 100; i++) {
			int count = 0;
			//this is to find if the number is prime
			for (int j =2; j < i; j++) {
				if ((i % j) == 0) {
					count++;
				}
			}
			//if greater than 1 or greater it means that the number is not a prime
			//also print out the number of factors for each number between 2 and 100 exclusive
			if (count == 0) {
				System.out.println("The number " + i + " is a prime number!");
			}
			
			if (count > 0) {
				System.out.println("The number " + i + " is not a prime. It has " + (count + 2) + " factors.");
			}
			
		}
	}
}
