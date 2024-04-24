package com.nit.calculator;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double firstNumber = sc.nextDouble();

		System.out.print("Enter the second number: ");
		double secondNumber = sc.nextDouble();

		System.out.print("Choose an operation(+,-,*,/): ");
		char ch = sc.next().charAt(0);

		Calculator cal1 = new Calculator(firstNumber, secondNumber);

		switch (ch) {
		case '+':
			System.out.print("\nAddition is: " + cal1.addition());
			break;
		case '-':
			System.out.print("\nSubtraction is: " + cal1.subtraction());
			break;
		case '*':
			System.out.print("\nProduct is: " + cal1.product());
			break;
		case '/':
			System.out.print("\nDivision is: " + cal1.division());
			break;
		default:
			System.out.print("\nPlease choose a valid operation.");
		}

		sc.close();

	}

}
