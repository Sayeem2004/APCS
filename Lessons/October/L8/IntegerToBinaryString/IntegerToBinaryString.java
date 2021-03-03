/****************************************************************************************************
    Compilation:  javac IntegerToBinaryString.java
    Execution:    java IntegerToBinaryString n

    Notes: Prints out n in binary.

    % java IntegerToBinaryString 5
    101

    % java IntegerToBinaryString 106
    1101010

    % java IntegerToBinaryString 0
    0

    % java IntegerToBinaryString 16
    10000

****************************************************************************************************/

public class IntegerToBinaryString {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = i%2 + s;
        }
        System.out.println(s);
    }
}
