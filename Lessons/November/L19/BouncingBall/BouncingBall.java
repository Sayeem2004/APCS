/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac BouncingBall.java
    Execution: java BouncingBall
    Dependencies: StdDraw.java

    Notes: Creates a simple animation of a ball bouncing across the screen with inelastic collisions.

    > java BouncingBall
    <ctrl-s + BouncingBall.png>
    <open BouncingBall.png> 
****************************************************************************************************/
public class BouncingBall {
    public static void main(String[] args) {
        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0,1.0);
        StdDraw.setYscale(-1.0,1.0);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.LIGHT_GRAY);
        // initial values
        double rx = Math.random()*2 - 1, ry = Math.random()*2 - 1;     // position
        double vx = 0.008, vy = 0.012;     // velocity
        double rx2 = 0, ry2 = 0;
        double radius = 0.05;              // radius
        // main animation loop
        while (true)  {
            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0-radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0-radius) vy = -vy;
            rx2 = rx;
            ry2 = ry;
            // update position
            rx = rx+vx;
            ry = ry+vy;
            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledCircle(rx2,ry2,radius);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx,ry,radius+.004);
            // copy offscreen buffer to onscreen
            StdDraw.show();
            // pause for 20 ms
            StdDraw.pause(20);
        }
    }
}
