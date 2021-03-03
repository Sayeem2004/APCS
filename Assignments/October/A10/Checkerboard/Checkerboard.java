/****************************************************************************************************
    Names: Mohammad Khan, Bryan Zhang, Joseph Kim

    Problem Statement: Write a program Checkerboard.java that takes an integer command-line argument
    N, and uses two nested for loops to print an N-by-N "checkerboard" pattern like the one below:
    a total of NxN asterisks, where each row has 2N characters (alternating between asterisks and
    spaces).

    Compilation: javac Checkerboard.java
    Execution: java Checkerboard n

    Notes: Returns a 2n*2n checkerboard made of asterisks and spaces in an alternating pattern.

    % java Checkerboard 5
    * * * * *
     * * * * *
    * * * * *
     * * * * *
    * * * * *

    % java Checkerboard 4
    * * * *
     * * * *
    * * * *
     * * * *
****************************************************************************************************/

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int q = 0; q < n; q++) {
                if (i%2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(" *");
            }
            System.out.println();
        }
    }
}
