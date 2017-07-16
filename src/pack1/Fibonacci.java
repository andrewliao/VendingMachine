package pack1;

public class Fibonacci {
	/*
	public static int getValue(int numberInSequence) {
		if (numberInSequence == 1) {
			return 1;
		} else if (numberInSequence == 2) {
			return 1;
		} else {
			return getValue(numberInSequence-1) + getValue(numberInSequence-2);
		}
	
	}
	*/
	
	/*
	public static int getValue(int numberInSequence) {
		if (numberInSequence == 1 || numberInSequence == 2) {
			return 1;
		}
		

		int start = 1;
		int numberprev = 1; 
		int numbernext = 0;	
		 
		
		for (int i = 3; i <= numberInSequence; i++) {
			numbernext = start + numberprev;
			if (i == numberInSequence) {
				break;
			}
			start = numberprev;
			numberprev = numbernext;
			
		}
		return numbernext;
	}
	*/
	
	public static int getValue(int numberInSequence) {
		if (numberInSequence == 1 || numberInSequence == 2) {
			return 1;
		}
		
		int[] storage = new int[numberInSequence];
		for (int i = 0; i <= numberInSequence -1; i++) {
			if (i == 0 || i == 1) {
				storage[i] = 1;
			} else {
				storage[i] = storage[i-1] + storage[i-2];
			}
		
		}
		return storage[numberInSequence -1];
	}
}
