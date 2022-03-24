package com.demo.samples.day5.thread;

class SimpleThread extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		SimpleThread t1 = new SimpleThread();
		t1.start();
	}
}