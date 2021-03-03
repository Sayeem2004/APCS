/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac FilterOne.java
    Execution: java FilterOne < FilterOneIO.txt
    Dependencies: StdIn.java StdOut.java

    Notes: Takes a random sized input stream and prints out the numbers such that there is no
    consecutive numbers that are the same.

    > less FilterOneIO.txt
    1 2 2 1 5 1 7 7 7 7 1 1 1 1 1 1 1 1 1
    > java FilterOne < FilterOneIO.txt
    1 2 1 5 1 7 1
****************************************************************************************************/

public class FilterOne {
    public static void main(String[] args) {
        int prev = 0;
        int i = 0;
        while (!StdIn.isEmpty()) {
            int curr = StdIn.readInt();
            if (i == 0) {
                prev = curr;
                System.out.print(curr + " ");
                i++;
                continue;
            } else {
                if (curr == prev) {
                    continue;
                } else {
                    prev = curr;
                    System.out.print(curr + " ");
                }
            }
        }
        System.out.println();
    }
}
