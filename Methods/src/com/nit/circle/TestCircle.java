package com.nit.circle;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radius = ");
		float radius = sc.nextFloat();
		
		new Circle(radius);
		
		sc.close();

	}

}
