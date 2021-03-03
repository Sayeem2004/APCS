/****************************************************************************************************
    Compilation: javac DiceSimulation.java
    Execution: java DiceSimulation n

    Notes: Performs n simulations of rolling two dice and prints the probabilty of each sum between
    0 and 12.

    % java DiceSimulation 100
    0 0.0
    1 0.0
    2 0.03
    3 0.09
    4 0.09
    5 0.06
    6 0.14
    7 0.16
    8 0.13
    9 0.1
    10 0.09
    11 0.06
    12 0.05

    % java DiceSimulation 1000000
    0 0.0
    1 0.0
    2 0.027636
    3 0.055869
    4 0.083957
    5 0.111335
    6 0.13914
    7 0.166337
    8 0.138774
    9 0.110958
    10 0.083197
    11 0.055151
    12 0.027646
****************************************************************************************************/

public class DiceSimulation {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] count = new int[13];
        for (int i = 0; i < n; i++) {
            int q = (int)(Math.random() * 6) + 1;
            int j = (int)(Math.random() * 6) + 1;
            count[q+j]++;
        }
        for (int i = 0; i <= 12; i++) {
            System.out.println(i + " " + 1.0 * count[i] / n);
        }
    }
}
