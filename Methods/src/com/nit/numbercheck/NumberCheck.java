package com.nit.numbercheck;

class NumberCheck{
    int num1, num2, num3;
    NumberCheck(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        displayGreatestNumber();
        displayNumberType();
    }
    void displayGreatestNumber(){
        if(num1 == num2 && num1 == num3){
            System.out.println("\nAll are equal");
        } else{
            if(num1 > num2){
                if(num1 > num3) System.out.println("\nThe greatest number is " + num1);
                else System.out.println("\nThe greatest number is " + num3);
            } else if(num2 > num3) System.out.println("\nThe greatest number is " + num2);
            else System.out.println("\nThe greatest number is " + num3);
        }
        
    }
    void displayNumberType(){
        if(num1 < 0 && num2 < 0 && num3 <0) System.out.println("Entered numbers are negative numbers.");
        else if(num1 >= 0 && num2 >= 0 && num3 >= 0) System.out.println("Entered numbers are positive number.");
        else System.out.println("Entered numbers are mixed numbers.");
    }
}