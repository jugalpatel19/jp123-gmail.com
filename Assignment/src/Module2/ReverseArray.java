package Module2;
/*
 * 
 /* WAP to reverse an array of integer values.
 */

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
int[] a= {1,2,3};
		
		System.out.println("orignal array :"+Arrays.toString(a));
		
		for (int i = 0; i < a.length/2; i++) {
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
			
			System.out.println("Revers Array :"+Arrays.toString(a));
		}
		
	
	}

}
