package pack1;

public class GalToLitTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print conversions beginning with 1 gallon and ending with 100 gallons
		double gallons, liters;
		//after each 10 gallons a blank line has to be the output
		int counter = 0;
		for (int i = 1; i <= 100; i++) {
			gallons = i;
			liters = gallons * 3.7854;
			counter++;
			System.out.println(gallons + " gallons is equal to " + liters + " liters.");
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}

}
