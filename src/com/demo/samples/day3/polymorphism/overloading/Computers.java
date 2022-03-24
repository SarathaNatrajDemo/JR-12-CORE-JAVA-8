package com.demo.samples.day3.polymorphism.overloading;

public class Computers {
	
	public void courseOffered() {
		String topic = "Coding";
		System.out.println(" topic :: "+topic);
	}

	
	public void courseOffered(String topic) {
		topic = "Development";
		System.out.println(" topic in args 1 "+topic);
	}
	public void courseOffered(String topic1, String topic2) {
		topic1 = "Testing";
		topic2 = "Debugging";
		System.out.println(" topic in args 2 "+topic1+ topic2);
	}
}
