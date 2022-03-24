package com.demo.samples.day5.thread;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(4000);
		System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));

		for (int i = 0; i < 10; i++) {
			long start1 = System.currentTimeMillis() * i * 100;
			Thread.sleep(2000);
			System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
		}

	}

}