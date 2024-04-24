package com.nit.taskprograms;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Customer Name: ");
		String customerName = sc.nextLine();
		System.out.print("Product Name: ");
		String productName = sc.nextLine();
		System.out.print("Size: ");
		String size = sc.next();
		sc.nextLine();
		System.out.print("Color: ");
		String color = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();		
		
		LouisPhilippe product1 = new LouisPhilippe(customerName, productName, size, color, price, quantity);
		
		product1.printDetails();
		
		sc.close();

	}

}

