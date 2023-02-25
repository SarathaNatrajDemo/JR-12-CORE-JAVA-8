package com.demo.samples.day3.inheritance;

public class MethodOverridding1
{
	public static void main(String[] args) {
		Shapes myShape = new Shapes(); // Create a Shapes object
		Shapes myTriangle = new Triangle(); // Create a Triangle object // belongs to baseClass type
		Triangle myTriangle1 = new Triangle(); // belongs to subClass type
		Shapes myCircle = new Circle(); // Create a Circle object
//		myShape.area();
		myTriangle.area();
//	myShape.area();
		myCircle.area();
	}

}
//Base class Shapes, -> Triangle , Circle -> both with have render methods