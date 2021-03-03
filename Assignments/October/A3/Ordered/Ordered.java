/****************************************************************************************************
    Compilation: javac Ordered.java
    Execution: java Ordered a b c

    Notes: Returns true if a b, and c are in ascending or descending order, else false.

    % java Ordered 1 2 3
    true

    % java Ordered 3 2 1
    true

    % java Ordered 1 3 2
    false
****************************************************************************************************/

public class Ordered {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        boolean b = (x>=y && y>=z) || (x<=y && y<=z);
        
        System.out.println(b);
    }
}
