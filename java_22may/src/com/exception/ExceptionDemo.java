package com.exception;
/*
 * Exception: any abnormal condition
 * Exception class is a root class for all exception
 * 1.compile time error:syntax error , ; , }missing
 * 
 * 2.runtime time error:Arithmetic exception,ArrayIndexOutOfBound
 * NumberFormetException etc
 * 3.error: developer mistake
 * 
 * keywords:
 * 1.try:
 *      1.if you doubt that a code may have error it should be  written in try block 
 *      2.the code which have error will be skipped and remaining code must be executed
 *      3.try throw the error to catch block
 *      4.try must be followed by catch block or finally or both
 *   
 * 2.catch:
 *      1.whenever error is thrown by try block
 * catch block handle the error
 *      2.there may multiple catch
 * 3.finally
 *         1.whether error is there or not finally block will be executed
 * 4.throw
 * 5.throws     
 * 
 * 
 */



public class ExceptionDemo {
	public static void main(String[] args) {
		
		int a=10,b=0;
		int []num=new int [3];
		
		try {
			System.out.println("division is:"+a/b);
			for (int i=0;i<3;i++) {
				num[i]=i+1;
				System.out.println(num[i]);
				
			}
		
		System.out.println();
	}catch(ArithmeticException e){
		e.printStackTrace();
//		System.out.println("something is wrong");
	}
//	}catch (ArrayIndexOutOfBoundsException e) {
//		e.printStackTrace();
//	}
	
	finally {
	System.out.println("this code is written by Ajay");
	System.out.println("ph is 1234567890");
}


}
}
