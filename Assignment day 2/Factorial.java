package com.masai;

public class Factorial {
	public static void main(String[] args) {
		fun1(6);
		
	}
	static void fun1(int n) {
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				fun2(i);
			}
			
		}
		
	}
	static void fun2(int prime) {
		int count=0;
		for(int i=2;i<=prime;i++)
		{
			if(prime%i==0)
			{
				count++;
			}
		}
		if(count==1)
			{
			System.out.println(prime);
			}
	}
	
		
}
