package com.oops;
/*Encapsulation:wrapping of data
 * access specifier
 * 1.private: only access within  a class
 * 2.protected: only access given to the child
 * 3.default : only accessible within a package
 * 4.public :accessible everywhere
 */



class student123 {
	
	private int roll_no;
	protected String name;
	
	public void setData() {
		roll_no=1;
		name="jay";
		
	}
	public void display() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is :"+name);
		}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		//class_name obj_name =new class_name();
		student123 s1=new student123 ();
		s1.setData();
		s1.display();
		
		
		
System.out.println("roll no is:"+s1);
	  System.out.println("name is :"+s1.name);
		
	}

}
