/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class LamesTheorem {
    public static int euclid(int n, int m) {
        if (n == 0) return 1;
        if (m == 0) return 1;
        int x = Math.max(Math.abs(n),Math.abs(m));
        int y = Math.min(Math.abs(n),Math.abs(m));
        return 1+euclid(x%y,y);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = n;
        int j = 0;
        while (x > 0) {
            j++;
            x/=10;
        }
        System.out.println("3rd number <= " + j*5);
        int max = 0;
        for (int i = 1; i <= 25000; i++) {
            for (int q = 0; q <= 250; q++) {
                int ans = euclid(n,n*i+q);
                max = Math.max(ans,max);
            }
        }
        System.out.println("Max Number of Divisons = " + max);
    }
}
