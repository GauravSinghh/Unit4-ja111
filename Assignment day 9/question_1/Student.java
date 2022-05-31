package question_1;
import java.util.*;
public class Student {

	private   int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + calculateGrade() + "]";
	}
	
	public void displayDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student roll no");
		int id = sc.nextInt();
		
		System.out.println("Enter student name");
		String sName =sc.next();
		
		System.out.println("Enter Student marks");
		int sMarks=sc.nextInt();
		
		Student s1 = new Student(id,sName, sMarks);
		
		System.out.println(s1);
		//System.out.println(calculateGrade());
	}
	
	private  char calculateGrade() {
		
		if (marks >= 500)
			{
			return 'A';
					}
		else if (marks < 500 && marks >= 400)
			{
			return 'B';
		
			}
		else if(marks<400){
			return 'C';
		
		}
		else {
			return 'F';
		}
		
		
	}
	public Student() {
	
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		
	}
	
	
}
