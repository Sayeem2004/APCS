/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Nlines.java
    Execution: java Nlines n
    Dependencies: StdDraw.java

    Notes: Draws n+! lines using the following sequence
    (0,n)(0,0)
    (0,n-1)(1,0)
    ...
    (0,1)(n-1,0)
    (0,0)(n,0)

    > java Nlines 250
    <ctrl-s + Nlines.png>
    <open Nlines.png>
****************************************************************************************************/

public class NLines {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n);
        StdDraw.enableDoubleBuffering();
        for (int i = 0; i <= n; i++)
            StdDraw.line(0,n-i,i,0);
        StdDraw.show();
    }
}
