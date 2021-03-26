package com.java.concepts;

class OuterClass
{
	void display()
	{
		class InnerClass
		{
			void innerDisplay()
			{
				System.out.println("inner class display method");
			}
		}
		InnerClass i=new InnerClass();
		i.innerDisplay();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		
		
		OuterClass o=new OuterClass();
		
		o.display();
		

	}

}
