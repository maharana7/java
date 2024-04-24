package com.nit.logicalprograms;

import java.util.Scanner;

public class EmptyDiamondPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an odd number: ");
		int n = sc.nextInt();
		
		EmptyDiamondPrinter diamond1 = new EmptyDiamondPrinter();
		diamond1.diamondPrinter(n);
		diamond1.diamondPrinter2(n);

		sc.close();
		
	}

}

class EmptyDiamondPrinter{
	
	void diamondPrinter(int n) {
		
		int i , j, x = (n/2)+1, y = x;
		for(i = 1; i <= n/2; i++) {
			for(j = 1; j <= n; j++) {
				if(j > x && j < y) System.out.print("  ");
				else System.out.print("* ");
			}
			x--;
			y++; 
			System.out.println();
		}
		for(i = n/2; i < n; i++) {
			for(j = 1; j <= n; j++) {
				if(j > x && j < y) System.out.print("  ");
				else System.out.print("* ");
			}
			x++;
			y--;
			System.out.println();
		}
	}
		
	void diamondPrinter2(int n) {
			
		int i , j, x = (n/2)+1, y = x;
		for(i = 1; i <= n; i++) {
			if(i <= (n/2)+1) {
				for(j = 1; j <= n; j++) {
					if(j > x && j < y) System.out.print("  ");
					else System.out.print("* ");
				}
				x--;
				y++; 
				System.out.println();
				if(x == 0 && y == n+1) {
					x+=2;
					y-=2;
				}
			}
			else {
				for(j = 1; j <= n; j++) {
					if(j > x && j < y) System.out.print("  ");
					else System.out.print("* ");
				}
				x++;
				y--;
				System.out.println();
			}
			
		}
			
	}
	
}
