package com.demo.samples.day4.flowcontrol;

// code below uses the monthly number to calculate the month name:

public class SwitchDemo {

	public static void main(String[] args) {

		int month = 8;

		switch (month) {
		case 1:
			System.out.println("January");
			break;

		case 2:
			System.out.println("February");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:

			System.out.println("April");
			break;

		case 5:

			System.out.println("May");
			break;

		case 6:

			System.out.println("June");
			break;

		default:
			System.out.println("In next half");

		}

	}

}
