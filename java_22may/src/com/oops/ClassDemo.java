package com.oops;
/*
 * OOP: object oriented programming
 * 1. to organize the code
 * 2.to create less object
 * 3.reduce code redundancy
 * 
 * concept of oops
 * 1. class
 * 2. object
 * 3. encapsulation
 * 4. inheritance
 * 5. polymorphism
 * 6. abstraction
 * 
 * class: it is a collection of data member and member function
 * 
 * 
 * 
 * 
 * 
 */

import java.security.PublicKey;

class student {
	
	int roll_no;
	String name;
	
	public void setData() {
		roll_no=1;
		name="jay";
	}
		
		public void display() {
			System.out.println("roll no is :"+roll_no);
			System.out.println("name is :"+name);
		
	}

public class ClassDemo {
	public static void main(String[] args) {
		//class_name obj_name=new class_name();
		student s1=new student();
		s1.setData();
		s1.display();
		
	}
}

}
