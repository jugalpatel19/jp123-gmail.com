package com.oops;
/*
 * Function :dose something
 * 1.function without parameter without return type
 * 2.function with parameter without return type
 * 3.function without parameter with return type
 * 4.function with parameter with return type 
 * 
 * 
 * polymorphism ine name multiple form 
 * 
 * 1.function overloading 
 * same function name but diff parameter
 * 2.function overriding
 * 
 */


class Calc{
	int a,b,c;
	float a1,b1;
	
	public void sum() {
		a=45;
		b=5;
		
	}
	//2. function with parameter without return type
	public void sum (int num1,int num2 ) {
		a=num1;
		b=num2;
		
	}
	public void sum (float num1,float num2) {
		a1=num1;
		b1=num2;
		System.out.println("sum is:"+(a1+b1));
		
	}
		
	//3.function without parameter with return type
		
		       public int mul() {
		    	   a=852;
		    	   b=963;
		    	   return ( a*b);
		    			 
		       }
	//4. function with parameter with return type 
		      public int mul(int a,int b) {
		    	   
		    	  return (a*b);
		    	  
		       }
 public int mul(int a,int b,int c) {
	 return (a*b*c);
 }
 public void show() {
	 System.out.println("sum is:"+(a+b));
 }
	}
	

public class FunctionDemo {
	public static void main(String[] args) {
		
		Calc c1=new Calc();
		c1.sum();
		c1.show();
		c1.sum(123,100);
		c1.show();
		c1.sum(123.34f,100.78f);
		
		System.out.println("multiplication is:"+c1.mul());
		System.out.println("multiplication is:"+c1.mul (15,2));
		System.out.println("multiplication is :"+c1.mul(1,2,3));
	}

}
