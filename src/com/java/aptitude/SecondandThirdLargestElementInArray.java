package com.java.aptitude;

public class SecondandThirdLargestElementInArray {

	public static void main(String[] args) {
		
		
  int []a= {20,30,40,10,5,50};
		
		
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				//ascending order
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
		    }

	    }
		
		
		System.out.println("Second largest element "+a[a.length-2]);
		System.out.println("Third largest element "+a[a.length-3]);
		
	}
}
