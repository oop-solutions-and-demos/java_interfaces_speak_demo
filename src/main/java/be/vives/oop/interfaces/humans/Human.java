package be.vives.oop.interfaces.humans;

import be.vives.oop.interfaces.ISpeak;

/**
 * Human
 */
public class Human implements ISpeak {

  public Human(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Hi, my name is " + name;
  }

  public String speak() {
    return this.toString();
  }

  private String name = "Unnamed";
}