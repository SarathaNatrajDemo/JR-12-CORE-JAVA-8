package com.demo.samples.day4.arrays;

//Java program to demonstrate
//passing of array to method

public class PassArraysToMethod {
	// Driver method
	public static void main(String args[]) {
		int arr[] = { 3, 1, 2, 5, 4 };

		// passing array to method m1
		int sum = sum(arr);
		System.out.println("sum of array values : " + sum);

	}

	public static int sum(int[] arr) {
		// getting sum of array values
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		
		return sum;
	}
}
