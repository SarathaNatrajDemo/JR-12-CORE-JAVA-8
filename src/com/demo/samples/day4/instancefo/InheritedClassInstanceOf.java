package com.demo.samples.day4.instancefo;

//Inherited class
class Animal { } 
class Mammal extends Animal { } 

class InheritedClassInstanceInstanceOf{ 
	public static void main(String[] args) { 
		Mammal mobj = new Mammal();
		Animal aobj = new Animal();

    // Is `child` class instance of `child` class?
		if (mobj instanceof Mammal) 
		  System.out.println("mobj is instance of Mammal"); 
		else
		  System.out.println("mobj is NOT instance of Mammal"); 

    // Is `child` class instance of `parent` class?
		if (mobj instanceof Animal) 
		  System.out.println("mobj is instance of Animal"); 
		else
		  System.out.println("mobj is NOT instance of Animal");	
    
    // Is `parent` class instance of `child` class?
    if (aobj instanceof Mammal) 
		  System.out.println("aobj is instance of Animal"); 
		else
		  System.out.println("aobj is NOT instance of Animal");
	} 
} 
