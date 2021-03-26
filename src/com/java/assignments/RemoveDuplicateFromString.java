package com.java.assignments;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String s="india";
		
		char[] ch = s.toCharArray();
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		
		
		for (int i = 0; i < ch.length; i++)
		{
			lhs.add(ch[i]);
		}
		
	    s="";
		for(char c:lhs)
		{
	       s=s+c;
		}
		System.out.println(s);
		
	}

}
