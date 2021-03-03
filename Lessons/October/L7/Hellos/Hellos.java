/****************************************************************************************************
    Compilation: javac Hellos.java
    Execution: java Hellos n

    Notes: Prints n lines of "Hello".

    % java Hellos 13
    1st: Hello
    2nd: Hello
    3rd: Hello
    4th: Hello
    5th: Hello
    6th: Hello
    7th: Hello
    8th: Hello
    9th: Hello
    10th: Hello
    11th: Hello
    12th: Hello
    13th: Hello
****************************************************************************************************/

public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            if (i%100 == 11 || i%100 == 12 || i%100 == 13)
                System.out.println(i + "th: Hello");
            else if (i%10 == 1)
                System.out.println(i + "st: Hello");
            else if (i%10 == 2)
                System.out.println(i + "nd: Hello");
            else if (i%10 == 3)
                System.out.println(i + "rd: Hello");
            else
                System.out.println(i + "th: Hello");
        }
    }
}
