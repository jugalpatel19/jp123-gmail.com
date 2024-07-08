package com.collection;

import java.util.HashSet;
import java.util.Iterator;

import com.basic.NewDemo;

/*
 * 
 * HashSet:
 *   1. it is a dynamic array
 *   2.Automatically implements List interface
 *   3.Automatically shrink and grow
 *   4.Default size is 0
 *   5.default value is []
 *   6.All value has its own hash key
 *   7.All hash key are converted into hash code
 *   8.All value are displayed hash code wise
 *   9.Duplicate value are not allowed
 *   10.add() and remove() method
 *   
 *   
 *   
 *   
 * 
 */

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
		System.out.println("Default value is :"+h1);
		System.out.println("Default size is :"+h1.size());
		
		h1.add(885);
		h1.add(34.54f);
		h1.add('J');
		h1.add("jugal");
		h1.add(new Integer(100));
		
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is :"+h1.size());
		
		h1.add("jugal");
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is :"+h1.size());
		
Iterator i1=h1.iterator();
		
		while (i1.hasNext()) {
		System.out.println(i1.next());
		
		
		
		
		
		
	}
		
	}

}
