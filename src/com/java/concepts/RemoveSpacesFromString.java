package com.java.concepts;

public class RemoveSpacesFromString {

	public static void main(String[] args) 
	{
		String s="welcome to india";
		
		String s1=s.replaceAll(" ", "");

		System.out.println(s1);
	}

}
