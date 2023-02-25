package com.demo.samples.day4.arrays;

public class SumAndAverageArrayDemo {
	public static void main(String[] args) {

		   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		   int sum = 0;
		   double average;
		   
		   // access all elements using for each loop
		   // add each element in sum
		   for (int number: numbers) {
			   //compound operators +=, -=, *=, /=
		     sum += number; // sum = sum + number;
		   }
		  
		   // get the total number of elements
		   int arrayLength = numbers.length;
		   System.out.println(arrayLength);
		   System.out.println(sum);
		   
		  //sum = 36

		   // calculate the average
		   // convert the average from int to double
		   average =  (double)sum /(double)arrayLength; // 36.00 / 10.00
		   
		//   average = (double)sum ; //150.00
		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);
		 }
}
