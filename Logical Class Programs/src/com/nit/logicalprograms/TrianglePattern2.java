package com.nit.logicalprograms;
public class TrianglePattern2 {
	public static void main(String[] args) {
		PatternPrint p1 = new PatternPrint();
		p1.printPattern(5);
	}
}

class PatternPrint{
	void printPattern(int n) {
		for(int i = 1; i <= n; i++) {
			int x = n-i;
			int y = n+i;
			for(int j = 1; j <= n*2-1; j++) {
				if(j > x && j < y) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
