package question_2;

import java.util.Scanner;

public class UserRegistration {

	void registerUser(String username,String userCountry) throws InvalidCountryException {
		if(userCountry.equalsIgnoreCase("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the username");
		String user = scan.next();
		
		System.out.println("Enter your country");
		String country = scan.next();
		
		UserRegistration ur = new UserRegistration();
		
		try {
			ur.registerUser(user, country);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
