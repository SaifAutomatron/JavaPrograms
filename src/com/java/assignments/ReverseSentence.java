package com.java.assignments;

public class ReverseSentence {

	public static void main(String[] args) 
	{
       String s="welcome to tyss";
       
       String []stArr=s.split(" ");
       
       String temp="";
       
        temp=stArr[0];
		stArr[0]=stArr[stArr.length-1];
		stArr[stArr.length-1]=temp;
		
		for(String x:stArr)
		{
			System.out.print(x+" ");
		}
       
    

	}

}
