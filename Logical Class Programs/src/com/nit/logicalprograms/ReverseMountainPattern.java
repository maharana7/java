package com.nit.logicalprograms;
public class ReverseMountainPattern {
	public static void main(String[] args) {
		PatternPrinter p1 = new PatternPrinter();
		p1.printPattern(5);
	}
}

class PatternPrinter{
	void printPattern(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 2*n-1; j++) {
				if(j > i && j < 2*n-i)System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
	}
}
