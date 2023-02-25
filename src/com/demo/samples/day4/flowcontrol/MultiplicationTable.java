package com.demo.samples.day4.flowcontrol;

public class MultiplicationTable {

	public static void main(String[] args) {

		int num = 9, i = 1;
		while (i <= 10) {
			System.out.printf("%d * %d = %d ", num, i, num * i);
			System.out.println();
			i++;
		}
		System.out.println("USING FOR LOOP");
		
		// /n - newline
		// /t - tab - 8 chars space
		for(int j = 1; j <= 10; ++j)
        {
            System.out.printf("%d * %d = %d \n", num, j, num * j);
        }

		
	}
}
