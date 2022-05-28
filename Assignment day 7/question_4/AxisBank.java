package question_4;

public class AxisBank extends Bank {

	double rateOfInterest;

	@Override
	void displayDetails() {
		//String x = getBranchName();
		System.out.println("Branch Name : axis" +this.getBranchName());
		System.out.println("IFSC code :" +this.IfscCode);
		System.out.println("Rate of Interest :"+this.rateOfInterest);
	
		//super.displayDetails();
	}
	
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
	
}
