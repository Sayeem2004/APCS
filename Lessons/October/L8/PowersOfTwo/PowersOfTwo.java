/****************************************************************************************************
    Compilation: javac PowersOfTwo.java
    Execution: java PowersOfTwo n

    Notes: Prints out a table showing the status of all variables as pow is made into 2^k.

    % java PowersOfTwo 10
    n       i       PowerOfTwo      i<=n    output
    --------------------------------------------------
    10      0       1               true    0 1
    10      1       2               true    1 2
    10      2       4               true    2 4
    10      3       8               true    3 8
    10      4       16              true    4 16
    10      5       32              true    5 32
    10      6       64              true    6 64
    10      7       128             true    7 128
    10      8       256             true    8 256
    10      9       512             true    9 512
    10      10      1024            true    10 1024
    10      11      4096            false
****************************************************************************************************/

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int pow = 1;
        System.out.println("n\ti\tPowerOfTwo\ti<=n\toutput");
        System.out.println("--------------------------------------------------");
        while (i <= n) {
	        System.out.println(n + "\t" + i + "\t" + pow + "\t\t" + "true" + "\t" + i + " " + pow);
            pow *= 2;
            i++;
        }
        System.out.println(n + "\t" + (n+1) + "\t" + pow*2 + "\t\t"+ "false");
    }
}
