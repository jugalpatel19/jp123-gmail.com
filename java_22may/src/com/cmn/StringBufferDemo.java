package com.cmn;
/*
 * string buffer:mutable
 */

import javax.management.ValueExp;

import com.oops.ReversedDigitDemo;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("This is Tops Tech...");
		System.out.println("original string value is :"+s1);
		System.out.println("original string length is :"+s1.length());
		
		s1.insert(0, "Hii");
		System.out.println("Now string value is:"+s1);
		System.out.println("Now string length is :"+s1.length());
		
		s1.append("jugal");
		System.out.println("original string value is :"+s1);
		System.out.println("original string length is :"+s1.length());
		
		s1.delete(0, 4);
		System.out.println("original string value is:"+s1);
		System.out.println("original string length is :"+s1.length());
		
		s1.replace(0, 3, "");
		System.out.println("Now string value is:"+s1);
		System.out.println("Now string length is :"+s1.length());
		
		
		s1.reverse();
		System.out.println("Now string value is:"+s1.reverse());
		System.out.println("Now string length is :"+s1.length());
		
		
		
		
		
	}

}
