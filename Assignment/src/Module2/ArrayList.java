package Module2;

import java.util.Arrays;
import java.util.List;

/*
 * 
 /* WAP to iterate through all elements in an array list.
 */




public class ArrayList  {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3,4, 5, 6, 7, 8,9,10);

		for (int i = 0; i < numbers.size(); i++) 
	          
            System.out.print(numbers.get(i) + " ");
	
	}

}
