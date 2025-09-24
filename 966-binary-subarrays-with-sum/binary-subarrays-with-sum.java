class Solution {
    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;  // important edge case
        int n = nums.length;
        int cnt = 0;
        int currSum = 0, left = 0;

        for (int right = 0; right < n; right++) {
            currSum += nums[right];

            // ✅ Shrink window only if sum > goal
            while (currSum > goal) {
                currSum -= nums[left++];
            }

            // ✅ Count all subarrays ending at right
            cnt += (right - left + 1);
        }
        return cnt;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
}
