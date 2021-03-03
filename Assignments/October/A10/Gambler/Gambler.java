/****************************************************************************************************
    Names: Mohammad Khan, Bryan Zhang, Joseph Kim

    Problem Statement: Download and review the Gambler's Ruin simulation Gambler.java from the book
    site. Place your answers to question 2,3 and 4 in the documentation of Gambler.java. Submit
    Gambler.java.

    Compilation: javac Gambler.java
    Execution: java Gambler stake goal n

    Notes: Simulates a gambler who start with $stake and place fair $1 bets until she goes broke or
    reach $goal. Keeps track of the number of times she wins and the number of bets she makes. Run
    the experiment N times, averages the results, and prints them out.

    Answers:
    2a. You have an average 20% chance of success
    2b. More or less 1000000 bets to get to 2500
    2c. You have about a 0.1% chance to get to 1000 from 1.
    2d. You need to make about 1000 bets.
    3. The chance of success is ~ (100 * the stake / the goal) %. Ex: ((1 / 1000) * 100%, (2500 / 500) * 100%)
    4. The number of bets is on the same magnitude as or close to (stake * the goal).

    % java Gambler 50 250 1000
    179 wins of 1000
    Percent of games won = 17.9
    Avg # bets           = 8898.116

    % java Gambler 50 150 1000
    324 wins of 1000
    Percent of games won = 32.4
    Avg # bets           = 5069.644

    % java Gambler 50 100 1000
    507 wins of 1000
    Percent of games won = 50.7
    Avg # bets           = 2469.754
 ****************************************************************************************************/

public class Gambler {
    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);
        int goal   = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bets = 0;
		int wins = 0;
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;
                else                     cash--;
            }
            if (cash == goal) wins++;
		}
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
}
