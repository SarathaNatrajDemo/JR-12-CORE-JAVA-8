package com.demo.samples.day6.streams;

//Java Program illustrating that
//we can read a file in a human-readable
//format using FileReader

//Accessing FileReader, FileWriter,
//and IOException
import java.io.*;
public class FileReaderDemo {
 public static void main(
     String[] args) throws IOException
 {
     FileReader sourceStream = null;
     try {
         sourceStream
             = new FileReader("E:\\test.txt");

         // Reading sourcefile and
         // writing content to target file
         // character by character.
         int temp;
         while ((
                    temp = sourceStream.read())
                != -1)
             System.out.println((char)temp);
     }
     finally {
         // Closing stream as no longer in use
         if (sourceStream != null)
             sourceStream.close();
     }
 }
}