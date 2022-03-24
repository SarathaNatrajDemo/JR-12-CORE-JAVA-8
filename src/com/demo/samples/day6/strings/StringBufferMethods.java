package com.demo.samples.day6.strings;

//Java Program to Illustrate StringBuffer class
//via reverse() method

//Importing I/O classes
import java.io.*;

//Main class
class StringBufferMethods {

 // Main driver method
 public static void main(String[] args)
 {
     // Creating a string via creating
     // object of StringBuffer class
     StringBuffer s = new StringBuffer("GeeksGeeks");

     // Invoking reverse() method
     s.reverse();

     // Returns "skeeGrofskeeG"
     System.out.println(s);
     
    // via delete() and deleteCharAt() Methods
     s.delete(0, 5);
     // Returns forGeeks
     System.out.println(s);

     s.deleteCharAt(7);
     // Returns forGeek
     System.out.println(s);
     
     // via replace() method
     s.replace(5, 8, "are");
     
     // Returns GeeksareGeeks
     System.out.println(s);
 }
}
