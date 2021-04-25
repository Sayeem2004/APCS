public class FourSum {

    // print distinct tuples (i, j, k, q) such that a[i] + a[j] + a[k] + a[q] = 0
    public static void printAll(long[] a) {
        long n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int q = k+1; q < n; q++) {
                        if (a[i] + a[j] + a[k] + a[q] == 0) {
                            StdOut.println(a[i] + " " + a[j] + " " + a[k] + " " + a[q]);
                        }
                    }
                }
            }
        }
    }

    // return number of distinct tuples (i, j, k, q) such that a[i] + a[j] + a[k] + a[q] = 0
    public static long count(long[] a) {
        long n = a.length;
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int q = k+1; q < n; q++) {
                        if (a[i] + a[j] + a[k] + a[q] == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args)  {
        long[] a = StdIn.readAllLongs();
        Stopwatch timer = new Stopwatch();
        long count = count(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count);
    }
}
