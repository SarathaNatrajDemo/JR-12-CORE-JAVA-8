package com.demo.samples.day8.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectDatabase {
   static Connection conn = null;
   public static Connection getConnection() {
      if (conn != null) return conn;
      String database = "test";
      String Username = "root";
      String password = "123456";
      return getConnection(database, Username, password);
   }
   private static Connection getConnection(String databaseName, String UserName, String password) {
      try {
    	 //Step 1 - load the driver class          
         Class.forName("org.postgresql.Driver");
         
       //Step 2 - get connection         
         conn = DriverManager
                 .getConnection("jdbc:postgresql://localhost:5432/sample",
                         "postgres", "1234");
         System.out.println("Opened database successfully");

      } catch (Exception e) {
         e.printStackTrace();
      }
      return conn;
   }
}
