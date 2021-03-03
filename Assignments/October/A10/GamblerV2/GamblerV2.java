/****************************************************************************************************
    Names: Mohammad Khan, Bryan Zhang, Joseph Kim

    Problem Statement: Write a version of the Gambler that uses two nested while loops or two nested
    for loops instead of a while loop inside a for loop. Name the program GamblerV2.java.

    Compilation: javac GamblerV2.java
    Execution: java GamblerV2 stake goal N

    Notes: Simulates a gambler who start with $stake and place fair $1 bets until she goes broke or
    reach $goal. Keeps track of the number of times she wins and the number of bets she makes. Run
    the experiment N times, averages the results, and prints them out.

    % java GamblerV2 50 250 1000
    202 wins of 1000
    Percent of games won = 20.2
    Avg # bets           = 10993.258

    % java GamblerV2 50 150 1000
    349 wins of 1000
    Percent of games won = 34.9
    Avg # bets           = 5221.855

    % java GamblerV2 50 100 1000
    511 wins of 1000
    Percent of games won = 51.1
    Avg # bets           = 2464.543
 ****************************************************************************************************/

public class GamblerV2 {
    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);
        int goal   = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            for (; cash > 0 && cash < goal; bets++) {
                if (Math.random() < 0.5) cash++;
                else cash--;
                if (cash == goal) {
                    wins++;
                    break;
                }
            }
        }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}
