package com.masai;

public class VowelAndConsonant {
	
	void fun1(char ch) {
		
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println(ch+" is vowel");
		}
		else
		{
			
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				System.out.println(ch+" is consonant");
				else
				System.out.println("invalid character");
		}
		
	}

	public static void main(String[] args) {
		
		
		VowelAndConsonant v1 = new VowelAndConsonant();
		v1.fun1('i');
		v1.fun1('G');
		v1.fun1('3');

	}

}
