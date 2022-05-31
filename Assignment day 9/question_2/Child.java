package question_2;

public final class Child extends Parent{

	public Child(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	@Override
	void method1() {
		System.out.println("Method 1 of class child");
		System.out.println(number);
	}
	
	void method4() {
		System.out.println("Method 4 of class child");
	}
	
}
