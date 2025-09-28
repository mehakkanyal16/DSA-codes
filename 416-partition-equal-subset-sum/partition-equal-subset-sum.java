class Solution {
    public boolean solve(int ind,int nums[],Boolean dp[][] ,int target){
        if(ind==0) {
            if( nums[ind]==target)return true;
            return false;
        }
        if(ind<0)return false;
          if(dp[ind][target]!=null){
            return dp[ind][target];
        }
      
        boolean not_pick=solve(ind-1,nums,dp,target);
        boolean pick=false;
        if(nums[ind]<=target){
            pick=solve(ind-1,nums,dp,target-nums[ind]);
        }
        return dp[ind][target]=pick||not_pick;
    }
    public boolean canPartition(int[] nums) {

        int n=nums.length;
       
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
         if(sum%2==1)return false;
        int target=(sum/2);
        Boolean[][] dp=new Boolean[n][target+1];
       
        return solve(n-1,nums,dp,target);
        
    }
}