package com.nit.logicalprograms;
import java.util.Scanner;

public class AutomorphicNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
//		automorphicCheck1(n);
//		automorphicCheck2(n);
		automorphicCheck3(n);

		sc.close();
		
	}
	
	public static void automorphicCheck1(int n) {
		
		int sqr = n * n;
		
		int temp = n, count = 0;
		while(temp != 0) {
			count++;
			temp/=10;
		}
		
		int n2 = 1;
		while(count != 0) {
			n2*=10;
			count--;
		}
		
		if((sqr%n2) == n) System.out.println("Automorphic");
		else System.out.println("Not Automorphic");
	}
	
	public static void automorphicCheck2(int n) {
		
		int sq = n *n;
		boolean flag = true;
		while(n != 0) {
			if(n % 10 != sq % 10) {
				flag = false;
				break;
			}
			n/=10;
			sq/=10;
		}
		
		if(flag)System.out.println("Automorphic");
		else System.out.println("Not Automorphic");
		
	}
	
	public static void automorphicCheck3(int num) {
	
		for(int i = 1; i <= num; i++) {
			
			int n = i;
			int sq = n *n;
			boolean flag = true;
			while(n != 0) {
				if(n % 10 != sq % 10) {
					flag = false;
					break;
				}
				n/=10;
				sq/=10;
			}
			
			if(flag)System.out.print(i + " ");
			
		}
			
	}

}
