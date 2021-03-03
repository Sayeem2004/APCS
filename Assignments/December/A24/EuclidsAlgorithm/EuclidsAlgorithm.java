/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class EuclidsAlgorithm {
    public static int euclid(int n, int m) {
        if (n == 0) return m;
        if (m == 0) return n;
        int x = Math.max(Math.abs(n),Math.abs(m));
        int y = Math.min(Math.abs(n),Math.abs(m));
        return euclid(x%y,y);
    }
    public static double estimatepi(int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int x = (int)(1 + Math.random()*99999);
            int y = (int)(1 + Math.random()*99999);
            if (euclid(x,y) == 1) sum++;
        }
        sum /= n;
        sum = 6/sum;
        return Math.sqrt(sum);
    }
    public static void main(String[] args) {
        // int n = Integer.parseInt(args[0]);
        // int m = Integer.parseInt(args[1]);
        // System.out.println(euclid(n,m));
        System.out.println(estimatepi(1000000));
    }
}
