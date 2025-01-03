class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }
        long totalSum=0;
        long startSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum=totalSum+nums[i];
        }
        int cnt=0;
        for(int i=0;i<n-1;i++){
             startSum=startSum+nums[i];
             if(startSum>=totalSum-startSum){
                cnt++;
             }
        }
        return cnt;
    }
}