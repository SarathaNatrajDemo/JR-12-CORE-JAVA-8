package com.demo.samples.day4.flowcontrol;

public class SimpleContinueDemoo {

	   public static void main(String[] args) {
	      String[] listOfNames = { "Ravi", "Soma",
	         "null", "Colin", "Harry", "null",
	         "Smith" };

	    //  for (int i = 0; i < listOfNames.length; i++) {
	      // enhanced for loop
	      for(String name : listOfNames) {
	         if (name.equals("null"))
	            continue;
	         System.out.println(name);
	      }
	   }
	}

