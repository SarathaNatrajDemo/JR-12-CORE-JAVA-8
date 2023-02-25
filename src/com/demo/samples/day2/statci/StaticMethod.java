package com.demo.samples.day2.statci;

public class StaticMethod {
	// static method
     static void m1()
    {
    	 int a = 10;
        System.out.println("from m1"+a);
        
    }
  
    public static void main(String[] args)
    {
    	
          // calling m1 without creating
          // any object of class StaticMethod
           m1();
    }
}
