/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Galton.java
    Execution: java Galton n c
    Dependencies: None

    Notes: Simulates a galton board with n marbles and c channels.

    $ java Galton 200 10
    Channel             Marbles
    ----------------------------------------
    0                   *
    1                   ******
    2                   **************
    3                   **************************
    4                   **********************************************
    5                   ************************************************************
    6                   *******************************
    7                   ************
    8                   ***
    9                   *
****************************************************************************************************/

public class Galton {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int[] board = new int[c];
        for (int i = 0; i < n; i++) {
            int start = 0;
            for (int q = 0; q < c-1; q++)
                if (Math.random() < 0.5) start++;
            board[start]++;
        }
        System.out.printf("%-20s%-20s \n","Channel","Marbles");
        System.out.printf("%-40s \n","----------------------------------------");
        for (int i = 0; i < c; i++) {
            System.out.printf("%-20s",i);
            for (int q = 0; q < board[i]; q++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
