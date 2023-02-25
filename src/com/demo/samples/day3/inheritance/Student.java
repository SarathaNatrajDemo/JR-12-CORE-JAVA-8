package com.demo.samples.day3.inheritance;

public class Student implements Writable,Readable{

	@Override
	public void reads() {
		// TODO Auto-generated method stub
		
		System.out.println(" ABLE TO READ ");
		
	}

	@Override
	public void writes() {
		// TODO Auto-generated method stub
		System.out.println(" ABLE TO WRITE ");
	}

	@Override
	public void testRead() {
		// TODO Auto-generated method stub
		//System.out.println();
		
	}

	}
