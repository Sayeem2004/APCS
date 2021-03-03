/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang

    Compilation: javac Animal.java
    Dependencies: none

    Notes: An abstract class that stores a name and is the parent class to the rest of the classes.
****************************************************************************************************/

public abstract class Animal {
    // Attributes
    private String name;

    // Constructors
    public Animal(String n) {
        name = n;
    }

    // Abstract Methods 
    public abstract String getType();
    public abstract void getFood();
    public abstract void getDrink();
    public abstract String getClassification();
    public abstract String getDietType();
    public abstract String getBlood();

    // Override Methods
    @Override
    public String toString() {
        return name;
    }
}
