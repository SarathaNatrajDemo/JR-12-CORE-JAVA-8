package com.demo.samples.day10.designpatterns.presentation.interceptingfilter;

public class DebugFilter implements Filter {
	   public void execute(String request){
	      System.out.println("request log: " + request);
	   }
	}
