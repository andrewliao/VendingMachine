package pack1;

public class Truck extends Vehicle{
	int passengers; 
	
	Truck() {
		super();
		passengers = 10;
	}
	
	int getPassengers() {
		return passengers;
	}
	
	int getPassengers2() {
		return super.passengers;
	}
}
