package com.nit.datatypes;

public class TestDatatype {

	public static void main(String[] args) {
		
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40;
		float e = 50;
		double f = 60;
		char g = 70;
		
		String h = "";
		
		System.out.println("Byte Parameter Method");
		m1(a);
//		m1(b);
//		m1(c);
//		m1(d);
//		m1(e);
//		m1(f);
//		m1(g);
//		m1(h);
		
		System.out.println("\nShort Parameter Method");		
		m2(a);
		m2(b);
//		m2(c);
//		m2(d);
//		m2(e);
//		m2(f);
//		m2(g);
//		m2(h);
		
		System.out.println("\nInt Parameter Method");		
		m3(a);
		m3(b);
		m3(c);
//		m3(d);
//		m3(e);
//		m3(f);
		m3(g);
//		m3(h);
		
		System.out.println("\nLong Parameter Method");		
		m4(a);
		m4(b);
		m4(c);
		m4(d);
//		m4(e);
//		m4(f);
		m4(g);
//		m4(h);
		
		System.out.println("\nFloat Parameter Method");		
		m5(a);
		m5(b);
		m5(c);
		m5(d);
		m5(e);
//		m5(f);
		m5(g);
//		m5(h);
		
		System.out.println("\nDouble Parameter Method");		
		m6(a);
		m6(b);
		m6(c);
		m6(d);
		m6(e);
		m6(f);
		m6(g);
//		m6(h)

		System.out.println("\nCharacter Parameter Method");		
//		m7(a);
//		m7(b);
//		m7(c);
//		m7(d);
//		m7(e);
//		m7(f);
		m7(g);
//		m7(h);
		
		System.out.println("\nString Parameter Method");		
//		m8(a);
//		m8(b);
//		m8(c);
//		m8(d);
//		m8(e);
//		m8(f);
//		m8(g);
		m8(h);
		
		
	}
	
	public static void m1(byte a) {
		System.out.println("m1 executed");
	}
	
	public static void m2(short b) {
		System.out.println("m2 executed");
	}
	
	public static void m3(int c) {
		System.out.println("m3 executed");
	}
	
	public static void m4(long d) {
		System.out.println("m4 executed");
	}
	
	public static void m5(float e) {
		System.out.println("m5 executed");
	}
	
	public static void m6(double f) {
		System.out.println("m6 executed");
	}
	
	public static void m7(char g) {
		System.out.println("m7 executed");
	}
	
	public static void m8(String h) {
		System.out.println("m8 executed");
	}
	
}
