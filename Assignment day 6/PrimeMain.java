package com.masai;

import java.util.*;
public class PrimeMain {

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		for(int i =0;i<inputArray.length;i++)
		{
			int count =0;
			for(int j=2;j<inputArray[i];j++)
			{
				
				if(inputArray[i]%j==0)
				{
					count++;
				}	
			}
			if(count>0)
			{
				inputArray[i]=0;
			}
		}
		int pCount =0;
		for(int i =0;i<inputArray.length;i++)
		{
			if(inputArray[i]!=0)
			{
				pCount++;
			}
		}
		
			int ic=0;
			int [] arrPrime= new int[pCount];
			for(int j=0;j<inputArray.length;j++)
			{
				if(inputArray[j]!=0)
				{
					arrPrime[ic]=inputArray[j];
					ic++;			
				}
			}
			return arrPrime;
		
		
		}
		public static void main(String[] args){

			Scanner sc = new Scanner(System.in); 
			PrimeMain p = new PrimeMain();
		System.out.println("Enter Array length");
		int l = sc.nextInt();
			int[] arr = new int[l];
			
			for(int i =0;i<l;i++)
			{
				System.out.println("Enter element");
				arr[i]=sc.nextInt();
			}
			System.out.println("============");
			
		 int [] arrayMain=	p.findAndReturnPrimeNumbers(arr);
	
		if(arrayMain.length==0)
		{
			System.out.println("Prime number not found in the supplied Array");
		}
		else {
			System.out.println("Prime Numbers");
			for(int i =0;i<arrayMain.length;i++)
			{
				System.out.println(arrayMain[i]);
			}
		}
	
		}
}
