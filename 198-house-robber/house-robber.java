class Solution {
    public int f(int[] nums,int ind,int[] dp){
        if(ind==0){
            return nums[ind];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick=nums[ind]+f(nums,ind-2,dp);
        int not_pick=0+f(nums,ind-1,dp);
        return dp[ind]=Math.max(pick,not_pick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return f(nums,n-1,dp);
        
    }
}