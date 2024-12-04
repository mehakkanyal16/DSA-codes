class Solution {
    public int fib(int n) {
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        // int[] dp=new int[n+1];
        // dp[0]=0;
        // dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];

        if(n==0||n==1){
            return n;
        }
        int prev=1;
        int prev2=0;
        for(int i=2;i<=n;i++){
            int curr=prev+prev2;
             prev2=prev;
            prev=curr;
           
        }
        return prev;
    }
}