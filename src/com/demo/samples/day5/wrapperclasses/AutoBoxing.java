package com.demo.samples.day5.wrapperclasses;

//Java program to demonstrate Autoboxing

import java.util.ArrayList;

class Autoboxing {
	public static void main(String[] args) {
		char ch = 'a';

		// Autoboxing- primitive to Character object conversion
		Character charObj = ch;

		ArrayList<Character> arrayList = new ArrayList<Character>();

		// Autoboxing because ArrayList stores only objects
		arrayList.add(charObj);

		// printing the values from object
		System.out.println(arrayList.get(0));
	}
}