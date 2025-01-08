class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int n=nums.length;
        // int min_len=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum=sum+nums[j];
        //         if(sum>=target){
        //             min_len=Math.min(min_len,j-i+1);
        //             break;
        //         }
        //     }
            
        // }
        // return min_len==Integer.MAX_VALUE?0:min_len;

        int left=0;
        int right=0;
        int currentWindowSum=0;
        int res=Integer.MAX_VALUE;
        for(right=0;right<nums.length;right++){
               currentWindowSum+=nums[right];
                while(currentWindowSum>=target){
                    res=Math.min(res,right-left+1);
                    currentWindowSum-=nums[left++];
                }
        }
        return res==Integer.MAX_VALUE?0:res;

    }
}