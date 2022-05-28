package com.masai;

public class Main {

	public static void main(String[] args) {

		Member m1 = new Employee();
		Employee e1 = (Employee)m1;
		e1.specialization="Data compiling";
		e1.department = "HR department";
		m1.setName("Ramesh");
		m1.setAge(30);
		m1.setPhoneNumber("789456132");
		m1.setAddress("Haryana");
		m1.setSalary(7000.00);
	
		System.out.println("Employee Details :");
		System.out.println("Name :"+m1.getName());
		System.out.println("Age : "+m1.getAge());
		System.out.println("Phone :"+m1.getPhoneNumber());
		System.out.println("Address :"+m1.getAddress());
		m1.printSalary();
		System.out.println("Department :"+e1.department);
		System.out.println("Specialization :"+e1.specialization);
		
		Member m2 = new Manager();
		Manager manager = (Manager)m2;
		manager.specialization="Managing";
		manager.department = "Head";
		m2.setName("Somesh");
		m2.setAge(30);
		m2.setPhoneNumber("9999940400");
		m2.setAddress("Hyderabad");
		m2.setSalary(7860.00);
		
		System.out.println("=============");
		System.out.println("Manager Details :");
		System.out.println("Name :"+m2.getName());
		System.out.println("Age : "+m2.getAge());
		System.out.println("Phone :"+m2.getPhoneNumber());
		System.out.println("Address :"+m2.getAddress());
		m2.printSalary();
		System.out.println("Department :"+manager.department);
		System.out.println("Specialization :"+manager.specialization);
		
		
		
	}

}
