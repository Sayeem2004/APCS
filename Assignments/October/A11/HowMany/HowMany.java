/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac HowMany.java
    Execution: java HowMany a b c d ...

    Notes: Takes a variable number of integer command-line arguments and prints the integer i with probability proportional to the ith command-line argument.

    % java HowMany 1 1 1 1 1 1 1 1
    8

    % java HowMany 1 1 1 1 1
    5
****************************************************************************************************/

public class HowMany {
    public static void main(String[] args) {
       System.out.println(args.length);
    }
}
