package com.demo.samples.day5.thread;

//Java code illustrating destroy() method
import java.lang.*;

class NewThread extends Thread {
//	private String threadname;
	NewThread(String threadname, ThreadGroup tgob) {
		super(tgob, threadname);
	//	this.threadname = threadname;
		start();
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				//System.out.println(" running a thread "+threadname);
				System.out.println(" running a thread "+Thread.currentThread().getName());
			} catch (InterruptedException ex) {
				System.out.println("Exception encounterted");
			}
		}
	}
}

public class ThreadGroupDemo {
	public static void main(String arg[]) throws InterruptedException, SecurityException {
		// creating the thread group
		ThreadGroup gfg = new ThreadGroup("Parent thread");

		ThreadGroup gfg_child = new ThreadGroup(gfg, "child thread");

		NewThread t1 = new NewThread("one", gfg);
		System.out.println("Starting one");
		NewThread t2 = new NewThread("two", gfg);
		System.out.println("Starting two");

		// block until other thread is finished
		t1.join();
		t2.join();

		// destroying child thread
		gfg_child.destroy();
		System.out.println(gfg_child.getName() + " destroyed");

		// destroying parent thread
		gfg.destroy();
		System.out.println(gfg.getName() + " destroyed");
	}
}