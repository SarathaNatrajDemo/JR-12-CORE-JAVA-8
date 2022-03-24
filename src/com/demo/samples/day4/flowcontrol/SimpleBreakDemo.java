package com.demo.samples.day4.flowcontrol;

public class SimpleBreakDemo {

	   public static void main(String[] args) {

	      int counter = 0;
	      for (int i = 0; i <= 6; i++) {//row
	         for (int j = 0; j <= 6; j++) { //column
	            if (i == 5)
	               break;	
	              System.out.println(" j "+j +"\t i : "+i); 
	            }
	         counter++;
	         }
	      System.out.println(counter);
	   }
	}
