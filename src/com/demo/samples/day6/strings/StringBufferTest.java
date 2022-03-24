package com.demo.samples.day6.strings;

//Java Program to Illustrate StringBuffer class
//via length() and capacity() methods

//Importing I/O classes
import java.io.*;

//Main class
class StringBufferTest {

 // main driver method
 public static void main(String[] args)
 {

     // Creating adn storing string by creating object of
     // StringBuffer
     StringBuffer s = new StringBuffer("GeeksforGeeks");

     // Getting the length of the string
     int p = s.length();

     // Getting the capacity of the string
     int q = s.capacity();

     // Printing the length and capacity of
     // above generated input string on console
     System.out.println("Length of string GeeksforGeeks="
                        + p);
     System.out.println(
         "Capacity of string GeeksforGeeks=" + q);
 }
}
