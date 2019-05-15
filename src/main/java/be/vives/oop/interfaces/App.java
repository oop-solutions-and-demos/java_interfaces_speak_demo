package be.vives.oop.interfaces;

import be.vives.oop.interfaces.humans.Human;
import be.vives.oop.interfaces.pets.Cat;
import be.vives.oop.interfaces.pets.Dog;
import be.vives.oop.interfaces.pets.Pet;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) { 
      Cat cat = new Cat("Oscar", 3);
      cat.miauw();
    
      Dog dog = new Dog("Sam", 2);
      dog.bark();

      Human mark = new Human("Mark");
      mark.speak();

    }
}
