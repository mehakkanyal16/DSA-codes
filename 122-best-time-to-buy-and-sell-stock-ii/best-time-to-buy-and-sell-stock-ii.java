class Solution {
    public int maxProfit(int[] prices) {
        int start=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(start<prices[i]){
                maxprofit+=prices[i]-start;
            }
            start=prices[i];
        }
        return maxprofit;
        
    }
}