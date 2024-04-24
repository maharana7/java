package com.nit.studentdetails;

public class CalculateStudentGrade {
	
	public static char calculateGrade(Student student) {
		int marks = Integer.parseInt(student.getMarks());
		
		if(marks > 90) return 'A';
		else if(marks >= 75) return 'B';
		else if(marks >= 60) return 'C';
		else return 'F';
		
	}
	
}
  