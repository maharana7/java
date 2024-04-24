package com.nit.tenprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleSum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Double num1 = 0.0, num2 = 0.0;
		
		try {
			System.out.print("Enter first number: ");
			num1 = sc.nextDouble();
			System.out.print("Enter second number: ");
			num2 = sc.nextDouble();
			System.out.print("Sum: " + (num1 + num2));
		} catch(InputMismatchException ne) {
			System.out.println("Enter double values only.");
		}
		
		sc.close();

		
	}
	
}
