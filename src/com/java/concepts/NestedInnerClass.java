package com.java.concepts;

class Outer
{
	int x=10;
	
	class Inner
	{
		int y=20;
		public void innerDisplay()
		{
			System.out.println(y+" "+x);
		}
	}
	public void outerDisplay()
	{
		Inner i=new Inner();
		i.innerDisplay();
	}
}



public class NestedInnerClass {

	public static void main(String[] args) {
		
		//using outer class
		Outer o=new Outer();
		o.outerDisplay();
		
		//using inner class
		Outer.Inner i=new Outer().new Inner();
		i.innerDisplay();
		
	}

}
