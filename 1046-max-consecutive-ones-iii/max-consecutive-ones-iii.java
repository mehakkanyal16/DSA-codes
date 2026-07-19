class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxCnt=0;
        int left=0;
        int zCnt=0;
         for(int right=0;right<nums.length;right++){
            if(nums[right]==0)zCnt++;
            if(zCnt>k){
                if(nums[left]==0)zCnt--;
                left++;
            }
            maxCnt=Math.max(maxCnt,right-left+1);
         }
         return maxCnt;
        
    }
}