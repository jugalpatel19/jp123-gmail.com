package com.oops;

import java.util.Scanner;

/*
 * scanner:
 * it s a class
 * derived from java util package
 * main purpose is to take input from the user
 * use system.in as a parameter
 * 
 * datatype                       scanner class function
 * int                                nextInt()
 * float                              nextFloat()
 * long                               nextLong()
 * boolean                            nextBoolean() 
 * double                             nextDouble()
 * char                               next().charAT(0);
 * 
 * class
 * string
 * word                               next()
 * stop reading when space key is pressed
 * line                               nextLine()
 * stop reading when enter key is pressed
 * 
 * 
 * 
 */


public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		
		int  a,b;
		
		System.out.println("enter the value of a:");
		a=sc.nextInt();
		
		System.out.println("enter the value of b:");
		b=sc.nextInt();
		
		System.out.println("sum is :"+(a+b));
		
		char ch;
		
		System.out.println("enter a character");
		ch=sc.next().charAt(0);
		
		System.out.println("char is :"+ch);
//   string name;
//   System.out.println("enter your name:");
//   name=sc.next();
//
//
// System.out.println("name is :"+name);
//tLine();//buffer clean
		String name12;
		
		System.out.println("enter full name:");
		name12=sc1.nextLine();
		System.out.println("full name is :"+name12);
		
		
		
		
	}

}
