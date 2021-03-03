/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang

    Compilation: javac Cat.java
    Dependencies: Animal.java Mammal.java Carnivore.java

    Notes: A subclass of Mammal to describe the characteristics of a cat.
****************************************************************************************************/

public class Cat extends Mammal implements Carnivore {
    // Constructors
    public Cat(String n) {
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
        return "Carnivore";
    }
    public String getFavoriteFood() {
        return "Tuna";
    }
    public String getFavoriteDrink() {
        return "Milk";
    }
    public String getType() {
        return "Cat";
    }
}
