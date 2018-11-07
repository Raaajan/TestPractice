package test;



public class Primeseries {

	public static void main(String[] args)
	{
		int count=0;
	
		for(int i=0;i<=100;i++)
		{
		int c=2;
		int f=0;
		
		while(i>=c && i%c!=0)
		{
			c++;
			
			if(i==c)
			{
				f=1;
				break;
			}
			
		}
		
		if(f==1 || i==2)
		{
			System.out.println(i);
			count++;
		}
		
		/*else
		{
			System.out.println("not prime");
		}*/
		
		}
		System.out.println("total prime no " +count);

}
}
