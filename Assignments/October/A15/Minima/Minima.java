/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Minima.java
    Execution: java Minima n

    Notes: Takes an integer command-line argument n, generates a random permutation of
    the integers from [0,n), prints the permutation, and prints the number of left-to-right minima in
    the permuation (the number of times an element is the smallest seen so far).

    % java Minama 2
    0 1
    left-to-right minima: 1

    % java Minama 2
    1 0
    left-to-right minima: 2

    % java Minama 3
    0 1 2
    left-to-right minima: 1

    % java Minama 3
    1 0 2
    left-to-right minima: 2

    % java Minama 5
    4 3 1 0 2
    left-to-right minima: 4

    % java Minima 5
    3 4 2 0 1
    left-to-right minima: 3
****************************************************************************************************/

public class Minima {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] v = new int[n];
        for (int i = 0; i < n; i++)
            v[i] = i;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * n-i);
            int temp = v[r];
            v[r] = v[i];
            v[i] = temp;
        }
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] < min) {
                min = v[i];
                count++;
            }
            System.out.print(v[i] + " ");
        }
        System.out.println();
        System.out.println("left to right minima: " + count);
    }
}
