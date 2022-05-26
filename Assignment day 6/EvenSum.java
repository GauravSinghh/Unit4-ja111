package com.masai;

import java.util.*;
public class EvenSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row:");
		int N = sc.nextInt();
		
		System.out.println("Enter column");
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		
		
		for(int i=0;i<N;i++)
		{ 
			System.out.println("New row");
			for(int j =0;j<M;j++) {
				System.out.println("Next element");
				arr[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("=========");
		for(int i=0;i<N;i++)
		{ int sum =0;
			for(int j =0;j<M;j++) {
				if(arr[j][i]%2==0)
				{
					sum+=arr[j][i];
				}
			}
			System.out.println(sum);
		}

	}

}
