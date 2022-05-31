package question_2;
import java.util.*;
public class AllStudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter History Student name");
		String hName = scan.next();
		System.out.println("Enter Address");
		String hAddres = scan.next();
		HistoryStudent h1 = new HistoryStudent(hName, hAddres);
		System.out.println("Enter civics marks");
		h1.civicsMarks = scan.nextInt();
		System.out.println("Enter History marks");
		h1.historyMarks = scan.nextInt();
			
		System.err.println("--------------");
		
		System.out.println("Enter Science Student name");
		String sName = scan.next();
		System.out.println("Enter Address");
		String sAddres = scan.next();
		ScienceStudent s1 = new ScienceStudent(sName, sAddres);
		System.out.println("Enter Chemistry marks");
		s1.chemistryMarks = scan.nextInt();
		System.out.println("Enter Maths marks");
		s1.mathsMarks = scan.nextInt();
		System.out.println("Enter physics marks");
		s1.phisicsMarks= scan.nextInt();
		System.out.println();
		System.out.println("History student marks");
		System.out.println(h1);
		System.out.println();
		System.out.println("Science student marks");
		System.out.println(s1);

	}

}
