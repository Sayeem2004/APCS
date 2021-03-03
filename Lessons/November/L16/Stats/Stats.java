/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Stats.java
    Execution: java Stats < data.txt
    Dependencies: Stdin.java StdOut.java

    Notes: Takes n inputs and prints out the mean, the standard deviation, and the
    outliers. Uses standard input and output.

    $ more StatsIO.txt
    -15 -1304.2 1444.3 17.5 -34
    $ java Stats 5 < StatsIO.txt
    Mean:                21.71999999999998
    Standard Deviation:  972.916824296918
    Values more than 1.5 standard deviations from the mean:
****************************************************************************************************/

public class Stats {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0;
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            v[i] = StdIn.readDouble();
            sum += v[i];
        }
        sum /= n;
        double sd = 0;
        for (int i = 0; i < n; i++)
            sd += (v[i] - sum) * (v[i] - sum);
        sd /= n-1;
        sd = Math.sqrt(sd);
        System.out.printf("%-20s%15.5f\n","Mean: ",sum);
        System.out.printf("%-20s%15.5f\n","Standard Deviation: ",sd);
        System.out.printf("%-50s \n","Values more than 1.5 standard deviations from the mean: ");
        for (int i = 0; i < n; i++) {
            if (Math.abs(v[i]-sum) > 1.5 * sd)
                System.out.printf("%-10.5f \n",v[i]);
        }
    }
}
