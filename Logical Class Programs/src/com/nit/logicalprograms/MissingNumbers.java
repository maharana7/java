package com.nit.logicalprograms;

public class MissingNumbers {

	public static void main(String[] args) {
		
		missingNumbers(5298);
		
	}
	
	public static void missingNumbers(int n) {
		
		int t = n;
		
		int min = n % 10;
		int max = n % 10;
		
		while(t != 0) {
			if(max < t%10)
				max = t % 10;
			if(min > t%10)
				min = t % 10;
			
			t /= 10;
		}
		
		for(int i = min; i < max; i++) {
			boolean flag = false;
			int x = n;
			while(x != 0) {
				if(i == x%10) {
					flag = true;
					break;
				}
				x /= 10;
			}
			if(flag == false)
				System.out.print(i + " ");
		}
		
	}
	
}
