class Solution {
    public int solve(int ind,int[] nums,int[] dp){
        if(ind==0)return nums[0];
        if(ind<0)return 0;
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int not_pick=solve(ind-1,nums,dp);
       
         int   pick=solve(ind-2,nums,dp)+nums[ind];
        
        return dp[ind]=Math.max(pick,not_pick);

    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=solve(n-1,nums,dp);
        return ans;
    }
}