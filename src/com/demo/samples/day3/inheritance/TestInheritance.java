package com.demo.samples.day3.inheritance;

public class TestInheritance {

	public static void main(String[] args) {

		// Instance with Parameterize Constructor
		Animal dog = new Animal("Tommy", "Small Dog", 5, "Black");
		// calling super class method because reference to super class
		System.out.println(dog.print());

		Dog dog_tiny = new Dog("Tiny", "Small Dog", 4, "Black", "Bichon Friese");
		// calling super class method because reference to super class
		System.out.println(dog_tiny.print());

		Dog dog_big = new Dog("Tufan", "Big Dog", 4, "White", "Spotted");
		// calling sub class method because reference to sub class
		System.out.println(dog_big.print());
	}
}
