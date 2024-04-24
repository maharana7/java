/* Fascinating number, 273 
 * 
 * 273 * 1 = 273
 * 273 * 2 = 546
 * 273 * 3 = 819
 * 
 * concatenate all, 273546819, then the if the concatenated number contains all digits from 1 - 9 only once,
 * then it is a fascinating number.
 * 
 */

import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();

		fascinatingNumberCheck1(n);
		
//		fascinatingNumberCheck2(n);
		
		sc.close();

	}

	private static void fascinatingNumberCheck1(int n) {

		String x = "";
		int l = (int) (Math.log10(n) + 1);

		for (int i = 1; i <= l; i++) {
			x = x + (n * i);
		}

		if (x.length() == 9) {
			long a = Long.parseLong(x);
			boolean flag = true;
			
			for(int i = 1; i <= 9; i++) {
				long b = a;
				int c = 0;
				while(b != 0) {
					if(b % 10 == i) {
						c++;
					}
					b /= 10;
				}
				if(c != 1) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("It is a fascinating number.");
			}
				
			
		}
		

	}
	
	private static void fascinatingNumberCheck2(int m) {

		for(int k = 1; k <= m; k++) {
			
			int n = k, d = 0;
			
			String x = "";
			int l = (int) (Math.log10(n) + 1);

			for (int i = 1; i <= l; i++) {
				x = x + (n * i);
			}

			if (x.length() == 9) {
				long a = Long.parseLong(x);
				while (a != 0) {
					int c = 0;
					for (int i = 1; i <= 9; i++) {
						if (a % 10 == i) {
							c++;
						}
					}
					if (c != 1) {
						d = 1;
					}
					a /= 10;
				}
				if(d == 0) System.out.println(k + " ");
			} 
			
		}

	}

}
