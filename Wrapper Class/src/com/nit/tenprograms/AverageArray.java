package com.nit.tenprograms;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double marks[] = new Double[6];
		
		System.out.print("Enter 6 subject marks: ");
		for(int i = 0; i < 6; i++) {
			marks[i] = sc.nextDouble();
		}
		
		System.out.println("Average: " + calculateAverage(marks));
		
		sc.close();
		
	}
	
	static Double calculateAverage(Double[] arr) {
		
		Double sum = 0.0;
		
		for(int i = 0; i < 6; i++) {
			sum += arr[i];
		}
		
		return sum/6;	
				
	}
	
}