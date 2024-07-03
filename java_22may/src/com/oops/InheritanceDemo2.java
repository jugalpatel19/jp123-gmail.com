package com.oops;
/*
 * Hierarchical Inheritance:
 * Single parent multiple child
 * 
 * 
 */

class parent {
	String p_name;
	long ph_no;

	
	public void setParent() {
		p_name="jay patel";
		 ph_no = 9879887787l;
	}
}
class child1 extends parent{
	String name ="ajay";
	
	public void show() {
		System.out.println("for any complains of "+name+""+p_name+" call "+ph_no);
		
	}
}

class child2 extends parent{
	String name = "vijay";
	
	public void show() {
		System.out.println("for any complains of "+name+""+p_name+" call "+ph_no);
		
	}
}

public class InheritanceDemo2 {
public static void main(String[] args) {
	child1 child1=new child1();
	child2 child2=new child2();
	
	child1.setParent();
	child1.show();
	
	child2.setParent();
	child2.show();
}
}
