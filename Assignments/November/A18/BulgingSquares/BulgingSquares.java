/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac BulgingSquares.java
    Execution: java BulgingSquares
    Dependencies: StdDraw.java

    Notes: Creates an optical illusion, that looks like it is 3d even though it is on a 2d screen, using
    StdDraw.java.

    > java BulgingSquares
    <ctrl-s + BulgingSquares.png>
    <open BulgingSquares.png>
****************************************************************************************************/

public class BulgingSquares {
    public static void main(String[] args) {
        StdDraw.setXscale(0,15);
        StdDraw.setYscale(0,15);
        StdDraw.enableDoubleBuffering();
        for (int i = 0; i < 15; i++) {
            for (int q = 0; q < 15; q++) {
                if ((i+q)%2 == 0) {
                    StdDraw.filledSquare(i+.5,q+.5,.5);
                }
            }
        }
        for (int i = 6; i > 0; i--) {
            for (int q = 7-i; q < 7; q++) {
                if ((i+q)%2 == 1) {
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.filledSquare(q+1-.2,i+.2,.16);
                    StdDraw.filledSquare(q+.2,i+1-.2,.16);
                } else {
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.filledSquare(q+1-.2,i+.2,.16);
                    StdDraw.filledSquare(q+.2,i+1-.2,.16);
                }
            }
        }
        for (int i = 8; i < 14; i++) {
            for (int q = 6; q > 0+(i-7)-1 ; q--) {
                if ((i+q)%2 == 1) {
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.filledSquare(q+.2,i+.2,.16);
                    StdDraw.filledSquare(q+1-.2,i+1-.2,.16);
                } else {
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.filledSquare(q+.2,i+.2,.16);
                    StdDraw.filledSquare(q+1-.2,i+1-.2,.16);
                }
            }
        }
        for (int i = 8; i < 14; i++) {
            for (int q = 8; q < 22-i ; q++) {
                if ((i+q)%2 == 1) {
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.filledSquare(q+1-.2,i+.2,.16);
                    StdDraw.filledSquare(q+.2,i+1-.2,.16);
                } else {
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.filledSquare(q+1-.2,i+.2,.16);
                    StdDraw.filledSquare(q+.2,i+1-.2,.16);
                }
            }
        }
        for (int i = 1; i < 7; i++) {
            for (int q = 8; q < 8+i; q++) {
                if ((i+q)%2 == 1) {
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.filledSquare(q+.2,i+.2,.16);
                    StdDraw.filledSquare(q+1-.2,i+1-.2,.16);
                } else {
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.filledSquare(q+.2,i+.2,.16);
                    StdDraw.filledSquare(q+1-.2,i+1-.2,.16);
                }
            }
        }
        for (int i = 1; i < 7; i++) {
            if ((i+7)%2 == 0) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(7+.2,i+1-.2,.16);
                StdDraw.filledSquare(7+1-.2,i+1-.2,.16);
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(7+.2,i+1-.2,.16);
                StdDraw.filledSquare(7+1-.2,i+1-.2,.16);
            }
        }
        for (int i = 8; i < 14; i++) {
            if ((i+7)%2 == 0) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(7+.2,i+.2,.16);
                StdDraw.filledSquare(7+1-.2,i+.2,.16);
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(7+.2,i+.2,.16);
                StdDraw.filledSquare(7+1-.2,i+.2,.16);
            }
        }
        for (int i = 1; i < 7; i++) {
            if ((i+7)%2 == 0) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(i+1-.2,7+.2,.16);
                StdDraw.filledSquare(i+1-.2,7+1-.2,.16);
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(i+1-.2,7+.2,.16);
                StdDraw.filledSquare(i+1-.2,7+1-.2,.16);
            }
        }
        for (int i = 8; i < 14; i++) {
            if ((i+7)%2 == 0) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(i+.2,7+.2,.16);
                StdDraw.filledSquare(i+.2,7+1-.2,.16);
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(i+.2,7+.2,.16);
                StdDraw.filledSquare(i+.2,7+1-.2,.16);
            }
        }
        for (int i = 0; i < 3; i++) {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(2+i+1-.2,4-i+.2,.16);
            StdDraw.filledSquare(2+i+.2,4-i+1-.2,.16);
            StdDraw.filledSquare(10+i+1-.2,12-i+.2,.16);
            StdDraw.filledSquare(10+i+.2,12-i+1-.2,.16);
        }
        for (int i = 0; i < 3; i++) {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(2+i+.2,10+i+.2,.16);
            StdDraw.filledSquare(2+i+1-.2,10+i+1-.2,.16);
            StdDraw.filledSquare(10+i+.2,2+i+.2,.16);
            StdDraw.filledSquare(10+i+1-.2,2+i+1-.2,.16);
        }
        StdDraw.show();
    }
}
