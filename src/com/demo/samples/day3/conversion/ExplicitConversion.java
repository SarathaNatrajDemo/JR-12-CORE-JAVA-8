package com.demo.samples.day3.conversion;

public class ExplicitConversion {
	 
    // Main driver method
    public static void main(String[] argv)
    {
 
        // Declaring character variable
        char ch = 'c';
        // Declaring integer variable
        int num = 88;
        // Trying to insert integer to character
        ch = (char)num;
        
        System.out.println("ch :: "+ch);
    }
}
