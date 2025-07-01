class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int windowSize = n - k;
        int windowSum = 0;
        int totalSum = 0;
        int left = 0;
        int maxi = Integer.MIN_VALUE;

        for (int num : nums) {
            totalSum += num;
        }

       
        if (k == n) {
            return totalSum;
        }

        for (int right = 0; right < n; right++) {
            windowSum += nums[right];

            if (right - left + 1 == windowSize) {
                maxi = Math.max(maxi, totalSum - windowSum);
                windowSum -= nums[left];
                left++;
            }
        }

        return maxi;
    }
}
