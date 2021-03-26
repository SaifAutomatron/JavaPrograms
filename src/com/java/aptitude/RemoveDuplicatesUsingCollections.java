package com.java.aptitude;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,6,7,9,0,4,3,1};
		
		for(int i:a)
		{
			System.out.print(i+",");
		}
		System.out.println();
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			al.add(a[i]);
		}
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		
		lhs.addAll(al);
		
		a=new int[lhs.size()];
		
		int j=0;
		
		for(int i:lhs)
		{
			a[j++]=i;
		}
		
		
		for(int i:a)
		{
			System.out.print(i+",");
		}
		
		

	}

}
