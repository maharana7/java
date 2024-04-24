package com.nit.accessmodifiers2;

import com.nit.accesmodifiers.*;

public class Test4 extends Test{

	public static void main(String[] args) {
		
		System.out.println(x);
//		System.out.println(a); --> private variable in class Test in accessmodifiers package
		System.out.println(b);
		Test t = new Test();
//		System.out.println(t.ch); --> default instance variable in class Test in accessmodifiers package
		
	}
	
}
