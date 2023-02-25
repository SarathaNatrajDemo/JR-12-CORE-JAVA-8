package com.demo.samples.day5.exception;

import java.io.IOException;

//Java program to demonstrate

//control flow of try-catch-finally clause
//when exception occur in try block
//and handled in catch block

public class TryCatchFinally {

	public static void main(String[] args) {

		// array of size 4. 0,1,2,3,4
		int[] arr = new int[5];

		try {
			int num = arr[9];
			String str = null;
			System.out.println(str.length());

			// this statement will never execute
			// as exception is raised by above statement
			System.out.println("Inside try block "+num);
		}

		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception caught in catch block - array index out of bounds");
			ex.printStackTrace();
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Exception caught in catch block - null pointer");
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught in catch block - general");
			e.printStackTrace();
		}

		finally {
			System.out.println("finally block executed");
		}

		// rest program will be executed
		System.out.println("Outside try-catch-finally clause");
	}
}