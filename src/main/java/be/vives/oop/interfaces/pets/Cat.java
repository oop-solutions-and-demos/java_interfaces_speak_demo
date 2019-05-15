package be.vives.oop.interfaces.pets;

public class Cat extends Pet {
  // The Cat class inherits from the Pet class

  public Cat(String name, int age) {
    super(name, age);    // Call correct base class constructor FIRST !!!!
}

  public void miauw() {
    System.out.println("Miauw, miauw ...");
  }
}