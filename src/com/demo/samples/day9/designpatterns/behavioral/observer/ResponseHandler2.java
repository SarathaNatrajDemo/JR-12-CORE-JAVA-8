package com.demo.samples.day9.designpatterns.behavioral.observer;
import java.util.Observable;
import java.util.Observer;


public class ResponseHandler2 implements Observer {
    private String resp;
    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nReceived Response: IN HANDLER 2 " + resp );
        }
    }


}