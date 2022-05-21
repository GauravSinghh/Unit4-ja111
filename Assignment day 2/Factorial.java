package com.masai;

public class Factorial {
	public static void main(String[] args) {
		fun1(3);
		
	}
	static void fun1(int n) {
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product*=i;
		}
		System.out.println(product);
	}
		
}
