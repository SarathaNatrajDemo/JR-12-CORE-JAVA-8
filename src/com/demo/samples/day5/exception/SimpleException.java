package com.demo.samples.day5.exception;

//Java program to demonstrate how exception is thrown.

class SimpleException {

	public static void main(String args[]) {

		try {
			String str = null;
			System.out.println(str.length());
			
			System.out.println("Simple exception");
		}catch (Exception objException) {
			System.out.println(" str is ::"+objException.getLocalizedMessage());
		}

	}
}
