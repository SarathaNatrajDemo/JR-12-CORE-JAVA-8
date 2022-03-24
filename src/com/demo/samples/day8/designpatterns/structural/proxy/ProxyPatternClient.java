package com.demo.samples.day8.designpatterns.structural.proxy;
public class ProxyPatternClient {
	
	public static void main(String[] args) 
	{
		OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
		
		access.grantInternetAccess();
	}


}
