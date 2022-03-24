package com.demo.samples;

public class Sample {
	public static void main(String[] args) {
		int n = 45893;
		int  temp, new_number=0, temp1, rev=0;
		while (n != 0) {
			temp = n % 10;
			n = n / 10;
			if (temp == 8) {
				temp = 0;
			} else if (temp == 9) {
				temp = 1;
			} else
				temp = temp + 2;

			new_number = new_number * 10 + temp; // this number is reversed of desired output
		}
		System.out.println(new_number);
		// now reverser the new_number to get answer;
		while (new_number != 0) {
			temp1 = new_number % 10;
			new_number = new_number / 10;
			rev = rev * 10 + temp1;
		}
		System.out.println(rev);
	}

}
