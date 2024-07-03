package com.oops;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

import com.basic.interchange;

/*
 * Array:collection of data of similar type
 * 1.start with index 0
 * 2.size=length-1
 * 3.if data enter is greater than the size 
 * it will give exception ArrayIndexOutofBound()
 * 
 *  types:
 *  1 D Array
 *  2 D Array
 *  jagged/ragged Array
 * 
 *  
 *  new
 */

public class ArrayDemo {
	public static void main(String[] args) {
		//syn:datatype[][variable_name]=new datatype[size];
		
		int[] a=new int[5];
		
		for ( int i=0;i<4;i++) {
			a[i]=i+1;
			
		}
		for (int j=0;j<a.length;j++) {
			System.out.println(a[j]);
			
		}
		
		// 23 4 67 2 5 
		//selection sort 
		Scanner sc=new Scanner(System.in);
		int[]
        num=new int [5];
		System.out.println("enter the values:");
		for (int i =0; i<num.length;i++) {
			
			num[i]=sc.nextInt();
		}
		
// for (int i=0;i<num.length;i++){	
// for (int j=i+1;j<num.length;j++)
//		if(num[i]>num[j]) {
		
//		
//int temp=num[i];//23
//num[i]=num[j];//4
//num[j]=temp;//23
//			
//		}
//		
//	 }
// }
		

Arrays.sort(num);
	
	System.out.println("sorted Array");
	for (int i=0;i<num.length;i++) {
		
		System.out.println(num[i]);
	}
}
}


