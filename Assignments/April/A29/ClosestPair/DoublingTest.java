/****************************************************************************************************
    Name: Mohammad Khan, Asa Muhammad, Caroline Leung, Dylan Hu, Esteak Shapin, Han Zhang, Jishan
    Chowdhury

    Compilation: javac DoublingTest.java
    Execution: java DoublingTest
    Dependencies: StdIn.java StdOut.java Stopwatch.java StdRandom.java ClosestPair.java

    Notes: Runs time trials of ClosestPair.getClosestPair(int[] a), doubling the size of a after every
    trial. Prints out the times in seconds and the ratios of the current time to the previos time as
    well. Will continue to run until the program is manually terminated. As seen in the example run
    below the ratio as the size doubles is approximately 4 which means that the ClosestPair program
    does indeed run in quadratic time.

    > java DoublingTest
        size    time ratio
        512    0.00 0.50
       1024    0.00 1.00
       2048    0.01 2.50
       4096    0.01 1.80
       8192    0.03 3.78
      16384    0.14 4.03
      32768    0.55 3.99
      65536    2.19 4.01
     131072    8.76 3.99
     262144   35.27 4.03
     ...
****************************************************************************************************/

public class DoublingTest {
    public static double timeTrial(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniform(2000000) - 1000000;
        }
        Stopwatch s = new Stopwatch();
        ClosestPair.getClosestPair(a);
        return s.elapsedTime();
    }

    public static void main(String[] args) {
        StdOut.printf("%7s %7s %4s\n", "size", "time", "ratio");
        double previous = timeTrial(256);
        for (int n = 512; true; n += n) {
            double current = timeTrial(n);
            StdOut.printf("%7d %7.2f %4.2f\n", n, current, current / previous);
            previous = current;
        }
    }
}
