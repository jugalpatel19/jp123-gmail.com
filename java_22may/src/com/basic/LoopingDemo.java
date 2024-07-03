package com.basic;
/*
 * 	Loop:interative,repetitive
 * 
 * 1.Entry contro:
 * for
 * syn:
 * for(initialization;condition;incre/decree)
 * {
 * 
 * }
 * 
 * 
 * while
 * syn:
 * initilization;
 * while(condition){
 * statement;
 * incree/decree;
 * }
 * 
 * 
 * 2.Exit control
 * do while
 * 
 * initialization
 * do{
 * statement
 * incree/decree
 * }while(condition);
 * 
 * 
 */
	
public class LoopingDemo {
		public static void main(String[] args) {
			for (int i =1;i<5; i++) {
			System.out.println(i);
	}	
			//11 times loop is executed
			
			
			
			
			
			
			System.out.println("while loop");
			
			int j=1;//1
			
			while(j<=5) { //6
				System.out.println(j);//5
				j++;//5
			}
			//17 times loop is executed
			
			System.out.println("do while");
			
			int k=1;   //1
			
			do {
				System.out.println(k);
				k++;
			}while (k<=5);
			
			//21 times loop is executed
			}
}

