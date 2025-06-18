class Solution {
    public boolean solve(int[] nums,int i,int k,Boolean[][]dp){
        if(k==0)return true;
        if(i==0) return nums[i]==k;
        if(dp[i][k]!=null){
            return dp[i][k];
        }
        boolean not_pick=solve(nums,i-1,k,dp);
        boolean pick=false;
        if(k>=nums[i]){
            pick=solve(nums,i-1,k-nums[i],dp);
        }
        return dp[i][k]=pick||not_pick;

    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
       Boolean[][] dp=new Boolean[n][sum+1];
       
        return solve(nums,n-1,sum/2,dp);
        
    }
}