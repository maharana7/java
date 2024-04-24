package com.nit.logicalprograms;
import java.util.Scanner;

public class Test{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pattern p = new Pattern();
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(p.printPattern(n));
		
		sc.close();
	}
	
}


class Pattern {

	String printPattern(int n) {
		
		String res = "";
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
			}
			res += "\n";
		}
		
		return res;
		
	}

}
