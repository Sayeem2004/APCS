/******************************************************************************
 *  Compilation:  javac AnimatedHanoi.java
 *  Execution:    java AnimatedHanoi n
 *  Dependencies: StdDraw.java
 *
 *  Solves the Towers of Hanoi problem on n discs and displays the
 *  results graphically.
 *
 *
 *  % java AnimatedHanoi 6
 *
 ******************************************************************************/
import java.awt.Color;

public class AnimatedHanoi {

    // draw the current state of the Towers of Hanoi game
    public static void draw(int[] pole) {

        int n = pole.length - 1;

        // draw 3 poles
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.002);

        for (int i = 0; i < 3; i++)
            StdDraw.line(i, 0, i, n);

        // draw N discs
        int[] discs = new int[3];   // discs[p] = # discs on pole p
        for (int i = n; i >= 1; i--) {
            Color color = Color.getHSBColor(1.0f * i / n, 0.7f, 0.7f);
            StdDraw.setPenColor(color);
            StdDraw.setPenRadius(0.035);   // magic constant
            double size = 0.5 * i / n;
            int p = pole[i];
            StdDraw.line(p-size/2, discs[p], p + size/2, discs[p]);
            ++discs[p];
        }

        StdDraw.show();
        StdDraw.pause(500);
    }

    public static void hanoi(int n) {
        int[] pole = new int[n+1];       // pole[i] = pole (0-2) that disc i is on
        draw(pole);
        hanoi(n, 0, 1, 2, pole);
    }

    public static void hanoi(int n, int from, int temp, int to, int[] pole) {
        if (n == 0) return;
        hanoi(n-1, from, to, temp, pole);
        StdOut.println("Move disc " + n + " from pole " + from + " to pole " + to);
        pole[n] = to;
        draw(pole);
        hanoi(n-1, temp, from, to, pole);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);   // number of discs
        int WIDTH  = 200;                    // width of largest disc
        int HEIGHT = 20;                     // height of each disc

        // set size of window and sale
        StdDraw.setCanvasSize(4*WIDTH, (n+3)*HEIGHT);
        StdDraw.setXscale(-1, 3);
        StdDraw.setYscale(0, n+3);
        StdDraw.enableDoubleBuffering();

        // solve the Towers of Hanoi with n discs
        hanoi(n);
    }
}
