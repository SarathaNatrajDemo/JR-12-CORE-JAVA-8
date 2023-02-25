package com.demo.samples.day6.streams;

//Java Program illustrating the
//Byte Stream to copy
//contents of one file to another file.
import java.io.*;
public class BStream {
 public static void main(
     String[] args) throws IOException
 {

     FileInputStream sourceStream = null;
     FileOutputStream targetStream = null;

     try {
         sourceStream
             = new FileInputStream("E:\\test1.txt");
         targetStream
             = new FileOutputStream("E:\\targetfile1.txt");

         // Reading source file and writing
         // content to target file byte by byte
         int temp;
         while ((
                    temp = sourceStream.read())
                != -1)
             targetStream.write((byte)temp);
     }
     finally {
         if (sourceStream != null)
             sourceStream.close();
         if (targetStream != null)
             targetStream.close();
     }
 }
}