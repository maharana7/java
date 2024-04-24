package com.nit.circle;

public class Circle {
	
	float radius;
	
	Circle(float radius){
		this.radius = radius;
		findDiameter();
		findCircumference();
		findArea();
		circleDetails();
	}
	
	float findDiameter() {
		return radius*2;
	}
	
	float findCircumference() {
		return (float) (2 * Math.PI* radius);
	}
	
	float findArea() {
		return (float)(Math.PI * radius * radius);
	}
	
	void circleDetails() {
		System.out.println("\nRadius = " + radius);
		System.out.println("Diameter = " + findDiameter());
		System.out.println("Circumference = " + findCircumference());
		System.out.println("Area = " + findArea());
	}
	
}
