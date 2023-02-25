package com.demo.samples.day10.designpatterns.presentation.interceptingfilter;

public class AuthenticationFilter implements Filter {
	   public void execute(String request){
	      System.out.println("Authenticating request: " + request);
	   }
	}
