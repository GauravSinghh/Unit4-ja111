package com.masai;

public class Main {
	public static void main(String[] args) {
		//Student std1 = new Student();
		Student obj =Student.getStudent(false);
		System.out.println(obj.getName());
		System.out.println(obj.getAddress());
		System.out.println(obj.getRoll());
		System.out.println(obj.getCollageName());
		System.out.println("=======");
		
		//Student std2 = new Student();
		Student obj2=Student.getStudent(true);
		System.out.println(obj2.getName());
		System.out.println(obj2.getAddress());
		System.out.println(obj2.getRoll());
		System.out.println(obj2.getCollageName());
		
	}

}
