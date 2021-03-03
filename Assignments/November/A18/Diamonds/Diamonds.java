/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Diamonds.java
    Execution: java Diamonds n
    Dependencies: StdDraw.java

    Notes: Draws n progressively smaller diamonds that are in the interior of each other.

    > java Diamonds 15
    <ctrl-s + Diamonds.png>
    <open Diamonds.png>
****************************************************************************************************/

public class Diamonds {
    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 1;
        double y1 = 1;
        double y2 = 0;
        int n = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                StdDraw.line(x1,(y2+y1)/2,(x1+x2)/2,y2);
                StdDraw.line(x2,(y2+y1)/2,(x1+x2)/2,y2);
                StdDraw.line(x1,(y2+y1)/2,(x1+x2)/2,y1);
                StdDraw.line(x2,(y2+y1)/2,(x1+x2)/2,y1);
                double a = (x2-x1)/4;
                double b = (y1-y2)/4;
                x1 += a;
                x2 -= a;
                y1 -= b;
                y2 += b;
            } else {
                StdDraw.line(x1,y2,x2,y2);
                StdDraw.line(x1,y1,x2,y1);
                StdDraw.line(x1,y2,x1,y1);
                StdDraw.line(x2,y2,x2,y1);
            }
        }
        StdDraw.show();
    }
}
