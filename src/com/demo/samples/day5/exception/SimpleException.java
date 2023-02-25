package com.demo.samples.day5.exception;

//Java program to demonstrate how exception is thrown.

class SimpleException {

	public static void main(String args[]) {

		try {
			String str = "hello";
			System.out.println(str.length());
			// str=null;
			//System.out.println(str.toString());
			
			System.out.println("stat after exception ");

		} catch (Exception e) {
		//	System.out.println(" str is ::" + e);
			e.printStackTrace();
		}
		System.out.println("Simple exception");

	}
}
