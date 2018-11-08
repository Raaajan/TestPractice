package test;

public class FindMIssingno {

	public static void main(String[] args) 
	{
	
		// logic is suppose we have 1245 and we have to find missing no.
		//1.so we will add all the no 1+2+4+5=12
		//2. we will add all the no in squence from start to end 1+2+3+4+5=15
		//3. Now we will subtract these 2 nos and result will give missing no 15-12=3
		
		int a[]={1,2,3,5};
		int sum=0;
		int length=a.length;
		System.out.println("lenght of array "+length);
		
		//sum of given no 
		for(int i=0;i<length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of given no. "+sum);
	
		// sum of all no from start to end
		
		int sum1=0;
		for(int i=0;i<=length+1;i++)
		{
			sum1=sum1+i;
		
		}
		System.out.println("sum of given no. "+sum1);
		
		System.out.println("Missing no in sequence of no "+(sum1-sum));
		
	
	
	
	}

}
