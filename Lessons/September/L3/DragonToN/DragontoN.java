/****************************************************************************************************
    Compilation: javac DragontoN.java
    Execution: java DragontoN num

    Notes: Prints out the Dragon Curve Sequences from 1 to num, num >= 1.

    % java DragontoN 5
    F
    FLF
    FLFLFRF
    FLFLFRFLFLFRFRF
    FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRF

    % java DragontoN 7
    F
    FLF
    FLFLFRF
    FLFLFRFLFLFRFRF
    FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRF
    FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRFLFLFLFRFLFLFRFRFRFLFLFRFRFLFRFRF
    FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRFLFLFLFRFLFLFRFRFRFLFLFRFRFLFRFRFLFLFLFRFLFLFRFRFLFLFLFRFRFLFRFRFRFLFLFRFLFLFRFRFRFLFLFRFRFLFRFRF
****************************************************************************************************/

public class DragontoN {
    public static void main(String[] args) {
        String a = "F";
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
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
