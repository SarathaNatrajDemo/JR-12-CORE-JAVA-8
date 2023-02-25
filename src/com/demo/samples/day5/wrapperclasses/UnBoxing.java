package com.demo.samples.day5.wrapperclasses;

//Java program to demonstrate Unboxing
import java.util.ArrayList;

class Unboxing {
	public static void main(String[] args) {
		Character ch = 'a';
		
		Character charObj = new Character('d');
		
		Integer num1 = 78;
		
		Integer num2 = new Integer(8);	

		// unboxing - Character object to primitive conversion
		char a = ch;

		ArrayList<Character> arrayList = new ArrayList<Character>();
		arrayList.add(ch);
		
		ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
		arrayListInt.add(num2);
		arrayListInt.add(num1);
		
		int n1 = num1;
		int n2 = num2;
		

		// unboxing because get method returns an Integer object
		 a = arrayList.get(0);

		// printing the values from primitive data types
		System.out.println(a);
		
		System.out.println(arrayListInt.get(0));
		System.out.println(arrayListInt.get(1));
		
		// printing the values from primitive data types
				System.out.println(n1+" "+n2);
				
	}
}
