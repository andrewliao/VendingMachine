package vendingmachine;

public class Chips {
	private static double cost = 1.50;
	private static int stock = 10;
	
	
	public static double getCost() {
		return cost;
	}

	
	public static int getStock() {
		return stock;
	}

	public static void setStock(int stock1) {
		stock = stock1;
	}
	
	
}
