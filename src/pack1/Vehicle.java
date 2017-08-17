package pack1;

public class Vehicle {
	 int passengers;
	private int fuelcap;
	private int mpg;
	
	Vehicle() {
		passengers = 0;
		fuelcap = 0;
		mpg = 0;
	}
	//this is a constructor for Vehicle
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	//display the range
	int range() {
		return mpg * fuelcap;
	}
	
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

