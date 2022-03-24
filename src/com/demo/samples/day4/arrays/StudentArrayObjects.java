package com.demo.samples.day4.arrays;

import java.util.Scanner;

public class StudentArrayObjects {
	public static void main(String[] args) {
		// declares an Array of student class .
		Student[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student[3];
		Scanner sc = new Scanner(System.in);
		int rno=0;
		String name = null;
		
		
		System.out.println("Details of student :::: ");
		for(int i =0;i<arr.length;i++) {
			rno = sc.nextInt();
			name = sc.next();
			arr[i] = new Student(rno, name);
		}
		
		
		/*
		 * // initialize the first elements of the array arr[0] = new Student(1,
		 * "aman");
		 * 
		 * // initialize the second elements of the array arr[1] = new Student(2,
		 * "vaibhav");
		 * 
		 * // so on... arr[2] = new Student(3, "shikar"); arr[3] = new Student(4,
		 * "dharmesh"); arr[4] = new Student(5, "mohit");
		 * 
		 * 
		 */		

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
	}
}
