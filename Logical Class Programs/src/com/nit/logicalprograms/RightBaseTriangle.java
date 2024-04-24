package com.nit.logicalprograms;
public class RightBaseTriangle {

	public static void main(String[] args) {
		
		PatternPrinter3 p3 = new PatternPrinter3();
		p3.printPattern(10);

	}

}

class PatternPrinter3{
	
	void printPattern(int n) {
		
		for(int i = 1; i <= 2*n-1; i++) {
			for(int j = 1; j <= n; j++) {
				if(j <= n-i || j <= i -n) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
