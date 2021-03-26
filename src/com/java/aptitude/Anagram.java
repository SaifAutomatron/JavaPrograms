package com.java.aptitude;

import java.util.Arrays;

public class Anagram {
	
	public static boolean areAnagrams(String word1,String word2)
	{
		if(word1.equalsIgnoreCase(word2))
			return false;
		
		char[] ch1=word1.toLowerCase().toCharArray();
		char[] ch2=word2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
			
		if(String.valueOf(ch1).equals(String.valueOf(ch2)))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		System.out.println(areAnagrams("Fired", "Fried"));
	}

}
