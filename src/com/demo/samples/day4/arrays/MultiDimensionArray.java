package com.demo.samples.day4.arrays;

public class MultiDimensionArray {
	public static void main(String[] args) {
		try {
        // create a 2d array
        int[][] a = {
            {1, 2, 3}, 
            {4, 5},
            {8,11,9}, 
            {7}, 
        };

        int[][][] matrix = new int[3][3][3];

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        System.out.println("Length of row 4: " + a[3].length);
        
        // iterating through for loop
        for (int i = 0; i < a.length; ++i) { //iterating rows
            for(int j = 0; j < a[i].length; ++j) { //iterating columns
                System.out.println(a[i][j]);
            }
        }
        
        System.out.println(" FOR EACH ... LOOP ");
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }
		}catch(Exception e) {
			System.out.println("exception occurred");
			e.printStackTrace();
		}
    }
	
}
