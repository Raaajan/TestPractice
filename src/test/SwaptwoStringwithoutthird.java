package test;

public class SwaptwoStringwithoutthird {

	public static void main(String[] args) 
	{
		String a="Hell";
		String b="World";
		
		
		
		System.out.println("-----Before Swapping--------");
		System.out.println("a- "+a+" : "+a.length());
		System.out.println("b- "+b+" : "+b.length());
		//1.concat a and b
		a=a+b;
		System.out.println();
		System.out.println("concatinating a and b");
		System.out.println(a+" : "+a.length());
		//2. store intial string a in b
		b=a.substring(0, a.length()-b.length());
		//3. Store b in a
		a=a.substring(b.length());
		System.out.println();
		System.out.println("---------after Swapping-------");
		System.out.println("a- "+a+" : "+a.length());
		System.out.println("b- "+b+" : "+b.length());
		
	
		
	}

}
