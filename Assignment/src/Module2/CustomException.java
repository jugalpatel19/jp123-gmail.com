package Module2;

import java.util.Scanner;

import javax.swing.tree.AbstractLayoutCache;


/*
 * 
 * W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance.
Account balance is:2000 Enter withdraw amount:2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.
 */
class JugalException extends Exception{
	double amount;
	public JugalException(double amount) {
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
	public void withdraw(double amount) throws JugalException {
		if(amount<=ballance) {
		ballance-=amount;
		System.out.println("amount withdraw is :"+amount+" remianing ballance is :" +ballance);
	}else {
		double needs=amount-ballance;
				
		throw new JugalException(needs);
	}
	}
}
public class CustomException{
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
		} catch (JugalException e) {
//			e.printStackTrace();
			System.out.println("Sorry,Insufficent balance "+"You need more "+e.amount+"Rs  "+"To Perform This Transaction ");
		}
		
	
	

	}
}