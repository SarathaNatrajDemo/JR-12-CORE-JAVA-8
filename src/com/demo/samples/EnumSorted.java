package com.demo.samples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
enum Level {
  HIGH, MEDIUM, LOW;
}

class Person {
  private Level severity;
  private String name;

  public Person(Level severity, String name) {
    super();
    this.severity = severity;
    this.name = name;
  }

  public Level getSeverity() {
    return severity;
  }

  public void setSeverity(Level severity) {
    this.severity = severity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class EnumSorted {
  public static void main(String[] args) {
    Person one = new Person(Level.HIGH, "Nikil");
    Person two = new Person(Level.MEDIUM, "Rahul");
    Person three = new Person(Level.LOW, "Raj");
    Person four = new Person(Level.HIGH, "Sana");
    Person five = new Person(Level.MEDIUM, "Abi");
    Person six = new Person(Level.LOW, "Sai");
    Person seven = new Person(Level.LOW, "Malar");

    List<Person> persons = new ArrayList<Person>();
    persons.add(one);
    persons.add(two);
    persons.add(three);
    persons.add(four);
    persons.add(five);
    persons.add(six);
    persons.add(seven);

    Collections.sort(persons, new Comparator<Person>() {
      @Override
      public int compare(Person person1, Person person2) {
        if (person1.getSeverity() == person2.getSeverity()) {
          return person1.getName().compareTo(person2.getName());
        } else {
          return person1.getSeverity().compareTo(person2.getSeverity());
        }
      }
    });
    for (Person person : persons) {
      System.out.println(person.getName() + " " + person.getSeverity());
    }
  }
}