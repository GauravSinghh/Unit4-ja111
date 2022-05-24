package com.masai;

public class StudentMain {

	
	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setName("Gaurav");
		std1.setRoll(01);
		std1.setMarks(800);
		std1.setAge(5);
		System.out.println("Student1 details: ");
		std1.showDetails();
		
		System.out.println("=======");
		System.out.println("Student2 details :");
		Student std2 = new Student(03,"Dino",400,20);
		if(std2.getName()!=null)
		{
			System.out.println("Roll is :"+ std2.getRoll());
			System.out.println("Name is :"+std2.getName());
			System.out.println("Marks is :"+std2.getMarks());
			System.out.println("Age is : "+std2.getAge());
		
		}
		}
}
