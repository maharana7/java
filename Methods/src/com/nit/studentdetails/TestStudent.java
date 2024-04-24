package com.nit.studentdetails;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();

		System.out.println("Enter Marks: ");
		String marks = sc.next();

		Student student1 = new Student();
		student1.setName(name);
		student1.setMarks(marks);

		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setStudent(student1);
		studentGrade.setStudentGrade(CalculateStudentGrade.calculateGrade(student1));
		System.out.println(studentGrade);

		sc.close();

	}

}
