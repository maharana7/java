package com.nit.gradefinder;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Student Name: ");
		String studentName = sc.nextLine();
		
		System.out.println("Enter Marks of Each Subject: ");
		System.out.print("Odia: ");
		int odia = sc.nextInt();
		System.out.print("English: ");
		int eng = sc.nextInt();
		System.out.print("Mathematics: ");
		int math = sc.nextInt();
		System.out.print("Physics: ");
		int phy = sc.nextInt();
		System.out.print("Chemistry: ");
		int che = sc.nextInt();
		System.out.print("Biology: ");
		int bio = sc.nextInt();
		
		Student studen1 = new Student(studentName, odia, eng, math, phy, che, bio);
		studen1.displayDetails();
		
		sc.close();
		
	}

}
