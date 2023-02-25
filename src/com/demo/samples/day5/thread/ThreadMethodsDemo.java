package com.demo.samples.day5.thread;

public class ThreadMethodsDemo extends Thread {
	public ThreadMethodsDemo(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("thread methods demo");
			try {
				System.out.println("thread is going to sleep");
				ThreadMethodsDemo.sleep(5000);

				System.out.println("thread wake up");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
			ThreadMethodsDemo de = new ThreadMethodsDemo("TEST");
 
			System.out.println("getstate1 "+de.getState());
			//Runnable state 
			de.start();
			System.out.println("getstate2 "+de.getState());
			System.out.println("getstate3 "+de.getState());
			System.out.println("getstate4 "+de.getState());
			System.out.println("thread Name "+de.getName());
			System.out.println("thread Priority "+de.getPriority());
			System.out.println("getstate5 "+de.getState());
	}
}
