package com.java.assignments;

public class RotateArray {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,40,50};
		
		int key=2;
		
		
		for (int i = 0; i < key; i++) 
		{
			int temp=a[0];
			for (int j = 1; j < a.length; j++) 
			{
			  a[i-1]=a[i];
			
			}
			a[a.length-1]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
