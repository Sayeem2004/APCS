/****************************************************************************************************
    Compilation: javac Triangle.java
    Execution: java Triangle n

    Notes: Prints an n*n(n >= 0) grid with a triangle with a height of n and a width of n.

    % java Triangle 6
    * * * * * *
    . * * * * *
    . . * * * *
    . . . * * *
    . . . . * *
    . . . . . *

****************************************************************************************************/

public class Triangle {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int q = 0; q < i; q++)
                System.out.print(". ");
            for (int q = i; q < n; q++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
