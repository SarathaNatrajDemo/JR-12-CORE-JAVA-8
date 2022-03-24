package com.demo.samples.day3.inheritance;

public class MethodOverridding1
{
	public static void main(String[] args) {
		Shapes myShape = new Shapes(); // Create a Shapes object
		Shapes myTriangle = new Triangle(); // Create a Triangle object
		Shapes myCircle = new Circle(); // Create a Circle object
		myShape.area();
		myTriangle.area();
		myShape.area();
		myCircle.area();
	}

}
//Base class Polygon, -> Square , Circle -> both with have render methods