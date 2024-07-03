package com.basic;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * for i
 * initialization
 * first no of pattern
 * 
 * condition
 * largest/smallest no in pattern
 * 
 * smallest to largest <=
 * largest to smallest >=
 * 
 * incree/decree
 * <= ++
 * >= --
 * 
 * 
 * for j 
 * intialization 
 * first col of each row
 * same no: that no only
 * diff no: upper loop name
 * 
 * condition
 * last col of each row
 * same no: that no only
 * diff no: upper loop name 
 * 
 * check each row
 * smallest to largest <=
 * largest to smallest >=
 * 
 * incree/decree
 * <= ++
 * >- --
 * 
 * 
 * for k:
 * 1. k completely depends on i{		
 * 
 * 5
 * 54
 * 543
 * 5432
 * 54321
 * 
 * 1
 * 21
 * 321
 * 4321
 * 54321
 * 
 * 1
 * 10
 * 101
 * 1010
 * 10101
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * %2
 * 
 * a
 * ab
 * abc
 * abcd
 * abcde
 * 
 * 
 * 
 * 
 * 
 */

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class PatternDemo1 {
	public static void main(String[] args) {
		for (int i=5;i>=1;i--) {
			for (int j=i; j<=5; j++) {
				System.out.print(j);
			}			System.out.println();	
for ( int i =5; i>=1;i--) {
	for ( int j=5; j>=i;j--) {
	System.out.print(j);
	
	}
	System.out.println();
}


		for (int i=1;i <=5;i++) {
			for (int j=i;j>=1; j--) {
				System.out.print(j);
}
		System.out.println();
}		for(int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}
		
		for(int i=65;i<=69;i++) {
			for (int j =65;j <=i;j++) {
				System.out.print((char)j);
			}
			System.out.println();
		

			for ( int i=1;i<=5;i++) {
				for ( int k=i;k<=5;k++) {
					System.out.print(" ");
				}
				for (int j =1; j<=i; j++) {
					System.out.print(" "+j);
				}
				System.out.println();
			}
			
}
}