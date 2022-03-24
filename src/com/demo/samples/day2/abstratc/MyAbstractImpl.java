package com.demo.samples.day2.abstratc;

public class MyAbstractImpl extends Demo  
{  
	//method impelmentation  - abstract method 
	void display() {  
		System.out.println("Abstract method?");  
	}  
	public static void main(String args[])  {  
		//creating object of abstract class  
		MyAbstractImpl obj = new MyAbstractImpl();  
		//invoking abstract method  
		obj.display();  
		obj.hello();
	}  
}  