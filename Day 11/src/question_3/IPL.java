package question_3;

import java.util.*;
public class IPL {

	void homeTeamStadium(Stadium stadium) {
		if(stadium.equals(Stadium.CHIDAMBARAM_STADIUM))
				{
			   System.out.println("This is the home ground of CSK");
				}
		else if(stadium.equals(Stadium.EDEN_GARDENS_STADIUM)) {
			System.out.println("This is the home ground of KKR");
		}
		else if(stadium.equals(Stadium.M_CHINNASWAMY_STADIUM)) {
			System.out.println("This is the home ground of RCB");
		}
		else if(stadium.equals(Stadium.WANKHEDE_STADIUM)) {
			System.out.println("This is the home ground of Mumbai Indians");
		}
	}
	
	public static void main(String[] args) {
		IPL ipl = new IPL();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stadium name in uppercase");
		String stadiumName = sc.next();
		Stadium s = Stadium.valueOf(stadiumName);
		ipl.homeTeamStadium(s);
	}
}
