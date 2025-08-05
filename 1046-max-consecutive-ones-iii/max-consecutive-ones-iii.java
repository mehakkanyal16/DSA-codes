class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zeroes=0;
        int left=0;
        int max=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}