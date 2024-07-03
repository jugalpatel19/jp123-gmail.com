package com.oops;
/*
 * 2D Array:
 * 
 * combination of row and col
 * 
 * int[row][col]
 */

// com.basic.interchange;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		
	for (int i=0;i<3;i++) {
		for (int j=0;j<3;j++) {
			a[i][j]=j+1;
			System.out.print(" "+a[i][j]);
			
		}
		System.out.println();

}
	int [][] b=new int [3][3];
	for (int i=0;i<3;i++) {
		for (int j=0;j<3;j++) {
			b[i][j]=j+3;
			System.out.print(" "+b[i][j]);
			}
		System.out.println();
}
	System.out.println("sum of 2 arrays");
	int [][] c=new int [3][3];
	for (int i=0;i<3;i++) {
		for (int j=0;j<3;j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(" "+c[i][j]);
	
	}
		System.out.println();
}
	}
}
