/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class Functions {
    public static int max3(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        if (c >= b && c >= a) return c;
        return a;
    }
    public static double max3(double a, double b, double c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        if (c >= b && c >= a) return c;
        return a;
    }
    public static boolean odd3(boolean a, boolean b, boolean c) {
        int odd = 0;
        if (a) odd++;
        if (b) odd++;
        if (c) odd++;
        if (odd%2 == 1) return true;
        else return false;
    }
    public static boolean odd(boolean ... v) {
        int odd = 0;
        for (boolean x : v) if (x) odd++;
        if (odd%2 == 1) return true;
        else return false;
    }
    public static int[] createIntegerArray(int ... v) {
        int n = v.length;
        int[] r = new int[n];
        for (int i = 0; i < v.length; i++)
            r[i] = v[i];
        return r;
    }
    public static boolean majority(boolean a, boolean b, boolean c) {
        return (a&&b) || (a&&c) || (b&&c);
    }
    public static boolean eq(int[] v, int[] v2) {
        int n = v.length;
        if (n != v2.length) return false;
        for (int i = 0; i < n; i++)
            if (v[i] != v2[i]) return false;
        return true;
    }
    public static double[] scale(double[] v) {
        double mn = Integer.MAX_VALUE;
        double mx = Integer.MIN_VALUE;
        // double mn = StdStats.min(v);
        // double mx = StdStats.max(v);
        for (double x : v) {
            mn = Math.min(x,mn);
            mx = Math.max(x,mx);
        }
        double[] r = new double[v.length];
        for (int i = 0; i < v.length; i++) {
            r[i] = (v[i]-mn) / (mx-mn);
        }
        return r;
    }
    public static String[] reverse(String[] v) {
        String[] r = new String[v.length];
        for (int i = 0; i < v.length; i++) {
            r[i] = v[v.length-i-1];
        }
        return r;
    }
    public static String[] reverseInplace(String[] v) {
        for (int i = 0; i < v.length/2; i++) {
            String s = v[i];
            v[i] = v[v.length-i-1];
            v[v.length-i-1] = s;
        }
        return v;
    }
    public static void main(String[] args) {
        int[] a = createIntegerArray(1,2);
        int[] b = createIntegerArray(1,2);
        System.out.println(eq(a,b));
    }
}
