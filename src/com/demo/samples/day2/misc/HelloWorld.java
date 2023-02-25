package com.demo.samples.day2.misc;

public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld ! Welcome to Java!!!");
		System.out.println("hello");
				
		//datatype variablename -  variable declaration;
		int a=5;
		
		//datatype variablename = somevalue - variable initialization
		int b = 10;
		
		int sum = a + b;
		int p = 5000, n = 2;
		float r = 2.5f;
		float simpleInterest = p * n * r / 100;
		System.out.println("SIMPLE INTEREST FOR 2 YEARS :: "+simpleInterest);
		
		
		System.out.println(" prefix "+ ++b);
		System.out.println(" postfix "+b++);
		System.out.println("b :: "+b);
		
		System.out.println(" prefix "+ --b);
		System.out.println(" postfix "+b--);
		System.out.println("b :: "+b);
		
		int m, o=15, j = 5;
		m = o++ -j + 10;//15++ -5 + 10 ; 15-5+10; 10+10;20=m , o=16
		System.out.println(" m value ::"+m);
		
		m= -o++; // m =-(o++)
		System.out.println(" m value : "+m+"\t o value : "+o);
		
		System.out.println(" a : "+a+" b : "+b);
		System.out.println(" sum of two numbers : "+sum);
		
		
		//% - modulus operator - this return a remainder of division operation
		if(b%2 == 0) {
			System.out.println(b+" is even ");
		}else {
			System.out.println(b+" is odd ");
		}
	}

}
