package question_3;

public class Abs {

	/*
	 * Abstract class : It is a type of abstraction where hiding of implementation details and showing only
	 *       functionality to the user. Through abstract class 100% abstraction is not guaranteed. A class that
	 *        is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods.
	 *         It needs to be extended and its method implemented. It cannot be instantiated.
 
	 */
	public static void main(String[] args) {
		A a1 = new B();
		a1.funA();
	}
		
}

abstract class A{
	 abstract void funA();
}

class B extends A{
	void funA() {
		System.out.println("func A of class B");
	}
	
}
