package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.basic.NewDemo;

/*
 * 
 * Collection: to collect primitive and non primitive 
 * values into a single object
 * 
 * it contains class and interface
 * 
 * class
 * 1.ArrayList
 *   1. it is a dynamic array
 *   2.Automatically implements List interface
 *   3.Automatically shrink and grow
 *   4.Default size is 0
 *   5.default value is []
 *   6.The sequence in which data is added and removed the same sequence it will display
 *   7.Duplicate values are allowed
 *   8.add() and remove() method
 *   
 * 2.HashSet
 * 3.HashMap
 * 4.Vector
 * 5.Generic
 * 
 * Interface:
 * 
 * 1.List
 * 2.Set
 * 3.Map
 * 4.Iterator
 * 1.when you want display the values in list instead of[]
 * we use iterator
 * steps:
 *   1.first give all value to iterator object
 *   2.use loop to traverse each object
 *   3. to display value
 * 5.enumeration
 * 
 */

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		
		System.out.println("Default value is :"+a1);
		
		
		a1.add(12);
		a1.add(56.45f);
		a1.add("jugal");
		a1.add('J');
		a1.add( new Integer(150));
		
		System.out.println("Now value is :"+a1);
		System.out.println("Default size is:"+a1.size());
		a1.add("jugal");
		System.out.println("Now value is :"+a1);
		System.out.println("Default size is:"+a1.size());
		a1.remove(0);
		System.out.println("Now value is :"+a1);
		System.out.println("Default size is:"+a1.size());
		a1.remove("jugal");
		System.out.println("Now value is :"+a1);
		System.out.println("Default size is:"+a1.size());
		
		
		
		Iterator i1=a1.iterator();
		
		while (i1.hasNext()) {
		System.out.println(i1.next());
		
		
		
		
		
		
	}

}
}

