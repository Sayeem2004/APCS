/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac WorldMap.java
    Execution: java WorldMap < World.txt
    Dependencies: StdDraw.java StdIn.java StdOut.java

    Notes: Creates a map using a set of points from a data file. These points refer to the vertices
    of a polygon which is then drawn using StdDraw.

    > java WorldMap < World.txt
    <ctrl-s + WorldMap.png>
    <open WorldMap.png> 
****************************************************************************************************/

public class WorldMap {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(a,b);
        StdDraw.setXscale(0,a);
        StdDraw.setYscale(0,b);
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            int c = StdIn.readInt();
            double[] x = new double[c];
            double[] y = new double[c];
            for (int i = 0; i < c; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x,y);
        }
        StdDraw.show();
    }
}
