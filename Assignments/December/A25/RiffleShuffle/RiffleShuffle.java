/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac RiffleShuffle.java
    Execution: java RiffleShuffle
    Dependencies: StdRandom.java

    Notes: Simulates shuffling a deck of cards using the riffle shuffle technique seven times and
    then prints out the final order of the cards.

    > java RiffleShuffle
    35 19 7 46 20 32 5 26 15 16 36 40 41 45 47 21 12 48 49 37 18 3 28 39 50 44 33 14 0 17 43 11 23 42
     9 4 22 34 27 51 30 24 38 1 13 6 8 29 2 25 10 31
****************************************************************************************************/

public class RiffleShuffle {
    public static int[] riffleshuffle(int[] v) {
        int n = v.length, r = 0;
        for (int i = 0; i < n; i++) {
            if (StdRandom.bernoulli()) r++;
        }
        int[] a = new int[r];
        int[] b = new int[n-r];
        for (int i = 0; i < r; i++) a[i] = v[i];
        for (int i = r; i < n; i++) b[i-r] = v[i];
        int c = 0, d = 0;
        double n1 = r, n2 = n-r;
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            if (Math.random() < n1 /(n1+n2)) {
                ret[i] = a[c];
                c++; n1--;
            } else {
                ret[i] = b[d];
                d++; n2--;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] v = new int[52];
        for (int i = 0; i < v.length; i++)
            v[i] = i;
        for (int i = 0; i < 7; i++) {
            v = riffleshuffle(v);
        }
        for (int q = 0; q < v.length; q++)
            System.out.print(v[q] + " ");
        System.out.println();
    }
}
