package question_1;

public class Demo {

	public static void main(String[] args) {
		X x = new ZImpl();
		x.fun1();
		x.fun2();
		X.fun3();
		
		Y y= (Y)x;
		y.fun4();
		y.fun5();
		Y.fun6();
		
		Z z =(Z)y;
		z.fun1();
		z.fun2();
		z.fun4();
		z.fun5();
		z.fun7();

	}

}
