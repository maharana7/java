package com.nit.tenprograms;

import java.util.Scanner;

public class TempArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of temperatures: ");
		int n = sc.nextInt();
		
		Double temp[] = new Double[n];
		
		System.out.print("Enter " + n + " temperatures in celsius: ");
		for(int i = 0; i < n; i++) {
			
			Double celsius = sc.nextDouble();
			double fahrenheit = celsiusToFahrenheit(celsius);
			
			temp[i] = fahrenheit;
			
		}
		
		for(Double d: temp) {
			System.out.print(d + " ");
		}
		
		sc.close();
		
	}
	
	private static Double celsiusToFahrenheit(Double celsius) {
		
		return (celsius * 9/5) + 32;
		
	}
	
}