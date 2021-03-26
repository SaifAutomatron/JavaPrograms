package com.java.assignments;

public class SeprateCharsFromString {

	public static void main(String[] args) {

		String s="123@abc456$xyz";
		
		char[] ch = s.toCharArray();
		
		String alpha="";
		String spl="";
		String num="";
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				alpha=alpha+ch[i];
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				num=num+ch[i];
			}
			else
				spl=spl+ch[i];
		}
		
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spl);

	}

}
