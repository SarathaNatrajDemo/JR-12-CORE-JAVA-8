package com.demo.samples.day8.designpatterns.creational.factory;

public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("ADASSA");
        notification.notifyUser();
    }
}
