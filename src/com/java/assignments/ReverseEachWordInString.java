package com.java.assignments;


public class ReverseEachWordInString {

	public static void main(String[] args)
	{
		String s="welcome to tyss";
		
		String []s1=s.split(" ");
//		
//		String reverse="";
//		for (int i = 0; i < s1.length; i++) 
//		{
//			String rev="";
//			for (int j = s1[i].length()-1; j >=0 ; j--) 
//			{
//			   rev=rev+s1[i].charAt(j);
//			}
//			
//			reverse=reverse+rev+" ";
//		}
//     
//		System.out.println(reverse);
		
		for (int i = 0; i < s1.length; i++) 
		{
			String str=s1[i];
			String rev="";
			
			for (int j = str.length()-1; j >=0; j--)
			{
				rev=rev+str.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
		
		

	}

}
