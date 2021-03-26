package com.java.assignments;

public class StringPlaindrome {

	public static void main(String[] args) 
	{
		String s="nitin";
		
		
		String rev="";
		for (int i =s.length()-1; i >=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		
		
		if(rev.equals(s))
			System.out.println("Given string is plaindrome");
		else
			System.out.println("Given string is not plaindrome");
	}

}
