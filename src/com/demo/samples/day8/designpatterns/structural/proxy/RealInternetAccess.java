package com.demo.samples.day8.designpatterns.structural.proxy;
public class RealInternetAccess implements OfficeInternetAccess {
	
	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println(" \n Internet Access granted for employee: "+ employeeName);
	}

}
