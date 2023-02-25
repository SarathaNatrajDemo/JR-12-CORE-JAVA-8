package com.demo.samples.day10.designpatterns.presentation.frontcontroller;

public class FrontControllerPatternDemo {
	   public static void main(String[] args) {
	   
	      FrontController frontController = new FrontController();
	      frontController.dispatchRequest("HOME");
	      frontController.dispatchRequest("STUDENT");
	   }
	}