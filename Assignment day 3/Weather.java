package com.masai;

public class Weather {
  public static void main(String[] args)
  {
	  boolean isSnowing = false;
	  boolean isRaining = false;
	  double temperature = 55.10;
	  if(isSnowing==false&isRaining==false&temperature>=50)
	  {
		  System.out.println("Let's go out!");
	  }
	  else
	  {
		  System.out.println("Let's stay home.");
	  }
  }
}
