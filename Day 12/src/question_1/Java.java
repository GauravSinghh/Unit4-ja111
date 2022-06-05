package question_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[jJ]{1}[ava]{3}");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line");
		String str = sc.nextLine();
		
		Matcher m = p.matcher(str);
		int count=0;
		while(m.find())
		
		{
			count++;
			System.out.println(m.start() + "------" + m.end() + "-------" + m.group());
		}
		System.out.println("The no of occurrences: "+count);
	}

}
