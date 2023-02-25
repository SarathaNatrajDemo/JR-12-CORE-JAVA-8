package com.demo.samples.day4.arrays;

import java.util.Scanner;

public class StudentArrayObjects {
	public static void main(String[] args) {
		
		int rno=0,noOfElements=0;
		String name = null;
		// declares an Array of student class .
		// stuArrObj;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array  :::: ");
		noOfElements = sc.nextInt();

		// declaring & allocating  memory for 3 objects of type Student.
		 Student[] stuArrObj = new Student[noOfElements];
		 String[] strArr = new String[3];
	   //Student[0] = Student, Student[1] =
		
		
		// next() - default delimiter space
		//nextLine() - default delimiter new line, \n, enter key

		
		System.out.println("Details of student :::: ");
		for(int i =0;i<stuArrObj.length;i++) {
			rno = sc.nextInt();
			sc.nextLine();
			name = sc.nextLine();
			stuArrObj[i] = new Student(rno, name);
		}
		for (int i = 0; i < stuArrObj.length; i++)
			System.out.println("Element at " + i + " : " + stuArrObj[i].roll_no + " " + stuArrObj[i].name);
		
		
		System.out.println("Array individual elements initialization");

		//Array individual elements initialization
		stuArrObj[0] = new Student(1,"aman");
		stuArrObj[1] = new Student(2,"mohit");
	//	stuArrObj[2] = new Student(3,"vaibhav");
		
		for (int i = 0; i < stuArrObj.length; i++)
			System.out.println("Element at " + i + " : " + stuArrObj[i].roll_no + " " + stuArrObj[i].name);
	}

		/*
		 * // initialize the first elements of the array 
		 * arr[0] = new Student(1,
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
}
