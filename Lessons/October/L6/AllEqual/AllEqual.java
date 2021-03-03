/****************************************************************************************************
    Compilation: javac AllEqual.java
    Execution: java AllEqual a b c

    Notes: Prints "equal" if a = b = c and "not equal" if they dont.

    % java 10 10 10
    equal

    % java 10 20 10
    not equal
****************************************************************************************************/

public class AllEqual {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && a == c)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
