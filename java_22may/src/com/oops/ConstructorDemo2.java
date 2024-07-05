package com.oops;

import java.security.PublicKey;

/*
 * 
 * Overriding:
 * same function same parameter same return type
 * but different function body/function different
 * 
 * keyword:
 * super: call the function of immediate parent 
 * 
 * 
 */

class A{
	public void show() {
		System.out.println("In class A show");
	}
	public A() {
		System.out.println("In constructor A");
		
		
	}
}
class B extends A{
	public void show() {
		super.show();
		System.out.println("In class B show");
	}
	public B() {
		System.out.println("In constructor B");
	}
}
class c extends B{
	public void show() {
		super.show();
		System.out.println("In class C show");
		
	} 
	public c() {
		System.out.println("In constructor C");
}
}
public class ConstructorDemo2 {
	public static void main(String[] args) {
		c c=new c();
		c.show();
	}

}
