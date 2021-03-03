/****************************************************************************************************
    Compilation: javac FibonacciWord.java
    Execution: java FibonacciWord

    Notes: Prints the fibonacci word sequence from 0 to 10 using "A" and "B" as the initial strings.

    % java FibonacciWord
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
****************************************************************************************************/

public class FibonacciWord {
    public static void main(String[] args) {
        String a = "A", b = "B";
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <= 8; i++) {
            String c = b+a;
            a = b; b = c;
            System.out.println(b);
        }
    }
}
