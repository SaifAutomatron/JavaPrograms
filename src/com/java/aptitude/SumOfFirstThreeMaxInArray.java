package com.java.aptitude;

public class SumOfFirstThreeMaxInArray {

	public static void main(String[] args) {
		
		
    int []a= {20,30,40,10,5,50};
			
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				//descending order
				if(a[i]<a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
		    }

	    }
		int sum=0;
		for (int i = 0; i < 3; i++) 
		{
			sum=sum+a[i];
		}
	
		System.out.println("Sum of first 3 max numbers "+sum);

	}

}
