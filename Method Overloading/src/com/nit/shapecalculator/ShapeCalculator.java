package com.nit.shapecalculator;

public class ShapeCalculator {

	static int calculateArea(int sideLength) {
		return sideLength*sideLength;
	}
	
	static int calculateArea(int length, int width) {
		return length*width;
	}
	
	static double calculateArea(double radius) {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		System.out.println("Square Area: "+ calculateArea(5));
		System.out.println("Rectangle Area: " + calculateArea(7, 4));
		System.out.println("Circle Area: " + calculateArea(4.0));
	}
	
}