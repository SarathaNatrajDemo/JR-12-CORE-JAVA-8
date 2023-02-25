package com.demo.samples.day2.classes;

import java.util.Scanner;
public abstract class Rectangle {
	double length;
	private double breadth;
	private double depth;

	//no args constructor
	public Rectangle() {
		System.out.println("Empty / no argument / default constructor called");
	}


	//Constructor overloading
	//parameterised constructor - 2 args
	public Rectangle(double len, double bre) {
		this.length = len;
		this.breadth = bre;
		System.out.println(" parameterised constructor called ");
	}

	// 3 args
	public Rectangle(double len, double bre, double dep) {
		this.length = len;
		this.breadth = bre;
		this.depth = dep;
		System.out.println(" parameterised constructor called ");
	}

//int a - java declaration
	// a:Int - kotlin declaration
	//method overloading
	//method or behaviour or action
	//method signature - java method definition
	//access specifier void/return nameOfMethod(parameters){
	//definition for your method
//}

	//method signature - Kotlin method definition
	//evenOrOdd(paramters ) : Int{
	//method definition
	//}
	public  void setDim(double len, double bre) {
		length = len;
		breadth = bre;
	}
	
	public  void setDim(double len, double bre,double dep) {
		length = len;
		breadth = bre;
		depth = dep;
	}
	
	//method to calculate the area - definition - concrete method - fully defined method
	public double getArea() {
		System.out.println(length);
		return this.breadth * this.length;
		
	}

	//method declaration - abstract method - not defined here

	abstract public double getPerimeter() ;

}

