package Module2;
/*
 * 
 * WAP to demonstrate try catch block.
 */

public class TryCatch {
	public static void main(String[] args) {
		  try  
	        {  
	        int data=50/0; 
	        }  
	             
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("something is wrong");  
	   
	}

}
