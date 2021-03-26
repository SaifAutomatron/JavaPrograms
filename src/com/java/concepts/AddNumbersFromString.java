package com.java.concepts;

public class AddNumbersFromString {

	public static void main(String[] args) 
	{
		String s="10$@90abdc100";
		
		int sum=0;
		String[] num = s.split("[^0-9]");
		
		for (int i = 0; i < num.length; i++) 
		{
			int b=0;
			if(!num[i].equals("")) 
			{
			
			 b = Integer.parseInt(num[i]);
			}
		
			sum=sum+b;
		}
	
    System.out.println(sum);
	}

}
