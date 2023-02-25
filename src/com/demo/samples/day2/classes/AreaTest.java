package com.demo.samples.day2.classes;

import java.util.Scanner;

 class AreaTest {
	public static void main(String[] args) {
		
		
		System.out.println(" Enter the breadth & length ");
		Scanner sc = new Scanner(System.in);
		double len = sc.nextDouble();
		double bre = sc.nextDouble();
		
		//Calling an empty constructor
		Rectangle rectObj = new Rectangle() {
			@Override
			public double getPerimeter() {
				return 0;
			}
		};
		System.out.println(rectObj.length);
		rectObj.setDim(len, bre);
		System.out.println("Area :: "+rectObj.getArea());
		
		
		 System.out.println(" Enter the breadth & length ");
		 len = sc.nextDouble();
		 bre = sc.nextDouble();
		 
		//Call a parameterised constructor
		 Rectangle rectObj1 = new Rectangle(len, bre) {
			 @Override
			 public double getPerimeter() {
				 return 0;
			 }
		 };
		 System.out.println("Area :: "+rectObj1.getArea());
		 
	}

}
