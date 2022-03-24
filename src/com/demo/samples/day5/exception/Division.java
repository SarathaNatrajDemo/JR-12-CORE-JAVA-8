package com.demo.samples.day5.exception;

//Java program to demonstrate working of try,
//catch and finally

class Division {
	public static void main(String[] args) {
		int a = 10, b = 5, c = 5, result;
		try {
			result = a / (b - c);
			System.out.println("result" + result);
		}

		catch (Exception e) {
			System.out.println("Exception caught:Division by zero");
		}

		finally {
			System.out.println("I am in final block");
		}
	}
}
