package test;

public class SmallestandLargestno {

	public static void main(String[] args)
	{
	
		int a[]={10,15,2,7,4,9,13,5,8,-1,-5};
		
		// 1st approach - by sorting array and getting value from 1st index and last index
		int last=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			int temp;
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}	
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Smallest no: "+a[0]);
		System.out.println("Largest no: "+a[last]);
		
		System.out.println("-------------2nd Approach-------------------");
		//2nd approach-by considering 1st value as largest and smallest and then comparing with others
		
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("Smallest value : "+smallest);
		System.out.println("Largest value : "+largest);
		
		
	}

}
