package com.demo.samples;
import java.util.Scanner;

public class NumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Basic arithmetic operators
		
		//Variable declaration
		
		int aa;
		
		//Variable initialization /assignment
		int i=0, j = i;
		
		
		//byte a=0;
		
		int num1=10, num2=25;
		
		//Variable initialization
		int sum = 0;
		
		sum = num1+num2;
	
	//	int power = 3*3;
		
		System.out.println("Addition : \t "+sum);
		System.out.println("Subtraction : \t "+(num1-num2));
		System.out.println("Multiplication :  "+(num1*num2));
		
		//System.out.println("power operator : "+Math.pow(4, 3));
		
		System.out.println(" Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println(" number 1:: "+number1);
		System.out.println(" number 2:: "+number2);
		
		System.out.println("Addition : \t "+(number1 + number2));
		System.out.println("Subtraction : \t "+(number1-number2));
		System.out.println("Multiplication :  "+(number1*number2));
		

	}

}
