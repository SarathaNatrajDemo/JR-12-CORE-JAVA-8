package com.demo.samples.day5.exception;

public class ThrowException 
{
    static void fun()
    {
        try
        {
        	
        	System.out.println("sdsdss");
            throw new NullPointerException("demo");
        }
        catch(NullPointerException  e)
        {
            System.out.println("Caught inside fun().");
            e.printStackTrace();
          // throw e; // rethrowing the exception
        }
    }
 
    public static void main(String args[])
    {
        try
        {
            fun();
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught in main.");
            e.printStackTrace();
        }
    }
}
