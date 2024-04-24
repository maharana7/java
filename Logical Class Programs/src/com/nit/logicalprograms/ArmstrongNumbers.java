package com.nit.logicalprograms;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10000; i++) {
			isArmstrongNumber(i);
		}

	}
	
	protected static void isArmstrongNumber(int n) {
		
		int t = n;
		int l = (int)Math.log10(n)+1;
		
		int sum = 0;
		
		while(n != 0) {
			
			int r = n % 10;
			int m = 1;
			
			for(int i = 1; i <= l; i++) {
				m *= r;
			}
			
			sum += m;
			n /= 10;
			
		}
		
		if(sum == t) System.out.print(t + " ");
		
		
	}

}
