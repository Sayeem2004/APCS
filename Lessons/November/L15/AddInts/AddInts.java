/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac AddInts.java
    Execution: java AddInts n
    Dependencies: StdIn.java StdOut.java

    Notes: This program takes a command-line argument n, reads in n integers, and prints out their sum.

    $ more AddIntsIO.txt
    1 2 3 4 5 6 7 8 9 10
    $ java AddInts 10 < AddIntsIO.txt
    Sum is 55
****************************************************************************************************/

public class AddInts {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = StdIn.readInt();
            sum = sum + value;
        }
        StdOut.println("Sum is " + sum);
    }
}
