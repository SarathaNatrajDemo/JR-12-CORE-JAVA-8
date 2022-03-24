package com.demo.samples;
import java.util.Scanner;

public class NumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Basic arithmetic operators
		
		//Variable declaration
		int i=0, j = i;
		
		byte a=0;
		
		int num1=10, num2=25;
		
		//Variable initialization
		int sum = 0;
		
		sum = num1+num2;
		int power = 3*3;
		
		System.out.println("Addition : \t "+sum);
		System.out.println("power operator : "+Math.pow(4, 3));
		
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.next());
		
		System.out.println(" number :: "+number);

	}

}
