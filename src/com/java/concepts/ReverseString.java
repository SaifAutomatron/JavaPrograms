package com.java.concepts;

public class ReverseString {

	public static void main(String[] args) {

		//1
		String s="india";
		for (int i =s.length()-1; i >=0; i--) 
		{
			System.out.print(s.charAt(i));
		}
		
        //2
		String rev="";
		for (int i =s.length()-1; i >=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		//3
		String r="";
		char[] ch = s.toCharArray();
		for (int i = 0; i < args.length; i++) 
		{
			r=ch[i]+r;
		}
		System.out.println(r);
	}

}
