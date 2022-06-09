package question_2;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		EmployeeBonus eb = new EmployeeBonus();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yy format");
		String joinD = scan.next();
		try {
			double bonus = eb.getBonus(joinD);
			System.out.println("Employee will get bonus of : "+bonus);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("application ended normally");
	}
}
