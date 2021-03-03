/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Plateau.java
    Execution: java Plateau a b c d ...

    Notes: Takes a variable number of integers and find the largest contiguous subarray that are all
    the same integers and are greater than the integers directly next to it.

    % java LongestPlateau 1 1 1 1 1 1
    start: -1
    length : 0

    % java LongestPlateau 1 2 2 1 3 3 3 3 3 1
    start: 4
    length : 5

    % java LongestPlateau 1 2 2 1 2 2 1
    start: 1
    length : 2

    % java LongestPlateau 1 2 2 2
    start: -1
    length : 0
****************************************************************************************************/

public class Plateau {
    public static void main(String[] args) {
        int start = -1;
        int best = 0;
        int btemp = 0;
        int stemp = -1;
        boolean st = false;
        for (int i = 1; i < args.length; i++) {
            int a = Integer.parseInt(args[i]);
            int b = Integer.parseInt(args[i-1]);
            if (!st && a > b) {
                st = true;
                stemp = i;
                btemp = 1;
            }
            if (st && a == b) {
                btemp++;
            }
            if (st && a < b) {
                st = false;
                if (btemp > best) {
                    best = btemp;
                    start = stemp;
                }
            }
        }
        System.out.println("Start: " + start);
        System.out.println("Length: " + best);
    }
}
