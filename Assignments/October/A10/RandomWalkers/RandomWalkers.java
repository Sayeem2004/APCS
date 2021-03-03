/****************************************************************************************************
    Names: Mohammad Khan, Bryan Zhang, Joseph Kim

    Problem Statement: Write a program RandomWalkers.java that takes two integer command-line
    arguments N and T. In each of T independent experiments, simulate a random walk of N steps and
    compute the squared distance. Output the mean squared distance (the average of the T squared
    distances).

    Compilation: javac RandomWalkers.java
    Execution: java RandomWalkers n t

    Notes: Returns the mean squares distance of t trials and n steps of a random walking simulation.

    Hypothesis: As N increases the mean squared distance from the origin is about equal to N.   

    % java RandomWalkers 100 100000
    mean squared distance = 100.02896

    % java RandomWalkers 800 100000
    mean squared distance = 799.39012

    % java RandomWalkers 1600 100000
    mean squared distance = 1595.85914
****************************************************************************************************/

public class RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);
        long ans = 0;
        for (int i = 0; i < t; i++) {
            int x = 0, y = 0;
            for (int q = 0; q < n; q++) {
                double a = Math.random();
                if (a < .25) x++;
                else if (a < .50) x--;
                else if (a < .75) y++;
                else y--;
            }
            ans += x*x + y*y;
        }
        System.out.println("mean squared distance = " + (double)ans/t);
    }
}
