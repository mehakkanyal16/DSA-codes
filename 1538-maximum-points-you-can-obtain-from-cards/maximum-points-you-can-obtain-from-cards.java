class Solution {
    public int maxScore(int[] nums, int k) {
        int totSum=0;
        for(int num:nums ){
            totSum+=num;
        }
        int n=nums.length;
        int left=0;
        int windowSize=n-k;
        int currSum=0;
        int max=Integer.MIN_VALUE;

        if (n==0)return 0;
        if(k==n)return totSum;
        for(int right=0;right<nums.length;right++){
            currSum+=nums[right];

            if((right-left+1)==windowSize){
                max=Math.max(max,totSum-currSum);
                currSum-=nums[left];
                left=left+1;
            }


        }
        return max;
        
    }
}