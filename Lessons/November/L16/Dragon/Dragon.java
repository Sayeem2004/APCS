/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Dragon.java
    Execution: java Dragon.java < DragonIO.txt
    Dependencies: StdIn.java StdOut.java

    Notes: Takes two dragon strings and prints the next sequence of dragon strings

    $ more DragionIO.txt
    F F
    $ java Dragon < DragonIO.txt
    FLF FRF
****************************************************************************************************/

public class Dragon {
    public static void main(String [] args) {
        String dragon = StdIn.readString();
    	String nogard = StdIn.readString();
    	System.out.print(dragon + "L" + nogard);
    	System.out.print(" ");
    	System.out.print(dragon + "R" + nogard);
    	System.out.println();
    }
}
