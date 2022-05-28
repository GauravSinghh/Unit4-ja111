package question_4;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
	
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		String bankName = scanner.next();
		Bank bank1 = getBank("axis");
		bank1.displayDetails();
	}
	
	
	public static Bank getBank(String bank) {
		if(bank == "axis")
		{
			AxisBank ax = new AxisBank();
			ax.setBranchName("Axis"); 
			System.out.println(ax.getBranchName());
			ax.IfscCode ="123tuv";
			ax.rateOfInterest = 4;
			return new AxisBank();
		}
		else if(bank == "icici")
		{
			ICICIBank ic = new ICICIBank();
			ic.branchName = "ICICI";
			ic.IfscCode ="5v42w";
			ic.rateOfInterest = 5;
			return new ICICIBank();
		}
		else 
		{
			return null;
		}
	}
	
	
}
