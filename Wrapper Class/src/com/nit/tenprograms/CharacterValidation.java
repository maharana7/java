package com.nit.tenprograms;

import java.util.Scanner;

public class CharacterValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		
		System.out.println(Character.isDigit(ch));
		
		sc.close();
		
	}
	
}
