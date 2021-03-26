package com.java.concepts;

public class StringCapital {

	public static void main(String[] args) {
		
		String s="welcome to india";
		
		String[] str = s.split(" ");
	
		for (int i = 0; i < str.length; i++) 
		{

			
			String s2=str[i].substring(0, 1).toUpperCase()+str[i].substring(i);
			System.out.print(s2+" ");

		}
		

	}

}
