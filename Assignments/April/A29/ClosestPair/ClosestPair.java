/****************************************************************************************************
    Name: Mohammad Khan, Asa Muhammad, Caroline Leung, Dylan Hu, Esteak Shapin, Han Zhang, Jishan
    Chowdhury

    Compilation: javac ClosestPair.java
    Execution: java ClosestPair
    Dependencies: StdIn.java StdOut.java Stopwatch.java

    Notes: Takes in an arbitrarily sized array of integers and finds the closest pair of integers and
    also prints out the time it takes to find the closest pair. If multiple pairs have the same
    difference, the first pair found is printed out.

    > java ClosestPair
    1
    5
    10
    3
    2
    16
    15
    elapsed time = 0.0
    closest pair: 1 2

    Problems:
    3)
        a) n(n-1)(n-2)(n-3)/24   =   n^4/24 - 6n^3/24 - 11n^2/24 - 6n/24   ~   n^4/24
            lim n -> inf (n(n-1)(n-2)(n-3)/24) / (n^4/24) =
            lim n -> inf (n^4/24 - 6n^3/24 - 11n^2/24 - 6n/24) / (n^4/24) =
            lim n -> inf (1 - 6/n - 11/n^2 - 6/n^3) =
            (1 - 0 - 0 - 0) =
            1
        b) n(n+1) - n^2   =   n^2 + n - n^2   =   n   ~   n
            lim n -> inf (n(n+1) - n^2) / (n) =
            lim n -> inf (n^2 + n - n^2) / (n) =
            lim n -> inf (n) / (n) =
            1
        c) n(n+1)/2 + nlogn   =   n^2/2 + nlogn + n/2   ~   n^2/2
            lim n -> inf (n(n+1)/2 + nlogn) / (n^2/2) =
            lim n -> inf (n^2/2 + nlogn + n/2) / (n^2/2) =
            lim n -> inf (1 + 2logn/n + 1/n) =
            1 + 2(lim n -> inf logn/n) + 0 =
            1 + 2(lim n -> inf (1/(ln(2)n)) / 1) + 0 =
            1 + 2(lim n -> inf 1 / (ln(2)n)) + 0 =
            1 + 2(0) + 0 =
            1
    6)
        a) f(n) = n(n-1))(n-2)(n-3)/24
            O(f(n)) = O(n^4)
            Order of growth rate for n(n-1)(n-2)(n-3)/24 is n^4
        b) g(n) = n(n+1) - n^2
            O(g(n) = O(n)
            Order of growth rate for n(n+1) - n^2 is n
        c) h(n) = n(n+1)/2 + nlogn
            O(h(n)) = O(n^2)
            Order of growth rate for n(n+1)/2 + nlogn is n^2
****************************************************************************************************/

public class ClosestPair {
    public static int[] getClosestPair(int[] a) {
        int[] ret = {0, Integer.MAX_VALUE};
        for (int i = 0; i < a.length; i++) {
            for (int q = i+1; q < a.length; q++) {
                if (Math.abs(a[i]-a[q]) < ret[1]-ret[0]) {
                    ret[1] = Math.max(a[i],a[q]);
                    ret[0] = Math.min(a[i],a[q]);
                }
            }
        }
        return ret;
    }

    public static void main(String[] args)  {
        int[] a = StdIn.readAllInts();
        Stopwatch timer = new Stopwatch();
        int[] pair = getClosestPair(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println("closest pair: " + pair[0] + " " + pair[1]);
    }
}
