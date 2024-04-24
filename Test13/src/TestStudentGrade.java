import java.util.Scanner;

public class TestStudentGrade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name ");
		String name = sc.nextLine();
		System.out.println("Marks");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		
		StudentGrad st1 = new StudentGrad(name, sub1, sub2, sub3, sub4, sub5);
		System.out.println(st1.toString());
		
		sc.close();
	}

}

class StudentGrad{
	
	String studentName;
	int sub1, sub2, sub3, sub4, sub5;
	int totalMarks;
	char grade;
	public StudentGrad(String studentName, int sub1, int sub2, int sub3, int sub4, int sub5) {
		super();
		this.studentName = studentName;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		calculateGrade();
	}
	
	void calculateGrade() {
		this.totalMarks = sub1+sub2+sub3+sub4+sub5;
		int avg = totalMarks/5;
		if(avg >= 90) grade = 'A';
		else if(avg >=80 ) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else if(avg >= 40) grade = 'E';
		else grade = 'F';
	}
	
	public char getGrade() {
		return grade;
	}
	
	public String toString() {
		return "Name: " + studentName + "\nMarks:\n " + sub1 + " " + sub2 + " " + sub3 + " " + sub4 + " " + sub5 + "\nTotal Marks " + totalMarks
				+ "\nGrade: " + grade;
	}
	
}
