package com.demo.samples.day3.inheritance;

class PersonClass extends Ability implements Movable, Speakable
{
  @Override
  public void run()
  {
    System.out.println("I can run !!");
  }
  @Override
  public void speak()
  {
    System.out.println("I can speak !!");
  }
}
