class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][] count = new int[len][2]; // count[i][0] = zeros, count[i][1] = ones
        
        // Precompute zeros and ones for each string
        for (int i = 0; i < len; i++) {
            String s = strs[i];
            int zeros = 0, ones = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeros++;
                else ones++;
            }
            count[i][0] = zeros;
            count[i][1] = ones;
        }
        
        // dp[i][m][n] memo
        Integer[][][] dp = new Integer[len][m+1][n+1];
        return dfs(0, m, n, count, dp);
    }
    
    private int dfs(int index, int m, int n, int[][] count, Integer[][][] dp) {
        if (index == count.length) return 0;
        if (dp[index][m][n] != null) return dp[index][m][n];
        
        // Option 1: Skip the string
        int skip = dfs(index + 1, m, n, count, dp);
        
        int pick = 0;
        int zeros = count[index][0];
        int ones = count[index][1];
        
        // Option 2: Pick the string (only if we have capacity)
        if (m >= zeros && n >= ones) {
            pick = 1 + dfs(index + 1, m - zeros, n - ones, count, dp);
        }
        
        return dp[index][m][n] = Math.max(pick, skip);
    }
}
