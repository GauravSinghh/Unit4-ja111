package com.masai;

public class Demo {

	public Demo(){
		 System.out.println("inside constructor Demo()");
	 }
	public Demo(String s){
		 System.out.println("inside constructor Demo(String s)");
	 }
	public Demo(int i){
		 System.out.println("inside constructor Demo(int i)");
	 }
	public Demo(float f){
		 System.out.println("inside constructor Demo(float f)");
	 }

	 public static void main(String[] args) {
		 Demo obj = new Demo();
		
		 obj = new Demo("hello");
		 obj= new Demo(5);
		 obj = new Demo(10.55f);
	 
	 }
	
}
