package com.oops;
/*
 * Inheritance :making a class with the help of another class
 * deriving the attribute of some other class
 * 
 * re usability
 * extensibility
 * less object creation
 * use : extends"keyword to inherit the parent class 
 * 
 * types:
 * 1.single:one parent one child
 * 2.multilevel:one grandparent one parent one child
 * 3.hierarchical:one parent multiple child 
 * 4.multiple :multiple parent single child (not directly supported in java)
 * 5.hybrid:combination any two type
 * 
 * 
 * object will be created for last only
 * 
 */

class  Student1234 
{
	protected int  id;
	protected String name;
	
	public void setData() 
	{
		id= 1;
		name="Ajay";
	}
}
class Sports1 extends Student1234
{
	int sports_marks=85;
	
	public void show() 
	{
		System.out.println("id is:"+id);
		System.out.println("name is :"+name);
		System.out.println("sports marks:"+sports_marks);
		
	}
}
public class InheritanceDemo {
	public static void main(String[] args) 
			{
				Sports1 sp=new Sports1();
				sp.setData();
				sp.show();
		
	
}
}
