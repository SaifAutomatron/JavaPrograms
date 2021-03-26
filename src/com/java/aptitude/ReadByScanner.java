package com.java.aptitude;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadByScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc=new Scanner(new File("C:\\Users\\Saif\\Desktop\\read.txt"));
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.next());
		}
		sc.close();

	}

}
