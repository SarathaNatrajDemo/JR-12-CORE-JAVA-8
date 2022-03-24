package com.demo.samples.day3.conversion;

public class UpcastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Fish();
		a.name="GoldFish";
		a.nature();
		//a.color ="Red";
		
		Fish f = new Fish();
		f.name="Whale";
		f.color="Blue";
		
	   f.nature();
		

	}

}
