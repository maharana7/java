package com.nit.accessmodifiers2;

import com.nit.accesmodifiers.*;

public class Test3 {

	public static void main(String[] args) {
		
		System.out.println(Test.x);
//		System.out.println(Test.a); -->  private variable in class Test in accessmodifiers package
//		System.out.println(Test.b); -->  protected variable in class Test in accessmodifiers package
		Test t = new Test();
//		System.out.println(t.ch);   -->  instance variable declared in class Test in accessmodifiers package
		
	}
	
}
