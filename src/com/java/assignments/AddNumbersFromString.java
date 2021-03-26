package com.java.assignments;

public class AddNumbersFromString {

	public static void main(String[] args) {
		
		
		String s="123@abc456$xyz";
			
			char[] ch = s.toCharArray();
			
			
			int sum=0;
		
			for (int i = 0; i < ch.length; i++) 
			{
			
				if(ch[i]>='0' && ch[i]<='9')
				{
					int n=ch[i]-48;
					sum=sum+n;
				}
				
			}
			
		System.out.println(sum);

	}

}
