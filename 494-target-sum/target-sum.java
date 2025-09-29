class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        // invalid case
        if ((target + totalSum) % 2 != 0 || Math.abs(target) > totalSum) {
            return 0;
        }

        int subsetSum = (target + totalSum) / 2;
        return countSubsets(nums, subsetSum);
    }

    private int countSubsets(int[] nums, int sum) {
        int n = nums.length;
        int[] dp = new int[sum + 1];
        dp[0] = 1; // one way to make sum=0 (empty subset)

        for (int num : nums) {
            for (int j = sum; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[sum];
    }
}
