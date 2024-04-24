package com.nit.special2digit;

public class SpecialNumberCheck {

	int num;
	int sum;
	int product;
	
	SpecialNumberCheck(int num){
		this.num = num;
		sumOfDigits();
		productOfDigits();
		printSpecialNumber();
	}
	
	void sumOfDigits() {
		sum = (num % 10) + (num / 10);
	}
	
	void productOfDigits() {
		product = (num % 10) * (num / 10);
	}
	
	boolean specialNumberCheck() {
		if((sum+product) == num) return true;
		else return false;
	}
	
	void printSpecialNumber() {
		if(specialNumberCheck()) System.out.println("\nSpecial 2-digit number");
		else System.out.println("\nNot a special 2-digit number");
	}
	
}
