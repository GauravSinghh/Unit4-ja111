package question_2;

public class HistoryStudent extends Student{

	int historyMarks;
	int civicsMarks;
	
	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getPercentage() {
		int x = this.historyMarks+this.civicsMarks;
		 double percent=(x*100)/200;
			
			return percent;
	}

	@Override
	public String toString() {
		return " HistoryStudent=Name : "+ this.name+ ", Address= "+this.address+  ", [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks +", Percentage of marks=" +getPercentage()+ "]";
	}

}
