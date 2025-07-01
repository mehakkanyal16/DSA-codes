class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,1);
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[prev]<nums[i]){
                    dp[i]=Math.max(dp[i],1+dp[prev]);
                }
            }
            maxi=Math.max(dp[i],maxi);

        }
        return maxi;
        
    }
}