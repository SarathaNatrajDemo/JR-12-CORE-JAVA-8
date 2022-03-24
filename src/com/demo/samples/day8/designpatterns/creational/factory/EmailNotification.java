package com.demo.samples.day8.designpatterns.creational.factory;

public class EmailNotification implements Notification {
	 
    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an Email notification");
    }
}
