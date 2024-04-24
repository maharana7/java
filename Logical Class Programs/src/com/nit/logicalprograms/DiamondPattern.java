package com.nit.logicalprograms;
public class DiamondPattern {

	public static void main(String[] args) {
		
		DiamondPrinter diamond1 = new DiamondPrinter();
		diamond1.diamondPrinter(15);

	}

}

class DiamondPrinter{
	
	void diamondPrinter(int n) {
		
		int x = (n/2) + 1, y = x;		
		for(int i = 1; i <= n; i++) {
			if(i <= (n/2)+1) {
				for(int j = 1; j <= n; j++) {
					if(j >= x && j <= y) 
						System.out.print("* ");
					else System.out.print("  ");
				}
				x--; y++;
			}
			else {
				x++; y--;
				for(int j = 1; j <= n; j++) {
					if(j > x && j < y) 
						System.out.print("* ");
					else System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
	}
	
}
