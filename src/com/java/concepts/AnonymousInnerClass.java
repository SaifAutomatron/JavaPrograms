package com.java.concepts;

interface My
{
	void display();
	
}
class Outerc
{
	public void method()
	{
		My m=new My() 
		{
			public void display()
			{
				System.out.println("Anonymous inner class");
			}
		};
	  m.display();	
	}
	
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		Outerc oc=new Outerc();
        
		oc.method();

	}

}
