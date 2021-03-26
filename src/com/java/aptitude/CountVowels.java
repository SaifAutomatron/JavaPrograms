package com.java.aptitude;

public class CountVowels {

	public static void main(String[] args) {
		
		String word="ChETaN BhAi zIndabad";
		word=word.toLowerCase();
		int counta=0,counte=0,counti=0,counto=0,countu=0;
			
		for (int i = 0; i < word.length(); i++) 
		{
			
				if(word.charAt(i)=='a')
					counta++;
				else if(word.charAt(i)=='e')
					counte++;
				else if(word.charAt(i)=='i')
					counti++;
				else if(word.charAt(i)=='o')
					counto++;
				else if(word.charAt(i)=='u')
					countu++;				
		}
		
		System.out.println("Vowels: "+"a="+counta+" e="+counte+" i="+counti+" o="+counto+" u="+countu);

	}

}
