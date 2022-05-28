package question_4;

public class ICICIBank extends Bank {

	double rateOfInterest;

	@Override
	void displayDetails() {
		System.out.println("Branch Name : icici" +getBranchName());
		System.out.println("IFSC code :" +this.IfscCode);
		System.out.println("Rate of Interest :"+this.rateOfInterest);
		
		//super.displayDetails();
	}
	
	
	
}
