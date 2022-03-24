package com.demo.samples.day6.streams;


//Java code to illustrate standard
//input output streams

import java.io.*;
public class SimpleIO {

 public static void main(String args[])
     throws IOException
 {

     // InputStreamReader class to read input
     InputStreamReader inp = null;

     // Storing the input in inp
     inp = new InputStreamReader(System.in);

     System.out.println("Enter characters, "
                        + " and '0' to quit.");
     char c;
     do {
         c = (char)inp.read();
         System.out.println(c);
     } while (c != '0');
 }
}