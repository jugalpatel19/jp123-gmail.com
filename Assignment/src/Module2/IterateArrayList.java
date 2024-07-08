package Module2;
/*
 * 
 /* WAP to iterate through all elements in an array list.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList  {
	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		
		
		
		a1.add("apple");
		a1.add("vivo");
		a1.add("oppo");
		a1.add("realme");
		a1.add("oneplus");
		
		System.out.println("Now value is :"+a1);
		System.out.println("Default size is:"+a1.size());
		
		Iterator i1=a1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
			
		}
	}

}
