package com.demo.samples.day4.flowcontrol;

//Java program to illustrate enhanced for loop
public class EnhancedForLoopDemo {
	public static void main(String args[]) {
		String array[] = { "Ron", "Harry", "Hermoine" };

		// enhanced for loop
		for (String x : array) {
			System.out.println(x);
		}
System.out.println("normal for loop >>>>");
		
		  //for loop for same function 
		  for (int i = 0; i < array.length; i++) {
			  System.out.println(array[i]);
		 }
		 
	}
}