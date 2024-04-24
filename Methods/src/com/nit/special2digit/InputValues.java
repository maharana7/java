package com.nit.special2digit;

import java.util.Scanner;

public class InputValues {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number = ");
		int num = sc.nextInt();
		
		int temp = num, count = 0;
		while(temp != 0) {
			count++;
			temp/=10;
		}
		
		if(count == 2) new SpecialNumberCheck(num);
		else System.out.println("Enter a 2 digit number only.");
		
		sc.close();

	}

}
