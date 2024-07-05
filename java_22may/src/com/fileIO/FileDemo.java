package com.fileIO;
/*
 * file is class
 */

import java.awt.DisplayMode;
import java.io.File;
import java.io.IOException;
import java.security.PublicKey;

class FDemo{
	File file;
	
	public FDemo() {
	
	file= new File("file3.txt");
	try {
		file.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	display();
	}
	public void display() {
		System.out.println("is file or not:"+file.isFile());
		System.out.println("is directory or not:"+file.isDirectory());
		System.out.println("can writer or not:"+file.canWrite());
		System.out.println("can read or not:"+file.canRead());
		System.out.println("file name:"+file.getName());
		System.out.println("file path:"+file.getPath());
		System.out.println("get absoulte file path:"+file.getAbsolutePath());
		
	}
}
public class FileDemo {
	public static void main(String[] args) {
		new FDemo();
	}
}
