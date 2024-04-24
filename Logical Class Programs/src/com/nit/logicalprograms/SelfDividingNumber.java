package com.nit.logicalprograms;

public class SelfDividingNumber {

	public static void main(String[] args) {
		
		selfDividingNumberCheck(838);

		//190238045706`
		
	}
	
	public static void selfDividingNumberCheck(int n) {
		
		int t = n;
		boolean flag = true;
		
		while(t != 0) {
			if(n % (t%10) != 0) {
				flag = false;
				break;
			}
			t /= 10;
		}
		
		if(flag) System.out.println("Self dividing number");
		else System.out.println("Not self dividing number");
		
	}

}
