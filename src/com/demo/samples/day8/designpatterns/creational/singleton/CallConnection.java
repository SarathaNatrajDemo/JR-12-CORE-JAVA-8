package com.demo.samples.day8.designpatterns.creational.singleton;

import java.sql.Connection;
public class CallConnection {
   public static void main(String[] args) {
      Connection con = ConnectDatabase.getConnection();
      if (con != null) {
         System.out.println("Connection successful !!!");
      }
   }
}   

