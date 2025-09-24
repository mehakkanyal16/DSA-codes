class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zeroes=0;
        int left=0;
        int maxCnt=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0)zeroes++;
            if(zeroes>k){
              if(nums[left]==0)zeroes--;
              left++;
            }
            maxCnt=Math.max(maxCnt,right-left+1);
        }
        return maxCnt;
    }

}