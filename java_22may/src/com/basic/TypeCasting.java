package com.basic;
/*
 * type casting: convert one primitive datatype to 
 * primitive datatype another
 * types:
 * implicit(automatic):small datatype to bigger datatype
 * int 4 to long 8 
 * 
 * 
 * explicit:bigger datatype to smaller datatype
 * long to int
 * 
 *  
 */

public class TypeCasting {
	public static void main(String[] args) {
		int i1=10;//4
		
		long l1=i1;//8
		
		System.out.println("Implicit convversion:"+l1);
				
				int i2 =(int)l1;
				
				System.out.println("explicit coversion:"+i2);
				
				int i3 =131;
				
				byte b1=(byte) i3; //-128 -127 -126 to 127
				
				System.out.println("explicit int to byte:"+b1);
				
				char ch='A';//2
				int i4=ch; //4
				
				System.out.println("char to int :"+i4);
				
				
				
				
				
	}

}
