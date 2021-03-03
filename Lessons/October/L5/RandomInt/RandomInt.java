/****************************************************************************************************
    Compilation: javac RandomInt.java
    Execution: java RandomInt a b

    Notes: Prints a random integer in the0 range [a,b), where a <= b;

    % java
****************************************************************************************************/
public class RandomInt {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double r = Math.random();

        int value = (int) ((b-a) * r) + a;
        System.out.println(value);
    }
}
