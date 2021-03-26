package com.java.concepts;

class Singleton
{
	static Singleton s=null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance()
	{
		if(s==null)
		{
			s=new Singleton();
		}
		return s;
	}
	
	public void print()
	{
		System.out.println("Singleton print method");
	}
	
}
public class CheckSingketon {

	public static void main(String[] args) {
		
        Singleton s=Singleton.getInstance();
        Singleton s1=Singleton.getInstance();
        
        CheckSingketon c=new CheckSingketon();
        CheckSingketon c1=new CheckSingketon();
        
        //verfying 
        System.out.println(s==s1);
        System.out.println(c==c1);
        s.print();
        
 
	}

}
