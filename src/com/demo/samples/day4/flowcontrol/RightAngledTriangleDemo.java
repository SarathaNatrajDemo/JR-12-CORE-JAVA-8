package com.demo.samples.day4.flowcontrol;

import java.util.Scanner;

public class RightAngledTriangleDemo {

	public static void main(String[] args) {
		
		//Scanner - class from java.util package fetch input from the keyboard
		//new operator is used to create an object for a class
		//System.in - input, System.out - output
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the valu of rows: ");
        int num = sc.nextInt();
        
      //  num = 5;

        //Nested for loop  - one for loop inside the other for loop
        for (int i=1;i<=num;i++){//row
            for (int j=1;j<=i;j++){//column
                System.out.print("* ");
            }
            //prints the output in the new line
            System.out.println();
        }
    }
}
