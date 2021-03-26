package com.java.aptitude;

import java.util.TreeSet;

public class SortArrayAndRemoveDuplicate {

	public static void main(String[] args) {
		
		int []a= {1,6,3,5,3,2,2,2,4,9,7,8};
		
		for(int i:a)
		{
			System.out.print(i+",");
		}
		System.out.println();
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		for(int i:a)
		{
			ts.add(i);
		}
		
		System.out.println(ts);
		
	}

}
