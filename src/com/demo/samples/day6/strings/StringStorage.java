package com.demo.samples.day6.strings;

public class StringStorage {
	public static void main(String args[])
    {
        String s1 = "TAT";
        String s2 = "TaT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equalsIgnoreCase(s1));
        System.out.println(s3.equals(s4));
        System.out.println(s4);
    }
}
