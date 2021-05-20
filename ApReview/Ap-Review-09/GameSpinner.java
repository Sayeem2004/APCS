// Part A
public class GameSpinner {
    private int max;
    private int prev = 0;
    private int streak = 0;

    public GameSpinner(int n) {
        max = n;
    }

    public static int spin() {
        int n = (int)(Math.random() * max) + 1;
        if (n == prev) streak++;
        else {
            prev = n;
            streak = 1;
        }
        return n;
    }

    public static int currentRun() {
        return streak;
    }
}
