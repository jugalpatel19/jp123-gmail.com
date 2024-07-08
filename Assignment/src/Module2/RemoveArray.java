package Module2;
/*
 * WAP to remove the third element from a array list.
 */
import java.util.ArrayList;
import java.util.List;

public class RemoveArray {
	public static void main(String[] args) {
    	ArrayList r1= new ArrayList();
		
		
		r1.add("apple");
		r1.add("vivo");
		r1.add("oppo");
		r1.add("realme");
		r1.add("oneplus");
		
		System.out.println("Now value is :"+r1);
		System.out.println("Default size is:"+r1.size());
		
		r1.remove("oppo");
		System.out.println("Now value is :"+r1);
		System.out.println("Default size is:"+r1.size());
		
		
		
	}

}
