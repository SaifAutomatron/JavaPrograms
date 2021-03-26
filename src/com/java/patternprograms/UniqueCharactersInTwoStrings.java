package com.java.patternprograms;

import java.util.TreeSet;

public class UniqueCharactersInTwoStrings {

	public static void main(String[] args) {

		String s1="hello";
		String s2="fellow";
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		TreeSet<Character> ts1=new TreeSet<Character>();
		TreeSet<Character> ts2=new TreeSet<Character>();
		TreeSet<Character> ts3=new TreeSet<Character>();
		
		for (int i = 0; i < ch1.length; i++) 
		{
			ts1.add(ch1[i]);
		}
		for (int i = 0; i < ch2.length; i++)
		{
			ts2.add(ch2[i]);
		}
		
		ts3.addAll(ts1);
	    ts3.addAll(ts2);
		ts1.retainAll(ts2);
		ts3.removeAll(ts1);
		
		System.out.println(ts3);
	
	}

}
