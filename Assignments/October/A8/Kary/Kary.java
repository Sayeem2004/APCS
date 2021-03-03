/****************************************************************************************************
    Name: Mohammad Khan
    
    Compilation: javac Kary.java
    Execution: java Kary n k

    Notes: Converts n(n >= 0) from base 10 to base k.

    % java 100 2
    1100100

    % java 100 3
    10201

    % java 100 15
    6A
****************************************************************************************************/

public class Kary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int pow = 1; int i = 0;
        String[] digits = new String[] {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        while (pow <= n/k) {
            pow *= k;
            i++;
        }
        while (i >= 0) {
            int b = n/pow;
            System.out.print(digits[b]);
            n -= b*pow;
            pow /= k;
            i--;
        }
        System.out.println();
    }
}
