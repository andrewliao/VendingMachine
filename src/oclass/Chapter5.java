package oclass;

public class Chapter5 {
	public static void main(String[] args) {
		//arrays can be declared as both int[] name or int name[]
		//former is used when you are declaring a method or when there are multiple of the same type of arrays being initialized
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < 10; i++) sum += nums[i];
		System.out.println(sum);
		
		//1111111111why is it no nums[]
		int sumEach = 0;
		for (int i: nums) sumEach += i;
		System.out.println(sumEach);
		
		String[] cool = new String[3];
		cool[0] = "cool";
		cool[1] = "cool";
		cool[2] = "cool";
		
		for (String x: cool) x = "nah";
		for (String x: cool) System.out.println(x);
		for (int i = 0; i < 3; i++) cool[i] = "nah";
		for (String x : cool) System.out.println(x);
		
		int summing = 0;
		int nums2[][] = new int[3][5];
		
		//gives nums2 some values
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				nums2[i][j] = (i + 1) * (j + 1);
			}
		}
		
		//use for-each loop to display and sum the values.
		for (int x[] : nums2) {
			for (int y: x) {
				System.out.println("value is " + y);
				summing += y;
			}
		}
		
		System.out.println("Summation is " + summing);
		
		//222222222question on references pg.159 look at new String(str)
		String str1 = "coolio";
		String str2 = "nah";
		String str3 = str2;
		str3 = str2;
		String str4 = new String(str2);
		System.out.println(str2);
		System.out.println(str3);
		//strings cannot be changed, only the references are changed special type of object
		
		boolean comparison = str3 == str2;
		System.out.println(comparison);
		boolean comparison2 = str4 == str2;
		System.out.println(comparison2);
		
		//bitwise operators
		char  ch;
		for (int i = 0; i < 10; i++) {
			ch = (char) (('A') + i);
			System.out.print(ch);
			ch = (char) (ch | 32);
			System.out.print(ch + " ");
		}
		
			
		//try to encode messages to bit and make a bit converter
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		int key = 88;
		
		System.out.print("Original message: ");
		System.out.println(msg);
		
		//encode the message
		for (int i = 0; i < msg.length(); i++) {
			encmsg += (char) (key ^ msg.charAt(i));
		}
		
		System.out.print("The encoded message: ");
		System.out.println(encmsg);
		
		//decode the message
		for (int i = 0; i < msg.length(); i++) {
			decmsg += (char) (encmsg.charAt(i) ^ key);
		}
		
		System.out.print("The decode message: ");
		System.out.println(decmsg);
		
		
	}
}
