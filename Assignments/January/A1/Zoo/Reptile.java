/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang

    Compilation: javac Reptile.java
    Dependencies: Animal.java

    Notes: An abstract subclass of Animal.
****************************************************************************************************/

public abstract class Reptile extends Animal {
    // Constructors
    public Reptile(String n) {
        super(n);
    }

    // Methods
    public String getBlood() {
        return "Cold-Blooded";
    }
    public String getClassification() {
        return "Reptile";
    }
}
