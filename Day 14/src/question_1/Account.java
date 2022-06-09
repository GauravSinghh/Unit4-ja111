package question_1;

public class Account {

	String accountNumber;
	double balance;
	
	void deposit( double amount) {
		balance=amount;
	}
	
	double withdraw( double amount) throws InsufficientFundsException {
		 if(balance>=amount)
		 {
			 double x = balance-amount;
			 balance= x;
		
			 return x;
		 }
		 else {
			 InsufficientFundsException ife = new InsufficientFundsException("Insufficient funds");
			 throw ife;
		 }
	
	}
	

	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
