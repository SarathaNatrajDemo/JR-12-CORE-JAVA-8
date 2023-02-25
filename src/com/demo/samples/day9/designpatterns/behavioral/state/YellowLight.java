package com.demo.samples.day9.designpatterns.behavioral.state;

public class YellowLight implements Reciever {
	@Override
	public void on() {
		System.out.println("Swithcing on yellow light");
	}

	@Override
	public void off() {
		System.out.println("Swithcing off yellow light");
	}
}
