package com.demo.samples.day6.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		usingPrintWriter();
		System.out.println("Write in to file");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	public static void usingPrintWriter() throws IOException 
	{
	  String textToAppend = "Happy JAVA Learning !!";
	   
	  FileWriter fileWriter = new FileWriter("E://samplefile.txt", true); //Set true for append mode
	    PrintWriter printWriter = new PrintWriter(fileWriter);
	    printWriter.println(textToAppend);  //New line
	    printWriter.close();
	}
}
