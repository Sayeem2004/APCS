/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang

    Compilation: javac Dinosaur.java
    Dependencies: Animal.java Reptile.java Herbivore.java

    Notes: A subclass of Reptile to describe the characteristics of a dinosaur.
****************************************************************************************************/

public class Dinosaur extends Reptile implements Herbivore {
    // Constructors
    public Dinosaur(String n) {
        super(n);
    }

    // Methods
    public void getFood() {
        System.out.println("If you get me " + getFavoriteFood() + ", I'll be happy!");
    }
    public void getDrink() {
        System.out.println("If you get me " + getFavoriteDrink() + ", I'll be happy!");
    }
    public String getDietType() {
        return "Herbivore";
    }
    public String getFavoriteFood() {
        return "Leaves";
    }
    public String getFavoriteDrink() {
        return "Water";
    }
    public String getType() {
        return "Argentinosaurus";
    }
}
