package question_2;

public class ScienceStudent extends Student{

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	

	
	
	@Override
	double getPercentage() {
		int x =this.chemistryMarks+this.mathsMarks+this.mathsMarks;
		 double percent=(x*100)/300;
		
		return percent;
		
	}




	@Override
	public String toString() {
		return  "ScienceStudent= Name : "+ this.name+ ", Address= "+this.address+ ", [phisicsMarks=" + phisicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks +  ", Percentage of marks=" +getPercentage()+"]";
	}
}
