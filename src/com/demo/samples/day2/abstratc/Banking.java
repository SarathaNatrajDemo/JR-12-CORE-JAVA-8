package com.demo.samples.day2.abstratc;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbiObj = new SBI();
		System.out.println(" rate of Interest - SBI:: "+sbiObj.getRateOfInterest());

		HDFC hdfcObj = new HDFC();
		System.out.println(" rate of Interest - HDFC :: "+hdfcObj.getRateOfInterest());

		IOB iobObj = new IOB();
		System.out.println(" rate of Interest - IOB :: "+iobObj.getRateOfInterest());

	}

}
