package com.nit.logicalprograms;
public class CommandLine{
    
    public static void main(String[] args){
        
        Calculator2 c1 = new Calculator2();
        
//        System.out.print("Number1 = ");
        c1.num1 = Integer.parseInt(args[0]);
//        System.out.print("Number2 = ");
        c1.num2 = Integer.parseInt(args[1]);
        
        System.out.println("Sum = " + c1.findSum(c1.num1, c1.num2));
        System.out.println("Difference = " + c1.findDifference(c1.num1, c1.num2));
        System.out.println("Product = " + c1.findProduct(c1.num1, c1.num2));
        System.out.println("Quotient = " + c1.findQuotient(c1.num1, c1.num2));
        
    }
    
}

class Calculator2{
    
    int num1, num2;
    
    public int findSum(int num1, int num2){
        return num1+num2;
    }
    
    public int findDifference(int num1, int num2){
        return num1-num2;
    }
    
    public int findProduct(int num1, int num2){
        return num1*num2;
    }
    
    public int findQuotient(int num1, int num2){
        return num1/num2;
    }
    
}