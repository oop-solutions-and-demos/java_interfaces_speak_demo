package be.vives.oop.interfaces.pets;

public class Bunny extends Pet {

  public Bunny(String name, int age, boolean livesInside) {
      super(name, age);    // Call correct base class constructor FIRST !!!!

      // Rest of initialization for Bunny
      this.livesInside = livesInside;
  }

  private boolean livesInside = false;
}