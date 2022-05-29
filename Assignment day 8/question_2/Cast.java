package question_2;


/*ClassCast Exception that occur when we try to convert one class type object 
 * into another class type. ClassCast Exception is thrown when we try to cast an
 *  object of the parent class to the child class object.
We can downcast the parent class variable to the child class object only if
the Parent class variable points to the Child class object , otherwise it will throw a
runtime exception called ClassCastException.

*/
public class Cast {

	void funX() {
		System.out.println("Funx of class Cast");
	}
	public static void main(String[] args) {

		Cast c1 = new Cast();
		
		A a1 =(A)c1;

	}

}
class A extends Cast{
	
	void funX() {
		System.out.println("funx of class A");
	}
}