class Solution {
    public int maxSum(int[] nums){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
             maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
           
            
        }
        return maxSum;
    }
     public int minSum(int[] nums){
        int minSum=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
            minSum=Math.min(minSum,sum);
            if(sum>0){
                sum=0;
            }
            
            
        }
        return minSum;
    }
    public int maxAbsoluteSum(int[] nums) {
        int max=maxSum(nums);
        int min=minSum(nums);
        return Math.max(max,-min);
        
    }
}