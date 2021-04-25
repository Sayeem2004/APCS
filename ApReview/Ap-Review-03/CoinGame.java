public class CoinGame {
    private int startingCoins;
    private int maxRounds;

    public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }

    public int getPlayer1Move() {
        return (int)(Math.random()*3+1);
    }

    // part A
    public int getPlayer2Move(int round) {
        int result;
        if (round%3 == 0) result = 3;
        else if (round%2 == 0) result = 2;
        else result = 1;
        return result;
    }

    // part B
    public void playGame() {
        int p1 = startingCoins, p2 = startingCoins;
        for (int i = 1; i <= maxRounds; i++) {
            if (p1 < 3 || p2 < 3) {
                if (p1 == p2) System.out.println("tie game");
                else if (p1 > p2) System.out.println("player 1 wins");
                else System.out.println("player 2 wins");
                return;
            }
            int m1 = getPlayer1Move(), m2 = getPlayer2Move(i);
            if (Math.abs(m1-m2) == 0) p2++;
            else if (Math.abs(m1-m2) == 1) p2++;
            else p1+=2;
            p1-=m1;
            p2-=m2;
        }
        if (p1 == p2) System.out.println("tie game");
        else if (p1 > p2) System.out.println("player 1 wins");
        else System.out.println("player 2 wins");
        return;
    }
}
