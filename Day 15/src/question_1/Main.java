package question_1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import java.time.format.DateTimeFormatter;

public class Main {

	int getAge(String dob) throws InvalidDateFormat {
		LocalDate ld = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate nld = LocalDate.parse(dob, dtf);
			Period diff = Period.between(nld, ld);
			if (diff.getDays() >= 0) {
				// System.out.println(diff.getDays()+" "+ diff.getMonths()+" "+diff.getYears());
				return diff.getYears();
			} else {

				return diff.getYears();
			}

		} catch (Exception e) {
			InvalidDateFormat ide = new InvalidDateFormat("Invalid Date format, enter properly!");
			throw ide;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Date of Birth as dd/mm/yyyy");
		String dob = scan.next();
		Main m = new Main();

		try {
			int age = m.getAge(dob);
			if (age > 0) {

				System.out.println("Age of the user is : " + age + " Years");
			} else {
				System.out.println("Date should not be in future!");
			}

		} catch (InvalidDateFormat e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println("app terminated normally");
	}
}
