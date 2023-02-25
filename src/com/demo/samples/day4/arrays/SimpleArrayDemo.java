package com.demo.samples.day4.arrays;

public class SimpleArrayDemo {
	public static void main(String[] args) {
		  
		   // create an array
			// initialise the array
		   int[] age = {12, 4, 5, 2, 5};
		   int index = 4;

		   // access each array elements
		   System.out.println("Accessing Elements of Array:");
		   System.out.println("First Element: " + age[0]);
		   System.out.println("Second Element: " + age[1]);
		   System.out.println("Third Element: " + age[2]);
		   System.out.println("Fourth Element: " + age[index]);
		   System.out.println("Fifth Element: " + age[4]);

		   
		   System.out.println(age[0] + age[1]);
		   
		   // loop through the array
		   // using for loop
		   System.out.println("Using for Loop:");
		   for(int i = 0; i < age.length; i++) {
		     System.out.println(age[i]);
		   }
		   
		   // loop through the array - jdk1.5
		   // using for loop other for each loop
		   System.out.println("Using for-each Loop:");
		   for(int x : age) {//for(datatype variablename : arrayname){}
		     System.out.println(x);
		   }
		   		 }

}
