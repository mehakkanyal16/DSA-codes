class Solution {
    public int maxScore(int[] nums, int k) {
        int left=0;
        int n=nums.length;
        int windowSize=n-k;
        int windowSum=0;
        int totalSum=0;
      
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        for(int right=0;right<n;right++){
            windowSum+=nums[right];
            if(right-left+1==windowSize){
                maxi=Math.max(maxi,totalSum-windowSum);
                windowSum-=nums[left];
                left++;

            }



        }
        if(k==n){
            return totalSum;
        }
        return maxi;
       
        
    }
}