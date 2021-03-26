package com.java.assignments;

public class SwapEvenAndOddIndexOfStringArray {

	public static void main(String[] args)
	{
		String s="welcome to tyss india";
		
		String []str=s.split(" ");
//		
//		for (int i = 0; i < str.length-1; i+=2) 
//		{
//			
//			String temp=str[i];
//			str[i]=str[i+1];
//			str[i+1]=temp;
//		
//		}
		
		int n=str.length;
		if(n%2!=0)
		{
			n=n-1;
		}

		for (int i = 0; i < n; i++) 
		{
			if(i%2==0) {
			String temp=str[i];
			str[i]=str[i+1];
			str[i+1]=temp;
			}
		
		}
		for(String x:str)
		{
			System.out.print(x+" ");
		}
	}

}
