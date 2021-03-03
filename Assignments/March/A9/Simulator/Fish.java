/****************************************************************************************************
    Names: Mohammad Khan & Kevin Cao & Evelyn Zheng & Aryan Patel & Xian Jun An & Noakai Aronesty

    Compilation: javac Fish.java
    Dependencies: Animal.java

    Notes: A class for the fish type.
****************************************************************************************************/

public class Fish extends Animal {
    // Constructors
    public Fish() {super();}
    public Fish(int position, int max, boolean gender, int strength) {super(position,max,gender,strength);}

    // Override Methods
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Fish;
    }
    @Override
    public String toString() {
      return "F";
    }
}
