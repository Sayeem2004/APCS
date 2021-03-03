/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Cannonball.java
    Execution: java Cannonball n
    Dependencies: none

    Notes: Returns the height of a pyramid of n cannonballs if it is possible to make a pyramid.

    > java Cannonball 5
    height = 2

    > java Cannonball 4
    Cannot make a pyramid with this amount of cannonballs
****************************************************************************************************/

public class Cannonball {
    public static int cannonball(int height) {
        if (height == 0) return 0;
        else return height*height + cannonball(height-1);
    }
    /*
    cannonball(3) StackTrace:
    empty                       push cannonball(3)
    ----------------------------------------------
    return 9+cannonball(2)      push cannonball(2)
    ----------------------------------------------
    return 4+cannonball(1)      push cannonball(1)
    return 9+cannonball(2)
    ----------------------------------------------
    return 1
    return 4+cannonball(1)
    return 9+cannonball(2)      pop return 1
    ----------------------------------------------
    return 4+1
    return 9+cannonball(2)      pop return 4+1
    ----------------------------------------------
    return 9+4+1                pop return 9+4+1
    ----------------------------------------------
    empty
    */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("n should be >= 0");
            return;
        }
        if (n > 1860) {
            System.out.println("n should be <= 1860");
            return;
        }
        System.out.println(cannonball(n));
        // int i = 0, count = cannonball(i);
        // while (count <= n) {
        //     if (count == n) {
        //         System.out.println("height = " + i);
        //         return;
        //     } else {
        //         i++;
        //         count = cannonball(i);
        //     }
        // }
        // System.out.println("Cannot make a pyramid with this amount of cannonballs");
    }
}
