class Solution {
    public int solve(int[] nums,int i,int k,int[][] dp){
       if(k == 0) return 1;
        if(i == 0){
            return (k % nums[0] == 0) ? 1 : 0; // Because we can take nums[0] multiple times
        }
        if(dp[i][k]!=-1){
            return dp[i][k];
        }
        int not_pick=solve(nums,i-1,k,dp);
        int pick=0;
        if(nums[i]<=k){
            pick=solve(nums,i,k-nums[i],dp);
        }
        return dp[i][k]=pick+not_pick;
    }
    public int change(int target,int[] nums) {
        int n=nums.length;
        int[][]dp=new int[n][target+1];
        for(int[] it:dp){
            Arrays.fill(it,-1);
        }
        return solve(nums,n-1,target,dp);

        
    }
}