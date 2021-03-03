/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Chaos.java
    Execution: java Chaos n
    Dependencies: StdDraw.java

    Notes: Creates a fractal pattern with n points. Most visible with n > 50000.

    > java Chaos 50000
    <ctrl-s + Chaos.png>
    <open Chaos.png> 
****************************************************************************************************/

public class Chaos {
    public static void main(String[] args) {
        double[] x = {0,.5,1};
        double[] y = {0,.5*Math.sqrt(3),0};
        int n = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenRadius(0.004);
        StdDraw.point(0,0);
        double a = 0;
        double b = 0;
        for (int i = 0; i < n; i++) {
            int c = (int) (Math.random() * 3);
            a = (a+x[c])/2;
            b = (b+y[c])/2;
            StdDraw.point(a,b);
        }
        StdDraw.show();
    }
}
