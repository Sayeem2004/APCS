/****************************************************************************************************
    Compilation: javac FibonacciWordtoN.java
    Execution: java FibonacciWordtoN num

    Notes: Prints the fibonacci word sequence from 0 to num(num >= 0) using "A" and "B" as the initial strings.

    % java FibonacciWordtoN 11
    A
    B
    BA
    BAB
    BABBA
    BABBABAB
    BABBABABBABBA
    BABBABABBABBABABBABAB
    BABBABABBABBABABBABABBABBABABBABBA
    BABBABABBABBABABBABABBABBABABBABBABABBABABBABBABABBABAB
    BABBABABBABBABABBABABBABBABABBABBABABBABABBABBABABBABABBABBABABBABBABABBABABBABBABABBABBA
    BABBABABBABBABABBABABBABBABABBABBABABBABABBABBABABBABABBABBABABBABBABABBABABBABBABABBABBABABBABABBABBABABBABABBABBABABBABBABABBABABBABBABABBABAB
****************************************************************************************************/

public class FibonacciWordtoN {
    public static void main(String[] args) {
        String a = "A", b = "B";
        int n = Integer.parseInt(args[0]);
        if (n >= 0) {
            System.out.println(a);
        }
        if (n >= 1) {
            System.out.println(b);
        }
        for (int i = 0; i <= n-2; i++) {
            String c = b+a;
            a = b; b = c;
            System.out.println(b);
        }
    }
}
