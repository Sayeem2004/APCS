/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac GeneralizedHarmonic.java
    Execution: java GeneralizedHarmonic n r

    Notes: Prints out the nth generalized harmonic number of order r.
    Ex: n = 3, r = 1 --> 1/1 + 1/2 + 1/3

    % java GeneralizedHarmonic 1 1
    1.0

    % java GeneralizedHarmonic 2 1
    1.5

    % java GeneralizedHarmonic 3 1
    1.8333333333333333

    % java GeneralizedHarmonic 1 2
    1.0

    % java GeneralizedHarmonic 2 2
    1.25

    % java GeneralizedHarmonic 3 2
    1.3611111111111112
****************************************************************************************************/

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(i,r);
        }
        System.out.println(sum);
    }
}
