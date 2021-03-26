package com.java.concepts;

import java.util.ArrayList;

public class StringInitialization {

	public static void main(String[] args) {

		String s="abcd";
		String s2="bcghi";
		String s3=s+s2;
		char[] sArr=s.toCharArray();
		char[] s2Arr=s2.toCharArray();
		char[] s3Arr = s3.toCharArray();
		ArrayList<Character> alist=new ArrayList<Character>();
		ArrayList<Character> s2list=new ArrayList<Character>();
		for(int i=0;i<s3Arr.length;i++) {
			alist.add(s3Arr[i]);
		}
		for(int i=0;i<sArr.length;i++) {
			s2list.add(sArr[i]);
		}
		s2list.removeAll(alist);
		alist.removeAll(s2list);
		System.out.print(s2list);
		System.out.print(alist);

	}

}
