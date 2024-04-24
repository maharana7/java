package com.nit.tenprograms;

import java.util.Scanner;

public class ParseIntegers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = null, str2="";
		
		try {
			System.out.print("Enter first number: ");
			str1 = sc.next();
			Integer num1 = Integer.parseInt(str1);
			System.out.print("Enter second number: ");
			str2 = sc.next();
			Integer num2 = Integer.parseInt(str2);
			System.out.println(num1 + num2);
		} catch(NumberFormatException ne) {
			System.out.println("Enter numbers only.");
		}
		
		sc.close();
		
	}

}
