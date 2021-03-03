/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac TenPerLine.java
    Execution: java TerPerLine < TenPerLineIO.txt
    Dependencies: StdIn.java StdOut.java

    Notes: Takes a random sequence of integers and prints them in a way such that there is 10 per
    line.

    $ more TenPerLineIO.txt
    30 44 88 16 25 77 76 25 20 27 82
    $ java TenPerLine < TenPerLineIO.txt
    30      44      88      16      25      77      76      25      20      27
    82
****************************************************************************************************/

public class TenPerLine {
    public static void main(String[] args) {
        int i = 1;
        while (!StdIn.isEmpty()) {
            int a = StdIn.readInt();
            if (a >= 0 && a < 100) {
                if (i%10 == 0)
                    System.out.printf("%-5s \n",a);
                else
                    System.out.printf("%-5s",a);
                i++;
            }
        }
    }
}
