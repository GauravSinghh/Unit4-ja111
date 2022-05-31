package question_2;

import java.util.*;
public class Parent {
	final int number;
	
	public Parent(int number) {
		super();
		this.number = number;
	}



	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int x = scan.nextInt();
		if(x>1&&x<=10) {
		Parent p = new Child(x);
		p.method1();
		p.method2();
		p.method3();
		Child c =(Child)p;
		c.method4();
		}
		else
		{
			System.out.println("invalid number");
		}
	}
	
	
	
	void method1() {
		System.out.println(number);
		System.out.println("Method 1 of class parent");
	}
	final void method2() {
		System.out.println("Method 2 of class parent");
		}
	void method3() {
		System.out.println("Method 3 of class parent");
	}
	
}
