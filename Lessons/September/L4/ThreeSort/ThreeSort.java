/****************************************************************************************************
    Compilation: java ThreeSort.java
    Execution: javac ThreeSort a b c

    Notes: Sorts a, b, and c in ascending order

    % java ThreeSort 17 14 2
    2
    14
    17
****************************************************************************************************/

public class ThreeSort {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int a = Math.min(n, Math.min(n2,n3));
        int c = Math.max(n, Math.max(n2,n3));
        int b = n+n2+n3-c-a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
