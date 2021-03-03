/****************************************************************************************************
    Compilation: javac DiceProbabilities.java
    Execution: java DiceProbabilities

    Notes: Performs a trace of calculating the frequencies of sums from two dice rolls.

    % java DiceProbabilities
    0 0 0 0 0 0 0 0 0 0 0 0 0
    0 0 1 1 1 1 1 1 0 0 0 0 0
    0 0 1 2 2 2 2 2 1 0 0 0 0
    0 0 1 2 3 3 3 3 2 1 0 0 0
    0 0 1 2 3 4 4 4 3 2 1 0 0
    0 0 1 2 3 4 5 5 4 3 2 1 0
    0 0 1 2 3 4 5 6 5 4 3 2 1
    0.0 0.0 0.0278 0.0556 0.0833 0.1111 0.1389 0.1667 0.1389 0.1111 0.0833 0.0556 0.0278
****************************************************************************************************/

public class DiceProbabilities {
    public static void main(String[] args) {
        int [] frequencies = new int[13];
        for (int q = 0; q <= 12; q++)
            System.out.print(frequencies[q] + " ");
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++)
                frequencies[i + j]++;
            for (int q = 0; q <= 12; q++)
                System.out.print(frequencies[q] + " ");
            System.out.println();
        }
        double[] probabilities = new double[13];
        for (int k = 1; k <= 12; k++)
            probabilities[k] = Math.round(frequencies[k] / 36.0 * 10000.0) / 10000.0;
        for (int q = 0; q <= 12; q++)
            System.out.print(probabilities[q] + " ");
        System.out.println();
    }
}
