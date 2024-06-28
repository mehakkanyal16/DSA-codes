class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int max_profit=0;
        int min_price=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<min_price){
                min_price=nums[i];
            }
            else if(nums[i]-min_price>max_profit){
                max_profit=nums[i]-min_price;
            }
        }
        
       return max_profit; 
    }
}