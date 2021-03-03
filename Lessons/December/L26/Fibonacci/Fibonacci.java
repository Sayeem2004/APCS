/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static int fib2(int n) {
        return addseq(n,0,1);
    }
    public static int addseq(int n, int f, int s) {
        if (n == 0) return f;
        if (n == 1) return s;
        return addseq(n-1,s,f+s);
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(addseq(i,0,1));
        }
    }
}
