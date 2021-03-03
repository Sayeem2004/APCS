/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac MinMaxPos.java
    Execution: java MinMaxPos < data.txt
    Dependencies: StdIn.java StdOut.java

    Notes: Takes a variable number of inputs and prints out the mininum and maximum values out of the
    inputs. Uses standard input and output.

    $ more MinMaxPosIO.txt
    1 -1 1200 -1233 0 14000
    $ java MinMaxPos < MinMaxPosIO.txt
    Please Enter A Non Negative Integer
    Please Enter A Non Negative Integer
    The mininum number is: 0
    The maximum number is: 14000
****************************************************************************************************/

public class MinMaxPos {
    public static void main(String[] args) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        while (!StdIn.isEmpty()) {
            int a = StdIn.readInt();
            if (a < 0)
                System.out.println("Please Enter A Non Negative Integer");
            else {
                mn = Math.min(a,mn);
                mx = Math.max(a,mx);
            }
        }
        System.out.println("The mininum number is: " + mn);
        System.out.println("The maximum number is: " + mx);
    }
}
