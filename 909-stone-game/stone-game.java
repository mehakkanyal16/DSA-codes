class Solution {

    Integer[][] dp;

    int solve(int l, int r, int[] piles) {
        if (l == r)
            return piles[l];

        if (dp[l][r] != null)
            return dp[l][r];

        int pickLeft = piles[l] - solve(l + 1, r, piles);
        int pickRight = piles[r] - solve(l, r - 1, piles);

        return dp[l][r] = Math.max(pickLeft, pickRight);
    }

    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        dp = new Integer[n][n];

        return solve(0, n - 1, piles) >= 0;
    }
}