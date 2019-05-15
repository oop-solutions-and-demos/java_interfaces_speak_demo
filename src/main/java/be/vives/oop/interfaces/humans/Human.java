package be.vives.oop.interfaces.humans;

/**
 * Human
 */
public class Human {

  public Human(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Hi, my name is " + name;
  }

  public void speak() {
    System.out.println(this);    // Will call toString()
  }

  private String name = "Unnamed";
}