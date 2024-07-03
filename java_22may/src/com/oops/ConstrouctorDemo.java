package com.oops;



/*
 * constructor: it is a special member function
 * which is initialized automatically
 * 1.same name as class name
 * 2.it has no return type
 * 3.it is automatically invoked whenever the object is created
 * 
 * types:
 * 1.default constructor (without parameter)
 * 2.parameterized constructor (with parameter)
 * 3.copy constructor(object as a parameter)
 * 
 */
class VolumeOfBox
{
	double length,width,height;
	//default costructor
	public VolumeOfBox() 
	{
		System.out.println("In Default constructor");
		length=1;
		width=2;
		height=3;
	}
	public VolumeOfBox(double l,double w,double h) {
		System.out.println("In Parameter constructor");
		length=l;
		width=w;
		height=h;
	}
	public VolumeOfBox(VolumeOfBox vob) {
		System.out.println("In Copy constructor");
		length=vob.length;
		width=vob.width;
		height=vob.height;
		
	}
	public void Volume() 
	{
		System.out.println("volume of box is:"+(length*width*height));
		
	}
}
public class ConstrouctorDemo {
	public static void main(String[] args) {
		VolumeOfBox dc=new VolumeOfBox();
		dc.Volume();
		
		VolumeOfBox pc=new VolumeOfBox(10,20,30);
		pc.Volume();
		
		VolumeOfBox cc=new VolumeOfBox(dc);
		cc.Volume();
		
		
		
	}
	}
