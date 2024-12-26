class Solution {


    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        for(int t=0;t<=amount;t++){
            if(t%coins[0]==0){
                dp[0][t] =t/coins[0];
            }else{
                dp[0][t]= (int) Math.pow(10, 9);
            }
        }
        for(int ind=1;ind<n;ind++){
            for(int t=0;t<=amount;t++){
                int not_take=0+dp[ind-1][t];
           int take=(int) Math.pow(10, 9);
             if (coins[ind] <= t) {
                  take = 1+dp[ind][t-coins[ind]];// Take the current coin
             }
            dp[ind][t]=Math.min(take,not_take);
         }
            
        }
        int ans=dp[n-1][amount];

        // If it's not possible to achieve the target sum, return -1
        if (ans >=(int) Math.pow(10, 9))
            return -1;
        return ans; 
    }
}