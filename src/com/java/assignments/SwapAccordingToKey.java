package com.java.assignments;

public class SwapAccordingToKey {

	public static void main(String[] args) {
		
	int a[]= {10,20,30,40,50};
	
	int key=1;
	
	
	for (int i = 0; i < key; i++) 
	{
		
		for (int j = 0; j < a.length-1; j++) 
		{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		
		}
		
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
}
}
