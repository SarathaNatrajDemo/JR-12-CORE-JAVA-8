package com.demo.samples.day7.collections;

import java.util.*;
public class ArrayListSorting  {

	public static void main(String args[]){
	   ArrayList<Employee> arraylist = new ArrayList<Employee>();
	   arraylist.add(new Employee(223, "Chaitanya", 26));
	   arraylist.add(new Employee(245, "Rahul", 24));
	   arraylist.add(new Employee(209, "Ajeet", 32));
	   arraylist.add(new Employee(210, "AjeetR", 20));
	   arraylist.add(new Employee(211, "AjeetB", 17));

	  Collections.sort(arraylist);

	   for(Employee emp: arraylist){
			System.out.println(emp);
	   }
	}
}

