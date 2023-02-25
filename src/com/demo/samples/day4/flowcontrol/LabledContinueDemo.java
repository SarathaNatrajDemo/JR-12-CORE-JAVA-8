package com.demo.samples.day4.flowcontrol;

public class LabledContinueDemo {

	public static void main(String[] args) {

		// nested for loop -
		System.out.println();
		System.out.println(" PATTERN 1");
		start: for (int i = 1; i < 10; i++) {
			System.out.println();
			// System.out.print(i);
			for (int j = 1; j < 10; j++) {
				// System.out.print("*");
				System.out.print(j);
				if (j >= i)
					continue start;
			}
			System.out.println("This will never" + " be printed");
		}
		// System.out.println("aasa");

		System.out.println();
		System.out.println(" PATTERN 2");
		start: for (int i = 1; i < 10; i++) {
			System.out.println();
			// System.out.print(i);
			for (int j = 1; j < 10; j++) {
				// System.out.print("*");
				System.out.print(i);
				if (j >= i)
					continue start;
			}
			System.out.println("This will never" + " be printed");
		}
		
		System.out.println();
		System.out.println(" PATTERN 3 ");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i);
			System.out.println("");
		}
	}

}
