package com.nit.logicalprograms;
import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

//		disariumCheck1(n);
		disariumCheck2(n);

		sc.close();

	}

	private static void disariumCheck1(int n) {

		int count = 0, sum = 0, temp = n;

		while (temp != 0) {
			count++;
			temp /= 10;
		}
		temp = n;

		while (n != 0) {
			sum += Math.pow(n % 10, count);
			n /= 10;
			count--;
		}

		if (temp == sum)
			System.out.println("Disarium Number");
		else
			System.out.println("Not Disarium Number");

	}

	private static void disariumCheck2(int n) {

		int sum = 0, t = n;
		int l = (int) Math.log10(n) + 1;

		while (n != 0) {

			int r = n % 10;
			int m = 1;

			for (int i = 1; i <= l; i++) {
				m = m * r;
			}

			l--;
			sum += m;
			n /= 10;
		}

		if (sum == t)
			System.out.println("Disarium Number");
		else
			System.out.println("Not Disarium Number");

	}
	
	private static void disariumCheck3(int n) {

		int sum = 0, t = n;
		int l = (int) Math.log10(n) + 1;

		while (n != 0) {

			int r = n % 10;
			int m = 1;

			for (int i = 1; i <= l; i++) {
				m = m * r;
			}

			l--;
			sum += m;
			n /= 10;
		}

		if (sum == t)
			System.out.println("Disarium Number");
		else
			System.out.println("Not Disarium Number");

	}

}
