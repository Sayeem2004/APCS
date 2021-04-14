/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Art.java
    Execution: java Art N
    Dependencies: StdDraw.java

    Notes: Creates an overlapping square fractal with different colors and with a total of N
    recursive layers. It is suggested that N <= 8.

    > java Art 5
    <Creates Art.png>
****************************************************************************************************/
import java.awt.Color;

public class Art {
    public static void art(int n, double x, double y, double sz) {
        Color[] C = {StdDraw.RED, StdDraw.ORANGE, StdDraw.YELLOW, StdDraw.GREEN, StdDraw.BLUE};
        if (n != 0) {
            // Base Case
            double[] X = new double[4];
            double[] Y = new double[4];
            X[0] = x-sz/2; Y[0] = y+sz/2;
            X[1] = x+sz/2; Y[1] = y+sz/2;
            X[2] = x+sz/2; Y[2] = y-sz/2;
            X[3] = x-sz/2; Y[3] = y-sz/2;
            StdDraw.setPenColor(C[n%5]);
            StdDraw.setPenRadius(0.001);
            StdDraw.filledPolygon(X, Y);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.line(X[0], Y[0], X[1], Y[1]);
            StdDraw.line(X[1], Y[1], X[2], Y[2]);
            StdDraw.line(X[2], Y[2], X[3], Y[3]);
            StdDraw.line(X[3], Y[3], X[0], Y[0]);
            // Recursive Calls
            art(n-1, x-sz/4, y+3*sz/4, sz/2); // Up Left
            art(n-1, x+sz/4, y+3*sz/4, sz/2); // Up Right
            art(n-1, x+3*sz/4, y+sz/4, sz/2); // Right Up
            art(n-1, x+3*sz/4, y-sz/4, sz/2); // Right Down
            art(n-1, x+sz/4, y-3*sz/4, sz/2); // Down Right
            art(n-1, x-sz/4, y-3*sz/4, sz/2); // Down Left
            art(n-1, x-3*sz/4, y-sz/4, sz/2); // Left Down
            art(n-1, x-3*sz/4, y+sz/4, sz/2); // Left Up
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(-2, 2);
        StdDraw.setYscale(-2, 2);
        art(n, 0, 0, 1);
        StdDraw.show();
        StdDraw.save("Art.png");
    }
}
