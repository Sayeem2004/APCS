/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Htree.java
    Execution: java Htree N
    Dependencies: StdDraw.java

    Notes: Creates an Htree fractal with a depth of N

    > java Htree 2
    <Creates Htree.png>
****************************************************************************************************/

public class Htree {
    public static void htree(int n, double x, double y, double sz) {
        if (n != 0) {
            StdDraw.line(x-sz/2, y, x+sz/2, y);
            StdDraw.line(x-sz/2, y-sz/2, x-sz/2, y+sz/2);
            StdDraw.line(x+sz/2, y-sz/2, x+sz/2, y+sz/2);
            htree(n-1, x-sz/2, y+sz/2, sz/2);
            htree(n-1, x+sz/2, y+sz/2, sz/2);
            htree(n-1, x+sz/2, y-sz/2, sz/2);
            htree(n-1, x-sz/2, y-sz/2, sz/2);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(-1,1);
        StdDraw.setYscale(-1,1);
        htree(n, 0, 0, 1);
        StdDraw.show();
        StdDraw.save("Htree.png");
    }
}
