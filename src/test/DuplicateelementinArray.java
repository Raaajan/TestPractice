package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.Set;

public class DuplicateelementinArray {

	public static void main(String[] args) 
	{
		String a[]={"java","ruby","pyhton","script","java","script","ruby"};
		
		//1ts method but this is considered as worst approach
		System.out.println("Duplicate element is :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					System.out.println(a[i]);
				}
			}
		}
		
		
		System.out.println("--------------------------------");
		
		//2nd approach is using hashset
		System.out.println("Duplicate element is : ");
		Set<String> names=new HashSet<String>();
		
		for(String name:a)
		{
			if(names.add(name)==false)
			{
				System.out.println(name);
			}
		}
	
		
System.out.println("--------------------------------");
		
		//2nd approach is using hashmap - this is considered as best approach
		System.out.println("Duplicate element is : ");
		
		Map<String,Integer> nmap=new HashMap<String,Integer>();
		
		for(String n:a)
		{
			Integer count=nmap.get(n);
					if(count==null)
					{
						nmap.put(n,1);
					}
					else
					{
						nmap.put(n, ++count);
					}
		}
		
		for(Map.Entry<String, Integer> value:nmap.entrySet())
		{
			if(value.getValue()>1)
			{
				System.out.println(value.getKey());
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
