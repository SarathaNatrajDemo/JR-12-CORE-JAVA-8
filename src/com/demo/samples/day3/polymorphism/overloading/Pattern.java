package com.demo.samples.day3.polymorphism.overloading;

public class Pattern {
	// method without parameter
	public void display() {
		
		//for(initialisation; condition ; incrementation/decrementation){
		// statements
		//}
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
	}


	// method with single parameter
	public void display(char symbol) {
		for (int i = 0; i < 10; i++) {
			System.out.print(symbol);
		}
	}
}
