class Solution {
    public int f(int ind,int[] nums,int[] dp){
        if(ind==0){
            return nums[ind];
        }
        if (ind<1){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick=nums[ind]+f(ind-2,nums,dp);
        int notpick=f(ind-1,nums,dp);
        return dp[ind]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return f(n-1,nums,dp);
    }
}