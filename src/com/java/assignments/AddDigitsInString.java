package com.java.assignments;

public class AddDigitsInString {

	public static void main(String[] args) {
		
		String s="123";
		
		int i=Integer.parseInt(s);
		int sum=0;
		
		while(i>0)
		{
			int n=i%10;
			sum=sum+n;
			i=i/10;
		}

		System.out.println(sum);
	}

}
