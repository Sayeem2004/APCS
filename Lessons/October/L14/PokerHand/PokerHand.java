/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:

    Notes:

    % java

****************************************************************************************************/

public class PokerHand {
    public static void main(String[] args) {
        String[] suits = {"clubs", "diamonds", "hearts", "spades" };
        String[] ranks = {"2", "3", "4", "5", "6", "7" , "8", "9", "10", "Jack", "Queen", "King" , "Ace"};
        String[] deck = new String[52];
        int k = 0;
        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                deck[k++] = ranks[j] + "\tof " + suits[i];
        int m = 5;
        int n = 52;

        int[] perm = new int[n];
        for (int i = 0; i < n; i++)
            perm[i] = i;
        for (int i = 0; i < m; i++)  {
            int r = i + (int) (Math.random() * (n-i));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }
        for (int i = 0; i < m; i++)
            System.out.println(deck[perm[i]] + " ");
    }
}
