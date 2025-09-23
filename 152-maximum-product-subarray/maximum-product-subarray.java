class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxProd=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                maxProd=Math.max(maxProd,prod);

            }
        }
        return maxProd;
    }
}