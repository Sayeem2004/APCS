/****************************************************************************************************
    Compilation: javac UseThree.java
    Execution: java UseThree name1 name2 name3

    Notes: Prints a sentence with the three names in reverse order.

    % java UseThree Alice Bob Carol
    Good Morning, Carol, Bob, and Alice, it is 7 AM.
****************************************************************************************************/

public class UseThree {
    public static void main(String[] args) {
        System.out.print("Good Morning, ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", ");
        System.out.print(args[0]);
        System.out.print(", ");
        System.out.print("it is 7 AM.\n");
    }
}
