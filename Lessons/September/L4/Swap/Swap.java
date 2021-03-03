/****************************************************************************************************
    Compilation: javac Swap.java
    Execution: java Swap a b

    Notes: Shows the process of swapping the values inputted by creating a temporary variable.

    % java 3 5
    3 5 0
    3 5 5
    3 3 5
    5 3 5
    5 3 0
****************************************************************************************************/

public class Swap {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int temp = 0;
        System.out.println("A = " + a + ", B = " + b + ", Temp = " + temp);
        temp = b;
        System.out.println("A = " + a + ", B = " + b + ", Temp = " + temp);
        b = a;
        System.out.println("A = " + a + ", B = " + b + ", Temp = " + temp);
        a = temp;
        System.out.println("A = " + a + ", B = " + b + ", Temp = " + temp);
        temp = 0;
        System.out.println("A = " + a + ", B = " + b + ", Temp = " + temp);
    }
}
