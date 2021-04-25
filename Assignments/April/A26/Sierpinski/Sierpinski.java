/****************************************************************************************************
    Name: Mohammad Khan & Asa Muhammad & Dylan Hu & Caroline Leung & Esteak Shapin & Han Zhang

    Compilation: javac Sierpinski.java
    Execution: java Sierpinski n
    Dependencies: StdDraw.java

    Notes: Sierpinski takes in one command-line argument, n, and draws the sierpinski triangle to the
    order n.

    > java Sierpinski 5
    <Opens Up Standard Draw>
****************************************************************************************************/

public class Sierpinski {
    public static double height(double length) {
        return length * Math.sqrt(3)/2;
    }

    public static void filledTriangle(double x, double y, double length) {
        double[] X = new double[3];
        double[] Y = new double[3];
        X[0] = x-length/2; Y[0] = y+height(length);
        X[1] = x; Y[1] = y;
        X[2] = x+length/2; Y[2] = y+height(length);
        StdDraw.filledPolygon(X, Y);
    }

    public static void sierpinski(int n, double x, double y, double length) {
        if (n > 0) {
            filledTriangle(x,y,length);
            sierpinski(n-1, x-length/2, y, length/2);
            sierpinski(n-1, x+length/2, y, length/2);
            sierpinski(n-1, x, y+height(length), length/2);
        }
    }

    public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        double[] X = {0.0, 0.5, 1.0};
        double[] Y = {0.0, 0.5*Math.sqrt(3), 0.0};
        StdDraw.polygon(X, Y);
        StdDraw.setPenColor(StdDraw.BLACK);

        int n = Integer.parseInt(args[0]);
        sierpinski(n, 0.5, 0.0, 0.5);
    }
}
