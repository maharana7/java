package com.nit.logicalprograms;
public class MountainPattern {
	public static void main(String[] args) {
		Pattern2 p1 = new Pattern2();
		p1.printPattern(5);
	}
}

class Pattern2{
	void printPattern(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 2*n-1; j++) {
				if(j <= i || j >= 2*n-i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
