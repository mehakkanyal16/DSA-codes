class Solution {
    public int singleNonDuplicate(int[] nums) {
         int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            res=res^nums[i];
        }
     return res;  
        
    }
}