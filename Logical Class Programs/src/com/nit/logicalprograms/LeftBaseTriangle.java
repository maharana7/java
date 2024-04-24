package com.nit.logicalprograms;
public class LeftBaseTriangle {
	public static void main(String[] args) {
		PatternPrinter1 p1 = new PatternPrinter1();
		p1.printPattern(5);
	}
}

class PatternPrinter1{
	void printPattern(int n) {
		for(int i = 1; i <= 2*n-1; i++) {
			for(int j = 1; j <= n; j++) {
				if(i <= n) {
					if(j <= i) System.out.print("*");
				}else {
					if(j <= 2*n-i) System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
