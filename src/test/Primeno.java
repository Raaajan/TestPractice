package test;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int n=  sc.nextInt();
		int c=2;
		int f=0;
		while(n>=c && n%c!=0)
		{
			c++;
			
			if(n==c)
			{
				f=1;
				break;
			}
			
		}
		
		if(f==1 || n==2)
		{
			System.out.println("prime");
		}
		
		else
		{
			System.out.println("not prime");
		}
		
		
		
	}

}
