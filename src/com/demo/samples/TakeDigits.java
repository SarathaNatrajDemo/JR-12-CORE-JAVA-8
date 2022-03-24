package com.demo.samples;

import java.util.Scanner;

public class TakeDigits {
	public static void main(String[] args) {
		int num, sum, remainder, check; // check used as a boolean expression
	    sum = check = 0;

	    Scanner sc = new Scanner(System.in);
	    num =  sc.nextInt();
	    while (num > 0)
	    {
	        remainder = num % 10; // each time num is reduced

	        if (remainder != 9)
	        {
	            if (check == 0)
	                sum = (10 * sum) + (remainder + 1);
	            else
	            {
	                sum = (10 * sum) + (remainder + 2);
	                check = 0;
	            }
	        }
	        else
	        {
	            sum = (10 * sum) + 0;
	            check = 2;
	        }
	        num /= 10; // will divide and execute in each iteration until it's true
	    }

	    num = sum; // final number will be equal to the sum
	    sum = 0;

	    // Summing up the results
	    while (num > 0)
	    {
	        remainder = num % 10;
	        sum = (10 * sum) + remainder;
	        num /= 10;
	    }

	    System.out.println(sum);
	}
}
