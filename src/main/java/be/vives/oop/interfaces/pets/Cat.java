package be.vives.oop.interfaces.pets;

import be.vives.oop.interfaces.ISpeak;

public class Cat extends Pet implements ISpeak {
  // The Cat class inherits from the Pet class

  public Cat(String name, int age) {
    super(name, age);    // Call correct base class constructor FIRST !!!!
  }

  public String speak() {
    return "Miauw, miauw ...";
  }
}