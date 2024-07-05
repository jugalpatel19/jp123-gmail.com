package Module2;
/*
 * WAP to remove the third element from a array list.
 */
import java.util.ArrayList;
import java.util.List;

public class RemoveArray {
	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");

		  System.out.println(list_Strings);

		  list_Strings.remove(1);
		   
		  System.out.println(list_Strings);
	
	}

}
