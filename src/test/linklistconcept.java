package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class linklistconcept {

	public static void main(String[] args) 
	{
		//ArrayList <String> ar = new ArrayList<String>();
		LinkedList <String> ar= new LinkedList<String>();
		
		ar.add("a");
		ar.add("b");
		ar.add("c");
		ar.add("d");
		ar.add("e");
		
	
		System.out.println("Before inserting");
		System.out.println(ar.indexOf("a")+" =a");
		System.out.println(ar.indexOf("b")+" =b");
		System.out.println(ar.indexOf("c")+" =c");
		System.out.println(ar.indexOf("d")+" =d");
		System.out.println(ar.indexOf("e")+" =e");

		//ar.set(1, "f");
		ar.add(1, "f");
		System.out.println("After inserting");
		
		System.out.println(ar.indexOf("a")+" =a");
		System.out.println(ar.indexOf("b")+" =b");
		System.out.println(ar.indexOf("c")+" =c");
		System.out.println(ar.indexOf("d")+" =d");
		System.out.println(ar.indexOf("e")+" =e");
		System.out.println(ar.indexOf("f")+" =f");
		
	}

}
