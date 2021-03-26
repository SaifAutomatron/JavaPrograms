package com.java.assignments;

public class FindwordWithLeastLength {

	public static void main(String[] args) 
	{
	
		String s="welcome to india";
	
		String []str=s.split(" ");
		
		String word=str[0];
		for (int i = 0; i < str.length; i++) 
		{
		   
			if(str[i].length()<word.length())
			{
				word=str[i];
			}
			
		}

		System.out.println(word);
		
	}

}
