package question_1;
import java.util.*;
public class Demo {
	public Hotel provideFood(int amount) {
		if(amount>1000)
		{
			return new TajHotel();
		}
		else if(amount>200&&amount<1000)
		{
			return new RoadSideHotel();
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount");
		int amount = scan.nextInt();
		while(amount<200) {
			System.out.println("Enter valid amount");
			amount = scan.nextInt();
		}
		Demo d1 = new Demo();
		Hotel h1 = d1.provideFood(amount);
		h1.chickenBiryani();
		h1.masalaDosa();
		if(h1 instanceof TajHotel)
		{
			((TajHotel) h1).welcomeDrink();
		}
		
	}
	
}
