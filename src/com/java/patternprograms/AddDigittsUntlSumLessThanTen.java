package com.java.patternprograms;




public class AddDigittsUntlSumLessThanTen {
	
	public static int sumOfDigits(int num)
	{
		int sum=0;
		int rem;
		
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(sum<10)
		{
			return sum;
		}
		return sumOfDigits(sum);
	}

	public static void main(String[] args) 
	{
       int n=123567969;
//       int sum=0;
//       
//       while(n>0||sum>9)
//       {
//    	   if(n==0)
//    	   {
//    		   n=sum;
//    		   sum=0;
//    	   }
//    		  	  sum+=n%10;
//    	    	  n=n/10;
//       }
//       System.out.println(sum);
       System.out.println(sumOfDigits(n));
       
	}

}
