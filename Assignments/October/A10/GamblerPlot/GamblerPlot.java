/****************************************************************************************************
    Names: Mohammad Khan, Bryan Zhang, Joseph Kim

    Problem Statement: Write a program GamblerPlot that traces a gambler's ruin simulation by
    printing a line after each bet in which one asterisk corresponds to each dollar held by the
    gambler and prints  "end of trial #" after the conclusion of each trial. Pipe the output of
    GamblerPlot to the less command to view each run.

    Compilation: javac GamblerPlot.java
    Execution: java GamblerPlot stake goal N

    Notes: Simulates a gambler who start with $stake and place fair $1 bets until she goes broke or
    reach $goal. Keeps track of the number of times she wins and the number of bets she makes. Run
    the experiment N times, averages the results, and prints them out. Also shows the amount of money
    she has visually using asterisks.

    % java GamblerPlot 1 5 5
    *
    **
    *
    end of trial #1
    *
    end of trial #2
    *
    end of trial #3
    *
    **
    *
    **
    *
    **
    *
    **
    *
    **
    *
    **
    *
    end of trial #4
    *
    end of trial #5
    0 wins of 5
    Percent of games won = 0.0
    Avg # bets           = 3.8
 ****************************************************************************************************/

public class GamblerPlot {
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
				moola(cash);
                if (Math.random() < 0.5) cash++;
                else                     cash--;
            }
            if (cash == goal) wins++;
			System.out.println("end of trial #" + (t+1));
		}
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
	private static void moola(int a) {
		String asterisk = "*";
		String ans = asterisk.repeat(a);
		if (a > 0) System.out.println(ans);
		else System.out.println("");
	}
}
