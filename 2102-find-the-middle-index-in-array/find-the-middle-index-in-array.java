class Solution {
    public int findMiddleIndex(int[] nums) {
         int n=nums.length;
         int tsum=0;
         int leftsum=0;
        for(int i=0;i<n;i++){
          tsum=tsum+nums[i];
        }
        for(int i=0;i<n;i++){
            if (leftsum == tsum - leftsum - nums[i]) {
                return i;
            }
            // Update leftsum
            leftsum += nums[i];
        }
        return -1;
    }
}