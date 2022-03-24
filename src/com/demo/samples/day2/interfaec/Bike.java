package com.demo.samples.day2.interfaec;

public class Bike implements Vehicle {

	int speed=60;
	@Override
	public void changeGear() {
		// TODO Auto-generated method stub
		System.out.println(" Changinge the gear");
		
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		speed=speed+10;
		System.out.println(" increasing  the speed");
		System.out.println("I am travelling with "+speed+" km per hour");
	}
	public static void main(String[]  args) {
		Bike b = new Bike();
		b.changeGear();
		b.speedUp();
		
		b.speedUp();
		
	}
}
