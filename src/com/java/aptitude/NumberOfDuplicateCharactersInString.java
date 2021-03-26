package com.java.aptitude;

import java.util.LinkedHashSet;

public class NumberOfDuplicateCharactersInString {

	public static void main(String[] args) {


        String s="welcome to ty";
		
		char[] ch = s.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++)
		{
			set.add(ch[i]);
		}
		
		int count1=0;
		for(Character c:set)
		{
			int count=0;
			for (int i = 0; i < ch.length; i++) 
			{
				if(c==ch[i])
				{
					count++;
				}
			}
			if(count>1)
			count1++;
		}

       System.out.println(count1);

	}

}
