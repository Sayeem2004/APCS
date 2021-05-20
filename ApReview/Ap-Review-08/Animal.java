// Part A
public class Animal {
    private String diet;
    private String species;
    private String name;

    public Animal(String d, String s, String n) {
        diet = d;
        species = s;
        name = n;
    }

    public String toString() {
        return name + " the " + species + " is a " + diet;
    }
}

// Part B
public class Herbivore extends Animal {
    public Herbivore(String s, String n) {
        super("herbivore",s,n);
    }
}

// Part C
public class Elephant extends Herbivore {
    private double tusklength;

    public Elephant(String n, double tl) {
        tusklength = tl;
        super("elephant",n);
    }

    public String toString() {
        String s = super.toString();
        return s + " with tusks " + tusklength + " meters long";
    }
}
