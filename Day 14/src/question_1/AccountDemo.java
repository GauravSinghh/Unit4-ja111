package question_1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args)  {
		System.out.println("Welcome to your account");
		 System.out.println("--------------------");
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter account number");
		 String accNumber = scan.next();
		 Account acc = new Account(accNumber);
		 
		 System.out.println("Enter the amount to be deposited");
		 double deposit = scan.nextDouble();
		 acc.deposit(deposit);
		 
		 System.out.println("Enter the amount to be withdrawn");
		 double withdraw = scan.nextDouble();
		 
		double balLeft;
		try {
			balLeft = acc.withdraw(withdraw);
			 System.out.println("Amount withdrawn : "+withdraw);
			 System.out.println("balance left : "+balLeft);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
			
		 
		 System.out.println("--------------------");
		 System.out.println("Thank you for using our service!!");
		
	}
}
