package com.nit.tenprograms;

import java.util.Scanner;

public class StringToBoolean {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a boolean value(true/false): ");
		String str = sc.next();
		
		System.out.println(stringToBoolean(str));
		

		sc.close();
		
	}
	
	static boolean stringToBoolean(String str) {
		
		Boolean bool = Boolean.valueOf(str);
		
		return bool;
		
	}

}
