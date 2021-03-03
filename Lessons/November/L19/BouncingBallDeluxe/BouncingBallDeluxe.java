/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac BouncingBallDeluxe.java
    Execution: java BouncingBallDeluxe
    Dependencies: StdDraw.java StdAudio.java TennisBall.png Pipebang.wav

    Notes: Creates a simple animation of a tennis ball bouncing with audio effects and inelastic
    collisions.

    > java BouncingBallDeluxe
    <ctrl-s + BouncingBall.png>
    <open BouncingBall.png> 
****************************************************************************************************/
public class BouncingBallDeluxe {
    public static void main(String[] args) {
        // initial values
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.05;              // radius
        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();
        // main animation loop
        while (true) {
            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) + radius > 1.0) {
                vx = -vx;
                StdAudio.play("Pipebang.wav");
            }
            if (Math.abs(ry + vy) + radius > 1.0) {
                vy = -vy;
                StdAudio.play("Pipebang.wav");
            }
            // update position
            rx = rx + vx;
            ry = ry + vy;
            // set the background to light gray
            StdDraw.clear(StdDraw.LIGHT_GRAY);
            // draw ball on the screen
            StdDraw.picture(rx, ry, "TennisBall.png");
            // display and pause for 20ms
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
