package com.java.aptitude;

import java.util.LinkedHashSet;

public class OccurenceOfWordsInString {

	public static void main(String[] args) {
		
        String s="welcome to india welcome to sri lanka";
		
		String[] strarr = s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for (int i = 0; i < strarr.length; i++)
		{
			set.add(strarr[i]);
		}
		
		for(String str:set)
		{
			int count=0;
			for (int i = 0; i < strarr.length; i++) 
			{
				if(str.equals(strarr[i]))
				{
					count++;
				}
			}
			System.out.println(str+"="+count);
		}

	}

}
