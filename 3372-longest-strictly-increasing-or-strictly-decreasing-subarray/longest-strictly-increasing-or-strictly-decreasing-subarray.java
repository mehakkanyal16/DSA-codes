class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int incCount = 1, decCount = 1, maxCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                incCount++;
                decCount = 1; // reset decCount as the sequence is no longer decreasing
            } else if (nums[i] < nums[i - 1]) {
                decCount++;
                incCount = 1; // reset incCount as the sequence is no longer increasing
            } else {
                incCount=1;
                decCount=1;
            }

            maxCount = Math.max(maxCount, Math.max(incCount, decCount));
        }

        return maxCount;
    }
}
