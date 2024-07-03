package com.basic;

public class sum {
	public static void main(String[] args) {
		
	int no=12345,rem1,rem2,rem3,rem4,rem5,b ;//15
	
	rem1=no%10;//12345%10//5
	no=no/10;//1234
	rem2=no%10;//4
	no=no/10;//123
	rem3=no%10;//3
	no=no/10;//12
	rem4=no%10;//2
	no=no/10;//1
	rem5=no%10;//1
	no=no/10;
	
	b=rem1+rem2+rem3+rem4+rem5;
	
	System.out.println("sun of digit :"+b);
	
	
	
	
}
}