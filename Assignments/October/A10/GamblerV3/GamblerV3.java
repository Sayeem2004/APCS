/****************************************************************************************************
    Names: Mohammad Khan, Bryan Zhang, Joseph Kim

    Problem Statement: Modify Gambler to take an extra command-line argument that specifies the
    (fixed) probability that the gambler wins each bet. Name the program GamblerV3.java

    Compilation: javac GamblerV3.java
    Execution: java GamblerV3 stake goal N O

    Notes: Simulates a gambler who start with $stake and place $1 bets with odds O until she goes
    broke or reach $goal. Keeps track of the number of times she wins and the number of bets she
    makes. Run the experiment N times, averages the results, and prints them out.

    Answer: After simulating using values of .48, .5, and .51, the results show that even a small
    change to the odds causes a large change in the percent of winning and greatly decreases the
    number of bets. Using this knowledge it can be guessed that Math.random follows a bell curve
    type graph and that is why these massive changes of percent occur when the odds are shifted
    slightly.

    % java GamblerV3 50 100 1000 0.5
    495 wins of 1000
    Percent of games won = 49.5
    Avg # bets           = 2422.728

    % java GamblerV3 50 100 1000 0.51
    882 wins of 1000
    Percent of games won = 88.2
    Avg # bets           = 1858.88

    % java GamblerV3 50 100 1000 0.48
    19 wins of 1000
    Percent of games won = 1.9
    Avg # bets           = 1215.844
 ****************************************************************************************************/

public class GamblerV3 {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        double odds = Double.parseDouble(args[3]);
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < odds) cash++;
                else cash--;
            }
            if (cash == goal) wins++;
        }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}
