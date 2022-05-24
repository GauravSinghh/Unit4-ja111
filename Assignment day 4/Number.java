package com.masai;

public class Number {

	void wholeNumber(int n) {
		if(n%2==1)
		{
			System.out.println(n);
		}
		else if(n%2==0) {
			int x = n/10;
			
			System.out.println((x+1)*10);
		}
		else {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
	Number num = new Number();
	num.wholeNumber(5);
	num.wholeNumber(52);
	num.wholeNumber(-1);
	}

}
