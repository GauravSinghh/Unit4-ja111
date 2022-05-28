package question_4;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
	
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Bank name");
		String bankName = scanner.next();
		
		Bank bank1 = getBank(bankName);
		bank1.displayDetails();
	}
	
	
	public static Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("axis"))
		{
		
			AxisBank ax = new AxisBank();
			ax.setBranchName("Axis"); 
			ax.IfscCode ="123tuv";
			ax.rateOfInterest = 4;
			return ax;
		}
		else if(bank.equalsIgnoreCase("icici"))
		{
			ICICIBank ic = new ICICIBank();
			ic.branchName = "ICICI";
			ic.IfscCode ="5v42w";
			ic.rateOfInterest = 5;
			return ic;
		}
		else 
		{
			System.out.println(bank);
			return null;
		}
	}
	
	
}
