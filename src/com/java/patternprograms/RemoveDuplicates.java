package com.java.patternprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
	 String s="welcome to india welcome to mandiya";
	 
	 String[] sarr = s.split(" ");
	 
	 LinkedHashSet<String> lhs=new LinkedHashSet<String>();
	 
	 
	 for (int i = 0; i < sarr.length; i++) 
	 {
		lhs.add(sarr[i]);
	 }
	 
	
	 for(String st:lhs) 
	 {
		 int count=0;
		 for (int i = 0; i < sarr.length; i++) 
		 {
			if(st.equals(sarr[i]))
			{
				count++;
			}
		}
		 System.out.println(st+"="+count);
	 }
	 int i=0;
	 String s2=String.valueOf(i);
	 System.out.println(s2);
	}
	

}
