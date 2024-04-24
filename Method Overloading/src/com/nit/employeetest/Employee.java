package com.nit.employeetest;

public class Employee {

	private String name;
	private int age;
	private String department;
	private double salary;
	private String performance;
	static int employeeCount = 0;
	
	public Employee(String name, int age, String department, double salary, String performance) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.performance = performance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	public double updateSalary() {
		if(performance == "good") {
			getBonusCount("good");
			return salary += 10000;
		}
		else if(performance == "average") {
			getBonusCount("average");
			return salary += 5000;
		}
		else if(performance == null) return salary += 0;
		return salary;
	}
	
	static void getBonusCount(String performance) {
		if(performance == "good" || performance == "average") {
			employeeCount++;
		}
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Deva" , 23, "Production", 20000, "good");
		Employee e2 = new Employee("Ravi" , 25, "Testing", 26000, "average");
		Employee e3 = new Employee("Shiva" , 27, "Development", 23000, null);
		
		System.out.println("e1 salary: " + e1.updateSalary());
		System.out.println("e2 salary: " + e2.updateSalary());
		System.out.println("e3 salary: " + e3.updateSalary());
		
		System.out.println("Total Employees received bonus: " + employeeCount);
		
	}
	
	
}
