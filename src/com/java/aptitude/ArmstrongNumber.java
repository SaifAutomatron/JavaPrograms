package com.java.aptitude;

public class ArmstrongNumber {

	public static void main(String[] args) {
          int n=370;
          
          int number=n;
          
          int sum=0;
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;
			
		}

		if(number==sum)
		{
			System.out.println("Given number is an Armstrong Number");
		}
		else if(number!=sum)
			System.out.println("Given number is not an Armstrong Number");

	}

}
