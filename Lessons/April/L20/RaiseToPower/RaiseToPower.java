/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac RaiseToPower.java
    Execution: java RaiseToPower x n
    Dependencies: none

    Notes: Raises x to nth power using two different recursive methods, one that runs in linear time
    and one that runs in logarithmic time.

    > java RaiseToPower 5 0
    Linear Result:      1.0
    Logarithmic Result: 1.0

    > java RaiseToPower 5 100
    Linear Result:      7.888609052210123E69
    Logarithmic Result: 7.888609052210112E69

    > java RaiseToPower 5 200
    Linear Result:      6.223015277861144E139
    Logarithmic Result: 6.223015277861132E139
****************************************************************************************************/

public class RaiseToPower {
    public static double linearRaiseToPower(double x, int n) {
        if (n == 0) return 1;
        return x * linearRaiseToPower(x, n-1);
    }

    public static double logarithmicRaiseToPower(double x, int n) {
        if (n == 0) return 1;
        if (n%2 == 0) return logarithmicRaiseToPower(x,n/2) * logarithmicRaiseToPower(x,n/2);
        return logarithmicRaiseToPower(x,n/2) * logarithmicRaiseToPower(x,n/2) * x;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);

        double res1 = linearRaiseToPower(x, n);
        double res2 = logarithmicRaiseToPower(x, n);
        System.out.println("Linear Result:      " + res1);
        System.out.println("Logarithmic Result: " + res2);
    }
}
