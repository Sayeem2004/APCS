/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Logarithm.java
    Execution: java Logarithm
    Dependencies: none

    Notes: Returns the greatest integer smaller than or equal log_2(n)

    > java LG
****************************************************************************************************/

public class LG {
    public static int lg(int a) {
        int count = 0;
        while (a >= 2) {
            a /= 2;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("lg(" + n + ") = " + lg(n));
        // for (int i = 0; i < 16; i++) {
        //     for (int q = -2; q < 3; q++) {
        //         System.out.println("lg(" + (int)(Math.pow(2,i)+q) + ") = " + lg((int)Math.pow(2,i)+q));
        //     }
        // }
    }
}
