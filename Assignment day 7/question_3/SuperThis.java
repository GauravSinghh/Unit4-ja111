package question_3;

public class SuperThis {

	int x ;
	int y;
	
	//This keyword is used to refer to the variable of the current object. 
	//for eg. here we are using this.x or this.y these are pointing towards the 
	//instance variable of this object or of this class SuperThis
	
	//Super The super keyword in Java is a reference variable that is used to refer to
	//immediate parent class object or the superclass Object.

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public SuperThis() {
		super();
	}
	
	public static void main(String[] args) {
		
	}
	

}
