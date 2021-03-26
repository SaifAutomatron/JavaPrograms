package com.java.aptitude;

public class BubbleSort {

	public static void main(String[] args) {
		
		int []a= {20,30,40,10,5,50};
		
		for(int x:a) 
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
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
		
		for(int x:a)
		{
			System.out.print(x+" ");
		}

}
}
