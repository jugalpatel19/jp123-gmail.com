package KeyWord;
/*
 * Final : constant at value side
 * 
 * use with 
 * variable : constant at value side
 * 1. value must be given at the time of declaration
 * 2. at runtime as well as at compile time value cannot be changed
 * 
 * class : opp of abstract class
 * 
 * method : opp of abstract method
 * 
 */

final class FDemo{
	int id;
	String app_name="Tops";
	
	public final void show() {
		System.out.println("Enter id :"+id);
		System.out.println("App name is :"+app_name);
	}
}
//class Demo extends FDemo{
//	public void setData() {
//		id=1;
//		app_name="tops te";
//	}
//}

public class FinalDemo {
	public static void main(String[] args) {
		FDemo fd=new FDemo();
		fd.show();
	}
}


