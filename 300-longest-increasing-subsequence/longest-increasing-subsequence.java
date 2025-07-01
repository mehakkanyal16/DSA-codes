class Solution {
    public int solve(int[]nums,int ind,int prevInd,int[][] dp){
        if(ind>=nums.length)return 0;
        if(dp[ind][prevInd+1]!=-1){
            return dp[ind][prevInd+1];
        }

        int not_take=0+solve(nums,ind+1,prevInd,dp);
        int take=0;
        if(prevInd==-1||nums[ind]>nums[prevInd]){
            take=1+solve(nums,ind+1,ind,dp);
        }
        return dp[ind][prevInd+1]= Math.max(take,not_take);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] it:dp){
            Arrays.fill(it,-1);
        }
        return solve(nums,0,-1,dp);
        
    }
}