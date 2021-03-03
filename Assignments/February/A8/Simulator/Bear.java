/****************************************************************************************************
    Names: Mohammad Khan & Kevin Cao & Evelyn Zheng & Aryan Patel & Xian Jun An & Noakai Aronesty

    Compilation: javac Bear.java
    Dependencies: Animal.java

    Notes: A class for the bear type.
****************************************************************************************************/

public class Bear extends Animal {
    // Constructors
    public Bear() {super();}
    public Bear(int position, int max) {super(position,max);}

    // Override Methods
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Bear;
    }
    @Override
    public String toString() {
      return "B";
    }
}
