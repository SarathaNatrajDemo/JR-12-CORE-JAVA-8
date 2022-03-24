package com.demo.samples.day2.classes;

//
import java.util.Scanner;
public class Area {
	private static double length;
	private static double breadth;
	
	public static void setDim(double len, double bre) {
		length = len;
		breadth = bre;
	}
	public double getArea() {
		return this.breadth * this.length;
	}
	public static void main(String[] args) {
		Area areaObj = new Area();
		System.out.println(" Enter the breadth & length ");
		Scanner sc = new Scanner(System.in);
		double len = sc.nextDouble();
		double bre = sc.nextDouble();
		
		setDim(len, bre);
		System.out.println("Area :: "+areaObj.getArea());
		
	}
}
