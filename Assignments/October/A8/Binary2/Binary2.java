/****************************************************************************************************
    Name: Mohammad Khan
    
    Compilation: javac Binary2.java
    Execution: java Binary2 n

    Notes: Prints n in base 2 using a for loop.

    % java 10
    1010

    % java 100
    1100100
****************************************************************************************************/

public class Binary2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = "";
        for (; n > 0; n/=2) {
            s = n%2 + s;
        }
        System.out.println(s);
    }
}
