/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang

    Compilation: javac Mammal.java
    Dependencies: Animal.java

    Notes: An abstract subclass of Animal.
****************************************************************************************************/

public abstract class Mammal extends Animal {
    // Constructors
    public Mammal(String n) {
        super(n);
    }

    // Methods
    public String getBlood() {
        return "Warm-Blooded";
    }
    public String getClassification() {
        return "Mammal";
    }
}
