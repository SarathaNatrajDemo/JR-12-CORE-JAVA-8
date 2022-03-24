package com.demo.samples.day4.flowcontrol;

class ContinueDemo {
    public static void main(String args[])
    {
        for (int i = 0; i < 100; i++) {
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;
 
            // If number is odd, print it
            System.out.print(i + " ");
        }
    }
}
