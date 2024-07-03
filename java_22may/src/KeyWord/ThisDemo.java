package KeyWord;
/*
 * 
 * 1.when parameter variable name and class name are same
 * 2. use with class variable only
 */
class TDemo{
	int roll_no;
	String name;
	
	public void setData(int roll_no,String name) {
		this.roll_no=roll_no;
		this.name=name;
	}
	public void show() {
		System.out.println("roll_no is "+roll_no);
		System.out.println("name is "+name);
	}
}

public class ThisDemo {
	public static void main(String[] args) {
		TDemo td=new TDemo();
		td.setData(123,"Ajay");
		td.show();

	}
}
