/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Points.java
    Execution: java Points n r
    Dependencies: StdDraw.java

    Notes: Creates a canvas with n points with penradius set to r.

    > java Points 10 .05
    <ctrl-s + Points.png>
    <open Points.png>
****************************************************************************************************/

public class Points {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = Double.parseDouble(args[1]);
        StdDraw.setPenRadius(r);
        StdDraw.enableDoubleBuffering();
        for (int i = 0; i < n; i++)
            StdDraw.point(Math.random(),Math.random());
        StdDraw.show();
    }
}
