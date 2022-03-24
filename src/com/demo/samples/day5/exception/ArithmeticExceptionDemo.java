package com.demo.samples.day5.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Java program to demonstrate ArithmeticException
public class ArithmeticExceptionDemo {
	public static void main(String args[]) {
		try {
			int a = 30, b = 0;
			int c = a / b; // cannot divide by zero
			System.out.println("Result = " + c);
			
			//Java program to demonstrate NullPointerException
			// String a = null; //null value
	           // System.out.println(a.charAt(0));
			
			// Java program to demonstrate StringIndexOutOfBoundsException
			//String a = "This is like chipping "; // length is 22
            //char c = a.charAt(24); // accessing 25th element
			
			//Java program to demonstrate FileNotFoundException
		//	File file = new File("E://file.txt");
		//	 try {
			//	FileReader fr = new FileReader(file);
		//	} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
			
			// Java program to demonstrate NumberFormatException
			// "akki" is not a number
           // int num = Integer.parseInt ("akki") ;
           //  System.out.println(num);
			
			
			// Java program to demonstrate ArrayIndexOutOfBoundException
			//  int a[] = new int[5];
	        //    a[6] = 9; // accessing 7th element in an array of size 5
			
			
	       
		} catch (ArithmeticException e) {
			System.out.println("Can't divide a number by 0");
		}
	}

}
