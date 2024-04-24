package com.dev.practice;

import java.util.Scanner;

class CommonCharacters {
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First String: ");
        String firstString = sc.nextLine();
        System.out.print("Second String: ");
        String secondString = sc.nextLine();
        
        System.out.println("\nOutput: " + commonCharacters(firstString, secondString));
        
        sc.close();
        
    }
    
    static String commonCharacters(String firstString, String secondString){
        
        int l = Math.min(firstString.length(), secondString.length());
        String result = "";
        
        for(int i = 0; i < l; i++){
            if(firstString.charAt(i) == secondString.charAt(i)){
                result += firstString.charAt(i);
            }
            else break;
        }
        
        return result;
        
    }
    
}