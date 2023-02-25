package com.demo.samples.day2.finla;

public class FinalVariable {
	final int speedlimit = 90;// final variable

	void run() {
	//	speedlimit=400;
		System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		FinalVariable obj = new FinalVariable();
		obj.run();
	}
}// end of class
