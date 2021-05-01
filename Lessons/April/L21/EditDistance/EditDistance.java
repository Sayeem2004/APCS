/****************************************************************************************************
    Name: Mohammad Khan, Asa Muhammad, Caroline Leung, Dylan Hu, Esteak Shapin, Han Zhang, Jishan Chowdhury

    Compilation: javac EditDistance.java
    Execution: java EditDistance x y
    Dependencies: none

    Notes: Prints out the edit distance between two strings as well as the optimal alignment between
    the two strings to get the specified edit distance.

    > java EditDistance AACAGTTACC TAAGGTCA
    Edit Distance: 7
    A A C A G T T A C C
    T A - A G G T - C A
    1 0 2 0 0 1 0 2 0 1

    > java EditDistance 
****************************************************************************************************/

public class EditDistance {
    public static void main(String[] args) {
        // Reading In Strings And Initializing Dp Array
        String x = args[0], y = args[1];
        int m = x.length(), n = y.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m+1; i++) {
            dp[i][n] = (m-i)*2;
        }
        for (int i = 0; i < n+1; i++) {
            dp[m][i] = (n-i)*2;
        }

        // Actually Performing The Dp Algorithm
        for (int i = m-1; i >= 0; i--) {
            for (int q = n-1; q >= 0; q--) {
                dp[i][q] = Math.min(dp[i+1][q+1] + (x.charAt(i)==y.charAt(q) ? 0 : 1),
                                    Math.min(dp[i+1][q]+2, dp[i][q+1]+2));
            }
        }

        // Recovering Best Alignment
        char[][] ret = new char[3][m+n];
        int r = 0, s = 0, c = 0;
        while (r < m || s < n) {
            if (r < m && dp[r+1][s] == dp[r][s]-2) {
                ret[0][c] = x.charAt(r);
                ret[1][c] = '-';
                ret[2][c] = '2';
                r++;
            } else if (s < n && dp[r][s+1] == dp[r][s]-2) {
                ret[0][c] = '-';
                ret[1][c] = y.charAt(s);
                ret[2][c] = '2';
                s++;
            } else if (r < m && s < n && dp[r+1][s+1] == dp[r][s]) {
                ret[0][c] = x.charAt(r);
                ret[1][c] = y.charAt(s);
                ret[2][c] = '0';
                r++; s++;
            } else {
                ret[0][c] = x.charAt(r);
                ret[1][c] = y.charAt(s);
                ret[2][c] = '1';
                r++; s++;
            }
            c++;
        }

        // Printing Out Results
        System.out.println("Edit distance = " + dp[0][0]);
        for (int i = 0; i <= c; i++) {
            System.out.print(ret[0][i]+" ");
        }
        System.out.println();
        for (int i = 0; i <= c; i++) {
            System.out.print(ret[1][i]+" ");
        }
        System.out.println();
        for (int i = 0; i <= c; i++) {
            System.out.print(ret[2][i]+" ");
        }
        System.out.println();
    }
}
