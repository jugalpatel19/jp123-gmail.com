package Module2;

import java.util.List;

import java.util.ArrayList;

/*
 * WAP to update specific array element by given element.
 */

public class SpecificArrayElement {
public static void main(String[] args) {
	List<String> list_Strings = new ArrayList();
	  list_Strings.add("Red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("White");
	  list_Strings.add("Black");

	  System.out.println(list_Strings);

	  list_Strings.set(4, "Yellow");
	   
	  System.out.println(list_Strings);
}

}