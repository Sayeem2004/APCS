public int numUniqueBSTs(int n) {
    if (n <= 1) return Math.max(n, 0);
    int[] dp = new int[n+1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
        for (int q = 1; q <= i; q++) {
            dp[i] += dp[q-1] * dp[i-q];
        }
    }
    return dp[n];
}
