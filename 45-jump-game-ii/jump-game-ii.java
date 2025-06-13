class Solution {
    public int n;
    public int[] dp;

    public int helper(int idx, int[] nums) {
        if (idx >= n - 1) return 0; // Reached or passed the end
        if (nums[idx] == 0) return Integer.MAX_VALUE;

        if (dp[idx] != -1) return dp[idx]; // Memoization check

        int mini = Integer.MAX_VALUE;

        for (int j = 1; j <= nums[idx]; j++) {
            int nextIdx = idx + j;
            if (nextIdx < n) {
                int result = helper(nextIdx, nums);
                if (result != Integer.MAX_VALUE) {
                    mini = Math.min(mini, 1 + result);
                }
            }
        }

        return dp[idx] = mini;
    }

    public int jump(int[] nums) {
        this.n = nums.length;
        this.dp = new int[n];
        Arrays.fill(dp, -1);
        
        int ans = helper(0, nums);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
