package com.demo.samples.day4.flowcontrol;

public class LabeledBreakDemo {

	public static void main(String[] args) {
		int counter = 0;
		start: {
			for (int i = 0; i < 5; i++) {
				System.out.println();
				for (int j = 0; j <= 10; j++) {
					System.out.print("#");
					if (j >= 5)
						break start;
				}
				counter++;
			}
		}
		System.out.println("Comes out of the loop");
		System.out.println(counter);
	}
}