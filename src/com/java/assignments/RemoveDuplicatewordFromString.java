package com.java.assignments;

import java.util.LinkedHashSet;

public class RemoveDuplicatewordFromString {
	
	
	public static void main(String[] args) {
		
	String s="welcome to india welcome to mandya";
		
		String[] ch = s.split(" ");
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		
		for (int i = 0; i < ch.length; i++)
		{
			lhs.add(ch[i]);
		}
		
	     s="";
		for(String c:lhs)
		{
	       s=s+c+" ";
		}
		System.out.println(s);
	}

}
