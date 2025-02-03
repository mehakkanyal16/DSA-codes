class Solution {
    public int maxProfit(int[] nums) {
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min_price){
                min_price=nums[i];
            }else if(nums[i]-min_price>max_profit){
                max_profit=nums[i]-min_price;
            }
            
        }
        return max_profit;
        
    }
}