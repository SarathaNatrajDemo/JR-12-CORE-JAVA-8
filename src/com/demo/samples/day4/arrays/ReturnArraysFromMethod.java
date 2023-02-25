package com.demo.samples.day4.arrays;

//Java program to demonstrate
//return of array from method
public class ReturnArraysFromMethod {
	// Driver method
	public static void main(String args[]) {
		int arr[] = m1();

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		//C++, not in JAVA
		//int a[] = new long[20];
		
		long[] primes = new long[20];
		primes[23] = 22;

	}
	
	//public returntype/void mathodname(parameters){ 
	// stmts
	//}

	public static int[] m1() {
		// returning array
		return new int[] { 1, 2, 3,4,5,89,78,23 };
	}

}
