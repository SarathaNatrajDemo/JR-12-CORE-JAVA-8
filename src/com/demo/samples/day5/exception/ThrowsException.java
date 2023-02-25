package com.demo.samples.day5.exception;

//Java program to demonstrate working of throws
class ThrowsExeception {

	// This method throws an exception
	// to be handled
	// by caller or caller
	// of caller and so on.
	static void fun() throws Exception {
		int a= 10, b=0,result=0;
		result = a/b;
		System.out.println("Inside fun(). ");
		/*IllegalAccessException iae =new  IllegalAccessException("ahhhs");
		throw iae;
*/	}

	// This is a caller function
	public static void main(String args[]) {
		try {
			fun();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}