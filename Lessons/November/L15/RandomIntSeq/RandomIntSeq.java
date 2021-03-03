/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac RandomIntSeq.java
    Execution: java RandomIntSeq n m
    Dependencies: None

    Notes: Prints n random numbers between 0 and m.

    $ java RandomIntSeq 10 10
    1 4 6 3 2 4 5 3 2 3
****************************************************************************************************/

public class RandomIntSeq {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++)
            System.out.print((int)(Math.random() * m) + " ");
    }
}
