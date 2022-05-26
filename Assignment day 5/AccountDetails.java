package com.masai;

import java.util.*;
public class AccountDetails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account acc = new Account();
		System.out.println("Enter account id:");
		int acId = scan.nextInt();
		acc.setAccountId(acId);
		
		System.out.println("Enter account type:");
		String acType = scan.next();
		acc.setAccountType(acType);
		
		System.out.println("Enter balance:");
		int acBal = scan.nextInt();
		acc.setBalance(acBal);
		
		
		System.out.println(" Enter amount to be withdrawn:");
		int acWithdraw = scan.nextInt();
		 acc.withdraw(acWithdraw);
		 
		
//		AccountDetails accDl =new AccountDetails();
//		Object obj = accDl.getAccountDetails();
//		
		// new AccountDetails().getWithdrawAmount(acWithdraw);
	
	
	
	
	}
	
	public Account getAccountDetails() {
		Account account = new Account();
			return account;
   }
	
	
	public int getWithdrawAmount(int value) {
		if(value<0)
		System.out.println("Amount should be positive");
		return value;
	}
}
