package com.demo.samples.day3.inheritance;

//base class
class Employee {
	float salary = 40000;
	public Employee() {
		System.out.println("base class ");
	}
}

//sub class
class Programmer extends Employee {
	int bonus = 10000;
	
	public Programmer() {
		System.out.println("sub class ");
	}
	public static void main(String args[]) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}
}
