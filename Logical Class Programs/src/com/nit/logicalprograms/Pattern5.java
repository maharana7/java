package com.nit.logicalprograms;

public class Pattern5 {

	public static void main(String[] args) {
		
		int n = 5;
		int x = n, y = n;
		
		for(int i = 1; i <= n*2 - 1; i++) {
			for(int j = 1; j <= n*2 - 1; j++) {
				if(j >= x && j <= y) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if(i < n) {
				x--;
				y++;
			} else {
				++x;
				--y;
			}
			System.out.println();
		}

	}

}
