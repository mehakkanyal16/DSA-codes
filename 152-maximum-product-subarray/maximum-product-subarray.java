class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=Integer.MIN_VALUE;
        //left to right;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod=prod*nums[i];
            maxProduct=Math.max(maxProduct,prod);
            if(prod==0){
                prod=1;
            }
        }
        // right to left;
         prod=1;
        for(int i=nums.length-1;i>=0;i--){
            prod=prod*nums[i];
            maxProduct=Math.max(maxProduct,prod);
            if(prod==0){
                prod=1;
            }
        }
        return maxProduct;
        
    }
}