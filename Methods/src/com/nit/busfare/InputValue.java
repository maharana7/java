package com.nit.busfare;

import java.util.Scanner;

public class InputValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Distance: ");
		int distance = sc.nextInt();
		
		new BusFareCalculator(distance);
		
		sc.close();

	}

}