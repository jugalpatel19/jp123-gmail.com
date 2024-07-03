package com.basic;

public class SwitchDemo {
	public static void main(String[] args) {
		
		int choice=2;
		
	switch (choice) {
	case 1:
		System.out.println("light is on");
		break;
	case 2:
		System.out.println("fan is on");
		break;
	case 3:
		System.out.println("ac is on");
		break; 
	}
	
	//vowel and conconent 
	char ch='y';
	
	switch (ch) {
	case'a':
	case'e':
	case'i':
	case'o':
	case'u':
	case'A':
	case'E':
		
		System.out.println("vowel!!!!");
		break;
		
		default:
			System.out.println("consonant");
			break;
			
			
	}
	    
		
		
	}

}
