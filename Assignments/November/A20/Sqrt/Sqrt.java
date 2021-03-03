/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Sqrt.java
    Execution: has no main function but can be used in an other program using Sqrt.sqrt(x)
    Dependencies: none

    Notes: Has one method which calculates the square root of a number.

    Sqrt.sqrt(4) --> 2
    Sqrt.sqrt(9) --> 3
    Sqrt.sqrt(7.29) --> 2.7
    Sqrt.sqrt(9.61) --> 3.1
****************************************************************************************************/
public class Sqrt {
    public static double sqrt(double x) {
        double g = x/2;
        while ((g+x/g)/2 != g && (g+x/g)/2 != x/g) {
            g = (g+x/g)/2;
        }
        return g;
    }
}
