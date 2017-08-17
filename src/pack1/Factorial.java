package pack1;

public class Factorial {
	public static int start;
	
	int FactR(int n) {
		int result;
		if (n == 1) {
			return 1;
		} 
		result = n * FactR(n-1);
		return result;
	}
	
	int FactI(int n) {
		int t, result;
		
		result = 1;
		for (t = 1; t <= n; t++) {
			result *= t;
		}
		
		return result;
	}
	
	static {
		System.out.println("This is the static block!");
		start = 1;
	}
}
