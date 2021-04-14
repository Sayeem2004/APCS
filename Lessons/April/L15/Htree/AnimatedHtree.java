/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang & Janice Min & Jessica Eng & Justin Morill & Frank Wang & Ryan
    Wang

    Compilation: javac AnimatedHtree.java
    Execution: java AnimatedHtree N
    Dependencies: StdDraw.java

    Notes: Creates an Htree fractal with a depth of N, with 10 ms between moves

    > java Htree 2
    <Creates AnimatedHtree.png>
****************************************************************************************************/

public class AnimatedHTree {
    public static void htree(int n, double x, double y, double sz) {
        if (n != 0) {
            StdDraw.line(x-sz/2,y-sz/2,x-sz/2,y+sz/2);
            StdDraw.show();
            StdDraw.pause(10);
            StdDraw.line(x-sz/2,y,x+sz/2,y);
            StdDraw.show();
            StdDraw.pause(10);
            StdDraw.line(x+sz/2,y-sz/2,x+sz/2,y+sz/2);
            StdDraw.show();
            StdDraw.pause(10);
            htree(n-1, x-sz/2, y+sz/2, sz/2); // top left
            htree(n-1, x+sz/2, y+sz/2, sz/2); // top right
            htree(n-1, x+sz/2, y-sz/2, sz/2); // bottom right
            htree(n-1, x-sz/2, y-sz/2, sz/2); // bottom left
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(-1,1);
        StdDraw.setYscale(-1,1);
        htree(n, 0, 0, 1);
        StdDraw.show();
        StdDraw.save("AnimatedHtree.png");
    }
}

/*
Part D:
    When calling the recursive functions, the animation goes in the order of the recursive calls. We
    labelled the four recursive calls by their starting positions. If we call htree in the order given
    in our code, with the top left first, then it will fully complete the H's in the top left quarter
    of the picture, before going back to the original htree call, where it then goes to finish the
    top right, then finish the bottom right and bottom left, respectively. You can easily change this
    order by moving the recursive calls into a different permutation, however, the order will always be
    that the first htree that is recursively called will complete first followed by the others respectively. 
*/
