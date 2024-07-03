package com.thread;

import com.basic.interchange;

/*
 * 
 * Thread : light weight process
 * main is thread
 * whenever a process start
 * 
 * multi thread:multiprocessing,multitasking
 * 
 * thread life cycle
 * newborn
 * runnable
 * running
 * block
 * dead
 * 
 * thread can be achieved in 2 ways
 * 1.by using thread class
 * 2.by using runnable interface
 */
class First extends Thread{
	public void run() {
		for(int i= 1; i<=5; i++) {
			System.out.println("this is first thread");
			try {
				Thread.sleep(2000);
				
			}catch ( InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		First f1=new First();
		f1.start();
		
		for (int i=1; i<=5;i++) {
			System.out.println("this is main thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
