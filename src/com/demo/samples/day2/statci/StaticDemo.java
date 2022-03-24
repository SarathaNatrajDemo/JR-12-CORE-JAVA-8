package com.demo.samples.day2.statci;

public class StaticDemo {
    public static void main(String[] args)
    {
        // calling static method
        // without instantiating Student class
        Student.setCllg("BVRIT");
  
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
  
        s1.getStudentInfo();
        s2.getStudentInfo();
        
        Student.setCllg("IIT");
        
        Student s3 = new Student("Rahul");
        Student s4 = new Student("Mike");
  
        s3.getStudentInfo();
        s4.getStudentInfo();
        
    }
}
