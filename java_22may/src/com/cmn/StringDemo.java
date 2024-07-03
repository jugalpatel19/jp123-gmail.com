package com.cmn;
/*
 * Common class:
 * string:string is immutable
 * string buffer
 * wrapper
 * object
 */

public class StringDemo {
	public static void main(String[] args) {
		String s1="this is tops tech...";
		
		
		System.out.println("string value is :"+s1);
		System.out.println("string length is:"+s1.length());
		
		System.out.println("to uppercase:"+s1.toUpperCase());
		System.out.println("to lower case:"+s1.toLowerCase());
		System.out.println("substring is :"+s1.substring(2));
		System.out.println("substring is :"+s1.substring(2, 5));
		System.out.println("char at:"+s1.charAt(0));
		
		if(s1.equalsIgnoreCase("this is Tops Tech...")) {
			System.out.println("both strings are same");
			
		}else {
			System.out.println("both strings are diff");
			
		}
		
		System.out.println("string value is:"+s1);
		System.out.println("string length is :"+s1.length());
		
		
	}

}
