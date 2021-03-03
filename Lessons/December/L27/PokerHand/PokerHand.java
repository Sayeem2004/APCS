/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac PokerHand.java
    Execution: java PokerHand
    Dependencies: none

    Notes: Simulates drawing a poker hand 100000 times and shows the percentage of hands that had
    certain features such as pair, twopair, or fourofkind.

    > java PokerHand
    NoPair: 50.08899999999999
    Pair: 42.243
    TwoPair: 4.83
    ThreeOfKind: 2.075
    FourOfKind: 0.018000000000000002
    FullHouse: 0.15
    Flush: 0.203
    Straight: 0.38999999999999996
    StraightFlush: 0.002
    RoyalFlush: 0.0
****************************************************************************************************/

public class PokerHand {
    public static int[] riffleshuffle(int[] v) {
        int n = v.length, r = 0;
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) r++;
        }
        int[] a = new int[r];
        int[] b = new int[n-r];
        for (int i = 0; i < r; i++) a[i] = v[i];
        for (int i = r; i < n; i++) b[i-r] = v[i];
        int c = 0, d = 0;
        double n1 = r, n2 = n-r;
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            if (Math.random() < n1 /(n1+n2)) {
                ret[i] = a[c];
                c++; n1--;
            } else {
                ret[i] = b[d];
                d++; n2--;
            }
        }
        return ret;
    }
    public static boolean pair(int[] freq, int[] suit) {
        for (int x : freq) {
            if (x == 2) return true;
        }
        return false;
    }
    public static boolean twopair(int[] freq, int[] suit) {
        int count = 0;
        for (int x : freq) {
            if (x == 2) count++;
        }
        if (count == 2) return true;
        return false;
    }
    public static boolean threeofkind(int[] freq, int[] suit) {
        for (int x : freq) {
            if (x == 3) return true;
        }
        return false;
    }
    public static boolean fourofkind(int[] freq, int[] suit) {
        for (int x : freq) {
            if (x == 4) return true;
        }
        return false;
    }
    public static boolean fullhouse(int[] freq, int[] suit) {
        boolean a = false, b = false;
        for (int x : freq) {
            if (x == 3) a = true;
            if (x == 2) b = true;
        }
        return a && b;
    }
    public static boolean flush(int[] freq, int[] suit) {
        for (int x : suit) {
            if (x == 5) return true;
        }
        return false;
    }
    public static boolean straight(int[] freq, int[] suit) {
        boolean a = false;
        for (int i = 0; i < 9; i++) {
            if (freq[i] != 0) {
                if (i == 0) {
                    if (freq[i]==1 && freq[9]==1 && freq[10]==1 && freq[11]==1 && freq[12]==1) {
                        a = true; break;
                    }
                }
                if (freq[i]==1 && freq[i+1]==1 && freq[i+2]==1 && freq[i+3]==1 && freq[i+4]==1) {
                    a = true; break;
                }
            }
        }
        return a;
    }
    public static boolean straightflush(int[] freq, int[] suit) {
        return straight(freq,suit) && flush(freq,suit);
    }
    public static boolean royalflush(int[] freq, int[] suit) {
        boolean a = false;
        if (freq[0]==1 && freq[9]==1 && freq[10]==1 && freq[11]==1 && freq[12]==1)
            a = true;
        return a && flush(freq,suit);
    }
    public static void main(String[] args) {
        int[] cards = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
        int rf = 0, sf = 0, s = 0, f = 0, fh = 0, fok = 0, tok = 0, tp = 0, p = 0, np = 0;
        double n = 100000;
        for (int i = 0; i < n; i++) {
            for (int q = 0; q < 7; q++) {
                cards = riffleshuffle(cards);
            }
            int[] freq = new int[13];
            int[] suit = new int[4];
            for (int q = 0; q < 5; q++) {
                freq[cards[q]%13]++;
                suit[cards[q]/13]++;
            }
            if (royalflush(freq,suit)) {rf++; continue;}
            if (straightflush(freq,suit)) {sf++; continue;}
            if (straight(freq,suit)) {s++; continue;}
            if (flush(freq,suit)) {f++; continue;}
            if (fullhouse(freq,suit)) {fh++; continue;}
            if (fourofkind(freq,suit)) {fok++; continue;}
            if (threeofkind(freq,suit)) {tok++; continue;}
            if (twopair(freq,suit)) {tp++; continue;}
            if (pair(freq,suit)) {p++; continue;}
            np++;
        }
        System.out.println("NoPair: " + np/n*100);
        System.out.println("Pair: " + p/n*100);
        System.out.println("TwoPair: " + tp/n*100);
        System.out.println("ThreeOfKind: " + tok/n*100);
        System.out.println("FourOfKind: " + fok/n*100);
        System.out.println("FullHouse: " + fh/n*100);
        System.out.println("Flush: " + f/n*100);
        System.out.println("Straight: " + s/n*100);
        System.out.println("StraightFlush: " + sf/n*100);
        System.out.println("RoyalFlush: " + rf/n*100);
    }
}
