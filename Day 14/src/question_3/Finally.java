package question_3;

public class Finally {
	
	/*
	 * FINALLY- The finally  is always executed whether an exception is handled or not. Therefore,
        it contains all the necessary statements that need to be executed regardless of the
         exception occurs or not.
	 */
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}catch(Exception e) {
			System.out.println("Exception handled");
		}finally {
			System.out.println("This is an important statement, needs to be printed.");
		}
	}
}
