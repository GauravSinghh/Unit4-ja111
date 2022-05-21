package com.masai;

public class Student {

	 int roll;
	 String name;
	 int marks;
	
	 
	 void displayStudentDetails() {
		 System.out.println("Roll is : "+roll);
		 System.out.println("Name is : " +name);
		 System.out.println("Marks is : "+marks);
	 }
	public static void main(String[] args) {
		Student obj1 = new Student();
		Student obj2 = new Student();
		obj1.roll= 1212;
		obj1.name = "Gaurav";
		obj1.marks = 350;
		
		obj2.roll= 1234;
		obj2.name = "ravi";
		obj2.marks = 450;
		
		obj1.displayStudentDetails();
		System.out.println("-----------------");
		obj2.displayStudentDetails();
		
		obj1= null;
		obj2= null;
		

	}

}
