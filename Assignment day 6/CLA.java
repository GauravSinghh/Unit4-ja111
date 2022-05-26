package com.masai;

public class CLA {

	public static void main(String[] args) {
		if(args.length==1)
		{
			String s1= args[0];
			int i1 =Integer.parseInt(s1);
			int prod=1;
			for(int i =1;i<=i1;i++)
			{
				prod*=i;
			}
			System.out.println("when one args is there:"+prod);
		}
		else if(args.length==2)
		{
			String s1= args[0];
			int i1 =Integer.parseInt(s1);
			String s2= args[1];
			int i2 =Integer.parseInt(s2);
			int abs = Math.abs(i1-i2);
			int prod=1;
			
			for(int i =1;i<=abs;i++)
			{
				prod*=i;
			}
			System.out.println("when two args is there:"+prod);
		
		}
		else if(args.length>=3)
		{
			System.out.println("when three or more args is there:");
			System.out.println("Error!");
		}
	}

}
