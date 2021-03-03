/****************************************************************************************************
    Compilation: javac ReverseArray.java
    Execution: java ReverseArray a b c d ...

    Notes: Takes a variable number of input strings and reverse thems and prints them

    % java ReverseArray a b c d e f
    f e d c b a

    % java ReverseArray d a default:
    d a d
****************************************************************************************************/

public class ReverseArray {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < args.length/2; i++) {
            String t = args[i];
            args[i] = args[args.length-i-1];
            args[args.length-i-1] = t;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}
