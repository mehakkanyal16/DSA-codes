class Solution {
    public int arrangeCoins(int n) {
        int rem_n=n;
        for(int i=1;i<=n;i++){
             rem_n=rem_n-i;
            if(rem_n==0){
                return i;
            }
           else if (rem_n < 0) {
                return i - 1;
            }


        }
        return n-1;
        
    }
}