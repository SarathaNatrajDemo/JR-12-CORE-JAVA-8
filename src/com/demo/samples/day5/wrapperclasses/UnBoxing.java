package com.demo.samples.day5.wrapperclasses;

//Java program to demonstrate Unboxing
import java.util.ArrayList;

class Unboxing {
	public static void main(String[] args) {
		Character ch = 'a';

		// unboxing - Character object to primitive conversion
		char a = ch;

		ArrayList<Character> arrayList = new ArrayList<Character>();
		arrayList.add(ch);

		// unboxing because get method returns an Integer object
		 a = arrayList.get(0);

		// printing the values from primitive data types
		System.out.println(a);
	}
}
