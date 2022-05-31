package question_1;

public class TajHotel implements Hotel{

	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		}

	@Override
	public void chickenBiryani() {
	System.out.println("having biryani at TajHotel");
		
	}

	@Override
	public void masalaDosa() {
		System.out.println("having masalaDosa at TajHotel");
		
	}
}
