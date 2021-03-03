/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac DiscreteDistribution.java
    Execution: java DiscreteDistribution a b c d ...

    Notes: Takes a variable number of integer command-line arguments and prints the integer i with
    probability proportional to the ith command-line argument.

    % java DiscreteDistribution 1 1 1 1 1
    0

    % java DiscreteDistribution 1 1 1 1 1
    1

    % java DiscreteDistribution 1 1 1 1 1
    4

    % java DiscreteDistribution 1 1 1 1 10
    4

    % java DiscreteDistribution 1 1 1 1 10
    2

    % java DiscreteDistribution 1 1 1 1 10
    4
****************************************************************************************************/

public class DiscreteDistribution {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++)
            sum += Integer.parseInt(args[i]);
        int a = (int) (Math.random() * sum);
        int temp = 0;
        for (int i = 0; i < args.length; i++) {
            temp += Integer.parseInt(args[i]);
            if (temp > a) {
                System.out.println(i);
                break;
            }
        }
    }
}
