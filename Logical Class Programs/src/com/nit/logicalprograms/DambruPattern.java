package com.nit.logicalprograms;
public class DambruPattern {

	public static void main(String[] args) {
		
		DambruPrinter p3 = new DambruPrinter();
		p3.printPattern(9);

	}

}

class DambruPrinter{
	
	void printPattern(int n) {
		n++;
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < n; j++) {
				if((j > i && j < n-i) || (j > n-i && j < i))
					System.out.print("  ");
				else System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}
