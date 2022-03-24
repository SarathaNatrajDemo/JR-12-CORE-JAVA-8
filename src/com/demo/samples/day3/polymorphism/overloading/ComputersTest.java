package com.demo.samples.day3.polymorphism.overloading;

public class ComputersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computers compObj = new Computers();
		compObj.courseOffered();
		compObj.courseOffered("");
		compObj.courseOffered(null, null);
	}

}
