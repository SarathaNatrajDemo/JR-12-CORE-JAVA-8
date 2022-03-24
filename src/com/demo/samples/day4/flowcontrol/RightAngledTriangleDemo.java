package com.demo.samples.day4.flowcontrol;

import java.util.Scanner;

public class RightAngledTriangleDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the valu of rows: ");
        int num = sc.nextInt();

        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
