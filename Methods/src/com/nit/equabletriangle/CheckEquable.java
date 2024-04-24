package com.nit.equabletriangle;

class CheckEquable {
	
	int side1;
	int side2;
	int side3;
	
	CheckEquable(int side1, int side2, int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		printTriangle();
	}
	
	boolean checkEquable(double area, double perimeter) {
		if(area == perimeter) return true;
		else return false;
	}
	double triangleArea() {
		double s = (side1 + side2 + side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	double trianglePerimeter() {
		return side1 + side2 + side3;
	}
	
	void printTriangle() {
		if(checkEquable(triangleArea(), trianglePerimeter())) System.out.println("\nEquable Triangle");
		else System.out.println("\nNot Equable Triangle");
	}
	
}
