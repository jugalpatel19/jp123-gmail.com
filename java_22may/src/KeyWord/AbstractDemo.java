package KeyWord;

abstract /*
 * 
 * Abstract : Details are hidden only essential info is shown 
 * 
 * 
 * use with class:
 * 1.Abstract class cannot create object
 * 2.must inherit into some other class
 * 
 * use with method;
 * 1.abstract method cannot have method body
 * 2.must override into child class
 * 3.abstract method must have abstract class
 * 
 * 
 */

class Ademo {
	int roll_no;
	String name;
	
	public void setData() {
		roll_no=123;
		name= "ajay";
	}
	public abstract void show();
	
	
}
class Demo extends Ademo 
{
	public void show() {
		System.out.println("roll no :"+roll_no);
		System.out.println("name is "+name);
		
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		//ADemo ad=new ADemo();
		Demo d1=new Demo();
		d1.setData();
		d1.show();
		
	}

}

