package oclass;

public class Bubble {
	public static void main(String[] args) {
		//in bubble sort smallest element of each pass is on the bottom at the end, only guarantee
		int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int a, b, t;
		int size;
		
		size = 10; //number of elements to sort
		
		//display original array
		System.out.print("Original array is:");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + nums[i]);
		}
		System.out.println();
		
		//This is the Bubble sort.
		for (a = 1; a < size; a++) {
			System.out.println(a + "round:");
			for (b = size -1 ; b >= a; b--) {
				if (nums[b-1] > nums[b]) {
					//exchange elements
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
					System.out.print(nums[b-1]);
					System.out.println("\t" + nums[b]);
				}
			}
		}
		
		//display the sorted array
		System.out.print("Sorted array is:");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + nums[i]);
		}
		System.out.println();
	}
}
