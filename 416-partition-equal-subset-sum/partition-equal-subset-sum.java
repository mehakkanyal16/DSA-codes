class Solution {
    public boolean solve(int ind,int[]arr,Boolean[][] dp,int k){
        if(ind==0) return arr[0]==k;
        if(ind<0)return false;
        if(dp[ind][k]!=null)return dp[ind][k];
       boolean not_pick=solve(ind-1,arr,dp,k);
        boolean pick=false;
        if(arr[ind]<=k){
            pick=solve(ind-1,arr,dp,k-arr[ind]);
        }
        return dp[ind][k]=pick||not_pick;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num:nums)sum+=num;
        if(sum%2!=0)return false;
        int target=sum/2;
        Boolean[][] dp=new Boolean[n][target+1];
        return solve(n-1,nums,dp,target);


        
    }
}