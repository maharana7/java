package com.nit.employee;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First Name: ");
		String firstName = sc.nextLine();
		
		System.out.print("Last Name: ");
		String lastName = sc.nextLine();
		
		System.out.print("Employee Id: ");
		int empId = sc.nextInt();
		
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		
		System.out.print("No. of Projects: ");
		int noOfProjects = sc.nextInt();
		
		Employee employee = new Employee();
		employee.setEmployeeData(firstName, lastName, empId, salary, noOfProjects);
		
		System.out.println(employee.toString());
		
		sc.close();
		
	}
	
}
