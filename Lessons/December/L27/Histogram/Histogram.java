/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Histogram.java
    Execution: java Histogram m
    Dependencies: StdArrayIO.java StdIn.java StdOut.java

    Notes: Creates an array with 10000 values between 0 and m-1 and returns a frequency list of these
    values

    > java Histogram 10
    10
    1014      1067      1005       980       971       999      1045       983       945       991
    10000
****************************************************************************************************/

public class Histogram {
    public static int[] histogram(int[] a, int m) {
        int[] freq = new int[m];
        for (int x : a) freq[x]++;
        return freq;
    }
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[10000];
        for (int i = 0; i < 10000; i++)
            a[i] = (int)(Math.random()*m);
        int[] b = histogram(a,m);
        StdArrayIO.print(b);
        int sum = 0;
        for (int x : b) sum += x;
        System.out.println(sum);
    }
}
