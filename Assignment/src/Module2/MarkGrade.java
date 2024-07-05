package Module2;

import java.util.Scanner;

/*
 *  W.A.J.P. which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks Grade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
 * 
 * 
 */

public class MarkGrade {
public static void main(String[] args) {
	int marks[] = new int[3];
    int i;
    float total=0, avg;
    Scanner sc=new Scanner(System.in);
	
    
    for(i=0; i<3; i++) { 
       System.out.print("Enter Marks of Subject"+(i+1)+":");
       marks[i] = sc.nextInt();
       total = total + marks[i];
    }
    sc.close();
    //Calculating average here
    avg = total/3;
    System.out.print("The student Grade is: ");
    if(avg>=100)
    {
        System.out.print("AA");
    }
    else if(avg>=81 && avg<90)
    {
       System.out.print("BB");
    } 
    else if(avg>=71 && avg<80)
    {
        System.out.print("BC");
    }
    else if (avg>=61 && avg<70) {
        System.out.print("CD");
    }
    else if (avg>=51 && avg<60) {
        System.out.print("DD");
    }
    else if (avg<=40) {
        System.out.print("Fail");
    }
    else {
		System.out.println("out of range");
	}
	
}
}
