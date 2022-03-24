package com.demo.samples.day4.instancefo;

public class SimpleString {
	public static void main(String args[]) {
		String str1 = "Educative!";

		if (str1 instanceof String)
			System.out.println("str1 is instance of String");
		else
			System.out.println("str1 is NOT instance of String");
	}
}
