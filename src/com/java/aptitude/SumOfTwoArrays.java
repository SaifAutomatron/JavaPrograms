package com.java.aptitude;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		
		int a[]= {2,3,5};
		int b[]= {1,4,6};
		
		int sum[]=new int[a.length];
		
		for (int i = 0; i < a.length; i++) 
		{
			sum[i]=a[i]+b[i];
			System.out.print(sum[i]+" ");
		}
		
  
	}

}
