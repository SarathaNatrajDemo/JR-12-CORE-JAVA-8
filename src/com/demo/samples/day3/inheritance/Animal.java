package com.demo.samples.day3.inheritance;

//POJO Class
public class Animal {
	// private variables
	private String name;
	private String breed;
	private int age;
	private String color;

	//empty constructor
	public Animal() {
		System.out.println("EMPTY CONSTRUCTOR - BASE CLASS ");
		
	}
	// Getter and setter methods - parameterised constructor
	public Animal(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
		System.out.println("PARAMETERISED CONSTRUCTOR- BASE CLASS");
	}

	// Method of class
	public String print() {
		return "Animal [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}
}
