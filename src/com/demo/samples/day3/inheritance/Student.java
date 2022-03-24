package com.demo.samples.day3.inheritance;

public class Student implements Writable,Readable{

	@Override
	public void reads() {
		// TODO Auto-generated method stub
		System.out.println(" Student reads ...");
	}

	@Override
	public void writes() {
		// TODO Auto-generated method stub
		System.out.println(" Student writes ...");
		
	}

}
