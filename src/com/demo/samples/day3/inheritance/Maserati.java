package com.demo.samples.day3.inheritance;

//Class2
//Child class
//Helper class
class Maserati extends Car {

 // Method in which it is shown
 // what happened with the engine of Puslar
 public void MaseratiStartDemo()
 {
     // Creating an object of Engine type
     // using stop() method
     // Here, MaseratiEngine is name of an object
     Engine MaseratiEngine = new Engine();
     MaseratiEngine.start();
     MaseratiEngine.stop();
 }
}
