package com.demo.samples.day8.designpatterns.creational.factory;

public class ComputerService {
	 public static void main(String[] args)
	    {
	        ComputerFactory computerFactory = new ComputerFactory();
	        Computer comp = computerFactory.getComputer("Server", "12", "16", "20");
	        System.out.println(comp.toString());
	    }
}
