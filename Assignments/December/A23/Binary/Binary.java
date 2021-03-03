/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Binary.java
    Execution: java Binary n
    Dependencies: none

    Notes: Returns the binary representation of a number using recursion.

    > java Binary 5
    101
****************************************************************************************************/

public class Binary {
    public static String toReverseBinary(int n) {
        String s = "";
        while (n > 0) {
            s = s + n%2;
            n /= 2;
        }
        return s;
    }
    public static String toBinary(int n) {
        if (n == 1) return "1";
        if (n == 0) return "0";
        return toBinary(n/2) + Integer.toString(n%2);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(toBinary(n));
    }
}
