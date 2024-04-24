package com.nit.logicalprograms;
public class TrianglePattern3 {
	public static void main(String[] args) {
		PrintPattern p1 = new PrintPattern();
		p1.printPattern(5);
	}
}

class PrintPattern{
	void printPattern(int n) {
		for(int i = n; i >= 1; i--) {
			int x = n-i;
			int y = n+i;
			for(int j = 2*n-1; j >= 1; j--) {
				if(j > x && j < y) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
