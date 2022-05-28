package question_2;

public class DayScholar extends Student {

	double transportFee;

	@Override
	public double payFee() {
		
		return transportFee /*+super.payFee()*/;
	}
	
	
	
}
