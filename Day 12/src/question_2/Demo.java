package question_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		
		System.out.println("Enter your mobile number");
		String num = scan.next();
		
		System.out.println("Enter your aadhar number");
		String aadhar = scan.next();
		
		boolean valid = new Demo().validate(name, num, aadhar);
		if(valid)
		{
			Citizen c = new Citizen(name, aadhar, num);
			System.out.println("Name :"+c.getName());
			System.out.println("Number : "+c.getMobileNumber());
			System.out.println("Aadhar number :"+c.getAadharNumber());
		}
		else {
			System.out.println("Wrong credentials");
		}
		
	}
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		boolean x =Pattern.matches("[a-zA-z]{3,6}", name);
		boolean y =Pattern.matches("[0-9]{12}", aadharCard);
		boolean z=Pattern.matches("[6789]{1}[0-9]{9}", mobileNum); 	 	
		if(x==true&&y==true&&z==true)
		{
			return true;
		}
		else {
			return false;
		}
	
	}
}
