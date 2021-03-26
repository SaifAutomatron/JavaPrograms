package com.java.patternprograms;


public class ArrayTest {

	public static void main(String[] args) {
		
		int []a= {1,2,3,1,1,1};
		
		int []b= {1,1,1,1,1,1,1,1};
	    
		int []c= {0,0};
		
	    if(a.length>b.length)
	    {
	    	c=a;
	    	
	    	for (int i = 0; i < b.length; i++) 
	    	{	
	    		c[i]=a[i]+b[i];	
			}
	    	
	    }
	    else if(a.length<b.length)
	    {
	    	c=b;
	    	
	    	for (int i = 0; i < a.length; i++) 
	    	{
	    		c[i]=a[i]+b[i];
			}
	    	
	    }
	    else
	    {
	    	c=new int[b.length];
	    	for (int i = 0; i < c.length; i++) 
	    	{
	    		c[i]=a[i]+b[i];	
			}
	    	
	    }
	
	    for(int x:c)
	    {
	    	System.out.print(x+" ");
	    }

	}

}
