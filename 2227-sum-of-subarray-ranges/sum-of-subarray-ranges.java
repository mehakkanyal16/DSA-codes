class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int maxi=Integer.MIN_VALUE;
            int mini=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                maxi=Math.max(nums[j],maxi);
                mini=Math.min(nums[j],mini);

                    sum+=(maxi-mini);

            }

        
        }
        return sum;


        
    }
}