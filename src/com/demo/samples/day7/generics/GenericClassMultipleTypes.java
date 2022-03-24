package com.demo.samples.day7.generics;

//Java program to show multiple
//type parameters in Java Generics

//We use < > to specify Parameter type
class TestGeneric<T, U> {
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	TestGeneric(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

//Driver class to test above
class GenericClassMultipleTypes {
	public static void main(String[] args) {
		TestGeneric<String, Integer> obj = new TestGeneric<String, Integer>("GfG", 15);

		obj.print();
		
		TestGeneric<Float, String> obj1 = new TestGeneric<Float, String>(11.20f, "xasdasasas");

		obj1.print();

	}
}
