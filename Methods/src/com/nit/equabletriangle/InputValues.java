package com.nit.equabletriangle;

import java.util.Scanner;

public class InputValues {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter side 1: ");
		int side1 = sc.nextInt();
		System.out.print("Enter side 2: ");
		int side2 = sc.nextInt();
		System.out.print("Enter side 3: ");
		int side3 = sc.nextInt();
		
		new CheckEquable(side1, side2, side3);
		
		sc.close();

	}

}
