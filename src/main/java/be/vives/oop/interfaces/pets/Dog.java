package be.vives.oop.interfaces.pets;

import be.vives.oop.interfaces.ISpeak;

public class Dog extends Pet implements ISpeak {
  // The Dog class inherits from the Pet class

  public Dog(String name, int age) {
    super(name, age);    // Call correct base class constructor FIRST !!!!
  }

  public String speak() {
    return "Woef, woef woef";
  }
}