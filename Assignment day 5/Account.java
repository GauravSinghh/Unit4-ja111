package com.masai;

import java.util.Scanner;

public class Account {

	private int accountId;
	private String accountType;
	private int balance;
	
	public Account() {
		
	}

	 public boolean withdraw(int x) {
		 if(x<=getBalance()) {
			int balLeft= getBalance()-x;
			 setBalance(balLeft);
			
			 System.out.println("Balance amount after withdraw: "+balLeft);
			
			 return true;
		 }else {
			 System.out.println("Sorry!!! No enough balance");
			 new AccountDetails().getWithdrawAmount(x);
			 return false;
		 }
		 
	 }

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>0) {
			this.balance = balance;
		}
		else 
		{
		System.out.println("Balance should be positive");
		System.out.println("Enter balance:");
		Scanner scan = new Scanner(System.in);
		balance = scan.nextInt();
		setBalance(balance);
		}
	}
}
