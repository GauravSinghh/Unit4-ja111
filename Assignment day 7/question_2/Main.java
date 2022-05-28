package question_2;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student(12,"Hiten",5000.00);
		System.out.println("Student details");
		s1.displayDetails();
		
		Hosteller h1 = new Hosteller();
		h1.hostelFee=10000.00;
		double hostelFees=h1.payFee();
		DayScholar d1 = new DayScholar();
		d1.transportFee = 2000.00;
		double dayScholarFees =d1.payFee();
		
		
		
		System.out.println("Total fees for hosteller :"+(hostelFees+s1.payFee()));
		System.out.println("==============");
		System.out.println("Total fees for Day Scholar :"+(dayScholarFees+s1.payFee()));
		
	}

}
