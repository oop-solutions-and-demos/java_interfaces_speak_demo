package be.vives.oop.interfaces;

import java.util.ArrayList;

import be.vives.oop.interfaces.humans.Human;
import be.vives.oop.interfaces.pets.Cat;
import be.vives.oop.interfaces.pets.Dog;

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
      ArrayList<ISpeak> speakers = new ArrayList<ISpeak>();

      speakers.add(new Cat("Oscar", 3));
      speakers.add(new Dog("Sam", 2));
      speakers.add(new Human("Mark"));
    
      for (ISpeak speaker : speakers) {
        System.out.println(speaker.speak());
      }

    }
}
