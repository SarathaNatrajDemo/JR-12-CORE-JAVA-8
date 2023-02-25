package com.demo.samples.day3.inheritance;

public class Dog extends Animal {
	private String type;

	public Dog(String name, String breed, int age, String color, String type) {
		// call super class constructor to initialize
		//THIS WILL CALL BASE CLASS PARAMETERISED CONSTRUCTOR 
		super(name, breed, age, color);
		this.type = type;
		System.out.println("PARAMETERISED CONSTRUCTOR - SUB CLASS ");
	}

	// Overriding method of parent class- Method overriding
	@Override
	public String print() {
		return "Dog [type=" + type + ", print()=" +  super.print() + "]";
		//return "Dog [type=" + type+ "]";
	}
}