/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class DigitSum {
    public static int digitsum(int n) {
        if (n < 0) return digitsum(-1*n);
        if (n < 10) return n;
        return n%10 + digitsum(n/10);
    }
    public static int digitalroot(int n) {
        if (n < 0) return digitalroot(-1*n);
        if (n < 10) return n;
        return digitalroot(n%10+digitalroot(n/10));
        // return digitalroot(Math.abs(n),0);
    }
    public static int digitalroot(int n, int m) {
        if (m < 10 && n == 0) {
            return m;
        }
        if (n == 0) {
            return digitalroot(m,0);
        }
        return digitalroot(n/10,m+n%10);
    }
    public static void main(String[] args) {
        // int n = Integer.parseInt(args[0]);
        System.out.println(digitalroot(883));
    }
}
