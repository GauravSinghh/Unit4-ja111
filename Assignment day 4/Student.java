package com.masai;

public class Student {
	private int roll;
	private String name;
	private int age;
	private  int marks;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
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

	public int getMarks() {
		
		return marks;
	
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int roll, String name, int age, int marks) {
	
		if((marks>0&marks<500)||(age>18&age<60))
		{
			this.roll= roll;
			this.name= name;
			this.marks = marks;
			this.age = age;
			
		}
		else
		{
			System.out.println("Enter valid age or marks");

		}
	
	}
	
	
	public Student() {
		
	}

	public void showDetails(){
		if((marks>0&marks<500)||(age>18&age<60))
		{
			System.out.println("Roll is :"+roll);
			System.out.println("Name is :"+name);
			System.out.println("Marks is :"+marks);
			System.out.println("Age is : "+age);
		}
		else
		{
			System.out.println("Enter valid age or marks");

		}
		
		}

}
