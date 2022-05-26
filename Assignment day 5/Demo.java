package com.masai;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No of Student :");
	
		int l = scan.nextInt();
		System.out.println("===========");
		
		Student[] array= new Student[l];
		for (int i =0;i<l;i++)
		{
			System.out.println("Enter details of student :"+(i+1));
			
			System.out.println("Enter roll no :");
			int x =scan.nextInt();
			
			System.out.println("Enter Name :");
			String s =scan.next();
			
			System.out.println("Enter Address :");
			String sA=scan.next();
			
			
			System.out.println("Enter marks");
			int y = scan.nextInt();
			
			
			array[i]= new Student();
			array[i].setName(s);
			array[i].setMarks(y);
			array[i].setAddress(sA);
			array[i].setRoll(x);
		}
		
		int avg = 0;
		for(int i =0;i<l;i++)
		{
			System.out.println("Details of Student:"+(i+1));
			
			System.out.println("Name: "+array[i].getName());
			
			System.out.println("Roll no :"+array[i].getRoll());
			
			System.out.println("Marks :" +array[i].getMarks());
			
			System.out.println("Address : "+array[i].getAddress());
			
			System.out.println("**************");
			avg+=array[i].getMarks();
		}
		System.out.println();
		System.out.println("Average of all Students"+avg/l);
		
	}

}
