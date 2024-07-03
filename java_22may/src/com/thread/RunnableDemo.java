package com.thread;

import com.basic.interchange;

class second implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i= 1;i<=5;i++) {
			 System.out.println("this is second thread");
			 try { Thread.sleep(2000);
			 
			 }catch (InterruptedException e) {
				 
				 e.printStackTrace();
			 }
	}
	 }
}

public class RunnableDemo {
	public static void main(String[] args)throws InterruptedException {
		second s1=new second();
		
		Thread t1=new Thread(s1);
		t1.start();
		
		for(int i= 1; i<=5; i++) {
			System.out.println("this is first thread");
			Thread.sleep(2000);
		
		
	}
	}
}
