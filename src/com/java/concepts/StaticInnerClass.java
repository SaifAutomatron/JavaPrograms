package com.java.concepts;

class Outers
{
	static int x=10;
	int y=20;
	static class Inner
	{
		void display()
		{
			System.out.println(x);
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) 
	{
		Outers.Inner i=new Outers.Inner();
		
		i.display();

	}

}
