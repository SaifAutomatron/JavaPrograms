package com.java.assignments;

public class ConvertCharToUppercase {

	public static void main(String[] args) 
	{
		
		String s="Indiaindia";
		
		String m="";
		for (int j = 0;j<s.length(); j++)
		{
			if(s.charAt(j)=='i')
			{
//				String  s1=s.charAt(j)+"";
//				m=m+s1.toUpperCase();
				char ch=(char)(s.charAt(j)-32);
				m=m+ch;
			}
			else
				m=m+s.charAt(j);
			
		}

		System.out.println(m);
	}

}
