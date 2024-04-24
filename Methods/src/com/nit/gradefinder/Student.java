package com.nit.gradefinder;

class Student {

	String studentName;
	double percentage;
	char grade;
	int sub1, sub2, sub3, sub4, sub5, sub6, totalMarks;
	
	Student(String studentName, int sub1, int sub2, int sub3, int sub4, int sub5, int sub6) {
		this.studentName = studentName;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
	}
	
	void calculatePercentage() {
		totalMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		percentage = totalMarks/6.0;
	}
	
	char findGrade() {
		if(percentage >= 90) return 'A';
		else if(percentage >= 80) return 'B';
		else if(percentage >= 70) return 'C';
		else if(percentage >= 60) return 'D';
		else if(percentage >= 40) return 'E';
		else return 'F';
	}
	
	void displayDetails() {
		calculatePercentage();
		System.out.println("\nStudent Name: " + studentName);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Secured Percentage: " + percentage);
		System.out.println("Grade: " + findGrade());
	}
	
}
