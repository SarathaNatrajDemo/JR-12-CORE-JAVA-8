package com.demo.samples.day5.exception;

//Java program to demonstrate working of throws
class ThrowsExeception {

	// This method throws an exception
	// to be handled
	// by caller or caller
	// of caller and so on.
	static void fun() throws IllegalAccessException {
		System.out.println("Inside fun(). ");
	 IllegalAccessException iae =new  IllegalAccessException(); 
		throw iae;
	}

	// This is a caller function
	public static void main(String args[]) {
		try {
			fun();
		} catch (IllegalAccessException e) {
			System.out.println("caught in main   saasaas."+e.getLocalizedMessage());
		}
	}
}