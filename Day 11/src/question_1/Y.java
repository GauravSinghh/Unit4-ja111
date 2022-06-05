package question_1;

public interface Y {

  void fun4();
	
	default void fun5() {
		System.out.println("fun5 of y");
	}
	
	static void fun6() {
		System.out.println("fun6 of y");

	}
}
