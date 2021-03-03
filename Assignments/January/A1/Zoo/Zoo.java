/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang

    Compilation: javac Zoo.java
    Execution: java Zoo
    Dependencies: Animal.java Mammal.java Reptile.java Carnivore.java Herbivore.java Cat.java
    Dinosaur.java

    Notes: A program to test all other classes.
****************************************************************************************************/
import java.util.*;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> poorzoo = new ArrayList<Animal>();
        Cat a = new Cat("Alice");
        Dinosaur b = new Dinosaur("Ben");
        Cat c = new Cat("Claire");
        Dinosaur d = new Dinosaur("Daniel");
        poorzoo.add(a);
        poorzoo.add(b);
        poorzoo.add(c);
        poorzoo.add(d);

        for (Animal creature : poorzoo) {
          System.out.println("My name is " + creature + " and I am a " + creature.getType() + ".");
          System.out.println("The " + creature.getType() + " is a type of " + creature.getClassification() + ".");
          System.out.println("I am a " + creature.getBlood() + " " + creature.getDietType() + ".");
          creature.getFood();
          creature.getDrink();
          System.out.println();
        }
    }
}
