package com.demo.samples.day5.thread;

//Driver class
class SyncDemo {
	public static void main(String args[]) {
		Sender send = new Sender();
		ThreadedSend S1 = new ThreadedSend(" Hi ", send);
		ThreadedSend S2 = new ThreadedSend(" Bye ", send);

		// Start two threads of ThreadedSend type
		S1.start();
		S2.start();

		}
}
