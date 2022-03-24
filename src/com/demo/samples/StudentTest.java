package com.demo.samples;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		stu.setId(11);
		stu.setName("Rahul");
		
		Student stu1 = new Student();
		stu1.setId(11);
		stu1.setName("Rahul");
		
		
		System.out.println(" Student id : "+stu.getId());
		System.out.println(" Student name :"+stu.getName());

	}

}
