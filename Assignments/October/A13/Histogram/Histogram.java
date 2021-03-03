/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Histogram.java
    Execution: java Histogram n

    Notes: Creates n random integers in interval [0,100] and creates a visual histogram of the
    numbers.

    % java Histogram 100
    a[] : 79 19 53 18 82 27 27 16 72 93 38 50 79 50 76 0 100 99 57 79 62 67 90 43 33 0 82 68 99 4 39
     5 34 100 56 27 79 16 12 45 3 66 45 56 6 96 57 39 15 80 23 45 80 9 6 17 61 24 68 51 75 35 8 69
     41 72 31 83 28 22 2 17 96 60 11 59 67 25 5 5 76 48 42 20 42 70 25 17 73 91 70 7 72 50 98 24 65
     84 94 53
    0:  *************
    10:  **********
    20:  ***********
    30:  *******
    40:  ********
    50:  ***********
    60:  **********
    70:  *************
    80:  ******
    90:  *********
    100: **
****************************************************************************************************/

public class Histogram {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = (int)(Math.random() * 101);

        System.out.printf("%s","a[] : ");
        for (int x : a)
            System.out.printf("%-4d",x);
        System.out.printf("%s","\n");

        int[] freq = new int[11];
        for (int x : a)
            freq[x/10]++;

        for (int i = 0; i < 11; i++) {
            System.out.printf("%-4s",i*10+": ");
            for (int q = 0; q < freq[i]; q++)
                System.out.printf("%s","*");
            System.out.printf("%s","\n");
        }
    }
}
