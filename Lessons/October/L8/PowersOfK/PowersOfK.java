/****************************************************************************************************
    Compilation: javac PowersOfK.java
    Execution: java PowersOfK n

    Notes: Returns all powers of n less than or equal to Long.MAX_VALUE.

    %java PowersOfK 10000
   	10000
    100000000
   	1000000000000
   	10000000000000000
****************************************************************************************************/

public class PowersOfK {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        long mx = Long.MAX_VALUE;
        long pow = 1;
        System.out.println(pow);
        while (pow <= mx/k) {
            pow *= k;
            System.out.println(pow);
        }
    }
}
