package com.demo.samples.day4.flowcontrol;

public class LabledContinueDemo {

	public static void main(String[] args) {

		start: 
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print("#");
				if (j >= i)
					continue start;
			}
			System.out.println("This will never" + " be printed");
		}
	}
}