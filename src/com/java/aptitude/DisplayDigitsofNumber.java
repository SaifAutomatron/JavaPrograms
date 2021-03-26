package com.java.aptitude;

public class DisplayDigitsofNumber {

	public static void main(String[] args) {
		
		int number=234;
		String s="";
		while(number>0)
		{
			int r=number%10;
			number=number/10;
			s=s+r;
		}
			for(int i=s.length()-1;i>=0;i--)
		{
				char c=s.charAt(i);
						
		    switch (c) {
			case '0':System.out.print("Zero ");
				     break;
			case '1':System.out.print("One ");
		     break;
			case '2':System.out.print("Two ");
		     break;
			case '3':System.out.print("Three ");
		     break;
			case '4':System.out.print("Four ");
		     break;
			case '5':System.out.print("Five ");
		     break;
			case '6':System.out.print("Six ");
		     break;
			case '7':System.out.print("Seven ");
		     break;
			case '8':System.out.print("Eight ");
		     break;
			case '9':System.out.print("Nine ");
		     break;

			default:
				break;
			}
		}
			
			
	   
	}

}
