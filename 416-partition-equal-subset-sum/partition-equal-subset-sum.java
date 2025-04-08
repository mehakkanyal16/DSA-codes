class Solution {
    public boolean f(int[] nums,int ind,int[][] dp,int k){
        if(ind==0){
            return (nums[ind]==k);
        }
        if(k==0){
            return true;
        }
        if(dp[ind][k]!=-1){
            return dp[ind][k]==0?false:true;
        }
        boolean notPick=f(nums,ind-1,dp,k);
        boolean pick=false;
        if(k>=nums[ind]){
            pick=f(nums,ind-1,dp,k-nums[ind]);
        }
        dp[ind][k]=pick||notPick?1:0;
        return pick||notPick;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        if(n==0){
            return false;
        }
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        if(totalSum%2!=0){
            return false;
        }
        int k=totalSum/2;
        int dp[][]=new int[n][k+1];
        for(int it[]:dp){
            Arrays.fill(it,-1);
        }
        return f(nums,n-1,dp,k);
        
    }
}