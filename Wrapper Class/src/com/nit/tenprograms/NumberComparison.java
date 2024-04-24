package com.nit.tenprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberComparison {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		try {
			System.out.print("Enter first number: ");
			num1 = sc.nextInt();
			System.out.print("Enter second number: ");
			num2 = sc.nextInt();
			TestNumberComparison.comparator(num1, num2);
		} catch(InputMismatchException in) {
			System.out.println("Enter Integers only.");
		}
				
		sc.close();
		
	}
	
}

class TestNumberComparison{
	static void comparator(Integer num1, Integer num2) {
		
		Integer iNum1 = Integer.valueOf(num1);
		Integer iNum2 = Integer.valueOf(num2);
		
		System.out.println("Greater Number: " + Integer.max(iNum1,iNum2));
		
	}
}
