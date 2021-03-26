package com.java.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintPairofNumbers 
{

	public static void main(String[] args) 
	{
		int []a= {4,2,3,5,6,1,4,1};
		
		
		Set<Integer> lhs=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			lhs.add(a[i]);
		}
		
		a=new int[lhs.size()];
		
		int count=0;
	    for(int x:lhs)
	    {
	    	a[count]=x;
	    	count++;
	    }
	    
	    
	    //Or
//		ArrayList<Integer> al=new ArrayList<Integer>(lhs);
//		
//		a=new int[al.size()];
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			a[i]=al.get(i);
//			
//		}
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]+a[j]==7)
				{
					System.out.println(a[i]+","+a[j]);
				}
				
			}
			
		}

	}

}
