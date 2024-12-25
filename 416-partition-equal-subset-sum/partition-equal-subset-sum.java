class Solution {
     static boolean f(int ind,int[] arr,int k,int[][] dp){
          if(k==0){
            return true;
        }
        if(ind==0){
            return (arr[ind]==k);
        }
      
        if(dp[ind][k]!=-1){
            return dp[ind][k]==0?false:true;
        }
        boolean not_pick=f(ind-1,arr,k,dp);
        boolean pick=false;
        if(arr[ind]<=k){
        pick=f(ind-1,arr,k-arr[ind],dp);
        }
        dp[ind][k]=not_pick||pick?1:0;
        return pick||not_pick;
        
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int totSum=0;
        for(int i=0;i<n;i++){
            totSum=totSum+nums[i];
        }
        if(totSum%2!=0){
            return false;
        }
        int k=totSum/2;
      int[][] dp=new int[n][k+1];
     for(int it[]:dp){
         Arrays.fill(it,-1);
     }
     return f(n-1,nums,k,dp);
    }
}