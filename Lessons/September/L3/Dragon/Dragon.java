/****************************************************************************************************
    Compilation: javac Dragon.java
    Execution: java Dragon

    Notes: Prints out the Dragon Curve Sequences from 1 to 5.

    % java Dragon
    F
    FLF
    FLFLFRF
    FLFLFRFLFLFRFRF
    FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRF
****************************************************************************************************/

public class Dragon {
    public static void main(String[] args) {
        String a = "F";
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.println(a);
            } else if (i == 1) {
                a = a + "L" + a;
                System.out.println(a);
            } else {
                String b = a.substring(0,a.length()/2) + "R" + a.substring(a.length()/2+1);
                a = a + "L" + b;
                System.out.println(a);
            }
        }
    }
}
