/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Distinct.java
    Execution: java Distinct a b c

    Notes: Returns the number of distinct integers among a, b, and c.

    % java Distinct 1 2 3
    3

    % java Distinct 1 2 2
    2

    % java Distinct 2 2 2
    1
****************************************************************************************************/

public class Distinct {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && b == c)
            System.out.println(1);
        else if (a == b || b == c || a == c)
            System.out.println(2);
        else
            System.out.println(3);
    }
}
