package com.java.aptitude;

public class ReverseString {

	public static void reverse(String s)
	{
		String reverse="";
		
		for (int i =s.length()-1; i >= 0; i--) 
		{
			reverse=reverse+s.charAt(i);
		
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
	
		reverse("hello");

	}

}
