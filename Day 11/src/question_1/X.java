package question_1;

public interface X {

	void fun1();
	
	default void fun2() {
		System.out.println("fun2 of X");
		
	}
	
	static void fun3() {
		System.out.println("fun3 of X");
	}
}
