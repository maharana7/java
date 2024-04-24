package com.nit.logicalprograms;
import java.util.Scanner;

public class SwastikPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an odd number for a proper Swastika pattern: ");
		int n = sc.nextInt();
		
		SwastikPrinter.designSwastika(n);
		
		sc.close();

	}

}

class SwastikPrinter{
	
	static void designSwastika(int n)  {
		
        for (int i = 0; i < n; i++) {
        	
            for (int j = 0; j < n; j++) {
            	
                if(i == n/2 || j == n/2 || (i == 0 && j > n/2) || (j == 0 && i < n/2)
                		|| (i == n-1 && j < n/2) || (j == n-1 && i > n/2))
                	System.out.print("* ");
                
                else System.out.print("  ");
                
            }
            
            System.out.println();
        }  
        
    }  
	
}

