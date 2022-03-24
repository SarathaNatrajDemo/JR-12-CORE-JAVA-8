package com.demo.samples.day4.flowcontrol;

public class NestedSwitchDemo {

	public static void main(String[] args)	{

		String Branch = "ECE";
		int year = 2;

		switch (year) {

		case 1:
			System.out.println("elective courses : Advance Maths, Algebra");
			break;

		case 2:
			switch (Branch)
			{
			case "CS":
				System.out.println(" CS Dept... ");
			case "ECE":
				System.out.println("elective courses : ML, Big Data");
				break;

			case "IT":
				System.out.println("elective courses : Software Engineering");
				break;

			default:
				System.out.println("Elective courses : English");
			}

		}

	}

}
