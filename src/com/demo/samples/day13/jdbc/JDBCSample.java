package com.demo.samples.day13.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCSample {
   public static void main(String args[]) {
      Connection c = null;
      try {
    	  
    	  //Step 1 - load the driver class
         Class.forName("org.postgresql.Driver");
         
         //mysql driver
         //Class.forName("com.mysql.jdbc.Driver")
         
         //Step 2 - get connection
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/sample",
            "postgres", "1234");
         
         
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }
}
