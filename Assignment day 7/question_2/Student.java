package question_2;

public class Student {

	private int studId;
	private String studName;
	private double examFee;
	
	
	public void displayDetails() {
		System.out.println("Name :" +studName);
		System.out.println("Student id :"+studId);
		System.out.println("Examfee :"+examFee);
	}
	 public double payFee() {
		
		return examFee;
	}
	 
	public Student() {
		super();
		
	}
	
	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	 
}
