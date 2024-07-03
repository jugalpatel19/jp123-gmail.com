package com.exception;
import java.util.Scanner;

/*
 * ATM :
 * deposit:
 * withdraw:
 * 2000
 * 5000
 * if you deposit 3000rs more you can withdraw 5000rs
 * 
 * Throw :
 * 		1.must use with user defined exception
 * 		2.must inherit Exception class into some user defined class to make it user defined exception
 * 		3.throw is written inside method
 * 		4.throw must be followed by "new" keyword and "constructor" 
 * 
 * Throws :
 * 		1.throws written after method declaration
 * 		2.we can throws user defines as well as system defined exception class
 * 		3.multiple class can be used with throws using ","
 * 
 */
class JayException extends Exception{
	double amount;
	public JayException(double amount) {
		this.amount=amount;
	}
	
}
class ATM{
	double ballance;
	public void deposit(double amount) {
//		ballance=ballance+amount;
		ballance+=amount;// short hand operator
		System.out.println("total ballance is :"+ballance);
	}
	public void withdraw(double amount) throws JayException {
		if(amount<=ballance) {
		ballance-=amount;
		System.out.println("amount withdraw is :"+amount+" remianing ballance is :" +ballance);
	}else {
		double needs=amount-ballance;
				
		throw new JayException(needs);
	}
	}
}

public class UserDefineException {
	public static void main(String[] args) {
		ATM atm=new ATM();
		Scanner sc=new Scanner(System.in);
		double amount;
		
		System.out.println("Enter is amount to be deposited :");
		amount=sc.nextDouble();
		
		
		atm.deposit(amount);

		System.out.println("Enter is amount to be Withdraw :");
		amount=sc.nextDouble();
		
		try {
			atm.withdraw(amount);
		} catch (JayException e) {
//			e.printStackTrace();
			System.out.println("If you deposit "+e.amount+"Rs more "+"you can withdraw "+amount+"Rs");
		}
		
	
	}

}
