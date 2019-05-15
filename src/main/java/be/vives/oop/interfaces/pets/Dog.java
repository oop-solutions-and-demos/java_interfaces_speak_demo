package be.vives.oop.interfaces.pets;

public class Dog extends Pet {
  // The Dog class inherits from the Pet class

  public Dog(String name, int age) {
    super(name, age);    // Call correct base class constructor FIRST !!!!
}

  public void bark() {
    System.out.println("Woef, woef woef");
  }
}