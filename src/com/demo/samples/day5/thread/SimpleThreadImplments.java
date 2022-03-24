package com.demo.samples.day5.thread;

public class SimpleThreadImplments implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		SimpleThreadImplments m1 = new SimpleThreadImplments();
	
		Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
		t1.start();
	}

}


//Thread()	Allocates a new Thread object.
//Thread(Runnable target)	Allocates a new Thread object.
//Thread(Runnable target, String name)	Allocates a new Thread object.
//Thread(String name)	Allocates a new Thread object.
//Thread(ThreadGroup group, Runnable target)	Allocates a new Thread object.
//Thread(ThreadGroup group, Runnable target, String name)	Allocates a new Thread object so that it has targeted as its run object, has the specified name as its name, and belongs to the thread group referred to by a group.
//Thread(ThreadGroup group, Runnable target, String name, long stackSize)	Allocates a new Thread object so that it has targeted as its run object, has the specified name as its name, and belongs to the thread group referred to by group, and has the specified stack size.
//Thread(ThreadGroup group, String name)	Allocates a new Thread object.
