package com.demo.samples.day5.exception;

//Java program to demonstrate working of try,
//catch and finally

class Division {
	public static void main(String[] args) {
		int a = 50, b = 5, c = 5, result;
		try {
			result = a / (b - c);
			System.out.println("result " + result);
			System.out.println("no exceptions ");
		}

		catch (Exception exeObj) {
			System.out.println("Exception caught:Division by zero ");
			exeObj.printStackTrace();
		}

		finally {
			System.out.println("I am in finally block");
		}

	}
}
