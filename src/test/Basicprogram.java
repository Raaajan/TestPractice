package test;



public class Basicprogram {

	private static final int HashMap = 0;

	public static void main(String[] args) {
		
// Reverse of String and count no of words in string
	/*String a= "Rajan shyamji Dubey";
	System.out.println("Before reverse "+a);
String b[]=	a.split(" ");
	System.out.println("No of words in String "+b.length);
	
	
	
	char ch[]=a.toCharArray();
	int size = ch.length;
	char c=0;
	int count=0;
	
	System.out.println("All char including spaces "+size);
	
	for(int i=0;i<size;i++)
	{
		if(ch[i]!=' ')
		{
			count++;
		}
		
	}
	System.out.println("All char excluding spaces "+count);
	for(int i=0;i<size/2;i++)
	{
		c=ch[i];
		ch[i]=ch[size-1-i];
		ch[size-1-i]=c;
		
	}
	
	System.out.println("After reverse");
	for(int i=0;i<size;i++)
	{
		System.out.print(ch[i]);
	}*/

		
		
		
		
		
//count no char in string after removing duplicate


		String str = "Raajann";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[i]);
		     cnt++;
		     break;
		    }
		   }
		   
		  }
	
		  System.out.println(cnt);
		  
		  
		  // how to get key from map
		  
		/*HashMap<String,String> mp= new HashMap<String,String>();
		mp.put("Rajan", "100");
		mp.put("chan", "200");
		mp.put("Vipin", "150");
		//System.out.println(mp);
	
		for(Map.Entry<String, String>m:mp.entrySet())
		{
			System.out.println(m.getKey());
		}
	
		System.out.println(mp.get("Rajan"));
	*/
		
		
		/*for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				char a=(char) (j+64);
				System.out.print(a);
			}
			System.out.println();
		}*/
	
	
	
	}}