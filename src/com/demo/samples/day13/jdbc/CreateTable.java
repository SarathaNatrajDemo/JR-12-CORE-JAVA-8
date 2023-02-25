package com.demo.samples.day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CreateTable {
   public static void main( String args[] ) {
      Connection c = null;
      Statement stmt = null;
      try {
    	  
    	  //Step 1 - load the driver class   - POSTGRES SQL
    	   Class.forName("org.postgresql.Driver");
    	   
    	   // Mysql - com.mysql.jdbc.Driver
    	   // Oracle - oracle.jdbc.driver.OracleDriver
    	   
       //Step 2 - get connection         
         c = DriverManager
                 .getConnection("jdbc:postgresql://localhost:5432/sample",
                         "postgres", "1234");
         System.out.println("Opened database successfully");
         
         // Connection conn = 
       //  DriverManager.getConnection ("jdbc:oracle:thin:@myhost:1521:orcl",
        //	       "scott", "tiger"); 
         
       //  conn =
        //	       DriverManager.getConnection("jdbc:mysql://localhost/test?" +
//        	                                   "user=minty&password=greatsqldb");




         
         
         //Step 3 - create stmt object
         stmt = c.createStatement();
         
         //Step 4 - create query string
         String sql = "CREATE TABLE COMPANY1 " +
            "(ID INT PRIMARY KEY     NOT NULL," +
            " NAME           TEXT    NOT NULL, " +
            " AGE            INT     NOT NULL, " +
            " ADDRESS        CHAR(50), " +
            " SALARY         REAL)";
         
         
         //Step 5 - excute the stmt
         stmt.executeUpdate(sql);
         
         //Step 6 - close the stmt,con
         stmt.close();
         c.close();
         
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table created successfully");
   }
}