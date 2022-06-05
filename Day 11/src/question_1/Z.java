package question_1;

public interface Z extends X,Y {

	void fun7();

	@Override
	default void fun4() {
		System.out.println("fun4 of z");

	}

	@Override
	default void fun2() {
		System.out.println("fun2 of z");

		X.super.fun2();
	}
	
	
	
	
}
