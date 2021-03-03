/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Circles.java
    Execution: java Circles n prob mn mr
    Dependencies: StdDraw.java

    Notes: Makes n circles, with an prob probability of making it black otherwise white, and has a
    radius of between mn and mr.

    > java Circles 250 .7 .1 .2
    <ctrl-s + Circles.png>
    <open Circles.png>
****************************************************************************************************/

public class Circles {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double prob = Double.parseDouble(args[1]);
        double mn = Double.parseDouble(args[2]);
        double mx = Double.parseDouble(args[3]);
        StdDraw.enableDoubleBuffering();
        for (int i = 0; i < n; i++) {
            StdDraw.setPenRadius(mn+Math.random()*(mx-mn));
            if (Math.random() < prob)
                StdDraw.setPenColor(StdDraw.BLACK);
            else
                StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.point(Math.random(),Math.random());
        }
        StdDraw.show();
    }
}
