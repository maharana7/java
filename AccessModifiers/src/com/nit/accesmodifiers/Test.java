/*
 	
Modifier	Class	Package	  Subclass	 World
public		  Y		  Y		     Y		   Y
protected	  Y		  Y			 Y		   N
default		  Y		  Y			 N		   N
private		  Y		  N			 N		   N
  
*/

package com.nit.accesmodifiers;

public class Test {

	public static int x = 10;
	private static double a = 20.7;
	protected static byte b = 120;
	char ch = 'A';  //default
	
	public static void main(String[] args) {
		
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		Test t = new Test();
		System.out.println(t.ch);
		
	}
	
}
