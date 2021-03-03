/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Seasons.java
    Execution: java Seasons m d

    Notes: Returns the season given the month(1 <= m <= 12) and the day(1 <= d <= 31).

    % java Seasons 1221
    Fall

    % java Seasons 1222
    Winter
****************************************************************************************************/

public class Seasons {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int total = m*100 + d;
        if (total <= 320)
            System.out.println("Winter");
        else if (total <= 620)
            System.out.println("Spring");
        else if (total <= 922)
            System.out.println("Summer");
        else if (total <= 1221)
            System.out.println("Fall");
        else
            System.out.println("Winter");
    }
}
