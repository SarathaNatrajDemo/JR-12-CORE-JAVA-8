package com.demo.samples.day2.classes;

//
import java.util.Scanner;
public class Area {
	private static double length;
	private static double breadth;
	
	//no args constructor or empty constructor
	public Area() {
		System.out.println("Empty / no argument / default constructor called");
		length = 0;
		breadth = 0;
	}
	
	//parameterised constructor
	public Area(double len, double bre) {
		this.length = len;
		this.breadth = bre;
		System.out.println(" parameterised constructor called ");
	}
	
	
	//method or behaviour or action
	public  void setDim(double len, double bre) {
		length = len;
		breadth = bre;
	}
	
	//method to calculate the area
	public double getArea() {
		return this.breadth * this.length;
	}
	
}
