package com.masai;
import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your employee Id");
		int empId = scanner.nextInt();
		System.out.println("Enter Your Name");
		String empName = scanner.next();
		System.out.println("Enter Your Salary");
		double empSalary = scanner.nextInt();
		System.out.println("Enter PF percentage");
		int pf = scanner.nextInt();
		
		Employee obj1=getEmployeeDetails(empId, empName, empSalary);
		
		
		int p=getPFPercentage(pf);
		
		obj1.calculateNetSalary(p);
	
		System.out.println("Id :"+obj1.getEmployeeId());
		System.out.println("Name : "+obj1.getEmployeeName());
		System.out.println("Salary : "+obj1.getSalary());
		
		System.out.println("Net Salary : "+obj1.getNetSalary());
	}
	 public static Employee getEmployeeDetails(int employeeId,String employeeName,  double salary) {

		 Employee emp1 = new Employee();
		 emp1.setEmployeeId(employeeId);
		 emp1.setEmployeeName(employeeName);
		 emp1.setSalary(salary);
		 return emp1;
		 
	 }
	 public static int getPFPercentage(int pfpercentage) {
		 return pfpercentage;
	 }

}
