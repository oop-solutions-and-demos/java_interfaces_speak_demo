package be.vives.oop.interfaces.pets;

public class Pet {

  public Pet() {
    this("Unknown", 0);
  }

  public Pet(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "The pet " + name + " has an age of "
      + age + " years.";
  }

  private String name = "unknown";
  private int age = 0;
}