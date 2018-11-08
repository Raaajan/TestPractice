package test;

public class Swappingwithoutthirdvariable {

	public static void main(String[] args) 
	{
	
		int x=10;
		int y=5;
		
		System.out.println("Before swapping : ");
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("after swapping :");
		 System.out.println("x : "+x);
		 System.out.println("y : "+y);
		
		
		
	}

}
