package com.nit.employee;

public class Employee {

	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public void setEmployeeData(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
		calculateSalary();
	}
	
	public void calculateSalary() {
		if(noOfProject > 5 && noOfProject < 10) salary += 5000;
		else if(noOfProject > 10 && noOfProject < 20) salary += 10000;
		else salary += 15000;
	}
	
	public String toString() {
		return "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nEmployee Id: " + employeeId + "\nNo of Projects: " + noOfProject + "\nSalary: " + salary;
	}
	
}
