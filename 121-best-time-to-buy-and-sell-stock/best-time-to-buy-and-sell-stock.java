class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            if(prices[i]-minPrice>maxProfit){
                maxProfit=Math.max(maxProfit,prices[i]-minPrice);
            }
        }
        return maxProfit;
        
    }
}