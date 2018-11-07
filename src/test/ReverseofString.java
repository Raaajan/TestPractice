package test;

public class ReverseofString {

	public static void main(String[] args)
	{
		String rev="";
		String s= "Rajan Dubey";
		int size=s.length();
		System.out.println("String size= "+size);
		
		// 1st way
		/*for(int i=s.length()-1;i>=0;i--)
		{
			 rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		//2nd way
		
		/*char[] a= s.toCharArray();	
		for(int i=0;i<=a.length/2;i++)
		{
			char temp;
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}*/
		
		//3rd way using string buffer (string is immutable but string buffer is mutable so direct method is available for reverse)
	
		StringBuffer sb= new StringBuffer(s); //pass string 
		sb.reverse();
		System.out.println(sb);
		
	}

}
