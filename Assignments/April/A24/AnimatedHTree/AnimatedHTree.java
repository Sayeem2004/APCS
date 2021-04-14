/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang & Janice Min & Jessica Eng & Justin Morill & Frank Wang & Ryan
    Wang

    Compilation: javac AnimatedHtree.java
    Execution: java AnimatedHtree N
    Dependencies: StdDraw.java

    Notes: Animates the creation of an Htree fractal with a depth of N, with 10 ms between moves.

    > java AnimatedHtree 2
    <Creates AnimatedHtree.png>

    Part D:
        When calling the recursive functions, the animation goes in the order of the recursive calls.
        We labelled the four recursive calls by their starting positions. If we call htree in the
        order given in our code, with the top left first, then it will fully complete the H's in the
        top left quarter of the picture, before going back to the original htree call, where it then
        goes to finish the top right, then finish the bottom right and bottom left, respectively.
        You can easily change this order by moving the recursive calls into a different permutation,
        however, the order will always be that the first htree that is recursively called will
        complete first followed by the others respectively. The base cases work similarly to the
        recusive calls as they are created in the order that they are labelled below. Changing the
        permutation of the left vertical line, the right vertical line, and the middle horizontal line
        will change the order in which they are drawn.
****************************************************************************************************/

public class AnimatedHTree {
    public static void htree(int n, double x, double y, double sz) {
        if (n != 0) {
            // Base Case
            StdDraw.line(x-sz/2, y-sz/2, x-sz/2, y+sz/2); // Left Vertical Line
            StdDraw.show();
            StdDraw.pause(10);
            StdDraw.line(x-sz/2, y, x+sz/2, y); // Middle Horizontal Line
            StdDraw.show();
            StdDraw.pause(10);
            StdDraw.line(x+sz/2, y-sz/2, x+sz/2, y+sz/2); // Right Vertical Line
            StdDraw.show();
            StdDraw.pause(10);
            // Recursive Calls
            htree(n-1, x-sz/2, y+sz/2, sz/2); // Top Left
            htree(n-1, x+sz/2, y+sz/2, sz/2); // Top Right
            htree(n-1, x+sz/2, y-sz/2, sz/2); // Bottom Right
            htree(n-1, x-sz/2, y-sz/2, sz/2); // Bottom Left
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        htree(n, 0, 0, 1);
        StdDraw.show();
        StdDraw.save("AnimatedHTree.png");
    }
}
