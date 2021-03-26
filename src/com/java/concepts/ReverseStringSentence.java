package com.java.concepts;

public class ReverseStringSentence {
	
	public static void main(String[] args)
	{
		String s="my name is saif";
		
		String[] srr = s.split(" ");
		
		for (int i = srr.length-1; i >=0; i--) 
		{
			System.out.print(srr[i]+" ");
		}
		
		String rev="";
		for (int i = srr.length-1; i >=0; i--) 
		{
			rev=rev+" "+srr[i];
		}
		System.out.println(rev.trim());
	}

}
