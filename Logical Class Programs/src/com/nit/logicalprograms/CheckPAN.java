package com.nit.logicalprograms;
import java.util.Scanner;

public class CheckPAN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter lower limit: ");
		int lowerLimit = sc.nextInt();
		System.out.println("Enter upper limit: ");
		int upperLimit = sc.nextInt();
		
		checkPan(lowerLimit, upperLimit);

	}

	private static void checkPan(int lowerLimit, int upperLimit) {

		for (int i = lowerLimit; i <= upperLimit; i++) {
			if (isPrimeNumber(i) && isUnique(i))
				System.out.print(i + " ");
		}
		System.out.println();
		for (int i = lowerLimit; i <= upperLimit; i++) {
			if (isPrimeNumber(i) && isUnique2(i))
				System.out.print(i + " ");
		}

	}

	private static boolean isPrimeNumber(int n) {

		int c = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				c++;
				break;
			}
		}
		if (c == 0)
			return true;
		else
			return false;

	}

	private static boolean isUnique(int n) {

		String s = "" + n;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					break;
				}
			}
		}
		if (count == 0)
			return true;
		else
			return false;

	}

	private static boolean isUnique2(int n) {
		
		for (int i = 0; i <= 9; i++) {

			int t = n;
			int c = 0;
			
			while (t != 0) {
				if (i == t % 10)
					c++;
				t /= 10;
			}
			
			if (c != 1 && c != 0) {
				return false;
			}

		}
		return true;

	}

}
