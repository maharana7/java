package com.nit.logicalprograms;

public class Y {

	String name = "Java";
	int a = -1;
	
	public int m1() {
		System.out.println(a++ + ++a);
		return ++a;
	}
	
	public static void m2(String name, int a) {
		
		System.out.println(name);
		new Y().a++;
		int m1 = new Y().m1();
		System.out.println(m1);
		System.out.println(a);
		
	}
	
	public String m3() {
		
		System.out.println("M3 called...");
		m2(name, m1());
		return name;
		
	}
	
	public static void main(String[] args) {
		Y y = new Y();
		y.a = y.a++ + ++y.a;
		String m3 = y.m3();
		System.out.println(m3);
		
	}

}
