/****************************************************************************************************
    Names: Mohammad Khan, Bryan Zhang, Joseph Kim

    Problem Statement: Modify Gambler to take an extra command-line argument that specifies the
    number of bets the gambler is willing to make, so that there are three possible ways for the game
    to end; the gambler wins, loses, or runs out of time. Add to the output to give the expected
    amount of money the gambler will have when the game ends. Name the program GamblerV4.java.

    Compilation: javac GamblerV4.java
    Execution: java GamblerV4 stake goal N bets

    Notes: Simulates a gambler who start with $stake and place $1 bets with fair odds until she goes
    broke, reach $goal, or runs out of bets. Keeps track of the number of times she wins and the
    number of bets she makes. Run the experiment N times, averages the results, and prints them out.
    Also calculates the expected number of money she has at the end.

    % java GamblerV4 50 250 1000 1000
    0 wins of 1000
    Percent of games won = 0.0
    Avg # bets           = 961.292
    Expected Money At The End = 50.564

    % java GamblerV4 50 250 1000 10000
    44 wins of 1000
    Percent of games won = 4.4
    Avg # bets           = 5682.816
    Expected Money At The End = 50.518

    % java GamblerV4 50 250 1000 100000
    205 wins of 1000
    Percent of games won = 20.5
    Avg # bets           = 9863.165
    Expected Money At The End = 51.25
 ****************************************************************************************************/

public class GamblerV4 {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int mxbet = Integer.parseInt(args[3]);
        int bets = 0, wins = 0, sum = 0;
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            int mx = mxbet;
            for (; cash > 0 && cash < goal && mx > 0; bets++, mx--) {
                if (Math.random() < 0.5) cash++;
                else cash--;
                if (cash == goal) {
                    wins++;
                    break;
                }
            }
            sum += cash;
        }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
        System.out.println("Expected Money At The End = " + 1.0 * sum / trials);
    }
}
