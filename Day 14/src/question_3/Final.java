package question_3;

public class Final {

	/*
	 * Final- Final keyword is used when we need to fixed the mutability of a class, method or a variable.
	 * if a variable is final, we cannot initiate it again in main method or in any other class. we can initiate it
	 * using constructor but only when we didn't initiate it before.
	 * below, you can see the error as we again try to initiate the x int again.
	 */

	final int x =10;
	public static void main(String[] args) {
		
		x =12; //showing error

	}
}
