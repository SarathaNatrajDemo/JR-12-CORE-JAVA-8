package com.demo.samples.day5.thread;

//A Java program to demonstrate working of
//synchronized.

import java.io.*;
import java.util.*;

//A Class used to send a message
class Sender {

	// An alternate implementation to demonstrate
	// that we can use synchronized with method also.
	// synchronized method or block
	public void send(String msg) {
	synchronized (this) {
			System.out.println("Sending\t" + msg);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Thread  interrupted.");
			}
			System.out.println("\n Received" + msg + "");
		}
	}
}
