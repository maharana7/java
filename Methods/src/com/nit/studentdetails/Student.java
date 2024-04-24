package com.nit.studentdetails;

public class Student {
	
	private String name;
	private String marks;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMarks() {
		return marks;
	}
	
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "Student Name: " + name +"\nMarks: " + marks;
	}
	
}
