package com.demo.samples.day2.classes;

public class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    
    //Empty or no-arg constructor
    public Member() {
    	System.out.println(" Empty constructor is called");
    	name = "Sai";
    	age = 21;
    	phoneNumber="8916645675";
    	address="45 Green Avenue, Kolkatta";
    	salary = 25000.0f;
    	
    }
    
    //Parameterised or Arguments constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
    	System.out.println(" parameterized constructor is called");
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
    	
        System.out.println("Salary " + salary);
    }
    
    public static void main(String[] a) {
    	
    	//Calling an empty constructor
    	Member member = new Member();
    	System.out.println(" Name :: "+member.name);
    	System.out.println(" Age :: "+member.age);
    	System.out.println(" Salaray :: "+member.salary);
    	member.printSalary();
    	System.out.println(" *************************************************** ");
    	    	
    	
    	//Calling the parameterised constructor
    	Member parameterMemberObject = new Member("Rahul",21,"8751215478","25 Bloom Avenue",35000.0f);
    	System.out.println(" Name :: "+parameterMemberObject.name);
    	System.out.println(" Age :: "+parameterMemberObject.age);
    	System.out.println(" Salaray :: "+parameterMemberObject.salary);
    	parameterMemberObject.printSalary();
    	System.out.println(" *************************************************** ");
    	
    }
}
