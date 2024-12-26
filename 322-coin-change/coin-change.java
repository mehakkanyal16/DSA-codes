class Solution {
    public int f(int ind,int[] arr ,int k,int[][] dp){
       if(k==0){
        return 0;
       }
       if(ind==0){
        if(k%arr[0]==0){
            return k/arr[0];
        }else{
           return (int) Math.pow(10, 9);
        }
       }
       if(dp[ind][k]!=-1){
        return dp[ind][k];
       }
       int not_take=0+f(ind-1,arr,k,dp);
       int take=(int) Math.pow(10, 9);
        if (arr[ind] <= k) {
            int res = f(ind, arr, k - arr[ind], dp); // Take the current coin
            if (res != Integer.MAX_VALUE) { // Check for valid result
                take = 1 + res;
            }
        }
        dp[ind][k]= Math.min(take,not_take);
        return dp[ind][k];

    }

    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
     int ans = f(n - 1,coins,amount, dp);

        // If it's not possible to achieve the target sum, return -1
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans; 
    }
}